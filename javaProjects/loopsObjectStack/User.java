import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class User {
    private String name;
    private String id;
    private boolean isActivated;

    public User(String name, String id, boolean isActivated) {
        this.name = name;
        this.id = id;
        this.isActivated = isActivated;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public static HashMap<String, User> createRandomUserMap(int numberOfUsers) {
        HashMap<String, User> userMap = new HashMap<>();
        for (int i = 0; i < numberOfUsers; i++) {
            String name = "User" + (i + 1);
            String id = String.valueOf(generateRandomId());
            boolean isActivated = generateRandomActivationStatus();
            User user = new User(name, id, isActivated);
            userMap.put(id, user);
        }
        return userMap;
    }

    private static int generateRandomId() {
        return ThreadLocalRandom.current().nextInt(1000);
    }

    private static boolean generateRandomActivationStatus() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    public static User getUserById(HashMap<String, User> userMap, String id) {
        return userMap.get(id);
    }

    public static int countActivatedUsers(HashMap<String, User> userMap) {
        int activatedCount = 0;
        for (User user : userMap.values()) {
            if (user.isActivated()) {
                activatedCount++;
            }
        }
        return activatedCount;
    }

    public static String getRandomUserId(HashMap<String, User> userMap) {
        List<String> userIds = new ArrayList<>(userMap.keySet());
        return userIds.get(ThreadLocalRandom.current().nextInt(userIds.size()));
    }

    public static void main(String[] args) {
        int numberOfUsers = 10;
        HashMap<String, User> userMap = createRandomUserMap(numberOfUsers);

        // Print all users
        System.out.println("All Users:");
        for (User user : userMap.values()) {
            System.out.println(user.getId() + ": " + user.getName() + " (Activated: " + user.isActivated() + ")");
        }

        // Get a random user by ID
        if (!userMap.isEmpty()) {
            String targetUserId = getRandomUserId(userMap);
            User targetUser = getUserById(userMap, targetUserId);
            if (targetUser != null) {
                System.out.println("Random User found: " + targetUser.getName());
            } else {
                System.out.println("Random User not found.");
            }
        } else {
            System.out.println("No users in the map.");
        }

        // Count how many users are activated
        int activatedCount = countActivatedUsers(userMap);
        System.out.println("Number of activated users: " + activatedCount);
    }
}
