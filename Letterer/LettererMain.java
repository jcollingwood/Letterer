import java.util.Scanner;

public class LettererMain {

	public static Letters letters;

	public static void main(String[] args) {

		System.out.println("WELCOME TO THE LETTERER!\n\n"+
				"TYPE IN YOUR MESSAGE AND WE WILL CONVERT IT INTO JUMBO LETTERS!");

		initialSetup();

		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n\nEnter your message: ");
			String message = scanner.next();
			StringProcessor.convertString(message);
		}
	}

	private static void initialSetup(){
		letters = new Letters();
	}

}
