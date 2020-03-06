package collection;
import java.util.*;

public class Collection 
{
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   if(n>10)
	   {
		   ArrayList<String> a = new ArrayList<String>(n);
		   for(int i = 0;i<n;i++)
		   {
			   a.add(sc.next());
		   }
		   System.out.println("fetched : ");
		   String p = sc.next();
		   if(a.contains(p))
		   {
			   System.out.println(p+" is available.");
		   }
		   else
		   {
			   System.out.println(p+" not available.");
		   }
		   System.out.println("Select the number to delete : ");
		   String x = sc.next();
		   a.remove(new String(x));
		   System.out.println(a);
		   sc.close();
	   }
	   else
	   {
		   System.out.println("Value should be greater than 10");
	   }
   }
}
