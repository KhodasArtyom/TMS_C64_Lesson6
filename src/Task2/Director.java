package Task2;

public class Director implements Position {
    String profession = " Моя должность - директор";

    @Override
    public void printPosition() {
        System.out.println(profession);
    }
}
