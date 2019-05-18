class Vechile 
{
	String name = " Grande";
	String engineMode = 1800cc;
	void showroom()
		{
			System.out.print("Vechile Marketing");
		}
}
public class Displayvechile extends Vechile 
{
	public static void main(String args[])
	{
Displayvechile obj = new Displayvechile();
 	System.out.print(obj.name);
 	System.out.print(obj.engineMode);
 	obj.showroom();
	}
}