public class Main {
    static void main(String[] args) {
        UserServices services = new UserServices();
        services.addUser("12345" , "ravi Kumar" , 1344213 , 2411.13);
        services.addUser("23911" , "adnan" , 29288492 , 13921.13);
        services.showAllUsers();
    }
}
