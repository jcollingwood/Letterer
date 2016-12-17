
public class LetterProcessor {

	public static Letter getLetter(char letter){
		switch(Character.toLowerCase(letter)){
		case 'a' : return Letters.getLetter(0);
		case 'b' : return Letters.getLetter(1);
		case 'c' : return Letters.getLetter(2);
		case 'd' : return Letters.getLetter(3);
		case 'e' : return Letters.getLetter(4);
		case 'f' : return Letters.getLetter(5);
		case 'g' : return Letters.getLetter(6);
		case 'h' : return Letters.getLetter(7);
		case 'i' : return Letters.getLetter(8);
		case 'j' : return Letters.getLetter(9);
		case 'k' : return Letters.getLetter(10);
		case 'l' : return Letters.getLetter(11);
		case 'm' : return Letters.getLetter(12);
		case 'n' : return Letters.getLetter(13);
		case 'o' : return Letters.getLetter(14);
		case 'p' : return Letters.getLetter(15);
		case 'q' : return Letters.getLetter(16);
		case 'r' : return Letters.getLetter(17);
		case 's' : return Letters.getLetter(18);
		case 't' : return Letters.getLetter(19);
		case 'u' : return Letters.getLetter(20);
		case 'v' : return Letters.getLetter(21);
		case 'w' : return Letters.getLetter(22);
		case 'x' : return Letters.getLetter(23);
		case 'y' : return Letters.getLetter(24);
		case 'z' : return Letters.getLetter(25);
		default : return null;
		}
		
	}
	
}
