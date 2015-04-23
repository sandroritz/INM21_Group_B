
/*
 * ZWECK: Mangelmanager
 * MODUL: Softwarekompomenten, HSLU-Wirtschaft
 */

package ch.hsluw.mangelmanager.rmi.Meldungstyp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ch.hsluw.mangelmanager.business.MeldungstypManager;
import ch.hsluw.mangelmanager.business.MeldungstypManagerImpl;
import ch.hsluw.mangelmanager.model.Meldungstyp;



public class MeldungstypROImpl extends UnicastRemoteObject implements MeldungstypRO {


	private static final long serialVersionUID = -8523214358712447146L;
	
	private MeldungstypManager meldungstypManager;

	public MeldungstypROImpl() throws RemoteException {
		meldungstypManager = new MeldungstypManagerImpl();
	}

	@Override
	public Meldungstyp add(Meldungstyp entity) throws RemoteException, Exception {
		return meldungstypManager.add(entity);
	}

	@Override
	public Meldungstyp update(Meldungstyp entity) throws RemoteException, Exception {
		return meldungstypManager.update(entity);
	}

	@Override
	public void delete(Meldungstyp entity) throws RemoteException, Exception {
		meldungstypManager.delete(entity);
	}
	
}