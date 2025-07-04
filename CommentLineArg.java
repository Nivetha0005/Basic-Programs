import java.util.*;
public class CommentLineArg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] a=new String[2];
		System.out.println("Enter the company name:");
		a[0]=s.next();
		System.out.println("Enter the location:");
		a[1]=s.next();
		System.out.println(a[0] + " Technologies " + a[1]);
		s.close();
	}

}