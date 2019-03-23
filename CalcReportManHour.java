public class CalcReportManHour extends CalcRMH implements Calc{

    double total = 0;

    public CalcReportManHour(double simMH, double simQty, double aveMH, double aveQty, double comMH, double comQty){

        super(simMH, simQty, aveMH, aveQty, comMH, comQty);
    }

    public double calculate(){

        total = (simMH * simQty) + (aveMH * aveQty) + (comMH * comQty);
        return total; 
    }
}