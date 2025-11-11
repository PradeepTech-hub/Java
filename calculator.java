package example;
class cals{
	int a,b;
	static int i =0;
	cals(int a,int b){
		this.a = a;
		this.b=b;
	}
	void displaycal() {
		int c;
		c = a+b;
		i++;
		System.out.print("c=" +c +" " +"i =" +" "	+i);
	}
}
public class calculator {
	public static void main(String[] args) {
		cals cal1 = new cals(5,6);
		cal1.displaycal();
	}

}
