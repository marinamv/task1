public class Dev extends Engineer{


    public Dev(String team, String project, int salary) {
        super(team, project,salary);
    }

    public String writeClass() {
        return "write new class";
    }

    public String fixBug() {
        return "fix feature bug";
    }
}
