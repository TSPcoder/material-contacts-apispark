package net.apispark.webapi;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

public class WrongTest {
	@Test
    public void dummy_assertion() throws Exception {
        Assert.assertThat("test is good", is(instanceOf(Integer.class)));
    }
}
