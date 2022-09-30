public class Padre extends Abuelo {
    int ci;


    public Padre(int ci) {
        this.ci = ci;
    }

    public Padre(String nombre, String primerApellido, String segundoApellido, int ci) {
        super(nombre, primerApellido, segundoApellido);
        this.ci = ci;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

}
