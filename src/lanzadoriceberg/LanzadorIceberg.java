package lanzadoriceberg;

public class LanzadorIceberg {

    public static void main(String[] args) {
        Iceberg a1 = new Iceberg("Groenlandia", "Iceberg01", new Status(1000, 125.6, 34.7));
        Iceberg a2 = new Iceberg("Estrecho de Bering", "Iceberg02", new Status(540.6, 75.9, 12.1));
        a1.updateIceberg(new Status(895.2, 180.3, 54.8));
        a1.updateIceberg(new Status(694.7, 196.4, 78.9));
        a2.updateIceberg(new Status(445.2, 62.3, 36.4));
        a2.updateIceberg(new Status(375.2, 37.1, 96.8));
        a1.showIceberg();
        a2.showIceberg();
    }
    
}
