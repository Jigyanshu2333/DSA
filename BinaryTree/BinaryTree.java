import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.plaf.synth.SynthStyleFactory;
public class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class PreOrderTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void printTree(Node root){
            if(root == null){
                System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data+" ");
            printTree(root.left);
            printTree(root.right);
        }
        public static void printInorderTree(Node root){
            if(root == null){
                System.out.print("-1 ");
                return;
            }
            printInorderTree(root.left);
            System.out.print(root.data+" ");
            printInorderTree(root.right);
        }
        public static void printPostorderTree(Node root){
            if(root == null){
                System.out.print("-1 ");
                return;
            }
            printPostorderTree(root.left);
            printPostorderTree(root.right);
            System.out.print(root.data+" ");
        }
        public static void printBFSTree(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    if(q.isEmpty()){
                        break;
                    }
                    System.out.println();
                    q.add(null);
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int countNodes(Node root){
            if(root == null){
                return 0;
            }
            int rs = countNodes(root.right);
            int ls = countNodes(root.left);
            return ls+rs+1;
        }
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftsum = sumOfNodes(root.left);
            int rightsum = sumOfNodes(root.right);
            return leftsum+rightsum+root.data;
        }
        public static int heightOfTree(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
        public static int diameterOFTree(Node root){
            if(root == null){
                return 0 ;
            }
            int diam1 = diameterOFTree(root.left);
            int diam2 = diameterOFTree(root.right);
            int diam3 = heightOfTree(root.left) + heightOfTree(root.right)+1;
            return Math.max(diam3,Math.max(diam1,diam2));
        }
        static class TreeInfo{
            int ht;
            int diam;
            TreeInfo(int ht ,int diam){
                this.ht = ht;
                this.diam = diam;
            }
        }
        public static TreeInfo DiameterOfTree2(Node root){
            if(root == null){
                return new TreeInfo(0,0);
            }
            TreeInfo left = DiameterOfTree2(root.left);
            TreeInfo right = DiameterOfTree2(root.right);
            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;
            int height = Math.max(left.ht,right.ht)+1;
            int diam = Math.max(Math.max(diam1,diam2), diam3);
            TreeInfo ans = new TreeInfo(height,diam);
            return ans;
        }
        
    }
        public static boolean isIdentical(Node root1,Node root2){
            if(root1==null && root2 == null){
                return true;
            }
            if(root1==null || root2==null){
                return false;
            }
            if(root1.data == root2.data){
                return isIdentical(root1.left, root2.left) && isIdentical(root1.right,root2.right);
            }
            return false;
        }
        public static boolean isSubTree(Node root1,Node root2){
            if(root2 == null){
                return true;
            }
            if(root1 == null){
                return false;
            }
            if(root1.data == root2.data){
                if(isIdentical(root1,root2)){
                    return true;
                }
            }
            return isSubTree(root1.left, root2) || isSubTree(root1.right, root2);
        }
    public static void main(String args[]){
        PreOrderTree tree1 = new PreOrderTree();
        int nodes1[] = {9,7,8,-1,-1,1,2,-1,-1,3,-1,-1,4,5,-1,-1,6,-1,-1};
        Node root1 = tree1.buildTree(nodes1);
        PreOrderTree tree2 = new PreOrderTree();
        //int nodes2[] = {1,2,-1,-1,3,-1,-1};
        //Node root2 = tree2.buildTree(nodes2);
        //System.out.println(root1.data+" "+root2.data);
        //tree1.printPostorderTree(root1);
        //tree2.printTree(root2);
        //System.out.println(isSubTree(root1,root2));
        tree1.printTree(root1);
    }
}