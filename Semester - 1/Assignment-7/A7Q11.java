import java.util.*;
public class A7Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
		numbers[i] = input.nextInt();
		bubbleSort(numbers);
		}
		public static void bubbleSort(int[] numbers)
		{
		int n = numbers.length;
		int temp =0;
		for (int i = 0; i < n; i++)
		{
		for (int j = 1; j < n-i ; j++)
		{
		if (numbers[j-1] < numbers[j])
		{
		temp = numbers[j-1];
		numbers[j-1] = numbers[j];
		numbers[i] = temp;
		}
		}
		}
		for (int i = 0; i < numbers.length; i++)
		System.out.print (numbers[i] +" ");
	}

}
