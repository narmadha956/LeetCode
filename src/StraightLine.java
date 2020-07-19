import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

public class StraightLine {

    public static void main(String[] args)
    {
       // int[][] coordinates = { {"Mr. ", "Mrs. ", "Ms. "}, {"Kumar"} };
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        int start = ThreadLocalRandom.current().nextInt(0, 20);
        int end = ThreadLocalRandom.current().nextInt(30, 150);
        Calendar calendar = Calendar.getInstance();
        System.out.println(start);
        calendar.add(Calendar.DAY_OF_MONTH, start);
        String startDate = df.format(calendar.getTime());
        System.out.println(startDate);
        System.out.println(end);
        calendar.add(Calendar.DAY_OF_MONTH, end);
        System.out.println(df.format(calendar.getTime()));

    }

        public static boolean checkStraightLine(int[][] coordinates) {


            int temp = coordinates[0][1]-coordinates[0][0];

            for(int i=0;i<coordinates.length;i++)
            {
                if(!((coordinates[0][i+1]-coordinates[0][i])==temp))
                    return false;
            }
            return true;

        }

}
