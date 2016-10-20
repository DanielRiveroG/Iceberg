package lanzadoriceberg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Status {
    private final Calendar date;
    private final Coordinates location;
    private final double volume;

    public Status(double volume, double longitude, double latitude) {
        this.date = GregorianCalendar.getInstance();
        this.volume = volume;
        this.location = new Coordinates(longitude, latitude);
    }
    
    @Override
    public String toString(){
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        return "Volumen: " + volume + " metros cúbicos Posición: " + location.getLatitude() + "º latitud y " + location.getLongitude() + "º longitud. A fecha de " + format1.format(date.getTime());
    }
    
}
