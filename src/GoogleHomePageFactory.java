public class GoogleHomePageFactory extends Factory {
    @Override
    public String getDomain() {
        return "google.com";
    }

    @Override
    public String getProtocol() {
        return "https";
    }

    @Override
    public String getPath() {
        return "";
    }

    @Override
    public String getQuery() {
        return "";
    }
}
