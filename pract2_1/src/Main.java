import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите возраст Васи");
        int vasyAge = scan.nextInt();
        System.out.println("Введите возраст Кати");
        int katyAge = scan.nextInt();
        System.out.println("Введите возраст Миши");
        int mishaAge = scan.nextInt();

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyAge >= katyAge && vasyAge >= mishaAge) {
            max = vasyAge;
            if (katyAge >= mishaAge) {
                middle = katyAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyAge;
            }
        } else if (katyAge >= vasyAge && katyAge >= mishaAge) {
            max = katyAge;
            if (vasyAge >= mishaAge) {
                middle = vasyAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = vasyAge;
            }
        } else {
            max = mishaAge;
            if (vasyAge >= katyAge) {
                middle = vasyAge;
                min = katyAge;
            } else {
                middle = katyAge;
                min = vasyAge;
            }
        }

        System.out.println("минимальный возраст: " + min);
        System.out.println("средний возраст: " + middle);
        System.out.println("максимальный возраст: " + max);
    }
}