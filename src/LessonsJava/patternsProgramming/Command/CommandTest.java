package LessonsJava.patternsProgramming.Command;

public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command switchUp = new TurnOnLightCommand(light);
        Command switchDown = new TurnOffLightCommand(light);

        SwitchInvoke switchInvoke = new SwitchInvoke(switchUp, switchDown);
        switchInvoke.flipUp();
        switchInvoke.flipDown();
    }
}

class Light{
    public Light() {
            }
            void turnOn(){
                System.out.println("The Light is ON");
            }
            void turnOff(){
                System.out.println("The light is OFF");
            }
}

interface Command{
    void execute();
}

class  TurnOnLightCommand implements Command{
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class  TurnOffLightCommand implements Command{
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

class SwitchInvoke{
    private Command flipUpCommand;
    private Command flipDownCommand;

    public SwitchInvoke(Command flipUpCommand, Command flipDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }

    void flipUp(){
        flipUpCommand.execute();
    }
    void flipDown(){
        flipDownCommand.execute();
    }
}