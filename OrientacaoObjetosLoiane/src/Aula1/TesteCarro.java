package Aula1;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		van.potenciaDoMotor = 4.1;
		
		System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.potenciaDoMotor);
        
        Carro fusca = new Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 10;
        fusca.capCombustivel = 100;
        fusca.consumoCombustivel = 0.2;
        fusca.potenciaDoMotor = 1.3;
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        System.out.println(fusca.potenciaDoMotor);
	}

}
