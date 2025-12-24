public class UserService {
    
    // ISSUE 1: Hardcoded credentials
    private static final String API_KEY = "sk-1234567890abcdef";
    private static final String DB_PASSWORD = "admin123";
    
    // ISSUE 2: SQL Injection vulnerability
    public User findUserByName(String username) {
        String query = "SELECT * FROM users WHERE username = '" + username + "'";
        return database.executeQuery(query);
    }
    
    // ISSUE 3: Missing null check
    public void updateUser(User user) {
        user.setLastModified(new Date());
        database.save(user);
    }
    
    // ISSUE 4: Resource leak
    public String readFile(String path) {
        FileInputStream fis = new FileInputStream(path);
        Scanner scanner = new Scanner(fis);
        return scanner.nextLine();
    }
    
    // ISSUE 5: Overly complex method
    public boolean validatePassword(String password) {
        if (password == null) {
            return false;
        }
        if (password.length() < 8) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        if (!password.matches(".*[a-z].*")) {
            return false;
        }
        if (!password.matches(".*[0-9].*")) {
            return false;
        }
        if (!password.matches(".*[!@#$%^&*].*")) {
            return false;
        }
        return true;
    }
}
