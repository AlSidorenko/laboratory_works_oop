package practical_work_006;

/**
 * Created on 21.05.2021 11:03.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Composition {

    private String title;
    private int size;
    private int profit;

    // Дефолтный конструктор
    public Composition() {
    }

    // Конструктор с переменными
    public Composition(String title) {
        this.title = title;
    }

    public Composition(int size, int profit) {
        this.size = size;
        this.profit = profit;
    }

    // ф-ция (метод) селектор
    public String getTitle() {
        return title;
    }

    // ф-ция (метод) модификатор
    public void setTitle(String title) {
        this.title = title;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    // деструктор
    public void finalize() {
        System.out.println("Object is destroyed by the Garbage Collector");
    }

    @Override
    public String toString() {
        return "Composition{" +
                "title='" + title + '\'' +
                ", size=" + size +
                ", profit=" + profit +
                '}';
    }
}
