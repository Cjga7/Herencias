public class Yo extends Padre{
    Integer celular;

    public Yo(int ci, Integer celular) {
        super(ci);
        this.celular = celular;
    }

    public Yo(String nombre, String primerApellido, String segundoApellido, int ci, Integer celular) {
        super(nombre, primerApellido, segundoApellido, ci);
        this.celular = celular;
    }
}
