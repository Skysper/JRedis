package me.skysper.jredis.model;


import org.junit.Test;

public class JStringTest {
    @Test
    public void testString(){
        char[] array = new char[10];
        array[0] = '\0';
        array[1]='a';
        System.out.println(new String(array));
    }
}
