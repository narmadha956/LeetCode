public class ConsecutiveOne {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int ans = 0;

        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]==1)
                temp = temp+1;

            if(temp>ans)
                ans =temp;

            if(nums[i]==0)
                temp=0;
        }
        return ans;

    }

    public static void main(String[] args)
    {
        int[] nums = {1,1,0,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
