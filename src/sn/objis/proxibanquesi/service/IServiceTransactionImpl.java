/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import sn.objis.proxibanquesi.dao.IDaoTransactionImpl;
import sn.objis.proxibanquesi.domaine.Transaction;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceTransactionImpl implements IServiceTransaction{

	private IDaoTransactionImpl dao = new IDaoTransactionImpl();
	
	@Override
	public void ajouter(Transaction t) {
		dao.create(t);
	}

	@Override
	public List<Transaction> Lister() {
		return dao.getAll();
	}

	@Override
	public void maj(Transaction t) {
		dao.update(t);
	}

	@Override
	public void supprimer(Transaction t) {
		dao.delete(t);
	}

}
