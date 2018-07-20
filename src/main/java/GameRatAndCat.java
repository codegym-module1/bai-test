import java.util.Scanner;

public class GameRatAndCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cat cat = new Cat("Tom", 10);

        Rat rat = new Rat("Jerry", 13, 10);

        cat.run(cat);
        rat.run(rat);
        System.out.println("Mèo có bắt được chuột không? "+cat.catchRat(rat));
        cat.eat(rat);

        String[] cats = new String[5];
        cats[0]= "Andy";
        cats[1]="Jame";
        cats[2]="Float";
        cats[3]="Mick";
        cats[4]="Seven";
        printArray(cats);
        System.out.println();
        String[] rats = new String[5];
        rats[0]= "Dy";
        rats[1]="James";
        rats[2]="Loat";
        rats[3]="Cick";
        rats[4]="Eleven";
        printArray(rats);

    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }

    public static void search(String[] array, String k) {
        for (int i = 0; i < array.length; i++) {
            if (k == array[i]) {
                System.out.println();
            }
        }
    }
}
