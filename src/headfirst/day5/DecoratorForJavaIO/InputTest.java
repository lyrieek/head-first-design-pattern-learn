package headfirst.day5.DecoratorForJavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by thunder on 2017/4/3.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("G:\\IdeaProjects\\DesignMode\\src\\headfirst\\day5\\DecoratorForJavaIO\\text.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
