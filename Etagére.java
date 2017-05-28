import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Etagére.
 * 
 * @author zouaoui
 */
public class Etagére implements Imprilable {
	/**
	 * Description of the property nb_max.
	 */
	public static int nb_max = 20;

	/**
	 * Description of the property documents.
	 */
	public ArrayList<Document> documents ;

	// Start of user code (user defined attributes for Etagére)

	// End of user code

	/**
	 * The constructor.
	 */
	public Etagére() {
		// Start of user code constructor for Etagére)
		documents  = new ArrayList <Document>();
		// End of user code
	}

	/**
	 * Description of the method Ajouter_doc.
	 * @param doc 
	 */
	public void Ajouter_doc(Document doc) {
		// Start of user code for method Ajouter_doc
		// End of user code
		if (documents.size()< nb_max)
			documents.add(doc);
		else
			System.out.println("l'étagére est pleine , l'ajout ne peut pas etre fait ");
	}

	/**
	 * Description of the method Rechercher_doc.
	 * @param chaine 
	 * @return 
	 */
	public void Rechercher_doc(String chaine) {
		// Start of user code for method Rechercher_doc
		
		Iterator <Document> it = documents.iterator();
		Document doc;
		Livre liv ;
		
		while (it.hasNext())
		{
			doc=it.next();
		
			if (doc.getTitre()== chaine)
			{
				System.out.println(doc.toString());
			}
			if (doc.getClass().getName()=="Livre")
			{
				liv = (Livre) it.next();
				
				if (liv.getAuteur()== chaine)
				{
					System.out.println(liv.toString());
				}
				
			}
				                        
		}
			
		// End of user code
	}

	/**
	 * Description of the method Lister_document().
	 */
	public void Lister_document(){
		// Start of user code for method Lister_document()
		// End of user code
		
		Iterator <Document> it = documents.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next().toString());
		}
	}

	/**
	 * Description of the method Trier_etagere.
	 */
	public void Trier_etagere() {
		// Start of user code for method Trier_etagere
		// End of user code
		
		Collections.sort(documents);
		
		
		
	}

	/**
	 * Description of the method Imprimer.
	 */
	public void Imprimer() {
		
		// Start of user code for method Imprimer
		// End of user code
		Iterator<Document> it = documents.iterator();
		Document doc = null ;
		
		while (it.hasNext())
		{	
			doc=it.next();
			
			if(doc.getClass().getName() == "Livre" || doc.getClass().getName()=="Roman" || doc.getClass().getName()=="Manuel")
				
				{	
					System.out.println(doc.toString());
					
				}
		}
	}

	// Start of user code (user defined methods for Etagére)

	// End of user code
	/**
	 * Returns nb_max.
	 * @return nb_max 
	 */
	public static int getNb_max() {
		return nb_max;
	}

	/**
	 * Sets a value to attribute nb_max. 
	 * @param newNb_max 
	 */
	public static void setNb_max(int newNb_max) {
		nb_max = newNb_max;
	}

	/**
	 * Returns documents.
	 * @return documents 
	 */
	public ArrayList<Document> getDocuments() {
		return this.documents;
	}

}
