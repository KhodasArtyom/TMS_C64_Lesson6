package Task2;

public class Worker implements Position{
    String profession = " Моя должность - рабочий";

    @Override
    public void printPosition() {
        System.out.println(profession);
    }
}
