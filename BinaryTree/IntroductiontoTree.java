public class Solution {
    public static int numberOfNodes(int N){
        // Write your code here.
        if(N == 1){
            return 1;
        }
        return 2*numberOfNodes(N-1);
    }
}