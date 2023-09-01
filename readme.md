# Image Editor -> Command Line Interface

## Table of Contents

1. [Introduction](#introduction)
2. [Usage](#usage)
3. [Features](#features)
4. [Code Explanation](#code-explanation)
5. [Examples](#examples)
6. [Future Plans](#future-plans)

## Introduction

This is a command line interface for the image editor. It is a simple program that takes in a file path to an image and a command to execute on the image. The program will then execute the command on the image and save the result to a new file.

This program is written in Java and uses the inbuilt Java libraries.

## Usage

The program takes in two arguments: the path to the image file and the command to execute on the image, gnerally. In the case of brightness it takes in a third argument which is the brightness value and the same goes for contrast.

## Features

The features include:

- Brightness
- Contrast
- Horizontal Flip
- Vertical Flip
- Rotate 90 degrees anti-clockwise
- Gray Scale
- Blur

-> More features will be added in the future.

Note that the program will not overwrite the original image file. It will save the result to a new file.

## Code Explanation

Let's start with analysing all the files that we have in the repository.

- First we have the assests folder:
  - So this folder will contain the **input file**. Your image file **should be** in this folder.
- Then we have the src folder:
  - This folder contains all the source code for the program.
  - Firstly we have the main class which is the **Main.java** file.
  - Then we have the **Image Editor package** which contains the real code for all the functions that are to be performed by the program.
  - In the package we have some sub directories which contain the code for the functions.
    - The **in** directory contains the code for reading the image file and the filter to be applied.
    - The **out** directory contains the code for writing the result to a new file.
    - The **filters** directory contains the code for the actual filters.
    - The **utils** directory contains the code for the utility functions.
  - And the lastly we have the **ImageEditor.java** file which is the class that runs the program by calling a run method which is called by the main function of the program.
- Then we have the standard gitignore file and the readme file.

### Main.java

Just a simple class that calls the run method of the ImageEditor class.

### /imageEditor/ImageEditor.java

The main class that calls all the methods in order to run the program. It has a run method which takes in the path to the image file and the command to execute on the image. It then calls the readImage method of the ImageReader class to read the image and then calls the filter method of the ImageFilter class to apply the filter on the image and then calls the writeImage method of the ImageWriter class to write the result to a new file.

### /imageEditor/in/InputFile.java

This class reads the image file. It has a read method which takes in the path to the image file. It then reads the image file and returns the image.

### /imageEditor/in/FilterInput.java

This class reads the filter to be applied on the image. It has a read method which takes in the command to be executed on the image. It then returns the filter to be applied on the image.

### /imageEditor/out/OutputFile.java

This class writes the result to a new file. It has a write method which takes in the path to the image file and the result image. It then writes the result image to a new file.

### /imageEditor/filters/Filters.java

This class contains all the filters that can be applied on the image. It has a filter method which takes in the image and the filter to be applied on the image. It then applies the filter on the image and returns the result image.

- Brightness: This filter takes in the image and the brightness value. It then applies the brightness filter on the image and returns the result image. The brightness filter is applied by adding the brightness value to each pixel value of the image.

- Contrast: This filter takes in the image and the contrast value. It then applies the contrast filter on the image and returns the result image. The contrast filter is applied by multiplying the contrast value to each pixel value of the image.

- Horizontal Flip: This filter takes in the image. It then applies the horizontal flip filter on the image and returns the result image. The horizontal flip filter is applied by reversing the order of the pixels in each row of the image.

- Vertical Flip: This filter takes in the image. It then applies the vertical flip filter on the image and returns the result image. The vertical flip filter is applied by reversing the order of the rows of the image.

- Rotate 90 degrees clockwise: This filter takes in the image. It then applies the rotate 90 degrees clockwise filter on the image and returns the result image. The rotate 90 degrees clockwise filter is applied by reversing the order of the rows of the image and then reversing the order of the pixels in each row of the image.

- Gray Scale: This filter takes in the image. It then applies the gray scale filter on the image and returns the result image. The gray scale filter is applied by taking the average of the red, green and blue values of each pixel and then setting the red, green and blue values of each pixel to the average value.

- Blur: This filter takes in the image. It then applies the blur filter on the image and returns the result image. The blur filter is applied by taking the average of the red, green and blue values of each pixel and the pixels around it and then setting the red, green and blue values of each pixel to the average value.

### /imageEditor/utils/PixelValues.java

This file is actually not very useful. It just contains the pixel values of the image, which can be acceeded by directly using the inbuilt functions of the BufferedImage class. I just made this file for learning purpose and to make the code more readable.

## Examples

### Input Image

![Input Image](/assets/Target.jpg)

### Gray Scale

![Gray Scale](/output/grayScale.jpg)

### Rotate 90 degrees anti-clockwise

![Rotate 90 degrees anti-clockwise](/output/rotate.jpg)

### Horizontal Flip

![Horizontal Flip](/output/horizontalFlip.jpg)

### Vertical Flip

![Vertical Flip](/output/verticalFlip.jpg)

### Brightness

![Brightness](/output/brightness.jpg)

### Blur

![Blur](/output/Blur.jpg)

### Contrast

![Contrast](/output/Contrast.jpg)

## Future Plans

- Add more filters.
- Add more features.
- Add more comments to the code.
- Make the code more readable.
- Add more examples.
- Add more documentation.
- Convert this into GUI with JavaFX.
