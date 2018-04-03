public class QA extends Engineer {


    public QA(String team, String project, int salary){
        super(team,project,salary);
    }

    public String createTest() {
        return "create a new test";
    }

    public String postBug() {
        return "post a new bug";
    }
}