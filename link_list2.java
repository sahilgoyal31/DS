import java.util.*;





public class link_list2 { 
	class node{
		int num;
		node next;
		public node(int num){
			
			this.num=num;
			this.next= null;
		}
	}
	public  void add(int num) {
		node faltu= new node(num);
		if(top==null)
		{
		top=faltu;
		}
		else
		{
			faltu.next=top;
			top=faltu;
		}
		
	}
public  void display() {
	node t = top;
	if (top==null)
		System.out.println("List is empty");
	while(t!=null)
	{
		System.out.print(t.num+ " ");
		t=t.next;
	}
	System.out.println("");
	System.out.println("-------------Displaying successfull---------------");
	}
public void delete() {
	
}
public void addlast(int num) {
	
}
public void deletelast() {
	
}
	public node top= null;
	public static void main(String args[]) {
		int data,n,flag1;
		flag1=0;
		Scanner scan=new Scanner(System.in);
		link_list2 a = new link_list2();
		while(flag1==0)
		{System.out.println("_______________________________Controller for link list (Press button according to your choice):_________________________");
		System.out.println("Press 1 : To display link list");
		System.out.println("Press 2 : To add element");
		System.out.println("Press 3: To delete element");
		System.out.println("Press 4 : To add element at last");
		System.out.println("Press 5 : To delete element at last");
		System.out.println("Press 6 : To Exit");
		
		n=scan.nextInt();
		switch(n)
		{
		case 1 : 
			System.out.println("Pressed 1 : LINK LIST");
			a.display();
			break;
		case 2 : 
			System.out.println("Pressed 2 :  Enter number to add ");
			data=scan.nextInt();
			a.add(data);
			break;
		case 3 : 
			System.out.println("Pressed 3 : DELETING");
			a.delete();
			break;
		case 4 : 
			System.out.println("Pressed 4 : Enter number wanted to add at last ");
			break;
		case 5 : 
			System.out.println("Pressed 5 : Deleting last element");
			break;
		case 6 :
			System.out.println("Pressed 6 : Exited successfully");
			
			flag1=1;
			break;
			default :
				System.out.println("Enter option between 1-6");
				break;
		}
		
		
		
		}
scan.close();	}

}
