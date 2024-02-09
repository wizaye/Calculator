package Calculator;

public class Subtract implements Operate{
    @Override
    public Double getResult(Double... num){
        Double result=num[0];
        for(int i=1;i<num.length;i++){
            result-=num[i];
        }
        return result;
    }
}
