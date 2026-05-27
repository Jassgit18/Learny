import java.util.*;
public class Generator{

        public void generate(int choice){
            QuestionBank qb = new QuestionBank();
            QA[] questions;
            
        switch (choice) {    
            case 1:
                questions = qb.getJavaCommon();
                break;
            case 2:
                questions = qb.getOopsCommon();
                break;
            case 3:
                questions = qb.getEasyQns();
                break;
            case 4:
                questions = qb.getMediumQns();
                break;
            case 5:
                questions = qb.getHardQns();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        Set<Integer> used = new HashSet<>();

        System.out.println("\nYour Questions:\n");
        while (used.size() < 6) {
            int index = r.nextInt(questions.length);

            if (used.add(index)) {

                QA qa = questions[index];
                System.out.println(used.size() + ". " + qa.question);

                System.out.print("Do you want the answer? (y/n): ");
                char ch = sc.next().charAt(0);

                if (ch == 'y' || ch == 'Y') {
                    System.out.println("Answer: " + qa.answer);
                }
                System.out.println();
            }
        }
    }
}
