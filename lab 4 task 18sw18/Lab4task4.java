import java.util.*;
class Lab4task4
{
	public static void main (String arg [])
	{
int arr1[][]= {{1,2},{1,2}};
int arr2[][]= {{1,2},{1,2}};
int sum[][] = new int[2][2];
for (int i=0;i<arr1.length;i++)
{
	for(int j=0;j<arr1[i].length;j++)
	{
		sum[i][j]=arr1[i][j]+arr2[i][j];
System.out.print(sum[i][j] + " ");
	}
	System.out.println();
}


}


}
