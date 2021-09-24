import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Locale locale = Locale.getDefault();


        if (locale.getCountry().equals("EN")) { //K
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextToK.xml");
            Change converter = context.getBean("celsiusConverterF", Change.class);
            Scanner in=new Scanner(System.in);
            converter.convert(in.nextDouble());
            context.close();
        }
        else { //F
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextToF.xml");
            Change converter = context.getBean("celsiusConverterK", Change.class);
            Scanner in=new Scanner(System.in);
            converter.convert(in.nextDouble());
            context.close();
        }
    }
}
