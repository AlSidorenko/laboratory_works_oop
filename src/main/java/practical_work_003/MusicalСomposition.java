package practical_work_003;

/**
 * Created on 21.05.2021 11:04.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class MusicalСomposition extends Composition {

    private Performer performer;
    private int  soundDuration;

    public MusicalСomposition() {
    }

    public MusicalСomposition(Performer performer, int soundDuration) {
        this.performer = performer;
        this.soundDuration = soundDuration;
    }

    public Performer getPerformer() {
        return performer;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    public int getSoundDuration() {
        return soundDuration;
    }

    public void setSoundDuration(int soundDuration) {
        this.soundDuration = soundDuration;
    }

    @Override
    public String toString() {
        return "MusicalСomposition{" +
                "performer=" + performer +
                ", soundDuration=" + soundDuration +
                '}';
    }
}
