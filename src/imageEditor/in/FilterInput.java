package imageEditor.in;

import java.util.Scanner;

public class FilterInput {

 // Method to get the user's choice for a filter
 public int filterInput() {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter 1 for grayscale.");
  System.out.println("Enter 2 for rotate 90 degrees clockwise.");
  System.out.println("Enter 3 for horizontally inverting the image.");
  System.out.println("Enter 4 for vertically inverting the image.");
  System.out.println("Enter 5 to change brightness.");
  System.out.println("Enter 6 for blur.");
  System.out.println("Enter 7 for contrast.");

  int input = scan.nextInt();

  return input;
 }

 // Method to get the percentage change in brightness
 public int changeBrightness() {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the percentage of brightness you want to increase: ");
  int input = scan.nextInt();
  return input;
 }

 // Method to get the contrast factor
 public double changeFactor() {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the factor of contrast you want to increase: ");
  double input = scan.nextDouble();
  return input;
 }
}
