class Bike extends Vehicle {
    public Bike(Workshop workShop1, Workshop workShop2, Workshop workShop3)
    {
        super(workShop1, workShop2, workShop3);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Bike ");
        workShop1.work();
        workShop2.work();
        workShop3.work();
    }
}
