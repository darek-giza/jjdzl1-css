package com.infoshare.academy.user;

import com.infoshare.academy.iostream.FileIO;
import com.infoshare.academy.iostream.FilePath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    public static User logIn() {
        Scanner in = new Scanner(System.in);
        System.out.println("*Panel logowania*");
        System.out.print("Podaj nazwę użytkownika: ");
        String login = in.nextLine();
        System.out.print("Podaj hasło: ");
        String password = in.nextLine();

        List<User> userCreated = createUserList();

        User userLogin = userCreated.stream()
                .filter(user -> login.equals(user.getLogin()) && password.equals(user.getPassword()))
                .findAny()
                .orElse(null);

        if (userLogin == null) {
            System.out.println("Logowanie nieudane, spróbuj ponownie!");
            logIn();
        } else if (userLogin.userAuth()) {
            System.out.println("Zalogowano pomyślnie. Witaj " + userLogin.getLogin() + "!");
        }
        return userLogin;
    }

    public static List<User> createUserList() {
        List<User> userList = new ArrayList<>();
        StringBuilder userData = FileIO.readFile(FilePath.getUserData());
        String[] userLine = userData.toString().split("\\n");
        for (String s : userLine) {
            String[] userPart = s.split(",");
            User userNext = returnUser(userPart);
            userList.add(userNext);
        }
        return userList;
    }

    public static User returnUser(String[] userPart) {
        return new User(Integer.parseInt(userPart[0]), userPart[1], userPart[2], userPart[3]);
    }
}