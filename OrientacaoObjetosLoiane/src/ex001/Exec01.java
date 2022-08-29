package ex001;

public class Exec01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
		
		System.out.println(lampada.modelo);
		System.out.println(lampada.tensao);
		System.out.println(lampada.cor);
		System.out.println(lampada.tipos[1]);
		
		
		

	}

}
