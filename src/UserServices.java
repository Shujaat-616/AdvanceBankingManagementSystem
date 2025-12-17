import java.util.ArrayList;
import java.util.Objects;

public class UserServices {
    ArrayList<User> users = new ArrayList<>();

    public void addUser(String id , String name , long accountNumber , double balance) {
        User user = new User(id , name , accountNumber , balance);
        users.add(user);
    }

    public void showAllUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public User findUserById(String id) {
        for (User user : users) {
            if (Objects.equals(user.getId(), id)) {
                return user;
            }
        }
        return null;
    }

    public boolean depositMoney(String userId , double money) {
        if (money < 0) {
            System.out.println("Deposit money should be positive");
            return false;
        }

        User user = findUserById(userId);
        if (user == null) {
            System.out.println("user not found");
            return false;
        }

        user.setBalance(user.getBalance() + money);
        System.out.println("deposit successful");
        return true;
    }

    public boolean withdrawMoney(String userId , double money) {
        if (money < 0) {
            System.out.println("amount should be positive");
            return false;
        }

        User user = findUserById(userId);

        if (user == null) {
            System.out.println("user not found");
            return false;
        }
        if (money > user.getBalance()) {
            System.out.println("insufficient balance");
            return false;
        }

        user.setBalance(user.getBalance() - money);
        System.out.println("Withdrawal successful");
        return true;
    }

    public void showBalance(String id) {
        User user = findUserById(id);
        if (user == null) {
            return;
        }
        System.out.println("The user with id : " + id +" has $" + user.getBalance() + " in his account");

    }





}
