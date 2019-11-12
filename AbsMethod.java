abstract class Draw{
  public final abstract void shape();

}
 	class Rectangle extends Draw{
		 public void shape(){
			 System.out.println("Drawing Rectangle ");
	}
}/*
	class Circle extends Draw{
		 void shape(){
		System.out.println("Drawing Circle :");
	}*/
class AbsMethod{
	public static void main(String[] args){
		/*Draw d = new Circle();

		d.shape();*/

		Draw d=new Rectangle();
		d.shape();
	}
}
