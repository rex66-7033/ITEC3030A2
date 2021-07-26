package itec3030.assignment2;



import itec3030.smarthome.standards.ControllerInterface;
import newtemp.NewTempSensor.NewTempSensorDriver;
import newtemp.NewTempSensor.Observer;

public class NewTempSensorAdapter implements Observer,AbstractNewTempSensorAdapter {

    protected NewTempSensorDriver newTempSensorDriver = new NewTempSensorDriver();

    private String id;
    private int i;

    @Override
    public NewTempSensorDriver getAdatptee() {
        newTempSensorDriver.registerObserver(this);
        return newTempSensorDriver;
    }

    @Override
    public void newTemperature(int i) {
        newTempSensorDriver.newTemperature(i);

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
        return this.id;
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
        return i;
    }

    @Override
    public void update(int i) {
        this.i=i;
        System.out.println("Sensor ("+id+") receiving new temperature: "+i+"");
    }
}
