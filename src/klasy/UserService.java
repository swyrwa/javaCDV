package klasy;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private User[] users;

    public UserService(User[] users) {
        this.users = users;
    }

    //        metodę, która będzie
//        wyszukiwała użytkowników po podanym loginie.

    /**
     * opis co robi funkcja
     */

    public List<User> wyszukajPoLoginie(String login) {
        List<User> userzyzWyszukiwania = new ArrayList<>();
        for (User u : users) {
//            boolean isLogin = u.login.contains(login);
            if (u.login.contains(login)) {
                userzyzWyszukiwania.add(u);
            }
        }
        return userzyzWyszukiwania;

        }

    }

