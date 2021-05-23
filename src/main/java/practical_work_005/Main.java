package practical_work_005;

import practical_work_002.Composition;

import java.util.Arrays;

/**
 * Created on 21.05.2021 18:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Main {

    public static void main(String[] args) {
        // Concert
        Concert[] concert = new Concert[2];

        // First composition
        Performer performer1 = new Performer("Оркестр", "Національної Філармонія України");
        MusicalСomposition [] musicalСompositions1 = {
                new MusicalСomposition(new Author("Мирослав", "Скорик"), 120),
                new MusicalСomposition(new Author("Микола", "Лисенко"), 90)
        };
        concert[0] = new Concert(performer1, musicalСompositions1);

        // Second composition
        Performer performer2 = new Performer("Оркест", "ім. Миколи Лисенка");
        MusicalСomposition [] musicalСompositions2 = {
                new MusicalСomposition(new Author("Михайло", "Вербицький"), 120),
                new MusicalСomposition(new Author("Сергій", "Прокоф'єв"), 90)
        };
        concert[1] = new Concert(performer2, musicalСompositions2);

        System.out.println(Arrays.toString(concert));

        // Destructor
        System.out.println("\nDestructor");
        Concert destructor = new Concert();
        destructor.finalize();
        destructor = null;
        System.gc();
    }
}
