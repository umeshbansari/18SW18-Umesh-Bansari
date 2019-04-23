/* Question one write a program on this matrix
0 1 2 3 4
5 6 7 8 9 
10 11 12 13 14
15 16 17 18 19
*/
import java.util.*;
class Ctast1
{
	public static void main (String arg [])
{
int x=0;
int arr [][]= new int [4][5];
for (int i=0;i<=arr.length;i++)
{
	for (int j=0;j<=arr.length;j++)
	{

		arr[i][j]=x;
		System.out.println(arr[i][j]);
x++;
	}
	System.out.println();
}


}


}