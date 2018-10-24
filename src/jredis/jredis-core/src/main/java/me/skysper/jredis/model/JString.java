package me.skysper.jredis.model;

/**
 * String对象
 * @author skysper
 */
public class JString {
    private int length;
    private int free;
    private char[] buffer;

    public static JString create(char[] content, int length) {
        JString sds = new JString();
        sds.length = length;
        sds.free = 0;
        sds.buffer = new char[length];
        if(content != null) {
            if(content.length <= length) {
                System.arraycopy(content, 0, sds.buffer, 0, content.length);
                sds.length = content.length;
                sds.free = (length - sds.length);
            } else {
                System.arraycopy(content, 0, sds.buffer, 0, length);
            }
        }
        return sds;
    }

    public void init(String content, short length) {

    }

    public void clear() {
        this.free = this.length;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public int getFree() {
        return free;
    }

    @Override
    public String toString() {
        return new String(this.buffer);
    }
}
