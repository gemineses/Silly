package tjATW;

import modelo.Logs;

public class Init {
	static Logs logInit = new Logs();

	public static void main(String[] args) {
		logInit.registraLogs(0, "0", "Entro nuevo", "main");
		
	}
}
