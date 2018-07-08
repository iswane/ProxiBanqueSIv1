/**
 * 
 */
package sn.objis.proxibanquesi.thread;

import sn.objis.proxibanquesi.domaine.CompteEpargne;
import sn.objis.proxibanquesi.service.IServiceCompteEpargneImpl;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class ThreadVersementCE extends Thread {

	// Attributs
	private double montant;
	private CompteEpargne compteE;
	private IServiceCompteEpargneImpl serviceCompteCourant = new IServiceCompteEpargneImpl();

	// Constructeurs
	public ThreadVersementCE() {
		super();
	}

	public ThreadVersementCE(double montant, CompteEpargne compteE) {
		super();
		this.montant = montant;
		this.compteE = compteE;
	}

	@Override
	public void run() {
		super.run();

		// Ajout d'un verrou sur le compte
		synchronized (compteE) {
			try {

				System.out.println(Thread.currentThread().getName()
						+ "Le solde du compte avant l'opération de retrait est de " + compteE.getSoldeCompte());
				serviceCompteCourant.retrait(compteE, montant);
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()
						+ "Le solde du compte après l'opération de retrait est de " + compteE.getSoldeCompte());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
