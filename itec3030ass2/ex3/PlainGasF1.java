package itec3030.assignment2;

import itec3030.smarthome.standards.ControllerInterface;

public class PlainGasF1 implements OurFurnace {

    @Override
    public ControllerInterface getController() {
        return null;
    }

    @Override
    public void setController(ControllerInterface controllerInterface) {

    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public void setID(String s) {

    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public boolean enabled() {
        return false;
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {
        System.out.println("PlainGasF1：Up and Running");
    }

    @Override
    public boolean isOn() {
        return false;
    }
}
