package ut.org.tracepluginsharehistiry;

import org.junit.Test;
import org.tracepluginsharehistiry.MyPluginComponent;
import org.tracepluginsharehistiry.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}