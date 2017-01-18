
public class StringProcessor {

	public static void convertString(String message){
		//gets array of letters from user input
		Letter[] msgArray = new Letter[message.length()];
		for(int i = 0; i < message.length(); i++){
			msgArray[i] = LetterProcessor.getLetter(message.charAt(i));
		}
		
		//uses the leading and trailing matrices to massage spacing of each letter so it fits with adjacent letters
		//TODO
		
		//creates and prints the word line by line
		for(int i = 0; i < 7; i++){
			String line = "";
			for(int j = 0; j < message.length(); j++){
				line = line + msgArray[j].getLetterLine(i);
			}
			System.out.println(line);
		}
	}
	
	private String addWhitespace(int numSpaces){
		String whitespace = "";
		for(int i = 0; i < numSpaces; i++){
			whitespace = whitespace + " ";
		}
		return whitespace;
	}
	
}
