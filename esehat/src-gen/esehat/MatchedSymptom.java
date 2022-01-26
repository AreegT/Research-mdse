/**
 */
package esehat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matched Symptom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.MatchedSymptom#getMl_algorithm <em>Ml algorithm</em>}</li>
 *   <li>{@link esehat.MatchedSymptom#getDays <em>Days</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getMatchedSymptom()
 * @model
 * @generated
 */
public interface MatchedSymptom extends EObject {
	/**
	 * Returns the value of the '<em><b>Ml algorithm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link esehat.ML_Algorithm#getMatchedsymptom <em>Matchedsymptom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ml algorithm</em>' reference.
	 * @see #setMl_algorithm(ML_Algorithm)
	 * @see esehat.EsehatPackage#getMatchedSymptom_Ml_algorithm()
	 * @see esehat.ML_Algorithm#getMatchedsymptom
	 * @model opposite="matchedsymptom" required="true"
	 * @generated
	 */
	ML_Algorithm getMl_algorithm();

	/**
	 * Sets the value of the '{@link esehat.MatchedSymptom#getMl_algorithm <em>Ml algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ml algorithm</em>' reference.
	 * @see #getMl_algorithm()
	 * @generated
	 */
	void setMl_algorithm(ML_Algorithm value);

	/**
	 * Returns the value of the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' attribute.
	 * @see #setDays(int)
	 * @see esehat.EsehatPackage#getMatchedSymptom_Days()
	 * @model
	 * @generated
	 */
	int getDays();

	/**
	 * Sets the value of the '{@link esehat.MatchedSymptom#getDays <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days</em>' attribute.
	 * @see #getDays()
	 * @generated
	 */
	void setDays(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getmatchedsymptoms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void submit();

} // MatchedSymptom
