/**
 */
package esehat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symptoms Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.SymptomsDataset#getMatchedsymptom <em>Matchedsymptom</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getSymptomsDataset()
 * @model
 * @generated
 */
public interface SymptomsDataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchedsymptom</b></em>' reference list.
	 * The list contents are of type {@link esehat.MatchedSymptom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchedsymptom</em>' reference list.
	 * @see esehat.EsehatPackage#getSymptomsDataset_Matchedsymptom()
	 * @model required="true"
	 * @generated
	 */
	EList<MatchedSymptom> getMatchedsymptom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void matchedsymptoms();

} // SymptomsDataset
