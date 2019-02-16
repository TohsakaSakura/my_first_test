package test;

class MyException extends Exception{
	private String message;
	private int id;
	MyException(String message, int id)
	{
		this.message = message;
		this.id = id;
	}
}

public class test2 {
	public void rigist(int num) throws MyException{
		if(num < 0) {
			throw new MyException("not exist",3);
		}
		System.out.println("1");
	}
	
	public static void main(String[] args)
	  {
			test2 t2=new test2();
			try {
				t2.rigist(-1);
			} catch(MyException e) {
				System.out.println("wow");
				System.out.println(e.getMessage());
			}
		  
	  }
}
