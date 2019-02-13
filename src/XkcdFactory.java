public class XkcdFactory extends RandomXkcdFactory {
    private final int Num;

    public XkcdFactory(int num){
        Num = num;
    }
    @Override
    public String getPath() {
        return String.valueOf(Num);
    }
}
