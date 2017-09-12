import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutations {
    private boolean visited[] = new boolean[6];    
     Map<Integer,List<Integer>>  listMap = new HashMap<>();
     
   public void dfs(int nums[], int depth, List<Integer> cur){
        if(nums == null)
            return;
        if(depth == nums.length)
        {   
             listMap.put(0, cur);
            System.out.println(cur);            
            return;
        }
       for(int i = 0; i < nums.length; i++){
           if(visited[i] == false){
                visited[i] = true;                 cur.add(nums[i]);
                 dfs(nums, depth + 1, cur);
                cur.remove(cur.size() - 1);
                visited[i] = false;           
                }
           }
     }
    
     public static void main(String args[]){
        Permutations permutations = new Permutations();
         List<Integer> cur = new ArrayList<Integer>();
        int nums[] = {6,0,7};
        permutations.dfs(nums, 0, cur);
       
     }
 }
