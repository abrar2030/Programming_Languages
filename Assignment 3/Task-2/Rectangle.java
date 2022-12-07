 public class Rectangle {
   
   double x,y;
   double Width, Height;

   Point TOP_LEFT()
   {   Point myPoint = new Point();
       myPoint.x = Width >= 0 ? x : x + Width;
       myPoint.y = Height >= 0 ? y + Height : y; 
        return myPoint;
   }

   Point bOTTOM_LEFT() {
      Point myPoint = new Point();
      myPoint.x = Width >= 0 ? x : x + Width;
      myPoint.y = Height >= 0 ? y : y + Height;
      return myPoint;
  }

  Point BOTTOM_RIGHT() {
      Point myPoint = new Point();
      myPoint.x = Width >= 0 ? x + Width: x;
      myPoint.y = Height >= 0 ? y + Height: y;
      return myPoint;
  }


   Point TOP_RIGHT() {
      Point myPoint = new Point();
      myPoint.x = Width >= 0 ? x + Width : x;
      myPoint.y = Height >= 0 ? y + Height : y;
      return myPoint;
  }

  
}
