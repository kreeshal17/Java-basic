
//queueu using linkedlist
//yaha add from rare last bata ra remove from front suru bata hunxa hai huehue
class q{
    Node head=null;
    Node tail=null;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    boolean isEmpty()
    {
        return head==null & tail==null;
}
public void add(int data)

{
    Node  newNode=new Node(data);
    if(tail==null)
    {
        tail=head=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
    

}
public int remove()
{
    if(isEmpty())
    {
        return -1;
    }
    int front= head.data;
    if(head==tail)
    {
        tail=null;
       
    }
    head=head.next;
    return front;

}
public int peek()
{
    if(isEmpty())
    {
        return -1;
    }
    return head.data;

}
    
    
}
    public class implementation {
        public static void main(String args[])
        {
            q qq= new q();
            qq.add(1);
            qq.add(2);
            qq.add(3);
            qq.add(4);
            qq.remove();
            while(!qq.isEmpty())
            {
                System.out.println(qq.peek());
                qq.remove();
            }
          

        }
}
