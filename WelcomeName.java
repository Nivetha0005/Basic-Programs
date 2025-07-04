public class WelcomeName {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Please enter your name as a command line argument");
			return;
		}
		String name=args[0];
		System.out.println("Welcome "+name);
	}

}
