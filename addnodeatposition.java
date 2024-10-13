class Node{
int data;
Node next;
Node(int x)
{data=x;
next=null;
}
}
class addnodeatposition{
public static void main(String [] args)
{ 
      Node head;
 Node tenp= new Node(10);
Node temp1=new Node(20);
Node temp2=new Node(30);
    Node temp3=new Node(40);
  head=tenp;
tenp.next=temp1;
temp1.next=temp2;
    temp2.next=temp3;
    addnodeatposition no=new  addnodeatposition();
    head=no.atgivenpos(1,35,head);
  
    head=no.atgivenpos(3,25,head);
    head=no.atgivenpos(4,75,head);
    head=no.atgivenpos(1,90,head);
no.printList(head);
                                                 
}
public Node  atgivenpos(int position,int data,Node head){
    Node node = new Node(data);
		if(position== 1){
			node.next = head;
            
			head = node;
           
            
		} else {
			Node previous = head;
			int count = 1; 

			while(count < position-1 ){
				previous = previous.next;
				count++;
			}

			Node current = previous.next;
			previous.next = node;
			node.next = current;
        
            
		}

return head;
	}
    

public static void printList(Node head)
{     
    Node t=head;
    while(t !=null)
    {
        System.out.println(t.data);
        t=t.next;
    }
} 
}