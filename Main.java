
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bibliothéque bib = new Bibliothéque();
		Etagére etagére = new Etagére();
		Etagére etagére2= new Etagére();
		
		
		Livre l1 = new Livre("Livre", 3, "auteur", 30);
		Livre l2 = new Livre("Livre2", 4, "auteur1", 30);
		Livre l3 = new Livre ("Livre3", 9, "auteur", 30);
		
		etagére.Ajouter_doc(l1);
		etagére2.Ajouter_doc(l2);
		etagére.Ajouter_doc(l3);
		
		Manuel m1 = new Manuel("Math", 1, "Patrain", 30, 2);
		Manuel m2 = new Manuel("Math2", 2, "Patarain", 40, 3);
		
		etagére.Ajouter_doc(m1);
		etagére2.Ajouter_doc(m2);
		
		Roman r1 = new Roman("Roman1", 5, "auteur1", 30, "A++");
		Roman r2 = new Roman("Roman2", 6, "auteur2", 30, "A++");
		
		etagére.Ajouter_doc(r1);
		etagére2.Ajouter_doc(r2);
		
		Dictionnaire d1 = new Dictionnaire("Larousse", 7, "francais");

		etagére.Ajouter_doc(d1);
		
		Revue rv1 = new Revue("Revue1", 8, 2017, "avril");
		etagére2.Ajouter_doc(rv1);
		
		
		bib.Ajouter_etagere(etagére);
		bib.Ajouter_etagere(etagére2);
		
		System.out.println("Etagére 1 :");
		etagére.Lister_document();
	
		System.out.println("");
		

		System.out.println("Etagére 2 :");
		etagére2.Lister_document();
		
		System.out.println("");
		
		bib.Lister_document_biblio();
		System.out.println();
		
		etagére.Trier_etagere();
		etagére.Lister_document();
		System.out.println();

		etagére2.Trier_etagere();
		etagére2.Lister_document();
		System.out.println();
		
		
		bib.Lister_document_biblio();
		System.out.println();
		
		System.out.println("Rechercher document par titre dans une étagére : ");
		etagére.Rechercher_doc("Livre");
		System.out.println();
	
		System.out.println("Rechercher document par auteur dans une étagére : ");
		etagére2.Rechercher_doc("Patarain");
		System.out.println();
	
		
		System.out.println("Rechercher document dans la bibliothéque : ");
		etagére.Rechercher_doc("Livre");
		System.out.println();
		
		
		System.out.println("Rechercher document dans la bibliothéque : ");
		bib.Rechercher_doc("Patarain");
		System.out.println();
		
		System.out.println("Imprimer livre 1");
		l1.Imprimer();
		System.out.println();
		
		System.out.println("Imprimer Roman 1");
		r1.Imprimer();
		System.out.println();
		
		
		System.out.println("Imprimer Manuel 1");
		m1.Imprimer();
		System.out.println();
		
		
		System.out.println("Imprimer étagére");
		etagére.Imprimer();
		System.out.println();
		
		
		
	}

}
