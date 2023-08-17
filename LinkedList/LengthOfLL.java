/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class LengthOfLL {
    public static int length(Node head){
        //Your code goes here
        int size = 0;
        while(head!=null){
            size++;
            head = head.next;
        }
        return size;
    }
}