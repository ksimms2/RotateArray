package edu.cnm.deepdive;

import java.util.Arrays;

public class Matrices {



  public static int[][] rotate(int[][] data) {

    int[][] rotatedMatrix = new int[data.length][data[0].length];

    for (int row = 0; row < data.length; row++) {
      for (int col = 0; col < data.length; col++) {

      }

    }

    for (int row = 0; row < data.length; row++) {
      for (int col = 0; col < data[row].length; col++) {

        rotatedMatrix[col][(data.length - 1) - row] = data[row][col];


      }

    }

    return rotatedMatrix;

  }
      static int N = 4;

  public static int[][] rotateInPlace(int[][] data) {
    for (int i = 0; i < N / 2; i++)
    {
      for (int j = i; j < N - i - 1; j++)
      {


        int temp = data[i][j];
        data[i][j] = data[N - 1 - j][i];
        data[N - 1 - j][i] = data[N - 1 - i][N - 1 - j];
        data[N - 1 - i][N - 1 - j] = data[j][N - 1 - i];
        data[j][N - 1 - i] = temp;
      }
    }
    return data;
  }

  public static void main(String[] args) {

    int[][] matrix = {

        {0, 1, 2, 3},
        {4, 5, 6, 7},
        {8, 9, 10, 11},
        {12, 13, 14, 15}};

    int[][] newRotatedMatrix = rotate(matrix);


    for (int i = 0; i < newRotatedMatrix.length;
        i++) {

      System.out.println("This is 90 rotation " + i + ": " + Arrays.toString(
          newRotatedMatrix[i]));
    }

    int[][] inPlaceRotate = rotateInPlace(matrix);

    for (int j = 0; j < inPlaceRotate.length;
        j++) {
      System.out.println("In place rotation "+ j + ": " + Arrays.toString(inPlaceRotate[j]));
    }

  }

}