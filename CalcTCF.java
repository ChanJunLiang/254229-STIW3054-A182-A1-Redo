public class CalcTCF{

    CalcTechFactor calctech;
    double total = 0;
    
    public CalcTCF(CalcTechFactor calctech){

        this.calctech = calctech;
    }

    public double calculate(){
        
        total = ( 0.01 * calctech.calculate()) + 0.6 ;
        return total;
    }

}