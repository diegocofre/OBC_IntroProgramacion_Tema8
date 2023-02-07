public class Main {
    public static void main(String[] args) {
        var p = new Persona();
        p.setEdad(44);
        p.setNombre("Diego");
        p.setTelefono("112334566");

        System.out.println("La persona " + p.getNombre() + " tiene " + p.getEdad() + " años y su teléfono es " + p.getTelefono());
    }
}