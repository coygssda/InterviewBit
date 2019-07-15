import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long curr_sum=0;
        long max_sum=0;
ArrayList<Integer> ans=new ArrayList<>();
ArrayList<Integer> copy =new ArrayList<>();
for(int i=0;i<A.size();i++){
    if(A.get(i)>=0){
        curr_sum+=A.get(i);
        copy.add(A.get(i));
    }
    else{
        curr_sum=0;
        copy.clear();
    }
    if(curr_sum>max_sum || (curr_sum==max_sum && ans.size()<copy.size())){
        max_sum=curr_sum;
        ans.clear();
        ans.addAll(copy);
    }
}
return ans;
    }
    
}

