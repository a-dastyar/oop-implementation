package ir.fanapcamps.wiazards_and_wariors;

abstract class Fighter {

    boolean isVulnerable() {
        throw new UnsupportedOperationException("Please provide implementation for this method");
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int damagePoints(Fighter wizard) {
        Wizard wiz = (Wizard) wizard;
        return wiz.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    private boolean prepared = false;

    @Override
    boolean isVulnerable() {
        return !prepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return prepared ? 12 : 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        prepared = true;
    }

}
