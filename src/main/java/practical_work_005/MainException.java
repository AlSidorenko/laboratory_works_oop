package practical_work_005;

import java.util.Arrays;

/**
 * Created on 25.05.2021 18:06.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class MainException {

    private static Concert[] concert = new Concert[2];

    public static void main(String[] args) throws MyException {

        // First composition
        Performer performer1 = new Performer("Оркестр", "Національної Філармонія України");
        MusicalСomposition[] musicalСompositions1 = {
                new MusicalСomposition(new Author("Мирослав", "Скорик"), 120),
                new MusicalСomposition(new Author("Микола", "Лисенко"), 90)
        };

        // Second composition
        Performer performer2 = new Performer("Оркестр", "ім. Миколи Лисенка");
        MusicalСomposition[] musicalСompositions2 = {
                new MusicalСomposition(new Author("Михайло", "Вербицький"), 120),
                new MusicalСomposition(new Author("Сергій", "Прокоф'єв"), 90)
        };

        concert[0] = new Concert(performer1, musicalСompositions1); // item - 1
        concert[1] = new Concert(performer2, musicalСompositions2); // item - 2


        //System.out.println(concert[3]);

        // Catch ArrayIndexOutOfBoundsException
        /*System.out.println("Catch ArrayIndexOutOfBoundsException");
        try {
            System.out.println(concert[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index of element is not correct");
        }*/

        // Catch MyException
        /*try {
            printElementOfArray(2);
        } catch (MyException exception) {
            System.out.println("Caught: " + exception);
        }*/

    }

    public static void printElementOfArray(int item) throws MyException {
        System.out.println("Called item(" + item + ")");
        if (item > concert.length) {
            throw new MyException(item);
        }
        System.out.println(concert[item-1]);
        System.out.println("Normal exit");

    }
}
