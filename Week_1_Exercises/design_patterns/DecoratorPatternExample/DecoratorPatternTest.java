package design_patterns.DecoratorPatternExample;

// DecoratorPatternTest.java
public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create a basic EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate with SMSNotifierDecorator
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate with SlackNotifierDecorator
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notification via Email, SMS, and Slack
        slackNotifier.send("Hello, this is a test notification!");
    }
}
