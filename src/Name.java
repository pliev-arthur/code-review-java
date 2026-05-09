// FIXME:
// 1. Убран лишний пробел в конструкторе Name( String lastName...)
// 2. Добавлен javadoc для класса
/*public class Name {

    private String firstName;
    private String lastName;
    private String patronymic;

    public Name(String firstName) {
        this.firstName = firstName;
        this.lastName = null;
        this.patronymic = null;
    }
    public Name( String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = null;
    }
    public Name(String lastName, String firstName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        if ((patronymic != null) && (!patronymic.trim().isEmpty())) {
            return firstName + " " + lastName + " " + patronymic;
        }
        if ((lastName != null) && (!lastName.trim().isEmpty())) {
            return firstName + " " + lastName;
        }
        return firstName;
    }
}*/

// FIXTO:
/**
 * Представляет имя человека, которое может состоять из имени, фамилии и отчества.
 *
 * <p>Поддерживает три уровня детализации: только имя, имя с фамилией или полное ФИО.
 * Метод {@link #toString()} форматирует вывод в зависимости от заполненных полей.
 */
public class Name {

    private String firstName;
    private String lastName;
    private String patronymic;

    public Name(String firstName) {
        this.firstName = firstName;
        this.lastName = null;
        this.patronymic = null;
    }

    public Name(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = null;
    }

    public Name(String lastName, String firstName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        if ((patronymic != null) && (!patronymic.trim().isEmpty())) {
            return firstName + " " + lastName + " " + patronymic;
        }
        if ((lastName != null) && (!lastName.trim().isEmpty())) {
            return firstName + " " + lastName;
        }
        return firstName;
    }
}