

public class App {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("Jalisson", "Barbosa"),
                new User("Maria", "Fulana"),
                new User("Joao", "Ciclano")
        };

        System.out.println(users[1].getFirstName());
        System.out.println(users[1].getLastName());
    }
}