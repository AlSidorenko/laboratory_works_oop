package practical_work_002;

import java.lang.reflect.Field;

/**
 * Created on 20.05.2021 23:24.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class MainExecutor {

    public static void main(String[] args) {
        // Ссылка на объект Composition
        Executor executor;

        // 1 - Создаем объект Composition
        executor = new Executor();
        executor.setName("David");
        executor.setSurname("Syd");
        System.out.println(executor);
        System.out.println();

        // 2 - Создаем объект Composition
        executor = new Executor("Gerberd", "Schildt");
        System.out.println(executor);
        System.out.println();

        // Reflection
        System.out.println("Reflection");
        getClassReflection();
        getFieldsReflection();
        System.out.println();

        // Destructor
        System.out.println("Destructor");
        // 3 - Создаем объект Composition
        Executor destructor = new Executor();
        destructor.finalize();
        destructor = null;
        System.gc();
    }

    public static void getClassReflection() {
        // 4 - Создаем объект Composition
        Executor executor = new Executor();
        Class<? extends Executor> executorClass = executor.getClass();
        System.out.println(executorClass.getName());
    }

    public static void getFieldsReflection() {
        Class<Executor> executorClass = Executor.class;
        Field[] declaredFields = executorClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }
}

