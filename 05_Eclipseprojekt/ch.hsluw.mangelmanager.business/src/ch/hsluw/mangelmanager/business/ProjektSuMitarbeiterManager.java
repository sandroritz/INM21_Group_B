/*
 * ZWECK: Mangelmanager
 * MODUL: Softwarekompomenten, HSLU-Wirtschaft
 */

package ch.hsluw.mangelmanager.business;

import java.util.Date;
import java.util.List;

import ch.hsluw.mangelmanager.model.ProjektSuMitarbeiter;

/**
 * Interface fuer ProjektSuMitarbeiter Entity
 * 
 * @version 1.0
 * @author lkuendig
 * 
 */
public interface ProjektSuMitarbeiterManager {
	/**
	 * Speichert die �bergebene Entity.
	 * 
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	ProjektSuMitarbeiter add(ProjektSuMitarbeiter entity) throws Exception;

	/**
	 * Updatet die �bergebene Entity.
	 * 
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	ProjektSuMitarbeiter update(ProjektSuMitarbeiter entity) throws Exception;

	/**
	 * L�scht die �bergebene Entity.
	 * 
	 * @param entity
	 * @throws Exception
	 */
	void delete(ProjektSuMitarbeiter entity) throws Exception;
}