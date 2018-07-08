/**
 * 
 */
package sn.objis.proxibanquesi.thread;

import sn.objis.proxibanquesi.domaine.CompteCourant;
import sn.objis.proxibanquesi.service.IServiceCompteCourantImpl;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class ThreadVersementCC extends Thread {

	// Attributs
	private double montant;
	private CompteCourant compteC;
	private IServiceCompteCourantImpl serviceCompteCourant = new IServiceCompteCourantImpl();

	// Constructeurs
	public ThreadVersementCC() {
		super();
	}

	public ThreadVersementCC(double montant, CompteCourant compteC) {
		super();
		this.montant = montant;
		this.compteC = compteC;
	}

	@Override
	public void run() {
		super.run();

		// Ajout d'un verrou sur le compte
		synchronized (compteC) {
			try {

				System.out.println(Thread.currentThread().getName()
						+ "Le solde du compte avant l'opération de retrait est de " + compteC.getSoldeCompte());
				serviceCompteCourant.retrait(compteC, montant);
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()
						+ "Le solde du compte après l'opération de retrait est de " + compteC.getSoldeCompte());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
