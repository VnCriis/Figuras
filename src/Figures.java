public class Figures {
    String name;
    int sidesBase;
    int sidesHight;

    public Figures(String name, int sidesBase, int sidesHight) {
        this.name = name;
        this.sidesBase = sidesBase;
        this.sidesHight = sidesHight;
    }

    public String getName() {
        return name;
    }

    public int getSidesBase() {
        return sidesBase;
    }

    public int getSidesHight() {
        return sidesHight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSidesBase(int sidesBase) {
        this.sidesBase = sidesBase;
    }

    public void setSidesHight(int sidesHight) {
        this.sidesHight = sidesHight;
    }
}
