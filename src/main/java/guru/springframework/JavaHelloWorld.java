package guru.springframework;


/**
 * Created by jt on 2018-12-09.
 */
public class JavaHelloWorld {

    public String getHello(){
        return "Hello World";
    }


    public String findBug(String s) throws Exception {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(String.format(".%s", s.charAt(i)));
        }
        return s;
    }

}
