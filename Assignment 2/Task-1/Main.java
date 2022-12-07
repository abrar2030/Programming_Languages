import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args){

		Line s = new Line();
		s.a = 1.0; 
		s.b = 2.0;
		s.c = 1.0;

		if (s.contains(100.0, 3.0))
		{
			out.println("Yes,the points lie on the line.");
		} else {
			out.println("No,the points does not lie on the line.");
		}

		s.isParalellWith(10.0, 3.0, 4.0);

		if (s.isOrthogonalTo(1.0, 2.0, 3.0, 4.0, 5.0, 2.0, 1.0, 2.0))
		{
			out.println("Yes,the line is Orthogonal to the given line.");
		} else {
			out.println("No,the line is not Orthogonal to the given line.");
		}

	}
}
