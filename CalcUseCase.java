public abstract class CalcUseCase{

    int simpleUC, averageUC, complexUC;

    protected CalcUseCase(int simpleUC, int averageUC, int complexUC){

        this.simpleUC  = simpleUC;
        this.averageUC = averageUC;
        this.complexUC = complexUC;
    }

}