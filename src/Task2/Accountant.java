package Task2;

public class Accountant implements Position {
    String profession = " Моя должность - бухгалтер";

    @Override
    public void printPosition() {
        System.out.println(profession);
    }
}
