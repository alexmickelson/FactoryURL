import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class URL {
    String Protocol;
    String Domain;
    String Path;
    String Query;

    public URL(Factory urlFactory){
        Protocol = urlFactory.getProtocol();
        Domain = urlFactory.getDomain();
        Path = urlFactory.getPath();
        Query = urlFactory.getQuery();
    }


    public URI GetUrl(){
        URI uri = null;
        try {
            uri = new URI(Protocol + "://www." + Domain + '/' + Path + Query);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri;
    }
}
