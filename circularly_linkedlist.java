
 
import java.util.Scanner;








public class circularly_linkedlist { 
	class node{
		int num;
		node next;
		public node(int num){
			
			this.num=num;
			
		}
	}
	public  void add(int num) {
		node faltu= new node(num);
		if(top==null)
		{
		top=faltu;
		tail=faltu;
		faltu.next=top;
		}
		else
		{
			tail.next=faltu;
			tail=faltu;
			tail.next=top;
		}
		System.out.println("______________________successfull________________________");
		
	}
public  void display() {
	node t = top;
	if (top==null)
		System.out.println("List is empty");
	while(t!=tail)
	{
		System.out.print(t.num+ " ");
		t=t.next;
	}
	System.out.println("");
	System.out.println("______________________Displaying successfull________________________");
	}
public void delete() {
	node t=null;
	if(top==null)
		System.out.print("List is ALREADY Empty");
	else
	{t=top;
	top=top.next;
	t=null;
		
	}System.out.println("______________________successfull________________________");
}
public void addlast(int num) {
	node t = new node(num);
	if(top==null)
		top=t;
	else
	{
	
	node f=top;
while(f.next!=null)
	f=f.next;
f.next=t;
	}System.out.println("______________________successfull________________________");
	
}

	public node top= null;
	public node tail=null;
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int data,n,flag1;
		flag1=0;
		
		Scanner scan=new Scanner(System.in);
		circularly_linkedlist a = new circularly_linkedlist();
		a.add(1);
		a.add(2);
			a.add(3);
			a.add(4);
			a.add(5);
			a.add(6);
			a.display();
		
	
	}}
		
