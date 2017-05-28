/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Roman.
 * 
 * @author zouaoui
 */
public class Roman extends Livre {
	/**
	 * Description of the property prix_litérature.
	 */
	private String prix_litérature = "";

	// Start of user code (user defined attributes for Roman)

	// End of user code

	/**
	 * The constructor.
	 */
	public Roman(String titre, int num , String auteur , int nb_pages , String prix_litérature) {
		// Start of user code constructor for Roman)
		super(titre, num, auteur, nb_pages);
		this.prix_litérature=prix_litérature;
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
					+this.getTitre()+" "+"Auteur: "+this.getAuteur()+" "+"Nb pages: "+this.getNb_pages()+" "+"prix_litérature :"
					+this.prix_litérature;
			;
			return ToString;
		// End of user code
	}

	// Start of user code (user defined methods for Roman)

	// End of user code
	/**
	 * Returns prix_litérature.
	 * @return prix_litérature 
	 */
	public String getPrix_litérature() {
		return this.prix_litérature;
	}

	/**
	 * Sets a value to attribute prix_litérature. 
	 * @param newPrix_litérature 
	 */
	public void setPrix_litérature(String newPrix_litérature) {
		this.prix_litérature = newPrix_litérature;
	}

}
