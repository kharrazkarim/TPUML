import java.util.HashSet;
import java.util.Iterator;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Bibliothéque.
 * 
 * @author zouaoui
 */
public class Bibliothéque {
	/**
	 * Description of the property etagéres.
	 */
	public HashSet<Etagére> etagéres ;
	// Start of user code (user defined attributes for Bibliothéque)

	// End of user code

	/**
	 * The constructor.
	 */
	public Bibliothéque() {
		// Start of user code constructor for Bibliothéque)
		etagéres = new HashSet<Etagére>();
	
		// End of user code
	}

	/**
	 * Description of the method Ajouter_etagere.
	 * @param etagere  
	 */
	public void Ajouter_etagere(Etagére etagere) {
		// Start of user code for method Ajouter_etagere
		// End of user code
		etagéres.add(etagere);
	}

	// Start of user code (user defined methods for Bibliothéque)

	// End of user code
	/**
	 * Returns etagéres.
	 * @return etagéres 
	 */
	public HashSet<Etagére> getEtagéres() {
		return this.etagéres;
	}
	
	public void Rechercher_doc(String chaine) {
		
		Iterator <Etagére> it = etagéres.iterator();
		
		while (it.hasNext())
		{
			it.next().Rechercher_doc(chaine);
		}
	}
	
	/**
	 * Description of the method Lister_document_biblio().
	 */
	public void Lister_document_biblio(){
		// Start of user code for method Lister_document()
		// End of user code
		
		Iterator <Etagére> it = etagéres.iterator();
		while (it.hasNext())
		{
			it.next().Lister_document();
		}
	}


}
