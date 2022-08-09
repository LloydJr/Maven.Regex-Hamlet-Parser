import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
    }

    @Test
    public void testChangeHoratioToTariq() {
    }

    @Test
    public void testFindHoratio() {
        Matcher matcher = hamletParser.findHoratio();
        int count = 0;

        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }

    @Test
    public void testFindHamlet() {
        Matcher matcher = hamletParser.findHamlet();
        int count = 0;

        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}