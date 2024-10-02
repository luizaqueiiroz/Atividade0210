package exemplo0210;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta1 = new Consulta ("Luiza", "Dr. Lorena", 31/04);
		Consulta consulta2 = new Consulta ("Laura", "Dr. Nhandeara", 27/11);
		Consulta consulta3 = new Consulta ("Sophia", "Dr. Eduarda", 07/03);
		System.out.println(consulta1.getNomePcnt());
		System.out.println(consulta1.getNomeDents());
		System.out.println(consulta2.getData());
		System.out.println(consulta2.getNomePcnt());
		System.out.println(consulta2.getNomeDents());
		System.out.println(consulta2.getData());
		System.out.println(consulta3.getNomePcnt());
		System.out.println(consulta3.getNomeDents());
		System.out.println(consulta3.getData());
	}

}


