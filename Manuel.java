/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Manuel.
 * 
 * @author zouaoui
 */
public class Manuel extends Livre {
	/**
	 * Description of the property niveau_scolaire.
	 */
	private int niveau_scolaire = 0;

	// Start of user code (user defined attributes for Manuel)

	// End of user code

	/**
	 * The constructor.
	 */
	public Manuel(String titre, int num , String auteur , int nb_pages, int niveau_scolaire) {
		// Start of user code constructor for Manuel)
		super(titre, num, auteur,nb_pages);
		this.niveau_scolaire=niveau_scolaire;
		
		// End of user code
	}

	/**
	 * Description of the method ToString.
	 * @return 
	 */
	@Override
	public String toString() {

		// Start of user code for method ToString
		String ToString = "Num : "+ this.getNum() +" "+ "Titre : "
		+this.getTitre()+" "+"Auteur: "+this.getAuteur()+" "+"Nb pages: "+this.getNb_pages()+" "+"Niveau Scolaire :"+this.getNiveau_scolaire();
;
		return ToString;
		// End of user code
	}

	// Start of user code (user defined methods for Manuel)

	// End of user code
	/**
	 * Returns niveau_scolaire.
	 * @return niveau_scolaire 
	 */
	public int getNiveau_scolaire() {
		return this.niveau_scolaire;
	}

	/**
	 * Sets a value to attribute niveau_scolaire. 
	 * @param newNiveau_scolaire 
	 */
	public void setNiveau_scolaire(int newNiveau_scolaire) {
		this.niveau_scolaire = newNiveau_scolaire;
	}

}
