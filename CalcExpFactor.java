public class CalcExpFactor extends CalcExp implements Calc{

    double total = 0;

    public CalcExpFactor(int e1, int e2, int e3, int e4, int e5, int e6, int e7, int e8){
        super(e1, e2, e3, e4, e5, e6, e7, e8);
    }

    public double calculate(){
        total = e1 + (e2 * 0.5) + e3 + (e4 * 0.5) + (e6 * 2) + (-e7) + (-e8);

		return total; 
    }
}