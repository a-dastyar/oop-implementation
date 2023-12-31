package ir.fanapcamps.robot_simulator;

enum Orientation {

    NORTH, EAST, SOUTH, WEST;

    public static Orientation rightOf(Orientation orientation){
        switch (orientation) {
            case NORTH: return EAST;
            case EAST: return SOUTH;
            case SOUTH: return WEST;
            case WEST: return NORTH;
            default: throw new IllegalArgumentException();
        }
    }
    public static Orientation leftOf(Orientation orientation){
        switch (orientation) {
            case NORTH: return WEST;
            case EAST: return NORTH;
            case SOUTH: return EAST;
            case WEST: return SOUTH;
            default: throw new IllegalArgumentException();
        }
    }
}
