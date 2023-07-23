import java.util.Scanner;

public class Main {
    public static void main(String...args) {
        TextMessage textf = new TextMessage("fack");
        TextMessage textb = new TextMessage("bullshit");
        System.out.println(textf.text);
        System.out.println(textb.text);
    }
}

class fack {
    public static void main(String[] args) {
        Scanner textmessagescan = new Scanner(System.in);
        System.out.print("Text Message ");

        String textf = textmessagescan.nextLine();

        String fa = textf.replace("fack", "f***k");
        System.out.print("Text Message " + fa);

    }
}

class bullshit {
    public static void main(String[] args) {
        Scanner textmessagescann = new Scanner(System.in);
        System.out.print("Text Message ");

        String texb = textmessagescann.nextLine();

        String bull = texb.replace("bullshit", "b****t");
        System.out.print("Text Message " + bull);

    }
}