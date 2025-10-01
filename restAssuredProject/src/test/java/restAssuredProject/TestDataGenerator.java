package restAssuredProject;


import java.util.Random;
import java.util.UUID;

public class TestDataGenerator {

    private static final String[] names = {"taufik", "aman", "rahul", "priya", "neha", "arjun"};
    private static final String[] domains = {"gmail.com", "yahoo.com", "outlook.com"};

    private static final Random random = new Random();

    // Generate random numeric ID
    public static int getRandomId() {
        return random.nextInt(1000); // 0–999
    }

    // Generate random title
    public static String getRandomTitle() {
        return "Hello " + getRandomName() + " Server";
    }

    // Pick a random name from the list
    public static String getRandomName() {
        return names[random.nextInt(names.length)];
    }

    // Generate random email
    public static String getRandomEmail() {
        return getRandomName() + random.nextInt(1000) + "@" + domains[random.nextInt(domains.length)];
    }

    // Generate UUID (optional alternative to numeric id)
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
