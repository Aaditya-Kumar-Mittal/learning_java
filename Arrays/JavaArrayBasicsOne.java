public class JavaArrayBasicsOne {

  public static void main(String[] args) {

    int[] integerArr = new int[10];

    for (int i = 0; i < integerArr.length; i++) {
      integerArr[i] = i;
    }

    for (int j : integerArr) {
      System.out.println(j);
    }

    System.out.println(integerArr); // [I@372f7a8d [ -> Array I -> Integer Type Rest is Hashcode which act as af
                                    // unique identifier

    // Creating a 2D Array

    int[][] matrix1 = new int[3][3];

    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix1[i].length; j++) {
        matrix1[i][j] = i * j;
      }
    }

    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix1[i].length; j++) {
        System.out.print(matrix1[i][j] + " ");
      }
      System.out.println();
    }

    // Creating a jagged array

    int[][] jaggedArray = new int[3][];
    jaggedArray[0] = new int[3];
    jaggedArray[1] = new int[2];
    jaggedArray[2] = new int[5];

    for (int i = 0; i < jaggedArray.length; i++) {
      for (int j = 0; j < jaggedArray[i].length; j++) {
        jaggedArray[i][j] = i + j;
      }
    }

    for (int i = 0; i < jaggedArray.length; i++) {
      for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.print(jaggedArray[i][j] + " ");
      }
      System.out.println();
    }

  }
}