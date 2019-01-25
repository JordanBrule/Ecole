package fr.adaming.ecole.humain;

public class Eleve extends Humain {

	String classe;
	int niveau;
	
	public void apprendre() {
	System.out.println("J'apprend");
	}

	
	public Eleve() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Eleve(int niveau) {
		super();
		this.niveau = niveau;
	}


	public Eleve(String classe, int niveau) {
		super();
		this.classe = classe;
		this.niveau = niveau;
	}
	
	
	
	
}
