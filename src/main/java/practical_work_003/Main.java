package practical_work_003;

/**
 * Created on 21.05.2021 18:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Main {

    public static void main(String[] args) {
        // MusicalСomposition
        MusicalСomposition musicalComposition = new MusicalСomposition();
        musicalComposition.setPerformer(new Performer("Мирослав", "Скорик"));
        musicalComposition.setSoundDuration(10);

        System.out.println(musicalComposition);
        System.out.println(musicalComposition.getPerformer());
        System.out.println(musicalComposition.getPerformer().getSurname());

        System.out.println();

        // PrintEdition
        Performer performer = new Performer("Михайло", "Вербицький");
        PrintEdition printEdition = new PrintEdition(1000, 500, performer, 250);
        System.out.println(printEdition);

    }
}
