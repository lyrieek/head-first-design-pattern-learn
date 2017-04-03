package headfirst.day5.DecoratorForJavaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 装饰者--将输入流中小写字符转换为大写字符
 */
public class UpperCaseInputStream extends FilterInputStream {
    public UpperCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toUpperCase((char) c);
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + len; i++) {
            b[i] = (byte) Character.toUpperCase((char) b[i]);
        }
        return result;
    }
}
