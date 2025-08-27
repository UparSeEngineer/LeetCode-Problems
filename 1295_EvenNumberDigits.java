class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public boolean even(int num){
        int evenDigit = digit(num);
        return (evenDigit % 2 == 0);
    }

    public int digit(int num){
        return ((int)Math.log10(num)+1);
    }
}