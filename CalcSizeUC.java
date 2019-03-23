public class CalcSizeUC{

    CalcUUCP uucp;
    CalcTCF tcf;
    double total = 0;
    
    public CalcSizeUC(CalcUUCP uucp, CalcTCF tcf){

        this.uucp = uucp;
        this.tcf = tcf;
    }

    public double calculate(){
        total = uucp.calculate() * tcf.calculate();
        return total;
    }

}