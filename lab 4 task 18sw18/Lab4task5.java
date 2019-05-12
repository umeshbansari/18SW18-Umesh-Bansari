import java.util.*;
class Lab4task5
{
	public static void main (String arg [])
	{


int arr[]={2,45,6,8,12};
int max=arr[0];
for (int i=0;i<arr.length;i++)
{
	if (max<arr[i])
	{
		max =arr[i];
	}
	
}
System.out.println("Highest Number of array is " + max);

}


}