
public class Letter {

	private String[] letter;
	private int width;
	private int[] leadingMatrix;
	private int[] trailingMatrix;

	public Letter(String[] letter){
		this.letter = letter;
		this.width = calculateWidth();
		this.leadingMatrix = null;
		this.trailingMatrix = null;
	}

	public String getLetterLine(int line){
		return letter[line];
	}

	public int[] getLeadingMatrix(){
		if(leadingMatrix != null)
			return leadingMatrix;
		else{
			calculateLeadingMatrix();
		}
		return leadingMatrix;
	}

	public int[] getTrailingMatrix(){
		if(trailingMatrix != null)
			return trailingMatrix;
		else{
			calculateTrailingMatrix();
		}
		return trailingMatrix;
	}

	private void calculateLeadingMatrix(){
		leadingMatrix = new int[7];
		int lineNum = 0;
		boolean lead = false;
		for(String line : letter){
			for(int i = 0; i < line.length(); i++){
				if(!lead && line.charAt(i) != ' '){
					leadingMatrix[lineNum] = i;
					lead = true;
				}
			}
			lead = false;
		}
	}

	private void calculateTrailingMatrix(){
		trailingMatrix = new int[7];
		int lineNum = 0;
		for(String line : letter){
			trailingMatrix[lineNum] = line.length() - width;
		}
	}

	private int calculateWidth(){
		int width = 0;
		for(String line : letter){
			if(line.length() > width)
				width = line.length();
		}
		return width;
	}


}
