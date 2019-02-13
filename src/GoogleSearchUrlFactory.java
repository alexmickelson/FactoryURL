public class GoogleSearchUrlFactory extends GoogleHomePageFactory {
    String Qry;
    public GoogleSearchUrlFactory(String qry){
        Qry = qry;
    }

    @Override
    public String getPath() {
        return "search";
    }

    @Override
    public String getQuery() {
        return "?q=" + Qry;
    }
}
