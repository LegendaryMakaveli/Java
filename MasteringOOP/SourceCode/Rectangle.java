public class Rectangle {
   private int length;
   private int width;

   public void setLength(int length) {
         this.length = length;
   }
   public int getLength() {
       return length;
   }

   public void setWidth(int width) {
       this.width = width;
   }
   public int getWidth() {
       return width;
   }

   public static int area(int length, int width){
       return length * width;
   }

   public static int perimeter(int length, int width){
       return (length + width) * 2;
   }
}
