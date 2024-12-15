package ClassesExercise.FirstTask.Google;

public class Parents {

    private String parentsName;
    private String parentsBirthday;

    public Parents(String parentsName, String parentsBirthday) {
        this.parentsName = parentsName;
        this.parentsBirthday = parentsBirthday;
    }

    @Override
    public String toString() {
        return  parentsName+" "+parentsBirthday;
    }
}
