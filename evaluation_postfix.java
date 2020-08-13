import java.util.Stack;
public class evaluation_postfix {
static int postfix(String str) {int num;
	Stack<Integer> stack= new Stack<>();
	for(int i=0;i<str.length();i++)
	{char c=str.charAt(i);
		if(c==' ')
		continue;
	else if(Character.isDigit(str.charAt(i)))
	{num=0;
		while(Character.isDigit(c)) {
			
		num=num*10+(int)(c-'0');
	i++;c=str.charAt(i);}
	stack.push(num);
	}
	else { int n=stack.pop();
	int n2=stack.pop();
	
		switch(str.charAt(i)) {
		case '+' : stack.push(n+n2);
		break;
		case '-' : stack.push(n2-n);
		break;
		case '*' : stack.push(n*n2);
		break;
		case '/' : stack.push(n2/n);
		break;
		default : return  0;
		
		}
		
	}
		
	}
return stack.pop();}
	public static void main(String[] args) {
	String str="2 3 1 * + 9 -";
	
	System.out.println("Answer : "+ postfix(str));
 str="100 200 + 2 / 5 * 7 +";
	System.out.println("Answer : "+ postfix(str));
		// TODO Auto-generated method stub
	}

}
