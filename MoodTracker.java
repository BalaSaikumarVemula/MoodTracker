import java.util.*;

public class MoodTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hey there 👋 How are you feeling today?");
        String mood = sc.nextLine().toLowerCase();

        if (mood.contains("sad") || mood.contains("tired")) {
            System.out.println("😔 Hang in there! Things will get better soon.");
        } else if (mood.contains("happy") || mood.contains("good")) {
            System.out.println("😄 That’s awesome! Keep that energy up!");
        } else if (mood.contains("angry") || mood.contains("mad")) {
            System.out.println("😤 Take a deep breath. Maybe step away for a minute?");
        } else {
            System.out.println("🤔 Interesting mood… you’re a mystery!");
        }

        String[] quotes = {
            "Keep going — you're doing great.",
            "Every expert was once a beginner.",
            "A calm mind brings inner strength.",
            "Do what you can, with what you have, where you are.",
            "Sometimes, doing nothing is doing something."
        };

        System.out.println("\nHere’s something for you: ");
        System.out.println("\"" + quotes[random.nextInt(quotes.length)] + "\"");
    }
}
