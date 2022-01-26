/**
 */
package esehat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.ML_Algorithm#getMatchedsymptom <em>Matchedsymptom</em>}</li>
 *   <li>{@link esehat.ML_Algorithm#getListofdiseases <em>Listofdiseases</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getML_Algorithm()
 * @model
 * @generated
 */
public interface ML_Algorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchedsymptom</b></em>' reference list.
	 * The list contents are of type {@link esehat.MatchedSymptom}.
	 * It is bidirectional and its opposite is '{@link esehat.MatchedSymptom#getMl_algorithm <em>Ml algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchedsymptom</em>' reference list.
	 * @see esehat.EsehatPackage#getML_Algorithm_Matchedsymptom()
	 * @see esehat.MatchedSymptom#getMl_algorithm
	 * @model opposite="ml_algorithm" required="true"
	 * @generated
	 */
	EList<MatchedSymptom> getMatchedsymptom();

	/**
	 * Returns the value of the '<em><b>Listofdiseases</b></em>' reference list.
	 * The list contents are of type {@link esehat.ListOfDiseases}.
	 * It is bidirectional and its opposite is '{@link esehat.ListOfDiseases#getMl_algorithm <em>Ml algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listofdiseases</em>' reference list.
	 * @see esehat.EsehatPackage#getML_Algorithm_Listofdiseases()
	 * @see esehat.ListOfDiseases#getMl_algorithm
	 * @model opposite="ml_algorithm" required="true"
	 * @generated
	 */
	EList<ListOfDiseases> getListofdiseases();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void multipletrees();

} // ML_Algorithm
