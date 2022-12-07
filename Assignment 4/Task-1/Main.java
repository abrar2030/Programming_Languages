public class Main{

    public static void main(String[] args) {
        
        double[] arr = {1, 2,3};
        DoubleVector v1 = new DoubleVector(arr);
        
        System.out.println(v1.toString());


        //scalar product
        double arr2[] = {1, 4, 5};
        DoubleVector v2 = new DoubleVector(arr2);
        System.out.println( v1.getDotProduct(v2));


        //sum 
        System.out.println( v1.getSum(v2).toString());

        //diff 
        System.out.println( v1.getDifference(v2).toString());

        //scalar multiplication 
        System.out.println(v1.getScalarProduct(5).toString());
        System.out.println(v2.getScalarProduct(5).toString());
        
    }
}
