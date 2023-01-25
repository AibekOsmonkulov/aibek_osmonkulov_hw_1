public class Main {
    public static void main(String[] args) {
        String myName;
        final int NUM = 2022;
        String word = " Bishkek";
        myName = NUM + word;
        System.out.println(myName);
        System.out.println(NUM);
        System.out.println(word);
        if (NUM < 0) {
            System.out.println("вы сохранили отрицательное число");

        }else if (NUM > 0) {
            System.out.println("вы сохранили положительное число");
        }else {
            System.out.println("вы сохранили 0");
        }

    }
}