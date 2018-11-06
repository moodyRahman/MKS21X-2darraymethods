//returns the sum of the elements in Row x of ary.
//When x is past the last row count it as a zero. (NO indexOutOfBounds should ever occur)
public class ArrayMethods{

	ArrayMethods(){
	}

	public static void printArray(int[][] array){
      for( int x = 0; x < array.length; x++){
        for( int y = 0; y < array[x].length;y++){
          System.out.print(array[x][y] + ", ");
          if(y == array[x].length -1){
            System.out.print("\n");      //helps with formatting
          }                             // new line at the end of each "mini array"
        }
      }
      System.out.print("\n");
    }

	public static int rowSum(int[][] ary, int x) {
    int counter = 0;
    try {
      for (int row = 0; row < ary[x].length; row++) {
        counter = counter + ary[x][row];
      }
    } catch (ArrayIndexOutOfBoundsException a) {
		System.out.println("input too large/small");
	}
    return counter;
  }

  public static int columnSum(int[][] ary, int x) {
    int counter = 0;
    for (int col = 0; col < ary.length; col++) {
      try {
        counter = counter + ary[col][x];
      } catch (ArrayIndexOutOfBoundsException a) {
		  System.out.println("input too large/small");
	  }
    }
    return counter;
  }


  public static int[] allRowSums(int[][] ary) {
    int[] output = new int[ary.length];
    for (int row = 0; row < output.length; row++) {
      output[row] = ArrayMethods.rowSum(ary, row);
    }
    return output;
  }

  public static int[] allColSums(int[][] ary) {
    int lag = 0;
    for (int col = 0; col < ary.length; col++) {
      if (ary[col].length > lag) {
        lag = ary[col].length;
      }
    }
}
}
