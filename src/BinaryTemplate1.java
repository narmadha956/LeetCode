import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * List is sorted, find the element
 */
public class BinaryTemplate1 {

    public static int binarySearch(ArrayList<Integer> list, int target)
    {
        if(list.size()==0)
            return -1;

        int left =0 ;
        int right = list.size()-1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;

            if(list.get(mid)==target)
                return mid;

            else if(list.get(mid)<target)
            {
                left=mid+1;
            }
            else
                right = mid-1;
        }

        return -1;


    }

    public static void main(String[] args)
    {

        ArrayList<Integer> listOfNum =  new ArrayList<>();
        listOfNum.add(1);
        listOfNum.add(2);
        listOfNum.add(3);
        listOfNum.add(6);
        listOfNum.add(7);

        listOfNum.add(8);
        binarySearch(listOfNum,3);

        System.out.println(binarySearch(listOfNum,8));





    }
}
