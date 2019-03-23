public class CalcUUCP {

    CalcActor act;
    CalcWeightUseCase weightWUC;
    double total = 0;
    
    public CalcUUCP(CalcActor act, CalcWeightUseCase weightWUC){

        this.act = act;
        this.weightWUC = weightWUC;
    }

    public double calculate(){
        total = act.calculate() + weightWUC.calculate();
        return total;
    }

}