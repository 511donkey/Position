public class User {
    private String fulName;
    private int salary;
    private Position position;


    public User() {
    }

    ;

    public User(String fulName, Position position) {
        this.fulName = fulName;
        int salary;
        this.position = position;
    }

    public User(String fulName, int salary, Position position) {
        this.fulName = fulName;
        this.salary = salary;
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "User{" +
                "fulName='" + fulName + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }
}
