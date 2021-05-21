package practical_work_003;

/**
 * Created on 21.05.2021 11:08.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class PrintEdition extends Composition {

    private Performer performer;
    private int numberOfPages;

    public PrintEdition(int size, int profit) {
        super(size, profit);
    }

    public PrintEdition() {
    }

    public PrintEdition(Performer performer, int numberOfPages) {
        this.performer = performer;
        this.numberOfPages = numberOfPages;
    }

    public PrintEdition(int size, int profit, Performer performer, int numberOfPages) {
        super(size, profit);
        this.performer = performer;
        this.numberOfPages = numberOfPages;
    }

    public Performer getPerformer() {
        return performer;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "PrintEdition{ " +
                "Composition{" +
                /*"title='" + title + '\'' + */
                "size=" + super.getSize() +
                ", profit=" + super.getProfit() +
                '}' + ',' +
                " performer=" + performer +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
