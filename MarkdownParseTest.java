import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile() throws IOException {
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> expectedOutPut = new ArrayList<String>();
        expectedOutPut.add("https://something.com");
        expectedOutPut.add("some-page.html");
        assertEquals(expectedOutPut, links);
    }

    @Test
    public void testFile2() throws IOException {
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> expectedOutPut = new ArrayList<String>();
        assertEquals(expectedOutPut, links);
    }

    @Test
    public void TestFile3() throws IOException {
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> expectedOutPut = new ArrayList<String>();
        expectedOutPut.add("https://validlink.com");
        assertEquals(expectedOutPut, links);
    }

    @Test
    public void TestFile4() throws IOException {
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> expectedOutPut = new ArrayList<String>();
        assertEquals(expectedOutPut, links);
    }

    @Test
    public void TestFile5() throws IOException {
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> expectedOutPut = new ArrayList<String>();
        assertEquals(expectedOutPut, links);
    }

    @Test
    public void TestFile6() throws IOException {
        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> expectedOutPut = new ArrayList<String>();
        assertEquals(expectedOutPut, links);
    }

    @Test
    public void TestFile7() throws IOException {
        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> expectedOutPut = new ArrayList<String>();
        assertEquals(expectedOutPut, links);
    }

    @Test
    public void TestFile8() throws IOException {
        Path fileName = Path.of("test-file8.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> expectedOutPut = new ArrayList<String>();
        assertEquals(expectedOutPut, links);
    }

    @Test
    public void testFail() throws IOException {
        assertEquals(2, 2);
        System.out.println("15l");
    }

    @Test
    public void testFail2() throws IOException {
        assertTrue(true);
    }

    @Test
    public void TestSnippet1() throws IOException {
        String contents= Files.readString(Path.of("./snippet1.md"));
        List<String> expect = List.of("google.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void TestSnippet2() throws IOException {
        String contents= Files.readString(Path.of("./snippet2.md"));
        List<String> expect = List.of("a.com, b.com, a.com(()), example.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void TestSnippet3() throws IOException {
        String contents= Files.readString(Path.of("./snippet3.md"));
        List<String> expect = List.of("https://www.twitter.com, https://ucsd-cse15l-w22.github.io/, github.com, https://cse.ucsd.edu/");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
}

/** Terminal command
 * javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
 * java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
 */
