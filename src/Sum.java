public class Sum {
    private int target;
    private int[] nums; 
    private int[] indices;
    private int nums_len;
    
    public int[] getIndices(int target, int[] nums){
        
        this.target = target;
        this.nums = nums;
        nums_len = nums.length;

        for(int i = 0; i < nums_len; i++){
            int a;
            for(a = 0; a < nums_len; a++){
                if(nums[a] + nums[i] == target){
                    return new int[] {a,i};
                }
            }
        }
        return null;
    }
}
