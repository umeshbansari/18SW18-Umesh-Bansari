import java.util.*;
class Classtask3
{
public static void main (String arg [])
{

//int num;
	Scanner zu = new 	Scanner(System.in);
	System.out.println(  " Enter no");
	int num  = zu.nextInt();
int a;
int fact =1; 
for(a=num;a>=1;a--)
{
	fact = fact*a;
}
System.out.println(fact);

}
}