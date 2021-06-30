package exam.Task_002;

public class Main {

    public static void main(String[] args) {
        Tvirob tvirob = new Tvirob("Virib 1", 100, 85, 5);
        System.out.printf("Q = %s\n", tvirob.Q());

        TPvirob tPvirob = new TPvirob("Virib 2", 100, 85, 5, 25);
        System.out.printf("QP = %s\n", tPvirob.Qp());
    }
}
