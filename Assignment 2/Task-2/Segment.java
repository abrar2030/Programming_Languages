class Segment {

	double x1, y1, x2, y2;

	double line()
	{
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}
	void contains(double x, double y)
	{
		double c = y - (y2 - y1)/(x2 - x1) * x;      
		if (c == y - (y2 - y1)/(x2 - x1) * x)
		{
			System.out.println("Yes,the points lie on the line.");

		} else {
			System.out.println("No,the points does not lie on the line.");
		}
	}

	static boolean OnSeg(Point p, Point q, Point r)
	{
		if (q.x <= Math.max(p.x, r.x) && q.x >= Math.min(p.x, r.x) &&
				q.y <= Math.max(p.y, r.y) && q.y >= Math.min(p.y, r.y))
			return true;

		return false;
	}

	static int Orient(Point p, Point q, Point r)
	{
		int val = (q.y - p.y) * (r.x - q.x) -
			(q.x - p.x) * (r.y - q.y);

		if (val == 0) return 0; 

		return (val > 0)? 1: 2; 
	}

	static boolean Intersect(Point p5, Point q5, Point p6, Point q6)
	{
		int o1 = Orient(p5, q5, p6);
		int o2 = Orient(p6, q6, p5);
		int o3 = Orient(p6, q6, p5);
		int o4 = Orient(p6, q6, q5);

		if (o1 != o2 && o3 != o4)
			return true;

		if (o1 == 0 && OnSeg(p5, p6, q5)) return true;

		if (o2 == 0 && OnSeg(p5, q6, q5)) return true;

		if (o3 == 0 && OnSeg(p6, p5, q6)) return true;

		return false;
	}

}
