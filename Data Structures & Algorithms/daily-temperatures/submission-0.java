class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res=new int[temp.length];
        for(int i=0;i<temp.length-1;i++){
            System.out.println("i---->"+i);
            int right=i+1;
            System.out.println("right---->"+right);
            while(right<temp.length){
                if(temp[i]<temp[right]){
                    System.out.println("temp[i]---->"+temp[i]);
                    System.out.println("temp[right]---->"+temp[right]);
                    res[i]=right-i;
                    break;
                }
                right++;
            }
        }
        res[temp.length-1]=0;
        return res;
    }
}
