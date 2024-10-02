package exemplo0210;

public class ConstrutorAnimal {

	public static void main(String[] args) {

		
		Animal animal1 = new Animal(1.0f, "cinza");
		Animal animal2 = new Animal(2.0f, "caramelo");
		
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
		System.out.println(animal2.getTamanho());
		System.out.println(animal2.getCor());

	}

}
