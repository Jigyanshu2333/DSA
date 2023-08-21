/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class ReverseADLL
{
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
        while(head.next!=null){
            head = head.next;
        }
        Node list = new Node(head.data);
        Node ans = list;
        head = head.prev;
        while(head!=null){
            list.next = new Node(head.data);
            list = list.next;
            head = head.prev;
        }
        return ans;
    }
}