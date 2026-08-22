class Solution {
    public int findDuplicate(int[] nums) {
        Scanner sc =new Scanner(System.in);
        HashSet<Integer> duplicate = new HashSet<>();
        int res = 0;
        int len=nums.length;
        for(int i= 0;i<len;i++){
        if(duplicate.contains(nums[i])){
            res = nums[i];
        
        }else{
        duplicate.add(nums[i]);
        }
        }
        return res;

        
    }
    
}
