package exam.Task_002;

public class TPvirob extends Tvirob {

    private int P;

    public TPvirob(String name, int numberOfTests, int numberOfProductsIsSuccessful, int numberOfProductsIsNontandard, int p) {
        super(name, numberOfTests, numberOfProductsIsSuccessful, numberOfProductsIsNontandard);
        P = p;
    }

    public double Qp() {
        return Q() - 2 * P;
}

    @Override
    public String toString() {
        return "TPvirob{" +
                "P=" + P +
                '}';
    }
}
