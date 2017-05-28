/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Revue.
 * 
 * @author zouaoui
 */
public class Revue extends Document {
	/**
	 * Description of the property mois.
	 */
	private String mois = "";

	/**
	 * Description of the property année.
	 */
	private int année = 0;

	// Start of user code (user defined attributes for Revue)

	// End of user code

	/**
	 * The constructor.
	 */
	public Revue(String titre , int num ,int année , String mois) {
		// Start of user code constructor for Revue)
		super(titre, num);
		// End of user code
		this.année= année;
		this.mois=mois;
	}

	/**
	 * Description of the method ToString.
	 * @return 
	 */
	@Override
	public String toString() {

		// Start of user code for method ToString
		String ToString = "Num : "+ this.getNum() +" "+ "Titre : "+this.getTitre()+" "+" mois:"+this.mois +" "+"année :"+this.année;

		return ToString;
		// End of user code
	}

	// Start of user code (user defined methods for Revue)

	// End of user code
	/**
	 * Returns mois.
	 * @return mois 
	 */
	public String getMois() {
		return this.mois;
	}

	/**
	 * Sets a value to attribute mois. 
	 * @param newMois 
	 */
	public void setMois(String newMois) {
		this.mois = newMois;
	}

	/**
	 * Returns année.
	 * @return année 
	 */
	public int getAnnée() {
		return this.année;
	}

	/**
	 * Sets a value to attribute année. 
	 * @param newAnnée 
	 */
	public void setAnnée(int newAnnée) {
		this.année = newAnnée;
	}

}
