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


public class SearchElementInLL
{
    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
        int ans = 0;
        while(head!=null){
            if(head.data == k){
                ans++;
                break;
            }
            head = head.next;
        }
        return ans;
    }
}