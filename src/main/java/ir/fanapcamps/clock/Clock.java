package ir.fanapcamps.clock;

public class Clock {

    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        this.hour = calcHour(hour, minute);
        this.minute = calcMinute(minute);
    }

    private static int calcHour(int hour, int minute) {
        // total hours in 24 hours format 
        int rawHour = (hour + minute / 60) % 24;
        // apply negative minutes to hour 
        rawHour = minute % 60 < 0 ? rawHour - 1 : rawHour;
        // calc right hour for negative value 
        rawHour = rawHour < 0 ? rawHour + 24 : rawHour;
        return rawHour;
    }

    private static int calcMinute(int minute) {
        // total minutes in 60 minutes format 
        int rawMin = minute % 60;
        // calc right minutes for negative value 
        rawMin = rawMin < 0 ? rawMin + 60 : rawMin;
        return rawMin;
    }

    public void add(int minutes) {
        int hours = this.hour + ((minutes / 60) % 24);
        int mins = this.minute + (minutes % 60);
        this.hour=calcHour(hours, mins);
        this.minute=calcMinute(mins);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.hour;
        hash = 97 * hash + this.minute;
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
        final Clock other = (Clock) obj;
        if (this.hour != other.hour) {
            return false;
        }
        return this.minute == other.minute;
    }

}
