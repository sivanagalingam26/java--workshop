import com.vetias.Temperature.bin.Sensor;

public class Temperaturesensor implements Sensor {

    private float Temperature;

    public Temperaturesensor(float atemperature) {
        temperature = aTemperature;
    }
    @Override
    public float getReading(){
        return temperature;
    }

    
    }

}

