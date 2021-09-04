package chapter1;

public class Principale {

	public static void main(String args[]) {
		//int x;
		//System.out.println(x);
		Etudiant e1 = new Etudiant(); // invocation de la classe Etuadiant à travers une instance
		//System.out.println(e1.age);
		Etudiant e2 = new Etudiant(22,"ali");
		//e2.infosEtudiant();
		//e1.infosEtudiant();
		
		Etudiant.GetMaxAge(); // invocation de la classe Etuadiant à travers une méthode de la classe
		/*
		System.out.println(e1.age);
		System.out.println(e1.nom);
		e2.infosEtudiant();
		e2.nom="amine";
		e2.age=25;*/
		
		
		//System.out.println(Etudiant.AGE_MAX_ETUDIANT);  // invocation de la classe Etuadiant à travers un attribut de la classe
		
		//System.out.println(Byte.MAX_VALUE);
		//System.out.println(Byte.MIN_VALUE);
		//System.out.println(Short.MAX_VALUE);
		//System.out.println(Short.MIN_VALUE);
		
		e1.AGE_MAX_ETUDIANT = 27;
		System.out.println(Etudiant.AGE_MAX_ETUDIANT);
		e2.AGE_MAX_ETUDIANT = 38;
		System.out.println(Etudiant.AGE_MAX_ETUDIANT);
	}
}
