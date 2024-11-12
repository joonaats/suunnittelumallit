public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) { this.computerBuilder = computerBuilder; }

    public Computer constructComputer() {
        computerBuilder.buildProcessor();
        computerBuilder.buildRam();
        computerBuilder.buildHardDrive();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOperatingSystem();
        return computerBuilder.getComputer();
    }
}