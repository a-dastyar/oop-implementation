package ir.fanapcamps.robot_simulator;

class GridPosition {

    final int x;

    final int y;

    GridPosition(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    GridPosition withXMove(int xMove) {
        return new GridPosition(this.x + xMove, this.y);
    }

    GridPosition withYMove(int yMove) {
        return new GridPosition(this.x, this.y + yMove);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else if (x != ((GridPosition) obj).x || y != ((GridPosition) obj).y) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GridPosition{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
