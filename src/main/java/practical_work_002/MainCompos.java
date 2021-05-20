package practical_work_002;

import java.lang.reflect.Field;

/**
 * Created on 20.05.2021 18:58.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class MainCompos {

    public static void main(String[] args) {
        // Ссылка на объект Composition
        Composition composition;

        // 1 - Создаем объект Composition
        composition = new Composition();
        composition.setTitle("Война и мир");
        composition.setSize(1000);
        composition.setProfit(500);
        System.out.println(composition);
        System.out.println();

        // 2 - Создаем объект Composition
        composition = new Composition("Анна Каренина");
        System.out.println(composition);
        System.out.println();

        // 3 - Создаем объект Composition
        composition = new Composition(1000, 500);
        System.out.println(composition);
        System.out.println();

        // Reflection
        System.out.println("Reflection");
        getClassReflection();
        getFieldsReflection();
        System.out.println();

        // Destructor
        System.out.println("Destructor");
        // 4 - Создаем объект Composition
        Composition destructor = new Composition();
        destructor.finalize();
        destructor = null;
        System.gc();
        //System.out.println("Inside the main() method");
    }

    public static void getClassReflection() {
        // 5 - Создаем объект Composition
        Composition composition = new Composition();
        Class<? extends Composition> compositionClass1 = composition.getClass();
        System.out.println(compositionClass1.getName());
    }

    public static void getFieldsReflection() {
        Class<Composition> compositionClass2 = Composition.class;
        Field[] declaredFields = compositionClass2.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }
}
