package practical_work_006;

import java.util.Comparator;

/**
 * Created on 25.05.2021 16:35.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class MusicalСompositionAuthorNameComparator implements Comparator<MusicalСomposition> {

    @Override
    public int compare(MusicalСomposition o1, MusicalСomposition o2) {
        return o1.getAuthor().getName().compareTo(o2.getAuthor().getName());
    }
}
