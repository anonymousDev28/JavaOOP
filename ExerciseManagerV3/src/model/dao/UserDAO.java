package model.dao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.User;
public class UserDAO {
    // <editor-fold defaultstate="collapsed" desc="Default Data">
    private static List<User> userExample = new ArrayList<>
        (Arrays.asList(new User("admin", "123456", "admin@gmail.com", "admin"),
                       new User("user", "123456", "user@gmail.com", "user")));
    // </editor-fold>
//    private List<User> users;
//    
//    public UserDAO() {
//        users = userExample;
//    }

    public static List<User> getUserExample() {
        return userExample;
    }
    
    // kiem tra quyen truy cap cua user
    public String checkUserRole(User user) {
        if (user != null) {
            for (User u : userExample) {
                if (u.getUsername().equals(user.getUsername())
                        && u.getPassword().equals(user.getPassword())) {
                    return u.getRole();
                }
            }
        }
        return "unvaild";
    }
    // kiem tra username hoac email da ton tai hay chua
    public boolean isUserExist(User user){
        for (User o : userExample) {
            if(o.getUsername().equals(user.getUsername())
             ||o.getEmail().equals(user.getEmail())){
                return true;
            }
        }
        return false;
    }
}
