/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Dictionnaire.
 * 
 * @author zouaoui
 */
public class Dictionnaire extends Document {
	/**
	 * Description of the property langue.
	 */
	private String langue = "";

	// Start of user code (user defined attributes for Dictionnaire)

	// End of user code

	/**
	 * The constructor.
	 */
	public Dictionnaire(String titre, int num,String langue) {
		// Start of user code constructor for Dictionnaire)
		super(titre, num);
		this.langue=langue;
		
		// End of user code
	}

	/**
	 * Description of the method ToString.
	 * @return 
	 */
	@Override
	public String toString() {
		// Start of user code for method ToString
		String ToString = "Num : "+ this.getNum() +" "+ "Titre : "+this.getTitre()+" "+ "langue: "+this.langue ;
		
		return ToString;
		// End of user code
	}

	// Start of user code (user defined methods for Dictionnaire)

	// End of user code
	/**
	 * Returns langue.
	 * @return langue 
	 */
	public String getLangue() {
		return this.langue;
	}

	/**
	 * Sets a value to attribute langue. 
	 * @param newLangue 
	 */
	public void setLangue(String newLangue) {
		this.langue = newLangue;
	}

}
