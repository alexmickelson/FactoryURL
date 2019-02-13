import java.util.concurrent.ThreadLocalRandom;

public class RandomXkcdFactory extends Factory {
    @Override
    public String getDomain() {
        return "xkcd.com";
    }

    @Override
    public String getProtocol() {
        return "https";
    }

    @Override
    public String getPath() {
        return String.valueOf(ThreadLocalRandom.current().nextInt(1, 2110));
    }

    @Override
    public String getQuery() {
        return "";
    }
}
