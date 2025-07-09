import java.util.*;
public class GenderInterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your gender(female/male): ");
		String g=s.next();
		System.out.println("Enter your age: ");
		int a=s.nextInt();
		if(g.equals("female") && (a>=1 && a<=58)) {
			System.out.println("Your interest % is: 8.2%");
		}
		else if(g.equals("female") && (a>=59 && a<=100)) {
			System.out.println("Your interest % is: 9.2%");
		}
		else if(g.equals("male") && (a>=1 && a<=58)) {
			System.out.println("Your interest % is: 8.4%");
		}
		else if(g.equals("male") && (a>=59 && a<=100)) {
			System.out.println("Your interest % is: 10.5%");
		}
		s.close();
	}

}
