package q3;


import java.util.ArrayList;

//starting code
public class TemperatureAlert implements Subject {
    private int temperature;
    private ArrayList<Observer> observers = new ArrayList<>();

    public TemperatureAlert() {
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if(this.temperature>35 || this.temperature<10) {
        	notifyObservers();
        }
    }

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o:observers) {
			o.update(temperature);
		}
		
		
	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}



}
