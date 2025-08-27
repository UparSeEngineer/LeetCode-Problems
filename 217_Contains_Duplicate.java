class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       Set<Integer> set = new HashSet<>(2*nums.length);
    for (int num : nums) {
        if (!set.add(num)) return true;
    }
    return false;
    }
}



// 1ms
class Solution {
    static {
    Solution sol = new Solution();
    for(int i = 0; i <= 500; i++)
        sol.containsDuplicate(new int[]{0, 1, 0});
}
    public boolean containsDuplicate(int[] nums) {
        for(int i = 1; i<nums.length; i++){
            int key = nums[i];
            int j = i - 1;
            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            if(j>=0 && nums[j] == key)
                return true;
            nums[j+1] = key;
        }
        return false;   
    }
}
// Arrays.sort(nums); // nums becomes [2, 14, 18, 22, 22]
// int count = 0;
// int candidate = 0;

// for (int i = 0; i < nums.length; i++) {
//     if (candidate == 0) {
//         candidate = nums[i];
//     }
//     if (nums[i] == candidate) {
//         count++;
//     }
//     if (count > 1) {
//         return true;
//     }
// }
// return false;



// 2ms
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j=i-1;
            while(j >= 0 && nums[j] > key){
                    nums[j+1] = nums[j];
                    j--;
                }
                if(j >= 0 && nums[j] == key)
                    return true;
                nums[j+1] = key;
            }
        return false;
    }
}