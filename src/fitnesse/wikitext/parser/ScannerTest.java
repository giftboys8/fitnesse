package fitnesse.wikitext.parser;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ScannerTest {
    @Test public void copyRestoresState() {
        Scanner scanner = new Scanner("stuff");
        Scanner backup = new Scanner(scanner);
        ParserTest.assertScans("Text=stuff", scanner);
        ParserTest.assertScans("", scanner);
        scanner.copy(backup);
        ParserTest.assertScans("Text=stuff", scanner);
    }
}
