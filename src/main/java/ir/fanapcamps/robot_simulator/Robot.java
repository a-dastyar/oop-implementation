package ir.fanapcamps.robot_simulator;

class Robot {

    private Orientation orientation;
    private GridPosition gridPosition;

    public Robot(GridPosition gridPosition, Orientation orientation) {
        this.gridPosition = gridPosition;
        this.orientation = orientation;
    }

    public void turnRight() {
        this.orientation = Orientation.rightOf(this.orientation);
    }

    public void turnLeft() {
        this.orientation = Orientation.leftOf(this.orientation);
    }

    public void advance() {
        int move = 0;
        if (this.orientation == Orientation.NORTH || this.orientation == Orientation.EAST) {
            move += 1;
        } else {
            move -= 1;
        }
        if (this.orientation == Orientation.NORTH || this.orientation == Orientation.SOUTH) {
            this.gridPosition=this.gridPosition.withNewYMove(move);
        }else{
            this.gridPosition=this.gridPosition.withNewXMove(move);
        }
    }

    public void simulate(String commands) {
        for (char chr : commands.toCharArray()) {
            switch (chr) {
                case 'R' :
                    turnRight();
                    break;
                case 'L' :
                    turnLeft();
                    break;
                case 'A' :
                    advance();
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            
        }
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }


}
