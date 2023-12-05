public class Cuadrado extends Regulares{

    public Cuadrado(String name, int sidesBase, int sidesHight) {
        super(name, sidesBase, sidesHight);
    }
    public void areaCuadrado() {
        System.out.println("El area del cuadrado es: ");
        System.out.println(this.getSidesBase()*this.getSidesBase());
    }
}
