import java.util.Scanner;

public class LettererMain {

	public static Letters letters;
	public final static String EXIT = "[exit]";

	public static void main(String[] args) {

		System.out.println("WELCOME TO THE LETTERER!\n\n"+
				"TYPE IN YOUR MESSAGE AND WE WILL CONVERT IT INTO JUMBO LETTERS!");
		System.out.println("\ntype \"[exit]\" to exit program");
		
		initialSetup();
		
		boolean done = false;

		while(!done){
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n\nEnter your message: ");
			String message = scanner.next();
			if(!EXIT.equals(message)){
				StringProcessor.convertString(message);
			}
			else {
				scanner.close();
				done = true;
			}
		}
	}

	private static void initialSetup(){
		letters = new Letters();
	}

}
