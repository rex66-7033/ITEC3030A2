package itec3030.assignment2;


import itec3030.smarthome.standards.TemperatureSensor;
import newtemp.NewTempSensor.NewTempSensorDriver;

public interface AbstractNewTempSensorAdapter extends TemperatureSensor {

	/**
	 * Returns the adaptee of this adapter. Useful for passing it to the device.
	 * @return A reference to the adaptee (a NewTempSensorDriver object)
	 */
	NewTempSensorDriver getAdatptee();

}