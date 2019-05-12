import java.util.*;
class Lab4task3
{
	public static void main (String arg [])
	{
Scanner zu = new Scanner(System.in);
System.out.print(" Enter N number of Integers:");
int integer = zu.nextInt();
int arr[] = new int [integer];
int sum = 0;
int u=1;
for (int x=0;x<arr.length;x++)
{
	System.out.print("Enter Digit number " + u++  + " :");
	arr [integer] = Integer.nextInt();
	sum = sum + arr[integer];
}

	System.out.println ( sum + integer);
}




}
