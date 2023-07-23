package HomeWork1;

//Создайте четыре переменные: типа "byte", типа "int", типа "double", типа "float".
public class Main {
    public static void main(String[] args) {
        int one = -714748364;
        byte two = -120;
        float three = 55885858584123.5595f;
        double four = -6657454712145.7578;

// С этим набором переменных сделайте преобразования типа "cужение" и "расширение".


// Cужение типов

        byte two1 = (byte)one;
        float three1 = (float)one;
        double four1 = (double)one;
        int one1 = (int)three;
        int one2 = (int)four;
        byte two2 = (byte)four;

        System.out.println("Вывод: " + two1 + " / " + three1 + " /  " + four1);
        System.out.println("Вывод: " + one1 + " / " + one2 + " /  " + two2);

// Расширение типов

        int one3 = two;
        float three2 = two;
        double four2 = two;

        System.out.println("Вывод: " + one3 + " / " + three2 + " /  " + four2);

// Запишите результаты преобразований в переменные соответствующего типа

        int one4 = 52;
        int one5 = 2147483647;
        int one6 = 0;
        int one7 = -2147483648;

        byte two3 = 52;
        byte two4 = 0;

        float three3 = 52;
        float three4 = 0;

        double four3 = 52;
        double four4 = -7.1474835E8;
        double four5 = -7.14748364E8;
        double four6 = 0;

// Выведите результаты преобразований на экран с помощь метода System.out.println()

        System.out.println("Вывод: " + one4 + " / " + one5 + " /  " + one6 + " / " + one7);
        System.out.println("Вывод: " + three3 + " / "  + three4);
        System.out.println("Вывод: " + four3 + " / " + four4 + " /  " + four5 + " / " + four6);
    }
}


