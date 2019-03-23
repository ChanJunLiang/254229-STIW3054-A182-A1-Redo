public abstract class CalcRMH{

    double simMH, simQty, aveMH, aveQty, comMH, comQty;

    protected CalcRMH(double simMH, double simQty, double aveMH, double aveQty, double comMH, double comQty){
        
        this.simMH  = simMH;
        this.simQty = simQty;
        this.aveMH  = aveMH;
        this.aveQty = aveQty;
        this.comMH  = comMH;
        this.comQty = comQty;
    }

}