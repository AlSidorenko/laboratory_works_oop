package practical_work_005;

/**
 * Created on 25.05.2021 18:28.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class MyException extends Exception {

    private int item;

    public MyException(int item) {
        this.item = item;
    }

    public String toString() {
        return "MyException[" + item + "]";
    }
}
