public class DistributionOfPens {
       public static void main(String []args) {
       //input initializing of total pens
       int totalPen = 14;
       int totalStudents = 3;

       int remainingPens = totalPen % totalStudents;
       int penPerStudents = totalPen / totalStudents;
       
       System.out.print("The Pen Per Student is "+penPerStudents+" and the remaining pen not distributed is "+ remainingPens);
       }
}

