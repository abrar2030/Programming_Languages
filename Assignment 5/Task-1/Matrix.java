public class Matrix {
	private double[][] matrix; 
	public Matrix(){
		matrix = new double[0][0];
	}
	public Matrix(int m , int n){
		matrix = new double[m][n];
	}
	public Matrix(double[] array, int n, int m){
		matrix = new double[n][m];
		for (int i =0;i<n; i++)
		{
			for (int j=0;j<m;j++)
			{
				matrix[i][j]=array[i*m+j];
			}
		}
	}

	public double getElement(int i, int j){
		return this.matrix[i][j];
	}
	public void setElement(int i, int j, double element){
		this.matrix[i][j] = element; 
	}
	public int getRowLength(){
		return this.matrix.length;
	}
	public int getColoumnLength(){
		return this.matrix[0].length; 
	}

	public static void getIdentityMatrix(int n, int m)
	{
		Matrix object = new Matrix(m,n);
		for(int i = 0; i<n; i++){
			for(int j = 0; j< m; j++)
			{
				if(i == j)
				{
					object.setElement(i, j, 1); 
				} else {
					object.setElement(i, j, 0);
				}
			}
		}

		System.out.println(object.toString());
	}



	public static Matrix transpose(Matrix A)
	{

		Matrix result = new Matrix(A.getColoumnLength() , A.getRowLength());

		for (int i =0;i<A.getColoumnLength(); i++)
		{ 
			for (int j=0;j<A.getRowLength();j++){
				result.setElement(i, j,A.getElement(j,i));
			}
		}
		return result; 
	}
	public static Matrix sum(Matrix A, Matrix B){
		if (A.getRowLength() != B.getRowLength() || A.getColoumnLength() != B.getColoumnLength())
		{
			System.out.println("compute the sum.");
			System.exit(1);
		}
		Matrix result = new Matrix(A.getRowLength(), A.getColoumnLength());
		for(int i = 0; i < A.getRowLength(); i++){
			for(int j = 0; j < A.getColoumnLength(); j++){
				result.setElement(i, j, A.getElement(i, j) + B.getElement(i, j));}
		}
		return result; 
	}
	public static Matrix difference(Matrix A, Matrix B){
		if (A.getRowLength() != B.getRowLength() || A.getColoumnLength() != B.getColoumnLength())
		{
			System.out.println("Matrices are of different size - can't compute the difference.");
			System.exit(1);
		}
		Matrix result = new Matrix(A.getRowLength(), A.getColoumnLength());
		for(int i = 0; i < A.getRowLength(); i++){
			for(int j = 0; j < A.getColoumnLength(); j++){
				result.setElement(i, j, A.getElement(i, j) - B.getElement(i, j));
			}
		}
		return result; 
	}

	@Override
		public String toString(){
			StringBuilder result = new StringBuilder("");
			for(int i = 0 ; i< this.getRowLength() ; i++){
				for(int j = 0; j < this.getColoumnLength(); j++){
					result.append(Double.toString(this.getElement(i, j))).append("\t"); 
				}
				result.append("\n"); 
			}
			return result.toString(); 
		}
}
