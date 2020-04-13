import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        User[] managers = new User[10];
        User[] cooks = new User[10];
        User[] waiters = new User[10];

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите полное имя");
        user.setFulName(sc1.nextLine());


        Scanner sc2 = new Scanner(System.in);
        System.out.println("введите первую букву должности");
        String position = sc2.nextLine();


        if (position.equals("m")) {
            user.setPosition(Position.MANAGER);
        } else if (position.equals("c")) {
            user.setPosition(Position.COOK);
        } else if (position.equals("w")) {
            user.setPosition(Position.WAITER);
        } else System.out.println("должности не найдено");

        if (user.getPosition() == Position.MANAGER) {
            user.setSalary(500);
        } else if (user.getPosition() == Position.COOK) {
            user.setSalary(600);
        } else if (user.getPosition() == Position.WAITER) {
            user.setSalary(400);
        }

        System.out.println(user.toString());

        for (int i = 0; i < managers.length; i++) {
            if (user.getPosition() == Position.MANAGER && managers[i] == null) {
                managers[i] = user;
                break;
            }
        }

        for (int i = 0; i < cooks.length; i++) {
            if (user.getPosition() == Position.COOK && cooks[i] == null) {
                cooks[i] = user;
                break;
            }
        }

        for (int i = 0; i < waiters.length; i++) {
            if (user.getPosition() == Position.WAITER && waiters[i] == null) {
                waiters[i] = user;
                break;
            }
        }

        System.out.println(Arrays.toString(managers));
        System.out.println(Arrays.toString(cooks));
        System.out.println(Arrays.toString(waiters));

    }
}

enum Position {
    MANAGER, COOK, WAITER;

}
