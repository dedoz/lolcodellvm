package com.lolcode.tree;

import com.lolcode.Runner;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/20/13
 * Time: 6:57 PM
 */
public class BasicTest {
    private Runner runner;

    @Before
    public void setUp() throws Exception {
        runner = new Runner();
        runner.setInputFile("tests/com/lolcode/tree/basic.lol");
    }

    @Test
    public void testTest() throws Exception {
        runner.test();
    }
}
