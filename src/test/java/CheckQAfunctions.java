import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CheckQAfunctions {
    String project = "Jira";
    String team = "Leo";
    int qaSalary = 10;
    QA qa = new QA(project, team, qaSalary);

    @Test
    public void createTest(){
        String createTestFunction = "create a new test";
        assertEquals(qa.createTest(), createTestFunction);
        System.out.println("QA: create a new test is works");
    }

    @Test
    public void postBug(){
        String postBugFunction = "post a new bug";
        assertEquals(qa.postBug(), postBugFunction);
        System.out.println("QA: post a new bug is works");
    }

    @Test
    public void displayInfoQA(){
        assertEquals(qa.getProject(), project);
        assertEquals(qa.getTeam(), team);
        assertEquals(qa.getSalary(), qaSalary);
        System.out.println("QAInfo: Mari " + "|Project: " + project + " |Team: " + team + " |Salary: " + qaSalary);
    }
}
