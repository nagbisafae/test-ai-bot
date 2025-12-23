public class BuggyCode {
    // Testing cloud deployment base64 again
    // Hardcoded API key
    private String apiKey = "sk-test-12345";
    
    // SQL injection vulnerability
    public void findUser(String username) {
        String query = "SELECT * FROM users WHERE name = " + username;
        System.out.println(query);
    }

    public String format(String text) {
        return text.toUpperCase();
    }
}
