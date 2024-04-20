public class QuestionService {
    // creates a array with 5 questions
    // Questions[] is the data type = class question but an array
    // questions is the referrance variable
    // new Questions will a one deminsional array with 5 questions
   Questions[] questions = new Questions[5];

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
   public void displayQuestions() {

    for(Questions q : questions) {
        System.out.println(q.getQuestions());
    }
   }
   
    
}
