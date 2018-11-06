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

		ArrayMethods.printArray(a);
		int res2 = ArrayMethods.rowSum(a, 2);
		int res0 = ArrayMethods.rowSum(a, 0);
		int resf = ArrayMethods.rowSum(a, a.length - 1);
		System.out.println(res2);
		System.out.println(res0);
		System.out.println(resf);


	}

}
