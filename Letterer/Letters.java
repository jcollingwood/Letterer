import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Letters {

	private final static String LETTERS_FILE = "letters.txt";
	
	private static Letter[] letters;

	public Letters(){
		letters = new Letter[26];
		try{
			FileInputStream fstream = new FileInputStream(LETTERS_FILE);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			String strLine;
			String letterString[] = new String[7];
			int letterLine = 0;
			
			while ((strLine = br.readLine()) != null)   {
				letterString[letterLine%7] = strLine;
				letterLine++;
				if(letterLine%7 == 0){
					letters[letterLine/7 - 1] = new Letter(letterString);
					letterString = new String[7];
				}
			}
			br.close();
		} catch(IOException e){
			e.printStackTrace();
			System.out.println("**********\nERROR READING --->  " + LETTERS_FILE + "\n**********");
		}
	}

	public static Letter getLetter(int index){
		return letters[index];
	}
	
	public Letter[] getLetters(){
		return letters;
	}


}
