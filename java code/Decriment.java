class Decriment{

	public static void main(String[]args){

	int a = 10 , b, c,d;
	b = --a;
	c = b--;
 	d = c++;
 	a = ++d;

       System.out.println("a = "+a);
       System.out.println("b = "+b);
       System.out.println("c = "+c);
       System.out.println("d = "+d);
}
}