public class CalcTechFactor extends CalcTech implements Calc{

    double total = 0;

    public CalcTechFactor(int t1, int t2, int t3, int t4, int t5, int t6, int t7, int t8, int t9, int t10, int t11, int t12, int t13){
        super(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
    }

    public double calculate(){
        total = ((t1*2) + t2 + t3 + t4 + t5 + (t6*0.5) + (t7*0.5) + (t8*2) + t9 + t10 + t11 + t12 + t13);

		return total; 
    }
}