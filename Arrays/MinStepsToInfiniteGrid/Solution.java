import java.util.ArrayList;

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps=0;
        /*
         * The difference between two points is the maximum absoulte difference between (i+1)th and ith 
         * co-ordinate
         */
        for(int i=0;i<A.size()-1;i++){
            int d=Math.max(Math.abs(B.get(i+1)-B.get(i)),Math.abs(A.get(i+1)-A.get(i)));
            steps+=d;
        }
        return steps;
    }
}
