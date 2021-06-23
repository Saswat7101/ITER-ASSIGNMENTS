import java.util.*;
public class A7Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10, 20, 25, 63, 96, 57};
		int size = array.length;
		int i =0, j = i-1;
		while (i < j)
		{
		int temp = array [i];
		array [i] = array [j];
		array [j] = temp;
		i++;
		j--;
		}
		System.out.println("Reversed Array ");;
		for (i = 0; i < array.length; i++)
			System.out.println(array[i]+ " ");
	}
}
