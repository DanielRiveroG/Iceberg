package lanzadoriceberg;

import java.util.ArrayList;

public class Iceberg {
    private final String origin;
    private final String id;
    private final ArrayList<Status> history = new ArrayList<>();

    public Iceberg(String origin, String id, Status ini) {
        this.origin = origin;
        this.id = id;
        history.add(ini);
    }

    public String getOrigin() {
        return origin;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Status> getHistory() {
        return history;
    }
    
    public void updateIceberg (Status newstat){
        history.add(newstat);
    }
    
    public void showIceberg(){
        System.out.println("El iceberg " + id + " se originó en " + origin + " y esta ha sido su evolución:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i));
        }
    }
    
}
