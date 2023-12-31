package ir.fanapcamps.elons_toy_car;

public class ElonsToyCar {

    private static int counter = 0;
    private int id;
    private int distance;
    private short battery;

    public ElonsToyCar() {
        this.id = ++counter;
        this.distance = 0;
        this.battery = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
        if (this.battery == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", this.battery);
    }

    public void drive() {
        if (this.battery > 0) {
            this.battery -= 1;
            this.distance += 20;
        } else {
            System.out.println(this.distanceDisplay());
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ElonsToyCar other = (ElonsToyCar) obj;
        return this.id == other.id;
    }

}
