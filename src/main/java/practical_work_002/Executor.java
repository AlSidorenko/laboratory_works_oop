package practical_work_002;

/**
 * Created on 20.05.2021 18:32.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Executor {

    private String name;
    private String surname;

    public Executor() {
    }

    public Executor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // деструктор
    public void finalize() {
        System.out.println("Object is destroyed by the Garbage Collector");
    }

    @Override
    public String toString() {
        return "Executor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
