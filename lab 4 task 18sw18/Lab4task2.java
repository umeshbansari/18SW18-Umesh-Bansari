import java.util.*;
class Lab4task2
{
	public static void main (String arg [])
	{
		Scanner zu = new Scanner(System.in);
		System.out.print("Enter Number for table");
		int table = zu.nextInt();
		for (int u=1;u<11;u++)
		{
			System.out.print(table + "x" + u + "=" + table*u);
			System.out.println();
		}
System.out.println();


	}
}
