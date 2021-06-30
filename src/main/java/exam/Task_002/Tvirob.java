package exam.Task_002;

public class Tvirob {

    private String name;
    private int numberOfTests;
    private int numberOfProductsIsSuccessful;
    private int numberOfProductsIsNontandard;

    public Tvirob(String name, int numberOfTests, int numberOfProductsIsSuccessful, int numberOfProductsIsNontandard) {
        this.name = name;
        this.numberOfTests = numberOfTests;
        this.numberOfProductsIsSuccessful = numberOfProductsIsSuccessful;
        this.numberOfProductsIsNontandard = numberOfProductsIsNontandard;
    }

    public double Q() {
        return numberOfTests/numberOfProductsIsSuccessful;
    }

    @Override
    public String toString() {
        return "Tvirob{" +
                "name='" + name + '\'' +
                ", numberOfTests=" + numberOfTests +
                ", numberOfProductsIsSuccessful=" + numberOfProductsIsSuccessful +
                ", numberOfProductsIsNontandard=" + numberOfProductsIsNontandard +
                '}';
    }
}
