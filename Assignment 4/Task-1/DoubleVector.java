public class DoubleVector{

    private double[] vector; 

   
    DoubleVector(double[] vector){
        this.vector = new double[vector.length];
        for(int i = 0 ; i < vector.length; i++){
            this.vector[i] = vector[i];
        }
    }

    
    public double[] getVector(){
        return this.vector;
    }

    public double getElement(int i){
        return this.vector[i];
    }
    
    public void setElement(int i, double value){
        this.vector[i] = value;
    }

    public double getDotProduct(DoubleVector A){
        if( this.vector.length != A.getVector().length){
            System.out.println("The vectors are not of th same length, Cannot find their sum!");
            System.exit(1);
        }
        double sum = 0; 
        for(int i = 0; i < this.vector.length; i++){
            sum += this.vector[i] * A.getElement(i);  
        }

        return sum; 
    }
    

    public DoubleVector getSum(DoubleVector input){
        if( this.vector.length != input.getVector().length){
            System.out.println("The vectors are not of th same length, Cannot find their sum!");
            System.exit(1); 
        }
        DoubleVector sum = new DoubleVector(input.getVector());
        for(int i = 0; i < this.vector.length; i++){
            sum.setElement(i, this.vector[i] + input.getElement(i));
        }
        return sum; 
    }


    public DoubleVector getDifference(DoubleVector input){
        if( this.vector.length != input.getVector().length){
            System.out.println("The vectors are not of th same length, Cannot find their sum!");
            System.exit(1); 
        }
        DoubleVector diff = new DoubleVector(input.getVector());
        for(int i = 0; i < this.vector.length; i++){
            diff.setElement(i, this.vector[i] - input.getElement(i));
        }
        return diff; 
    }


    public DoubleVector getScalarProduct(double k){
        for(int i = 0; i < this.vector.length; i++){
            this.setElement(i, this.vector[i] * k);
        }
        return this;
    }


    @Override 
    public String toString(){
        String res = "("; 
        for(int i = 0; i < this.vector.length; i++){
            res += Double.toString((this.vector[i])) + ", "; 
        }
        res+=")";
        return res; 
    }

}
