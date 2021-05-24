package practical_work_006;

import java.util.Arrays;

/**
 * Created on 23.05.2021 23:35.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Sorting {

    public void selectionSortSoundDuration(MusicalСomposition[] musicalСompositions) {
        for (int min = 0; min < musicalСompositions.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < musicalСompositions.length; j++) {
                if (musicalСompositions[j].getSoundDuration() < musicalСompositions[least].getSoundDuration()) {
                    least = j;
                }
            }
            MusicalСomposition tmp = musicalСompositions[min];
            musicalСompositions[min] = musicalСompositions[least];
            musicalСompositions[least] = tmp;
        }
        //System.out.println(Arrays.toString(musicalСompositions));
    }

}
