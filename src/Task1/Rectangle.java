package Task1;

public class Rectangle extends Figure{
    float perimeter;

    public Rectangle(float sideA, float sideB) {
        super(sideA, sideB);
    }

    @Override
    public float findSquare() {
        System.out.println("Площадь прямоугольника равна произведению длины на ширину");
        float s = sideA * sideB;
        System.out.println("Площадь = " + s);
        return s;
    }

    @Override
    public float findPerimeter() {
        System.out.println("Периметр прямоугольника равен сумме шириниы и длины, унможенных на 2");
        perimeter = (sideA + sideB) * 2;
        System.out.println("Периметр = " + perimeter);
        return perimeter;
    }

    @Override
    public void printPerimeter() {
        System.out.println(perimeter);
    }
}
