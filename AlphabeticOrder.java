import java.util.*;
public class AlphabeticOrder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the alphabets one by one:");
		char n=s.next().charAt(0);
		char n1=s.next().charAt(0);
		if(n<n1) {
			System.out.println(n+" "+n1);
		}
		else {
			System.out.println(n1+" "+n);
		}
		s.close();
	}

}