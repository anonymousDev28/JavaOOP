/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.dao.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import model.User;
import view.*;

/**
 *
 * @author Tommy
 */
public class LoginController {

    private UserDAO userDAO;
    private LoginView loginView;
    private MainView mainView;

    public LoginController(LoginView view) {
        this.loginView = view;
        userDAO = new UserDAO();
        view.addLoginListener(new LoginActionListener());
        view.addSignUpListener(new SignUpActionListener());

    }

    public void showLoginView() {
        loginView.setVisible(true);
    }

    class LoginActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            User user = loginView.getUser();
            if (user.getUsername().equals("") || user.getPassword().equals("")) {
                loginView.showMessage("username và password không được để trống!");
            } else {
                switch (userDAO.checkUserRole(user)) {
                    case "admin" -> {
                        mainView = new MainView("admin",user.getUsername());
                        ExerciseController ec = new ExerciseController(mainView);
                        ec.showExerciseView();
                        loginView.setVisible(false);
                    }
                    case "user" -> {
                        mainView = new MainView("user",user.getUsername());
                        ExerciseController ec2 = new ExerciseController(mainView);
                        mainView.disableViewUser();
                        ec2.showExerciseView();
                    }
                    default ->
                        loginView.showMessage("username hoặc password không đúng.");
                }
            }
        }

    }

    class SignUpActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUserSignUp();
            if (!userDAO.isUserExist(user)) {
                if (!user.getPassword().equals("")
                        && !user.getUsername().equals("")
                        && !user.getEmail().equals("")) {
                    if (isValidEmail(user.getEmail())) {
                        user.setRole("user");
//                        UserDAO.userExample.add(user);
                        UserDAO.getUserExample().add(user);
                        loginView.showMessage("Đăng kí thành công");
                    }else{
                        loginView.showMessage("Email không hợp lệ");
                    }
                } else {
                    loginView.showMessage("vui lòng điền đầy đủ các trường");
                }
            } else {
                loginView.showMessage("tên tài khoản hoặc email đã tồn tại !");
            }
        }
        public boolean isValidEmail(String email) {
            return Pattern.compile("^[^@]+@[^@]+\\.[^@]+$").matcher(email).matches();
        }

    }

}
