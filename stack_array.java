
public class stack_array {
static final int MAX=1000;
int a[]=new int[MAX];
int top=-1;
void display() {
	if(top<0)
		System.out.println("Stack Underflow");
	else
		
	{
		System.out.println("");
		int d=top;
		while(d>=0)
			System.out.print(a[d--]+" ");
		System.out.println("");
	}
		
}
void push(int x)
{if(top>=(MAX-1))
	System.out.println("Stack overflow");

else
{top++;
	a[top]=x;
}}
int pop()
{int x;
	if(top<0)
{
	System.out.println("Stack Underflow");
	return 0;
}

else
{x=a[top];
top--;
	
	return x;
}	
	
}
int see()
{int x;
if(top<0)
{
	System.out.println("Stack Underflow");
	return 0;
}

else
{x=a[top];
	
	return x;
}	
}
public static void main(String args[])
		{stack_array s= new stack_array();
	s.push(1);
		s.push(2);
		s.push(4);
		s.push(5);
		s.display();
		
		System.out.println(s.pop()+" popped ");
		s.display();
	int n=s.see();
	System.out.print(n);
		}
}
