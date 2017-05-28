/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Document.
 * 
 * @author zouaoui
 */
public class Document implements Comparable<Document> {
	/**
	 * Description of the property num.
	 */
	private int num = 0;

	/**
	 * Description of the property titre.
	 */
	private String titre = "";

	// Start of user code (user defined attributes for Document)

	// End of user code

	/**
	 * The constructor.
	 */
	public Document(String titre , int num) {
		// Start of user code constructor for Document)
		this.titre=titre;
		this.num=num;
		
		// End of user code
	}

	/**
	 * Description of the method CompareTo.
	 * @param Doc 
	 */
		@Override
	public int compareTo(Document o) {
		// TODO Auto-generated method stub
			
			return this.getTitre().compareTo(o.getTitre());
				
				
	}


	
	
	/**
	 * Description of the method ToString.
	 * @return 
	 */
		@Override
	public String toString() {
		// Start of user code for method ToString
		String ToString = "Num : "+ this.num +" "+ "Titre : "+this.titre ;
		
		return ToString;
		// End of user code
	}

	// Start of user code (user defined methods for Document)

	// End of user code
	/**
	 * Returns num.
	 * @return num 
	 */
	public int getNum() {
		return this.num;
	}

	/**
	 * Sets a value to attribute num. 
	 * @param newNum 
	 */
	public void setNum(int newNum) {
		this.num = newNum;
	}

	/**
	 * Returns titre.
	 * @return titre 
	 */
	public String getTitre() {
		return this.titre;
	}

	/**
	 * Sets a value to attribute titre. 
	 * @param newTitre 
	 */
	public void setTitre(String newTitre) {
		this.titre = newTitre;
	}

	
}
