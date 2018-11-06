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

	public static int rowSum(int[][] ary, int x){
		int output = 0;
		for (int col = 0; col < ary.length; col++){
			output = output + ary[col][x];
		}
		return output;
	}

	public static int columnSum(int[][] ary, int x){
		int output = 0;
		for (int row = 0; row < ary[x].length; row++){
			output += ary[x][row];
		}
		return output;
	}
}
