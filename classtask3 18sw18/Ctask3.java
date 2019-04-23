import java.util.*;
class Ctask3
{
	public static void main (String arg [])
{

outer:
for (int i=0;i<10;i++)
{
	for(int j=0;j<6;j++)
	{
	if (j==2)
	{
	System.out.print(j);
	break outer;
	}
	System.out.println();
	}
}
}

}
