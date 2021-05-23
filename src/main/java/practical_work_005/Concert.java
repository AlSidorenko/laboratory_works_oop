package practical_work_005;

import java.util.Arrays;

/**
 * Created on 23.05.2021 12:02.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Concert {

    private Performer performer;
    private MusicalСomposition [] сompositions;

    public Concert() {
    }

    public Concert(MusicalСomposition[] compositions) {
        this.сompositions = compositions;
    }

    public Concert(Performer performer, MusicalСomposition[] compositions) {
        this.performer = performer;
        this.сompositions = compositions;
    }

    public Performer getPerformer() {
        return performer;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    public MusicalСomposition[] getСompositions() {
        return сompositions;
    }

    public void setСompositions(MusicalСomposition[] сompositions) {
        this.сompositions = сompositions;
    }

    // деструктор
    public void finalize() {
        System.out.println("Object is destroyed by the Garbage Collector");
    }

    @Override
    public String toString() {
        return "Concert{" + "\n\t" +
                "performer=" + performer + ", \n\t" +
                "musical compositions=\n\t\t" + Arrays.toString(сompositions) +
                "\n\t}";
    }
}
