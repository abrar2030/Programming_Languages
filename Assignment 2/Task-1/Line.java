class Line {

	double a, b, c;

	boolean contains(double x,double y)
	{
		return a*x+b*y==c;
	}
	void isParalellWith(double a1,double b1,double c1)
	{
		if (a*b1 == a1*b)
		{
			System.out.println("Yes,the line is Paralell to the given line.");
		}
		else
		{
			System.out.println("No,the line is not Paralell to the given line.");
		}
	}

	static boolean isOrthogonalTo(double p1, double q1, double p2, double q2, double p3, double q3, double p4, double q4)
	{
		double m1, m2;

		if (p2 - p1 == 0 && p4 - p3 == 0)
			return false;

		else if (p2 - p1 == 0)

		{
			m2 = (q4 - q3) / (p4 - p3);
			if (m2 == 0)
				return true;
			else
				return false;
		}

		else if (p4 - p3 == 0)

		{
			m1 = (q2 - q1) / (p2 - p1);
			if (m1 == 0)
				return true;
			else
				return false;
		}

		else

		{

			m1 = (q2 - q1) / (p2 - p1);
			m2 = (q4 - q3) / (p4 - p3);

			if (m1 * m2 == -1)
				return true;
			else
				return false;
		}
	}
}

