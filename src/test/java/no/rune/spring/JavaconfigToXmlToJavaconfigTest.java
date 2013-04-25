package no.rune.spring;

import static org.junit.Assert.assertNotNull;
import no.rune.spring.config.Main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = Main.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class JavaconfigToXmlToJavaconfigTest {

    @Autowired
    private String myString;

    @Test
    public void shouldRetrieveTheBeanDefinedInLeafJavaconfig() {
        assertNotNull(myString);
    }

}
