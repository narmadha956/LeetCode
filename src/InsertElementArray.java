public class InsertElementArray {

    public static void main(String[] args)
    {
        int[] a = {1,23,5,2,32,3};
        int x = 15;
        insertElementAtStart(a,x);
        insertElementAtEnd(a,x);
        insertElementInMiddle(a,x);

    }

    public static void insertElementInMiddle(int[] a, int x)
    {
        int mid = a.length/2;
        for(int i =a.length-1;i>mid;i--)
        {
            a[i]=a[i-1];
        }
        a[mid]=x;
        printArray(a);

    }

    public static void insertElementAtStart(int[] a, int x)
    {
        for(int i=a.length-1;i>=1;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=x;
        printArray(a);

    }

    public static void insertElementAtEnd(int[] a, int y)
    {
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        a[a.length-1] = y;
      printArray(a);

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
