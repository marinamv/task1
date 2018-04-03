import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CheckDevFunctions {
    String project = "Jira";
    String team = "Leo";
    int devSalary = 25;
    Dev dev = new Dev(project, team, devSalary);

    @Test
    public void writeClass(){
        String writeClassFunction = "write new class";
        assertEquals(dev.writeClass(), writeClassFunction);
        System.out.println("Dev: write new class is works");
    }

    @Test
    public void fixBug(){
        String fixBugFunction = "fix feature bug";
        assertEquals(dev.fixBug(),fixBugFunction);
        System.out.println("Dev: fix feature bug function is works");
    }

    @Test
    public void displayInfoDev(){
        assertEquals(dev.getProject(), project);
        assertEquals(dev.getTeam(), team);
        assertEquals(dev.getSalary(), devSalary);
        System.out.println("DevInfo: Alex " + "|Project: " + project + " |Team: " + team + " |Salary: " + devSalary);
    }

}
