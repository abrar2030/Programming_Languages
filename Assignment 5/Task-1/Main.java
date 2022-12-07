public class Main{
  public static void main(String[] args) {

    Matrix m = new Matrix(2, 5);
   
    System.out.println("Empty matrix of MxN with zero Elements! ");
    System.out.println(m.toString());


    System.out.println("Matrix by row major order of MxN");
    double[] array={0,1,2,3,4,5,6,7,8,9};

    Matrix matrixone = new Matrix(array,2,5);
    System.out.println(matrixone.toString());
     
   
   


    int row=5;
    System.out.println("Identity Matrix: ");
    m.getIdentityMatrix(row,row);

    System.out.println("Transpose: of ");
    System.out.println(matrixone.toString());
    System.out.println("=>");
    System.out.println(Matrix.transpose(matrixone).toString());


   double[] arrayone={0,1,2,3,4,5,6,7,8};

   Matrix mone = new Matrix(arrayone,3,3);
   System.out.println("Matrix mone: ");
   System.out.println(mone.toString());
   Matrix mtwo = new Matrix(arrayone, 3,3);
   System.out.println("Matrix mtwo: ");
   System.out.println(mtwo.toString());
   System.out.println("Sum of Matrix mone and Matrix mtwo: ");
   System.out.println(Matrix.sum(mone, mtwo).toString());

  System.out.println("Difference of Matrix mone and Matrix mtwo: ");
  System.out.println(Matrix.difference(mone, mtwo).toString());
    
  }
}
