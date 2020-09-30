import javax.naming.event.NamingEvent;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class multiPlayer {

    public static void main(String[] args) {
        String[] toc_all = {"AndroidAppXC", "IOSAppXC", "EmtMobileAppAndroid", "EmtMobileAppIOS", "nrMobileAppAndroid", "nrMobileAppIOS", "vtMobileAppAndroid", "vtMobileAppIOS", "xcMobileWeb", "emtMobileWeb", "northernMobileWeb", "X5e4dsk3sG96sEr1MobileWeb", "gcMobileWeb", "gaMobileWeb", "WB13e3510aLN", "srMobileWeb", "WBa62c7ffbWR", "tfwMobileWeb", "tfwMobileAppIOS", "tfwMobileAppAndroid", "emrMobileWeb", "awcMobileWeb", "awcMobileAppIOS", "awcMobileAppAndroid"};
        String[] toc_all_web = {"xcMobileWeb","emtMobileWeb","northernMobileWeb","X5e4dsk3sG96sEr1MobileWeb","gcMobileWeb","gaMobileWeb","WB13e3510aLN","srMobileWeb","WBa62c7ffbWR", "tfwMobileWeb","emrMobileWeb","awcMobileWeb"};
        String[]  toc_all_seasons = {"crosscountrytrainsSeasons","eastmidlandstrainsSeasons","northernrailwaySeasons","virgintrainsSeasons","greaterangliaSeasons","londonnorthwesternSeasons","scotrailSeasons","westmidlandsrailSeasons","trainlineSeasons", "transportforWalesSeasons","eastmidlandsrailSeasons","avantiwestcoastSeasons"};

        System.out.println(toc_all[8]);
        System.out.println(toc_all_web[10]);
        System.out.println(toc_all_seasons[9]);

         String[] preferred = {"smart"};
        String[] available = {"specd"};

        List<String> list1 = Arrays.asList(preferred);
        List<String> list2 = Arrays.asList(available);
        

        for(String s : list1)
        {
           if( list2.contains(s))
            System.out.println("mad");

        }

        int h = 3;
        int b = (--h) + (h=10);

        System.out.println(b);



        System.out.println(list2.contains(list1));


    }
}
