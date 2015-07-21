package tjATW;

public class InitTest {
	public static void main(String[] args) {
		int seleccion=0;
		try {
			seleccion=Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("Este usuario no esta disponible");
		}
		TestUsuarios t=new TestUsuarios();
		switch(seleccion){
			case 24:
			t.jss();	
			break;
		}
		t.jss();
	}
}
