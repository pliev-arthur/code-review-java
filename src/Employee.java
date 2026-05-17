// FIXME:
// 1. Полям name и department добавлен модификатор private
// 2. Добавлены пустые строки между методами

/*
public class Employee {
    String name;
    Department department;

    public Employee(String name) {
        this.name = name;
        this.department = null;
    }
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if ((department != null) && (department.getBoss().getName() == name)) {
            return name + " начальник отдела " + department.getName();
        }
        if ((department != null) && (department.getBoss() != null)){
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getBoss().getName();
        }
        if (department != null) {
            return name + " работает в отделе " + department.getName();
        }
        return name;
    }
}*/

// FIXTO:
/**
 * Представляет сотрудника с именем и опциональной привязкой к отделу.
 *
 * <p>Метод {@link #toString()} форматирует вывод в зависимости от наличия отдела
 * и того, является ли сотрудник его начальником.
 */

public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
        this.department = null;
    }

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if (department != null && department.getBoss() != null
                && department.getBoss().getName().equals(name)) {
            return name + " начальник отдела " + department.getName();
        }
        if (department != null && department.getBoss() != null) {
            return name + " работает в отделе " + department.getName()
                    + ", начальник которого " + department.getBoss().getName();
        }
        if (department != null) {
            return name + " работает в отделе " + department.getName();
        }
        return name;
    }
}