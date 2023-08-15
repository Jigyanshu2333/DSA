import java.util.Stack;
public class PreOrder {

/*
	
	Following the structure used for Binary Tree
	
	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */


	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			BinaryTreeNode<Integer> node = stack.pop();
			System.out.print(node.data+" ");
			if(node.right!=null)
				stack.push(node.right);
			if(node.left!=null)
				stack.push(node.left);
		}
	}

}

