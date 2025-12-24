public class UserServiceOtherImplementation {
    
    private final UserRepository userRepository;
    private final PasswordValidator passwordValidator;
    
    public UserServiceOtherImplementation(UserRepository userRepository, 
                           PasswordValidator passwordValidator) {
        this.userRepository = userRepository;
        this.passwordValidator = passwordValidator;
    }
    
    /**
     * Finds user by username using parameterized query
     * @param username the username to search for
     * @return User if found, null otherwise
     */
    public User findUserByName(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        return userRepository.findByUsername(username);
    }
    
    /**
     * Updates user with null check and validation
     * @param user the user to update
     */
    public void updateUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        
        user.setLastModified(new Date());
        userRepository.save(user);
    }
    
    /**
     * Reads file with proper resource management
     * @param path file path to read
     * @return first line of the file
     */
    public String readFile(String path) throws IOException {
        try (FileInputStream fis = new FileInputStream(path);
             Scanner scanner = new Scanner(fis)) {
            return scanner.hasNextLine() ? scanner.nextLine() : "";
        }
    }
}
