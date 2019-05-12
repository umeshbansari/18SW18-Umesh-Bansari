import java.util.*;
class Lab4task1
{
	public static void main (String arg[])
{
	for (int i=1;i<6;i++)
	{
	for (int j=5;j>=i;j--)
			{
			System.out.print("*");
			}
	System.out.println();
	}
for (int x=1;x<6;x++)
{
	for (int y=1;y<=x;y++)
	{
	System.out.print("*");	
	}
System.out.println();
}
int a =1;
while (a<=5)
{
	int b=5;
	while (b>a)
	{
		System.out.print( " ");
	b--;}
	int c =1;
	while (c<=a)
	{
		System.out.print( " *");
c++;
	}
	System.out.println();
	
	a++;
}
	}
}