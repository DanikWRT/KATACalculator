public class Main {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Введите математическую операцию между двумя числами от 1 до 10: ");
        String mathOperation = scan.nextLine();
        System.out.println(calc(mathOperation));
        scan.close();
    }
    public static String calc(String answer) throws Exception {
        String [] expression;
        char operator = ' ';
        for (int i = 0; i < answer.length(); i++) {
            switch (answer.charAt(i)) {
                case '*' -> operator = answer.charAt(i);
                case '/' -> operator = answer.charAt(i);
                case '+' -> operator = answer.charAt(i);
                case '-' -> operator = answer.charAt(i);
            }
        }


        System.out.println(operator);


        return answer;
    }
}