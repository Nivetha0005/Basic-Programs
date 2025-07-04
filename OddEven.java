import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		if((n&1)==0) {
			System.out.println(n+" is Even number.");
		}
		else {
			System.out.println(n+" is Odd number.");
		}
		s.close();

	}

}