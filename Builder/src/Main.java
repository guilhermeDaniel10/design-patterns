public class Main {
    public static void main(String[] args) {
        User u = new User.UserBuilder("Guilherme", "Daniel").age(23).build();
        System.out.println(u.toString());


    }
}