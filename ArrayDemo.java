public class ArrayDemo
{
	public static void main(String[] args)
	{
		//declare & create an 
		// int[] anArray = new int[10];

		// //assign a value to each array element and print
		// for (int i =0 ; i < 10; i++)
		// {
		// 	anArray[i] = i;
		// 	System.out.print(anArray[i] + " ");
		// }
		// System.out.println();

		//2d array with 10 rows and 3 columns
		int[][] anArray = new int[10][3];
		System.out.println("Length ? " + anArray.length); //for row size
		System.out.println("Length ? " + anArray[0].length); //for column size

	}
}