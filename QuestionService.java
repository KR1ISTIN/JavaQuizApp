import java.util.Scanner;

public class QuestionService {
    // creates a array with 5 questions
    // Questions[] is the data type = class question but an array
    // questions is the referrance variable
    // new Questions will a one deminsional array with 5 questions
   Questions[] questions = new Questions[5];

   // this will be an array to store our answers from the user
   String selection[] = new String[5];

   // default constructor
   // assigning values in questions array
   public QuestionService() {
    questions[0] = new Questions(1, "size of int?", "2", "6", "4", "8", "4");
    questions[1] = new Questions(2, "size of double?", "2", "6", "4", "8", "8");
    questions[2] = new Questions(3, "size of char?", "2", "6", "4", "8", "2");
    questions[3] = new Questions(4, "size of long?", "2", "6", "4", "8", "8");
    questions[4] = new Questions(5, "size of boolean?", "1", "2", "4", "8", "1");

   }

   // displaying questions method
   public void playQuiz() {
    // creating i to keep track of the index value to store the answer is selections array
    int i = 0;
    for(Questions q : questions) {
        System.out.println("Question no.: " + q.getId());
        System.out.println(q.getQuestions());
        // make into a loop later 
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());// System.out is for the output
        System.out.println(q.getOpt3());   
        System.out.println(q.getOpt4());

        // scanner helps to get value from user input
        Scanner sc = new Scanner(System.in); // System.in is for the users input, 
        selection[i] = sc.nextLine(); // whatever the user types itll save it 
        i++; // adding i one time to loop to next index
    }

    // printing all the users answers from input
    System.out.println();
    for(String s : selection) {
        System.out.println("Answer:" + s);
    }
   }
   
    
}
