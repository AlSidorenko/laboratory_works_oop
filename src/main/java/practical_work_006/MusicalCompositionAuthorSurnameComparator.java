package practical_work_006;

import java.util.Comparator;

/**
 * Created on 25.05.2021 16:55.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class MusicalCompositionAuthorSurnameComparator implements Comparator<Musical–°omposition> {

    @Override
    public int compare(Musical–°omposition o1, Musical–°omposition o2) {
        return o1.getAuthor().getSurname().compareTo(o2.getAuthor().getSurname());
    }
}
