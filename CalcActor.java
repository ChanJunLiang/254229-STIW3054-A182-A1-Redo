public class CalcActor extends CalcActorPoint implements Calc{

    int total = 0;

    public CalcActor(int simpleAct, int averageAct, int complexAct){

        super(simpleAct, averageAct, complexAct);
    }

    public double calculate(){

        total = (simpleAct * 1) + (averageAct * 2) + (complexAct * 3);
        return total; 
    }
}