public class CalcEF{

    CalcExpFactor calcexp;
    double total = 0;
    
    public CalcEF(CalcExpFactor calcexp){

        this.calcexp = calcexp;

    }

    public double calculate(){
        
        total = ((-0.03) * calcexp.calculate()) + 1.4 ;
        return total;
    }

}