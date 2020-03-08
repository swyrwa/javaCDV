package klasy;

import java.util.List;

public class Main {



    public static void main(String[] args) {
        User user = new User("nowyUser", "password", "nowyUser@gamil.com", 78);
        User admin = new User("loginUsera","haslo","k@email.com",56);
        User escabo = new User("escobar", "paqwess", "email@do.com", 15);

//        System.out.println(user.age);
//        System.out.println(admin.age);
//        System.out.println(escabo.age);

        User[] users = new User[4];
        users[0] = new User("login", "passwd", "email@aa.pl", 33);
        users[1] = new User("login12", "pas345", "email@ba.pl", 31);
        users[2] = new User("sdfsf", "123", "ea@aa.pl", 23);
        users[3] = new User("1login", "pa33ff", "bg@aa.pl", 39);

        UserService service = new UserService(users);
        List<User> znalezionyUser = service.wyszukajPoLoginie("login");
        for (User y: znalezionyUser){
        System.out.println("Znaleziono loginy: "+y.login+ " z mailem: " + y.email);}







    }
}
