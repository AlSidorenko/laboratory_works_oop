package practical_work_006;

/**
 * Created on 24.05.2021 12:52.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class MainSortSoundDuration {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        MusicalСomposition[] musicalСompositions = {
                new MusicalСomposition(new Author("Мирослав", "Скорик"), 120),
                new MusicalСomposition(new Author("Микола", "Лисенко"), 90),
                new MusicalСomposition(new Author("Михайло", "Вербицький"), 100),
                new MusicalСomposition(new Author("Сергій", "Прокоф'єв"), 80)
        };

        System.out.println("Before: ");
        for (MusicalСomposition e : musicalСompositions) {
            System.out.println("Author=" + e.getAuthor() + ",sound duration=" + e.getSoundDuration());
        }

        sorting.selectionSortSoundDuration(musicalСompositions);
        System.out.println();

        System.out.println("After: ");
        for (MusicalСomposition e : musicalСompositions) {
            System.out.println("Author=" + e.getAuthor() + ",sound duration=" + e.getSoundDuration());
        }

    }
}
