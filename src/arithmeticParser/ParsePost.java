package arithmeticParser;

/**
 * Created by sun on 06.03.17.
 */
public class ParsePost {
    private arithmeticParser.StackX theStack;
    private String input;

    public ParsePost(String s) {

        this.input = s;
    }

    public int doParse() {

        theStack = new StackX(20);         //создание обьекта стэка
        char ch;
        int j;
        int num1, num2, interAns;

        for (j = 0; j < input.length(); j++) {                  //для каждого символа
//            ch = input.charAt(j);                               //чтение символа

           char[]c = input.toCharArray();
           ch = c[j];

           theStack.displayStack(" " + ch + " ");            //*диагностика*
           if(Character.isDigit(ch)) {
               theStack.push(Character.getNumericValue(ch));
//                if (ch >= '0' && ch <= '9') {             //если это цифра
//                theStack.push((int)(ch -'0'));        //занести в стэк
//            } else {                                  //если оператор -

           } else if(ch ==' '){

           } else if(ch =='+' || ch == '-' || ch== '*' || ch=='/' || ch=='(' || ch == ')') {
                num2 = theStack.pop();                //извлечение операндов
                num1 = theStack.pop();
                switch (ch) {                          //выполнение арифметических операций
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                theStack.push(interAns);
            }
        }
        interAns = theStack.pop();
        return interAns;
    }
}
