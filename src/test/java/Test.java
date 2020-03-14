import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : lwy-mbp
 * create at:  2020-03-14  19:46
 * @description:
 */

public class Test {

    @org.junit.Test
    public void test(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
    }
}
