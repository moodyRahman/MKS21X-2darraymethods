public class Driver{

	public static void main(String[] args) {

		int[][] a = new int[5][5];
		int term = 0;
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length;y++){
				a[x][y] = term;
				term++;
			}
		}

		System.out.println(ArrayMethods.rowSum(a, 2));


	}

}
