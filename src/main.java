import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args){
        URL url = new URL(new RandomXkcdFactory());
        showurl(url);

        url = new URL(new GoogleHomePageFactory());
        showurl(url);

        Scanner s = new Scanner(System.in);
        System.out.println("What do you want to search?");
        url = new URL(new GoogleSearchUrlFactory(s.next()));
        showurl(url);
        System.out.println("What do you want to search?");
        url = new URL(new GoogleSearchUrlFactory(s.next()));
        showurl(url);


        System.out.println("input xkcd comic number (between 1 and 2110)");
        url = new URL(new XkcdFactory(s.nextInt()));
        showurl(url);

    }

    static void showurl(URL url){
        try {
            Desktop.getDesktop().browse(url.GetUrl());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
