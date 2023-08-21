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

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

public class DeleteNodeInDLL
{
    public static Node deleteLastNode(Node head) {
        // Write your code here
        Node list = head;
        if(head.next==null){
            return null;
        }
        while(head.next.next!=null){
            head = head.next;
        }
        head.next = null;
        return list;
    }
}