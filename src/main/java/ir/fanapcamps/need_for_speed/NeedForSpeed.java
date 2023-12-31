package ir.fanapcamps.need_for_speed;

class NeedForSpeed {

    private int distance;
    private int charge;
    private final int speed;
    private final int batteryUsage;

    public NeedForSpeed(int speed, int batteryUsage) {
        this.speed = speed;
        this.batteryUsage = batteryUsage;
        this.distance = 0;
        this.charge = 100;
    }

    public boolean batteryDrained() {
        return this.batteryUsage > this.charge;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distance += this.speed;
            this.charge -= this.batteryUsage;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getCharge() {
        return charge;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryUsage() {
        return batteryUsage;
    }
}

class RaceTrack {

    private int length;

    public RaceTrack(int length) {
        this.length = length;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        int totalTrips = car.getCharge() / car.getBatteryUsage();
        return this.length <= (totalTrips * car.getSpeed());
    }
}
