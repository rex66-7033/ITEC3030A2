package itec3030.assignment2;

public abstract class OurFurnaceDecorator implements OurFurnace {
    protected OurFurnace ourFurnace;

    public OurFurnaceDecorator(OurFurnace ourFurnace) {
        this.ourFurnace = ourFurnace;
    }

    @Override
    public void turnOn() {
        ourFurnace.turnOn();
    }

}
