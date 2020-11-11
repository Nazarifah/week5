//bila xde keyword public before keyword class
//naming the file can be either Account.java
//ObjectArray.java or any other name

public class Account {
	int a, b;
	public void setData(int c, int d){
		a = c;
		b = d;
	}

	public void showData(){
		System.out.println("Value of a =" + a);
		System.out.println("Value of a =" + b);
	}
}