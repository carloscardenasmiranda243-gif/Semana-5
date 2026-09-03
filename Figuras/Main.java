public class Main {
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(5.0, 3.0);
        Circulo miCirculo = new Circulo(4.0);

        System.out.println("--- PRUEBA INDIVIDUAL ---");
        miRectangulo.mostrarNombre();
        System.out.println("Área del rectángulo: " + miRectangulo.area());

        System.out.println();

        miCirculo.mostrarNombre();
        System.out.println("Área del círculo: " + miCirculo.area());

        System.out.println("\n--- PRUEBA CON POLIMORFISMO ---");
        Figura[] figuras = new Figura[2];
        figuras[0] = miRectangulo;
        figuras[1] = miCirculo;

        for (Figura fig : figuras) {
            fig.mostrarNombre();
            System.out.println("Área: " + fig.area());
            System.out.println("--------------------");
        }
    }
}