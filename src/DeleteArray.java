public class DeleteArray {

    public static void main(String[] args)
    {
        int[] a = {1,23,5,2,32,3};
        deleteFromStart(a);


    }

    public static void deleteFromStart(int[] array)
    {
        for(int i=0;i<array.length-2;i++)
        {
            array[i]=array[i+2];
        }
        printArray(array);

    }

    public static void deleteFromEnd(int[] array)
    {

    }

    public static void deleteFromMid(int[] array)
    {

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
