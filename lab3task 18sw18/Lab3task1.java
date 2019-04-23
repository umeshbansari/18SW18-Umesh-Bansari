
import java.util.*;
class Lab3task1
{
	public static void main (String arg [])
	{



Scanner sc = new 	Scanner(System.in);
int  total_Marks = 300;
int obtained_Marks;
	//int percentage = obtained_marks*100/total_marks;
		System.out.println("Enter Marks of c plus" );
int c_plus = sc.nextInt ();
		System.out.println("Enter Marks of data structure" );
int data_structure = sc.nextInt ();
		System.out.println("Enter Marks of operating system" );
int operating_system = sc.nextInt ();
obtained_Marks = ( c_plus + data_structure + operating_system);

		System.out.println(" Obtained Marks = " + obtained_Marks );


		System.out.println("total_Marks = 300 ");
int percentage = obtained_Marks*100/total_Marks;

		System.out.println(" Percentage of total marks" +  percentage);
if (percentage > 90 )
		{
		System.out.println( " Grade A");

		}
if (percentage < 90 && percentage > 80 )
		{
		System.out.println( " Grade B");
		}
if (percentage <80 && percentage > 70 )
		{
		System.out.println(" Grade c" );
		}
else if (percentage <70 && percentage > 60 )
		{
		 System.out.println(" Grade D" );
		}
else 
		{
		System.out.println(" Fail" );	
		}
}

	}