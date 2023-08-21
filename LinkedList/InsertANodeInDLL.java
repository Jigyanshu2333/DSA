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

public class InsertANodeInDLL
{
    public static Node insertAtTail(Node list, int K) {
        // Write your code here
        if(list == null){
            return new Node(K);
        }
        Node head = list;
        while(list.next!=null){
            list = list.next;
        }
        list.next = new Node(K);
        return head;
    }
}