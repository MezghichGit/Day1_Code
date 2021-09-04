package chapter1;

public class Etudiant {
	
	// attributs d'instance
	int age;
	String nom;
	
	//attributs de classe
	
	static int AGE_MAX_ETUDIANT = 35;
	
	public void infosEtudiant()
	{
		System.out.println("Nom : "+ nom + " Age = "+age);
	}

}
