public class JavaCharacaterisDigitintcodePointExample1 {
public static void main(String[] args) {		
		// Initialize the codePoints.
		int codepoint1 = 55;
		int codepoint2 = 32;
		char codepoint3 = ' ';
		int codepoint4 = 49;
		int codepoint5 = 200;	
		// Check whether a particular codePoint is a digit or not.
		boolean check1 = Character.isDigit(codepoint1);
		boolean check2 = Character.isDigit(codepoint2);
		boolean check3 = Character.isDigit(codepoint3);
		boolean check4 = Character.isDigit(codepoint4);
		boolean check5 = Character.isDigit(codepoint5);
		// Print the result.
		if(check1){
		System.out.print("The codePoint \'"+codepoint1+"\' is a digit.\n");
		}
		else{
		System.out.print("The codePoint \'"+codepoint1+"\' is not a digit.\n");
		}
		if(check2){
		System.out.print("The codePoint \'"+codepoint2+"\' is a digit.\n");
		}
		else{
		System.out.print("The codePoint \'"+codepoint2+"\' is not a digit.\n");
		}
		if(check3){
		System.out.print("The codePoint \'"+codepoint3+"\' is a digit.\n");
		}
		else{
		System.out.print("The codePoint \'"+codepoint3+"\' is not a digit.\n");
		}	
		if(check4){
		System.out.print("The codePoint \'"+codepoint4+"\' is a digit.\n");
		}
		else{
		System.out.print("The codePoint \'"+codepoint4+"\' is not a digit.\n");
		}
		if(check5){
		System.out.print("The codePoint \'"+codepoint5+"\' is a digit.\n");
		}
		else{
		System.out.print("The codePoint \'"+codepoint5+"\' is not a digit.\n");
		}	
	}
}

