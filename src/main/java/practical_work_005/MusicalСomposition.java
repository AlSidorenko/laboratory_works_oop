package practical_work_005;

/**
 * Created on 21.05.2021 11:04.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class MusicalСomposition extends Composition {

    private Author author;
    private int  soundDuration;

    public MusicalСomposition() {
    }

    public MusicalСomposition(int soundDuration) {
        this.soundDuration = soundDuration;
    }


    public MusicalСomposition(Author author, int soundDuration) {
        this.author = author;
        this.soundDuration = soundDuration;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getSoundDuration() {
        return soundDuration;
    }

    public void setSoundDuration(int soundDuration) {
        this.soundDuration = soundDuration;
    }

    @Override
    public String toString() {
        return "Musical Сomposition{" +
                "author=" + author + "," +
                "soundDuration=" + soundDuration +
                "}\n\t\t";
    }
}
