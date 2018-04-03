public class Engineer {
    protected String project;
    protected String team;
    protected int salary;


    public Engineer(String project, String team, int salary) {
        this.project = project;
        this.team = team;
        this.salary = salary;
    }

    public String getProject() {
        return project;
    }

    public String getTeam() {
        return team;
    }

    public int getSalary() {
        return salary;
    }
}
