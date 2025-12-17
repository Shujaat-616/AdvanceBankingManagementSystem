import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        UserServices services = new UserServices();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to banking management System");
            System.out.println("1 --> add a new user");
            System.out.println("2 --> show all users");
            System.out.println("3 --> find user by id");
            System.out.println("4 --> deposit Money");
            System.out.println("5 --> withdraw Money");
            System.out.println("6 --> showBalance");
            System.out.println("0 --> exit");
            System.out.print("Please enter your choice here ---> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("please enter the following information");

                    String id;
                    System.out.print("please enter the user's id --> ");
                    id = scanner.next();

                    String name;
                    System.out.print("please enter the user's name -->");
                    name = scanner.next();

                    long accountNumber;
                    System.out.print("please enter the user's account number -->");
                    accountNumber = scanner.nextLong();

                    double balance;
                    System.out.print("please enter the initial balance of user -->");
                    balance = scanner.nextDouble();

                    services.addUser(id, name, accountNumber, balance);
                }
                case 2 -> services.showAllUsers();

                case 3 -> {
                    String id;
                    System.out.print("please enter the user id you want to find -->");
                    id = scanner.next();

                    services.findUserById(id);
                }
                case 4 -> {
                    System.out.println("Welcome to deposit section");

                    String userId;
                    double money;
                    System.out.print("please enter the account id of the user -->");
                    userId = scanner.next();

                    System.out.print("please enter the amount you want to deposit -->");
                    money = scanner.nextDouble();
                    services.depositMoney(userId, money);
                }
                case 5 -> {
                    System.out.println("Welcome to withdrawal section");

                    String userId;
                    double money;
                    System.out.print("please enter the account id of the user -->");
                    userId = scanner.next();

                    System.out.print("please enter the amount you want to withdraw -->");
                    money = scanner.nextDouble();
                    services.withdrawMoney(userId, money);
                }
                case 6 -> {
                    String id;
                    System.out.print("please enter the id of the user -->");
                    id = scanner.next();

                    services.showBalance(id);
                }
                case 0 -> {
                    scanner.close();
                    return;
                }

                default -> System.out.println("invalid choice");
            }
        }
    }
}
