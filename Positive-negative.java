import java.util.*;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number:");
		int n=s.nextInt();
		if(n<0) {
			System.out.println("the number "+n+" is negative.");
		}
		else if(n>0) {
			System.out.println("the number "+n+" is positive.");
		}
		else {
			System.out.println("the number "+n+" is zero.");
		}
		s.close();
	}

}
