package itec3030.assignment2;


import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import oldtempinc.drivers.OldTempSensor;

public class OldTempSensorAdapter extends OldTempSensor implements TemperatureSensor {
    private String id;

    @Override
    public void newTemperature(int i) {
        super.newTemperature(i);
    }

    @Override
    public ControllerInterface getController() {
        return null;
    }

    @Override
    public void setController(ControllerInterface controllerInterface) {

    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public void setID(String s) {
        this.id=s;
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
    public int getReading() {
        return (int) super.getTemperature();
    }
}
