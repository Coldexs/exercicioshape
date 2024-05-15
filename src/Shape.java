abstract class Shape {
    protected String nome;

    public Shape(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String getNome() {
        return nome;
    }
}