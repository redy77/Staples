package ru.victor.staplesEx;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class StaplesTest extends TestCase {

    private final String staples;
    private final Boolean check;

    public StaplesTest(String staples, Boolean check) {
        this.staples = staples;
        this.check = check;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"(())())())()(((", false},
                {"))()()(())()()", false},
                {"))()()(())()()", false},
                {"(((", false},
                {"()()()((())())", true},
                {"(())()()", true},
                {"()", true},
                {"(", false},
                {")(", true},
                {"()()", true},
                {")()(", true},
                {")((()))(", true},
                {"(()()()", false},
                {"))))", false},
                {")", false},
                {"((())", false},
        });
    }

    @Test
    public void testCheckStaples() {
        Assert.assertSame(check, Staples.checkStaples(staples));
    }
}