class TwoSum {
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     if(map.containsKey(target - nums[i])){
        //         return new int[]{map.get(target-nums[i]), i};
        //     }
        //     map.put(nums[i], i);
        // }
        // return null;     
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;  
    }
}