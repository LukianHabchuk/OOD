package Builder.Example1;

public class Main {
    public static void main(String[] args) {
        Account account = Account.initializeRegistration()
                .login("login")
                .password("password")
                .email("email")
                .createAccount();

    }
}
