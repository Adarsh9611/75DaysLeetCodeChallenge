class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int total=n*n;
        long sum=0;
        long squaresum=0;
        for(int[] row:grid){
            for(int num:row)
            {
              sum+=num;
              squaresum+=(long)num*num;
            }
        }
        long expectedsum=(long) total*(total+1)/2;
        long expectedsquaresum=(long) total*(total+1)*(2L*total+1)/6;
        long diff1=sum-expectedsum;
        long diff2=squaresum-expectedsquaresum;
        long sumrm=diff2/diff1;
        long repeated=(diff1+sumrm)/2;
        long missing=repeated-diff1;
        return new int[]{(int) repeated,(int) missing };
           }
}