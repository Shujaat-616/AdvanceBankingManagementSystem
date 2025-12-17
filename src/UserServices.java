import java.util.ArrayList;

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

    public boolean depositeMoney(double money) {

    }
}
