/**
 * Created by Администратор on 28.07.2016.
 */
public class Student extends Man {

    private int dataStudy;

    public Student(String name, int age, int weight, int dataStudy) {
        super(name, age, weight);
        this.dataStudy = dataStudy;
    }

    public int getDataStudy() {
        return dataStudy;
    }

    public void setDataStudy(int dataStudy) {
        this.dataStudy = dataStudy;
    }

    public void addOneStudyYear(){
        ++dataStudy;
    }
    public void removeOneStudyYear() {
        --dataStudy;
    }
}

