import java.awt.Color;
import java.awt.image.BufferedImage;

public class Filters {
 PixelValues pixelValues = new PixelValues();
 int width;
 int height;

 public BufferedImage toGrayScale(BufferedImage inputImage) {

  width = pixelValues.getWidth(inputImage);
  height = pixelValues.getHeight(inputImage);

  BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
  for (int i = 0; i < width; i++) {
   for (int j = 0; j < height; j++) {
    outputImage.setRGB(i, j, inputImage.getRGB(i, j));
   }
  }

  return outputImage;
 }

 public BufferedImage changeBrightness(BufferedImage inputImage, int increase) {
  width = pixelValues.getWidth(inputImage);
  height = pixelValues.getHeight(inputImage);
  BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
  for (int i = 0; i < width; i++) {
   for (int j = 0; j < height; j++) {
    int red = pixelValues.getRGB(inputImage, i, j)[0];
    int green = pixelValues.getRGB(inputImage, i, j)[1];
    int blue = pixelValues.getRGB(inputImage, i, j)[2];
    red = red + (increase * red / 100);
    green = green + (increase * green / 100);
    blue = blue + (increase * blue / 100);
    if (red > 255)
     red = 255;
    if (green > 255)
     green = 255;
    if (blue > 255)
     blue = 255;
    if (red < 0)
     red = 0;
    if (green < 0)
     green = 0;
    if (blue < 0)
     blue = 0;
    Color color = new Color(red, green, blue);
    outputImage.setRGB(i, j, color.getRGB());
   }
  }
  return outputImage;
 }

 public BufferedImage applyFilters(BufferedImage inputImage, int filterInput) {
  switch (filterInput) {
   case 1:
    return toGrayScale(inputImage);
   case 5:
    int increase = new FilterInput().changeBrightness();
    return changeBrightness(inputImage, increase);
  }

  return inputImage;
 }

}
