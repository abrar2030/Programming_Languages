import java.io.*;
import java.util.*;
import static java.lang.System.*;
class Main {

	public static void main(String[] args){

		Segment s = new Segment();
		s.x1 = 1.0; 
		s.y1 = 2.0; 
		s.x2 = 3.0;
		s.y2 = 4.0;

		out.println(s.line());
		s.contains(2.0, 1.0);
		Point p1 = new Point(0, 0);
		Point p2 = new Point(4, 4);
		Point p3 = new Point(1, 2);

		int o = s.Orient(p1, p2, p3);

		if (o==0)	
		{
			System.out.println("0");
		}
		else if (o == 1)
		{
			System.out.println("+1");
		}
		else			
		{
			System.out.println("-1");
		}

		Point p5 = new Point(1, 1);
		Point q5 = new Point(10, 1);
		Point p6 = new Point(1, 2);
		Point q6 = new Point(10, 2);


		if(s.Intersect(p5, q5, p6, q6))
			System.out.println("Yes,the segment intersect with the given segment.");
		else
			System.out.println("No,the segment does not intersect with the given segment.");

	}
}


