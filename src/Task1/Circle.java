package Task1;

public class Circle extends Figure {
    float p =  3.14f;
    float r;
    float perimeter;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public float findSquare() {
        System.out.println("Площадь круга равна Пи * R в квадрате");
        float s = p * (r *r);
        System.out.println("Площадь круга равна = " + s);
        return s;
    }

    @Override
    public float findPerimeter() {
        System.out.println("Периметр круга = 2 * Пи * R");
        perimeter = 2 * p * r;
        System.out.println("Периметр круга = " + perimeter);
        return perimeter;
    }

    @Override
    public void printPerimeter() {
        System.out.println(perimeter);
    }
}
