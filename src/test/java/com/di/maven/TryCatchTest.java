package com.di.maven;

public class TryCatchTest {
    @org.junit.Test
    public void testName() throws Exception {
        try {
            System.out.print("try");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("catch");
        } finally {
            System.out.print("finally");
        }
    }
}
