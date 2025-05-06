package designPattern.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Ali", "Hüseynov")
                .age(30)
                .email("ali@example.com")
                .phone("055-123-45-67")
                .build();

        System.out.println(user.toString());
    }
}
