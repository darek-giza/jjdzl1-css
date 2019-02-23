package com.infoshare.academy.user;

import com.infoshare.academy.iostream.FileIO;
import com.infoshare.academy.iostream.FilePath;
import com.infoshare.academy.menuEnum.MessagesEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    public static User logIn() {
        Scanner in = new Scanner(System.in);
        System.out.println(MessagesEnum.LOGIN_PANEL.getMessage());
        System.out.print(MessagesEnum.ENTER_LOGIN.getMessage());
        String login = in.nextLine();
        System.out.print(MessagesEnum.ENTER_PASSWORD.getMessage());
        String password = in.nextLine();

        List<User> userCreated = createUserList();

        User userLogin = userCreated.stream()
                .filter(user -> login.equals(user.getLogin()) && password.equals(user.getPassword()))
                .findAny()
                .orElse(null);

        if (userLogin == null) {
            System.out.println(MessagesEnum.LOGIN_FAILED.getMessage());
            logIn();
        } else if (userLogin.userAuth()) {
            System.out.println(MessagesEnum.LOGIN_SUCCESSFULL.getMessage() + userLogin.getLogin() + "!");
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
        return new User(userPart[0], userPart[1], userPart[2]);
    }
}