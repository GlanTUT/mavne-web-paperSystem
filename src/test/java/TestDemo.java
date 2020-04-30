/**
 * @Package PACKAGE_NAME
 * @author GlanTUT
 * @date 2020/4/29 17:40
 * @version V1.0
 */

import java.util.HashMap;

/**
 @author GlanTUT
 @create 2020-04 17:40
 */
public class TestDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < 50; i++) {
            System.out.println("hello i");
        }

        while (true) {
            map.put("name", "tom");
            map.put("age", "18");
            map.put("email", "2292262327");

            String age = map.get("age");
            System.out.println(age);

            TestDemo.TestDemo(null);
        }
    }

    public void TestSpringDemo(String[] args){

    }

    public static void TestDemo(String[] args){
        System.out.println("hello temp");
    }
}



