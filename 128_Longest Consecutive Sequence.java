class Solution {
    public int longestConsecutive(int[] nums) {
        int longestlength = 0;
        Map<Integer,Boolean> exploredMap = new HashMap<>();
        for(int num :nums){
            exploredMap.put(num, Boolean.FALSE);
        }

           for (int num : nums){
            int currlength = 1;

            int nextnum = num + 1;
            while(exploredMap.containsKey(nextnum) && exploredMap.get(nextnum)==false){
                currlength++;
                exploredMap.put(nextnum, Boolean.TRUE);
                nextnum++;
            }
            int prevnum = num - 1;
            while(exploredMap.containsKey(prevnum) && exploredMap.get(prevnum)==false){
                currlength++;
                exploredMap.put(prevnum, Boolean.TRUE);
                prevnum--;
            }
            longestlength = Math.max(longestlength, currlength);
        }
        return longestlength;
    }
}
