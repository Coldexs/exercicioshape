class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String nome, double length, double width) {
        super(nome);
        this.length = length;
        this.width = width;
    }


    public double calcularArea() {
        return length * width;
    }


    public double calcularPerimetro() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String nome, double radius) {
        super(nome);
        this.radius = radius;
    }


    public double calcularArea() {
        return Math.PI * radius * radius;
    }


    public double calcularPerimetro() {
        return 2 * Math.PI * radius;
    }
}

class Diamond extends Shape {
    private double diagonal1;
    private double diagonal2;

    public Diamond(String nome, double diagonal1, double diagonal2) {
        super(nome);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }


    public double calcularArea() {
        return (diagonal1 * diagonal2) / 2;
    }


    public double calcularPerimetro() {
        return 4 * Math.sqrt((diagonal1 * diagonal1 + diagonal2 * diagonal2) / 4);
    }
}

class Hexagon extends Shape {
    private double side;

    public Hexagon(String nome, double side) {
        super(nome);
        this.side = side;
    }


    public double calcularArea() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }


    public double calcularPerimetro() {
        return 6 * side;
    }
}

class Pentagon extends Shape {
    private double side;

    public Pentagon(String nome, double side) {
        super(nome);
        this.side = side;
    }


    public double calcularArea() {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }


    public double calcularPerimetro() {
        return 5 * side;
    }
}