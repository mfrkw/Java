public class Task12{
  public static void main (String[] args){

    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println(triangleArea + "平方cm");
  }

   public static double calcTriangleArea(double bottom , double height){
     double area = (bottom * height) / 2;
     return area;
   }
}