package bubblesort;
import java.util.*;
public class Bubble_Sort {

	public static void main (String[] args) 
	{
		
		int size, a, c, swap, array[];
		
		Scanner chu = new Scanner (System.in); 
		Random cha = new Random ();

		System.out.print("Enter array size to sort: ");
		size = chu.nextInt();
	
		array = new int [size];
		for (int i = 0; i < array.length; i++ ) 
		
		{

		array [i] = cha.nextInt(1000);
		
		}

		System.out.println();
		System.out.println(size + " random numbers generated ");
		
		for (a = 0; a < size; a++) {
			array [a] = cha.nextInt(1000);
			System.out.print(array[a] + " ");
			
		}
		
		System.out.println();
		for (a=0; a < size -1; a++) 
		{
			for (c = 0; c< size -c -1; c++) 
			{
				
				if (array[c] > array[c+1]) 
				{
					swap = array [c];
					array[c] = array [c+1];
					array[c+1] = swap;
				}
			}
		}
		System.out.println();
		System.out.println("Bubble Sorting... Done! ");
		for (a = 0; a < size ; a++){
			System.out.print(array [a] + " ");
		}
	}
	
}
