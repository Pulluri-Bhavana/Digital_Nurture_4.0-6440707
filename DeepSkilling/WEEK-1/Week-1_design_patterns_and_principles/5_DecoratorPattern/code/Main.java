package decorator;

public class Main {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();

        Notifier smsEmail = new SMSNotifierDecorator(email);
        Notifier allChannels = new SlackNotifierDecorator(smsEmail);

        allChannels.send();
    }
}
