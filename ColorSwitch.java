import java.util.*;
public class ColorSwitch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter letter in G,R,B,Y,W,O for printing color:");
		char c=s.next().charAt(0);
		switch(c) {
		case 'G':
			System.out.println("Green");
			break;
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		default:
			System.out.println("no colors available");
			break;
		}
		s.close();
	}

}
