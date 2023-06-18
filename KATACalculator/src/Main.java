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
        expression = answer.split("[*/+-]");
        if ((operator == ' ') || (expression.length > 2)) throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        System.out.println(operator);
        expression[0] = expression[0].trim().toUpperCase();
        expression[1] = expression[1].trim().toUpperCase();
        byte romanCheck = 0;
        answer = arabToRoman(96);
        return answer;
    }
    public static String romanToArab(String string) throws Exception {
        String[] arab = new String[]{"10", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] roman = new String[]{"X", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        for (int i = 0; i < 10; i++) if (string.trim().toUpperCase().equals(roman[i])) return arab[i];
        throw new Exception("т.к. введеные данные не соответсвует критерию");
    }
    static String arabToRoman(int number) {
        String[] roman = new String[]{"C", "IC","XC", "L", "IL", "XL", "X","IX", "V","IV", "I"};
        String[] arab = new String[]{"100", "99", "90", "50", "49", "40", "10","9", "5","4", "1"};
        String result = " ";
        for(int i = 0; i < arab.length; i++) {
            for (int j = 0; j<3; j++) {
                if (number >= Integer.parseInt(arab[i])) {
                    result = result  + roman[i];
                    number = number - Integer.parseInt(arab[i]);
                }
            }
        }
        return result.trim();
    }
}