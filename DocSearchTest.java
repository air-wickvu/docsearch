import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import static org.junit.Assert.*;
import org.junit.*;


public class DocSearchTest {
    @Test
    public void testHandle() throws URISyntaxException, IOException{
        Handler h = new Handler("./technical/");
        URI rootPath = new URI("http://localhost/"); 
        //assertEquals("Don't know how to handle that path!", h.handleRequest(rootPath));
        //h.handleRequest(rootPath);
    }
}
