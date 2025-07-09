import java.util.*;
public class LowerToUpper {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your character: ");
		char c=s.next().charAt(0);
		if(c>='A' && c<='Z') {
			c=(char)(c+32);
		}
		else if(c>='a' && c<='z'){
			c=(char)(c-32);
		}
		System.out.println("character is: "+c);
		s.close();
	}

}
