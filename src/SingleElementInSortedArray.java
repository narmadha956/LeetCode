public class SingleElementInSortedArray {

    public static void main(String[] args) {
        int result = singleNonDuplicateLeetExplained(new int[]{1, 1, 2, 3, 3});

    }


    public static int singleNonDuplicate(int[] nums) {
        if (nums.length > 1) {
            int j = (nums.length - 1);
            for (int i = 0; i < ((nums.length) / 2) + 1; i = i + 2) {
                if ((nums[i] != nums[i + 1]))
                    return nums[i];
                else if
                (nums[j] != nums[j - 1])
                    return nums[j];
                j = j - 2;
            }
            return 0;
        } else
            return nums[0];


    }
    public static int singleNonDuplicateLeet(int[] nums) {

        int start=0, end = nums.length-1, mid;
        while( start < end ) {
            mid = start + (end-start)/2;
            if( nums[mid] == nums[mid ^ 1] )
                start = mid + 1;
            else
                end = mid;
        }
        return nums[start];
    }

    public static int singleNonDuplicateLeetExplained(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = (left + right)/2;
            if((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1]))
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }

}
