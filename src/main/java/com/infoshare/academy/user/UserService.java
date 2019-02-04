package com.infoshare.academy.user;

import com.infoshare.academy.iostream.FileIO;
import com.infoshare.academy.iostream.FilePath;
import com.infoshare.academy.menu.MessagesEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    public static Users logIn() {
        Scanner in = new Scanner(System.in);
        System.out.println(MessagesEnum.LOGIN_PANEL.getMessage());
        System.out.print(MessagesEnum.ENTER_LOGIN.getMessage());
        String login = in.nextLine();
        System.out.print(MessagesEnum.ENTER_PASSWORD.getMessage());
        String password = in.nextLine();

        List<Users> usersCreated = createUserList();

        Users usersLogin = usersCreated.stream()
                .filter(users -> login.equals(users.getLogin()) && password.equals(users.getPassword()))
                .findAny()
                .orElse(null);

        if (usersLogin == null) {
            System.out.println(MessagesEnum.LOGIN_FAILED.getMessage());
            logIn();
        } else if (usersLogin.userAuth()) {
            System.out.println(MessagesEnum.LOGIN_SUCCESSFULL.getMessage() + usersLogin.getLogin() + "!");
        }
        return usersLogin;
    }

    public static List<Users> createUserList() {
        List<Users> usersList = new ArrayList<>();
        StringBuilder userData = FileIO.readFile(FilePath.getUserData());
        String[] userLine = userData.toString().split("\\n");
        for (String s : userLine) {
            String[] userPart = s.split(",");
            Users usersNext = returnUser(userPart);
            usersList.add(usersNext);
        }
        return usersList;
    }

    public static Users returnUser(String[] userPart) {
        return new Users(Integer.parseInt(userPart[0]), userPart[1], userPart[2], userPart[3]);
    }
}