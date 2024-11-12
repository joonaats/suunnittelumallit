public class Main {
    public static void main(String[] args) {
        // Build a gaming computer
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector gamingDirector = new ComputerDirector(gamingBuilder);
        Computer gamingComputer = gamingDirector.constructComputer();
        System.out.println("Gaming Computer Config: " + gamingComputer);

        // Build an office computer
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector officeDirector = new ComputerDirector(officeBuilder);
        Computer officeComputer = officeDirector.constructComputer();
        System.out.println("Office Computer Config: " + officeComputer);
    }
}