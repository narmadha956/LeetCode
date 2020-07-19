/*
You are given an API bool isBadVersion(version) which will return whether version is bad.
Implement a function to find the first bad version.
You should minimize the number of calls to the API.

Example :
Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version.

 */

import java.util.Random;

public class FirstBadVersion {


    public static void main(String[] args) {
       // firstBadVersion(27);
        System.out.println( "result "+firstBadVersion(27));
    }

    //1234567
    //FFFTTTT
    public static int firstBadVersion(int n) {

        int k = new Random().nextInt(n);
        System.out.println(k);

        for(int i = 1; i<=n;i++)
        {
          if(isBadVersion(i))
              return i;
        }

        return n;
    }

    static boolean isBadVersion(int badNum, int i) {
        if (i < badNum)
            return false;
        else
            return true;
    }

    static boolean isBadVersion( int i) {
        if (i ==1)
            return false;
        else
            return true;
    }

    public int firstBadVersionBinarySearch(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


}


