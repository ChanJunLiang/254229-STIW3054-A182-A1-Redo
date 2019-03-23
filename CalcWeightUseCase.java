public class CalcWeightUseCase extends CalcUseCase implements Calc {
    
    double total = 0;

    public CalcWeightUseCase(int simpleUC, int averageUC, int complexUC){
        super(simpleUC, averageUC, complexUC);
    }

    public double calculate(){
        total = (simpleUC * 5) + (averageUC * 10) + (complexUC * 15);
        return total; 
    }
}