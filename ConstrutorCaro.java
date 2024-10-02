package exemplo0210;

public class ConstrutorCaro {

	public static void main(String[] args) {

		Carro carro1 = new Carro ("LGC3M52", 866499622);
		Carro carro2 = new Carro ("ABC1D23", 212123456);
		Carro carro3 = new Carro ("JKL7M89", 364123456);
		
		System.out.println(carro1.getNumChassi());
		System.out.println(carro1.getPlaca());
		
		System.out.println(carro2.getNumChassi());
		System.out.println(carro2.getPlaca());
		
		System.out.println(carro3.getNumChassi());
		System.out.println(carro3.getPlaca());
	}

}
