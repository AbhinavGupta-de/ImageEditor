import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ImageEditor {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the image file name: ");
        String fileName = scanner.nextLine();

        File imageFile = new File("assets//" + fileName);

        if (!imageFile.exists()) {
            System.out.println("File not found: " + fileName);
            scanner.close();
            return;
        }

        System.out.println("Image file found: " + fileName);

        // Continue with image processing
        scanner.close();

        try {
            BufferedImage inputImage = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.out.println("Error reading image file: " + fileName);
            return;
        }

        System.out.println("Image file read successfully: " + fileName);
    }
}
