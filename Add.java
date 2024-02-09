package Calculator;

public class Add implements Operate{
    @Override
    public Double getResult(Double... number){
        Double sum=0.0;
        for(Double num:number){
            sum+=num;
        }
        return sum;
    }
    
}
