public class MyFirstApp {
	public static void main(String[] args){
		if(args.length > 0){
			System.out.println("Hello " + args[0]);
		}
		else{
			System.out.println("Hello Everyone looking at this screen");
		}
		MyHelper.printDate();
	}
}