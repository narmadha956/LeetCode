public class DuplicateZero {

    public static void duplicateZeros(int[] arr) {

      for(int i=0; i<arr.length-1;i++)
      {
          if(arr[i]==0)
          {
              for(int j=arr.length-1;j>i+1;j--)
              {
                  arr[j]=arr[j-1];
              }
              arr[i+1]=0;
              i=i+1;
          }
      }
      printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }

    public static void insertElementInMiddle(int[] a, int x)
    {
        int mid = a.length/2;
        for(int i =a.length-1;i>mid;i--)
        {
            a[i]=a[i-1];
        }
        a[mid]=x;

    }

    public static void printArray(int[] a)
    {

        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            System.out.print(",");

        }
    }
}
