package Task1;

public class Main {

    public static void main(String[] args) {
        float sum=0;

        Triangle triangle1 = new Triangle(3,4,4);
        triangle1.findSquare();
        triangle1.findPerimeter();
        System.out.println();
        Rectangle rectangle1 = new Rectangle(2,4);
        rectangle1.findSquare();
        rectangle1.findPerimeter();
        System.out.println();
        Circle circle1 = new Circle(3);
        circle1.findSquare();
        circle1.findPerimeter();
        System.out.println();
        System.out.println("Сумма периметров всех фигур = ");
        Figure [] array = new Figure[]{triangle1,rectangle1,circle1};

        for (int i = 0; i <array.length ; i++) {
            sum = triangle1.perimeter + rectangle1.perimeter + circle1.perimeter;
        }
        System.out.println(sum);





    }
}
