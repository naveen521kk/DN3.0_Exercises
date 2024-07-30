package design_patterns.CommandPatternExample;

public class CommandPatternTest {
    public static void main(String[] args) {
        // Create a light receiver
        Light light = new Light();

        // Create command objects with the light receiver
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Create the invoker
        RemoteControl remote = new RemoteControl();

        // Test turning the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Test turning the light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
