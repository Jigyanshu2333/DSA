import java.util.* ;
import java.io.*; 
public class TreeTraversals {

/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/

	public static void getOrder(BinaryTreeNode<Integer> root,List<Integer> inOrder,List<Integer> preOrder,List<Integer> postOrder){
		if(root == null){
			return;
		}
		preOrder.add(root.data);
		getOrder(root.left, inOrder, preOrder, postOrder);
		inOrder.add(root.data);
		getOrder(root.right, inOrder, preOrder, postOrder);
		postOrder.add(root.data);
	}
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> inOrder = new ArrayList<>();
		List<Integer> preOrder = new ArrayList<>();
		List<Integer> postOrder = new ArrayList<>();
		getOrder(root,inOrder,preOrder,postOrder);
		list.add(inOrder);
		list.add(preOrder);
		list.add(postOrder);
		return list;
    }
}


