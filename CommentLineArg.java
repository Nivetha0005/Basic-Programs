public class CommentLineArg {

	public static void main(String[] args) {
	if (args.length != 2) {
            System.out.println("Please enter exactly two arguments: <CompanyName> <City>");
            return;
        }

        String companyName = args[0];
        String city = args[1];

        System.out.println(companyName + " Technologies " + city);
	}

}
