public class Computer {
    private String processor;
    private int ram;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    public void setProcessor(String processor) { this.processor = processor; }
    public void setRam(int ram) { this.ram = ram; }
    public void setHardDrive(String hardDrive) { this.hardDrive = hardDrive; }
    public void setGraphicsCard(String graphicsCard) { this.graphicsCard = graphicsCard; }
    public void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }

    @Override
    public String toString() {
        return "Computer [Processor=" + processor + ", RAM=" + ram + " GB, Hard Drive=" + hardDrive +
                ", Graphics Card=" + graphicsCard + ", Operating System=" + operatingSystem + "]";
    }
}