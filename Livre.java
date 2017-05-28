/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Livre.
 * 
 * @author zouaoui
 */
public class Livre extends Document implements Imprilable {
	/**
	 * Description of the property auteur.
	 */
	private String auteur = "";

	/**
	 * Description of the property nb_pages.
	 */
	private int nb_pages = 0;

	// Start of user code (user defined attributes for Livre)

	// End of user code

	/**
	 * The constructor.
	 */
	public Livre(String titre, int num , String auteur , int nb_pages) {
		// Start of user code constructor for Livre)
		
		super(titre, num);
		this.auteur=auteur;
		this.nb_pages=nb_pages;
		
		// End of user code
	}

	/**
	 * Description of the method ToString.
	 * @return 
	 */
		@Override
	public String toString() {
		// Start of user code for method ToString
		String ToString = "Num : "+ this.getNum() +" "+ "Titre : "+this.getTitre() +" "+"Auteur : "+ this.getAuteur() +" "+"Nb pages:" + this.getNb_pages();  ;
		return ToString;
		// End of user code
	}

	/**
	 * Description of the method Imprimer.
	 */
	public void Imprimer() {
		// Start of user code for method Imprimer
		// End of user code
		System.out.println("Imprime");
		System.out.println(this.toString());
	}

	// Start of user code (user defined methods for Livre)

	// End of user code
	/**
	 * Returns auteur.
	 * @return auteur 
	 */
	public String getAuteur() {
		return this.auteur;
	}

	/**
	 * Sets a value to attribute auteur. 
	 * @param newAuteur 
	 */
	public void setAuteur(String newAuteur) {
		this.auteur = newAuteur;
	}

	/**
	 * Returns nb_pages.
	 * @return nb_pages 
	 */
	public int getNb_pages() {
		return this.nb_pages;
	}

	/**
	 * Sets a value to attribute nb_pages. 
	 * @param newNb_pages 
	 */
	public void setNb_pages(int newNb_pages) {
		this.nb_pages = newNb_pages;
	}

}
