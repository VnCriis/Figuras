public class Irregulares extends twoD{


    public Irregulares(String name, int sidesBase, int sidesHight) {
        super(name, sidesBase, sidesHight);
    }
    public void figuras2D() {
        System.out.println("Soy el tipo de figura 2D");
        System.out.println(this.getName());
        System.out.println("La base y la altura son: ");
        System.out.println(this.getSidesBase() + this.getSidesHight());
    }
}
