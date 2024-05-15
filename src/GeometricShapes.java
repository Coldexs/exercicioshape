public class GeometricShapes {
    public static void main(String[] args) {
        Rectangle retangulo = new Rectangle("Retângulo", 5, 10);
        Circle circulo = new Circle("Círculo", 5);
        Diamond losango = new Diamond("Losango", 8, 6);
        Hexagon hexagono = new Hexagon("Hexágono", 4);
        Pentagon pentagono = new Pentagon("Pentágono", 6);

        System.out.println(retangulo.getNome() + ": Área = " + retangulo.calcularArea() + ", Perímetro = " + retangulo.calcularPerimetro());
        System.out.println(circulo.getNome() + ": Área = " + circulo.calcularArea() + ", Perímetro = " + circulo.calcularPerimetro());
        System.out.println(losango.getNome() + ": Área = " + losango.calcularArea() + ", Perímetro = " + losango.calcularPerimetro());
        System.out.println(hexagono.getNome() + ": Área = " + hexagono.calcularArea() + ", Perímetro = " + hexagono.calcularPerimetro());
        System.out.println(pentagono.getNome() + ": Área = " + pentagono.calcularArea() + ", Perímetro = " + pentagono.calcularPerimetro());
    }
}