public class CalcUCP {

    CalcSizeUC szUC;
    CalcEF calcef;
    double total = 0;
        
    public CalcUCP(CalcSizeUC szUC, CalcEF calcef){

        this.szUC = szUC;
        this.calcef = calcef;
    }

    public double calculate(){
        total = szUC.calculate() * calcef.calculate();
        return total;
    }

}