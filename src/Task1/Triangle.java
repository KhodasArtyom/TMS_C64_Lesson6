package Task1;

public class Triangle extends Figure{
    float height;
    float s;

    float perimeter;





    public Triangle(float sideA, float sideB, float sideC) {
        super(sideA, sideB, sideC);
    }

    public Triangle(float sideA) {
        super(sideA);
    }

    @Override
    public float findSquare(){
        height = 3;
        System.out.println("Площадь треугольника = половине произведения основания на высоту, " +
                "проведенную к этому основанию");
        s = (sideA * height) / 2;
        System.out.println("Площадь треугольника равна = " + s);
        return s;
    }

    @Override
    public float findPerimeter() {
        System.out.println("Периметр треугольника равен сумме всех сторон");
        perimeter = sideA + sideB + sideC;
        System.out.println("Периметр = " + perimeter);
        return perimeter;
    }
    @Override
    public void printPerimeter() {
        System.out.println(perimeter);
    }


}
