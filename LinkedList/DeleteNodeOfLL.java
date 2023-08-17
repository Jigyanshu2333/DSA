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
 };

 *****************************************************************/

public class DeleteNodeOfLL {
    public static Node deleteLast(Node list){
        // Write your code here
        Node curr = list;
        if(list.next==null){
            return null;
        }
        while(list.next.next!=null){
            list = list.next;
        }
        list.next = null;
        return curr;
    }
}