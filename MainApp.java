package Calculator;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;
public class MainApp {
    public static void main(String[] args) {
        final String inputExp=ReadInput.read();
        Queue<String> operations;
        Queue<String> numbers;

        String numbersArray[]=inputExp.split("[+*/-]");
        String operatorArray[]=inputExp.split("[0-9]+");

        numbers=new LinkedList<String>(Arrays.asList(numbersArray));
        operations=new LinkedList<String>(Arrays.asList(operatorArray));
        Double result=Double.parseDouble(numbers.poll());

        while(!numbers.isEmpty()){
            String opr=operations.poll();
            
            Operate operate;
            switch(opr){
                case "+":
                    operate=new Add();
                    break;
                case "-":
                    operate=new Subtract();
                    break;
                case "*":
                    operate=new Multiply();
                    break;
                case "/":
                    operate=new Divide();
                    break;
                default:
                   continue;
            }
            Double num = Double.parseDouble(numbers.poll());
            result=operate.getResult(result,num);
        }
        System.out.println(result);
    }
    
}
