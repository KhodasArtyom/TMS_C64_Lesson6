package Task1;

public abstract class Figure {
    float sideA;
    float sideB;
    float sideC;

    public Figure() {
    }

    public Figure(float sideA) {
        this.sideA = sideA;
    }

    public Figure(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Figure(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public abstract float findSquare();


    public abstract float findPerimeter();


    public abstract void printPerimeter();
}
