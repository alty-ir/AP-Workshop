import java.util.ArrayList;

/**
 * A class to drive program.
 * 
 * @author Ali Tabesh
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        // create a voting system
        VotingSystem votingSystem = new VotingSystem();

        // create voting choices
        ArrayList<String> options = new ArrayList<>();
        ArrayList<String> days = new ArrayList<>();
        options.add("Yeap");
        options.add("Nope");
        days.add("Thue");
        days.add("Fri");
        days.add("Sat");
        days.add("Mon");

        // single vote mode (index 0)
        votingSystem.createVoting("are u ok?", 0, options);

        // multiple vote mode (index 1)
        votingSystem.createVoting("when is ur work day(s)?", 1, days);

        // print voting questions.
        System.out.println("print voting questions.");
        votingSystem.printVotingQuestions();
        System.out.println();

        // print voting
        System.out.println("print voting.");
        votingSystem.printVoting(0);
        System.out.println();
        votingSystem.printVoting(1);
        System.out.println();

        // print result
        System.out.println("print result.");
        votingSystem.printResult(0);
        System.out.println();
        votingSystem.printResult(1);
        System.out.println();

        // delete voting.
        System.out.println("delete voting.");
        votingSystem.deleteVoting(1);
        votingSystem.printVotingQuestions();
        votingSystem.createVoting("when is ur work day(s)?", 1, days);
        votingSystem.printVotingQuestions();
        System.out.println();

        // create person
        Person p1 = new Person("Ali", "1");
        Person p2 = new Person("Ali", "2");
        Person p3 = new Person("Ali", "3");
        Person p4 = new Person("Ali", "4");

        // random vote.
        System.out.println("random vote.");
        votingSystem.voteRandom(0, p1);
        votingSystem.voteRandom(0, p2);
        System.out.println();
        votingSystem.printResult(0);
        System.out.println();

        // create vote
        ArrayList<String> vote1 = new ArrayList<>();
        ArrayList<String> vote2 = new ArrayList<>();
        vote1.add("Nope");
        vote2.add("Nope");
        // voting 0:
        System.out.println("voting 0:");
        votingSystem.vote(0, p1, vote1);
        votingSystem.vote(0, p1, vote1);
        votingSystem.vote(0, p2, vote2);
        System.out.println();
        votingSystem.printResult(0);
        System.out.println();

        // voting 1:        
        ArrayList<String> vote3 = new ArrayList<>();
        ArrayList<String> vote4 = new ArrayList<>();
        vote3.add("Mon");
        vote3.add("Thue");
        vote3.add("Fri");
        vote3.add("Sat");
        vote4.add("Mon");
        vote4.add("Sat");
        System.out.println("voting 1");
        votingSystem.vote(1, p3, vote3);
        votingSystem.vote(1, p4, vote4);
        System.out.println();
        votingSystem.printResult(1);
    }
}
