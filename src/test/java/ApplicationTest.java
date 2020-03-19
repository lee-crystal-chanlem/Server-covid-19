import com.lwy.covid.Applcation;
import com.lwy.covid.entity.Country;
import com.lwy.covid.service.CountryService;
import com.lwy.covid.service.CountryServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @author : lwy-mbp
 * create at:  2020-03-14  19:02
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Applcation.class)
public class ApplicationTest {
    @Autowired
    private CountryService countryService;

    @Test
    public void test(){
//
//        Date date = new Date();
//        Country c = new Country();
//        c.setTime(date);
//        c.setConfirmNum(100);
//        c.setDeadNum(200);
//        c.setHealNum(300);
//        c.setCountryId(2);
//        c.setCountryName("cn");
//        countryService.insertCountry(c);
//        List<Country> all = countryService.getAllByTime(new Date());
//        System.out.println("大小: "+all.size());
//        for(Country c:all){
//            System.out.println(c);
//        }
    }
}
