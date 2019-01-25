package fr.adaming.ecole.humain;

public class Ecole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eleve leMeilleur = new Eleve(10);
		Eleve lePire = new Eleve(0);
		Eleve leTricheur = new Eleve();		
		Prof leProf = new Prof();
		Prof leProfMath = new Prof("Master Mathematique", 2500);
		Prof leProfTechno = new Prof(2500);
		
		leProfMath.adresse ="24 rue des oliviers 4150 DjerbalaDouce";
		leProfMath.age =29;
		leProfMath.nom ="Herbert";
		leProfMath.prenom ="Norbert";
		leProfMath.sex = 'H';
	
		//On renseigne les paramettres de "leProfMath" en sachant qu'il posséde les attributs de la class "humain"
		
		leProfMath.enseigne();
		leMeilleur.apprendre();
		
		System.out.println(leProfMath.toString());
	
	}

}
