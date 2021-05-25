package practical_work_006;

import java.util.Arrays;

/**
 * Created on 25.05.2021 16:41.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class MainSortAuthorName {

    public static void main(String[] args) {

        MusicalСomposition[] musicalСompositions = {
                new MusicalСomposition(new Author("Сергій", "Прокоф'єв"), 80),
                new MusicalСomposition(new Author("Мирослав", "Скорик"), 120),
                new MusicalСomposition(new Author("Микола", "Лисенко"), 90),
                new MusicalСomposition(new Author("Михайло", "Вербицький"), 100)

        };

        System.out.println("Before: ");
        for (MusicalСomposition e : musicalСompositions) {
            System.out.println("Author=" + e.getAuthor() + ",sound duration=" + e.getSoundDuration());
        }

        Arrays.sort(musicalСompositions, new MusicalСompositionAuthorNameComparator());
        System.out.println();

        System.out.println("After: ");
        for (MusicalСomposition e : musicalСompositions) {
            System.out.println("Author=" + e.getAuthor() + ",sound duration=" + e.getSoundDuration());
        }

    }
}
