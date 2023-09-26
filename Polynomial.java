public class Polynomial{
    double[] coefficient;
    public Polynomial(){
        this.coefficient = new double[4];
    }
    public Polynomial(double [] a){
        this.coefficient = a.clone();
    }
    public Polynomial add (Polynomial x){
        Polynomial A = new Polynomial(this.coefficient);
        int size = x.coefficient.length - 1;
        for (int i = 0; i < size; i++){
            A.coefficient[i] = this.coefficient[i] + x.coefficient[i];
        }
        return A;
    }
    public double evaluate (double num){
        double temp = 0.0;
        //Polynomial axe = new Polynomial(this.coefficient);
        for (int i = 0; i< axe.coefficient.length; i++){
            double hold = this.coefficient[i];
            for (int c = 0; c < i; c++){
                hold = hold*num;
            }
            temp = temp + hold;
        }
        return temp;
    }
    public boolean hasRoot(double x){
        if (evaluate(x) == 0){
            return true;
        }
        return false;
    }
}
