/**
 */
package esehat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Diseases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.ListOfDiseases#getMl_algorithm <em>Ml algorithm</em>}</li>
 *   <li>{@link esehat.ListOfDiseases#getPredicteddiseases <em>Predicteddiseases</em>}</li>
 *   <li>{@link esehat.ListOfDiseases#getName <em>Name</em>}</li>
 *   <li>{@link esehat.ListOfDiseases#getLanguage <em>Language</em>}</li>
 *   <li>{@link esehat.ListOfDiseases#isConfirmation <em>Confirmation</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getListOfDiseases()
 * @model
 * @generated
 */
public interface ListOfDiseases extends EObject {
	/**
	 * Returns the value of the '<em><b>Ml algorithm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link esehat.ML_Algorithm#getListofdiseases <em>Listofdiseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ml algorithm</em>' reference.
	 * @see #setMl_algorithm(ML_Algorithm)
	 * @see esehat.EsehatPackage#getListOfDiseases_Ml_algorithm()
	 * @see esehat.ML_Algorithm#getListofdiseases
	 * @model opposite="listofdiseases" required="true"
	 * @generated
	 */
	ML_Algorithm getMl_algorithm();

	/**
	 * Sets the value of the '{@link esehat.ListOfDiseases#getMl_algorithm <em>Ml algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ml algorithm</em>' reference.
	 * @see #getMl_algorithm()
	 * @generated
	 */
	void setMl_algorithm(ML_Algorithm value);

	/**
	 * Returns the value of the '<em><b>Predicteddiseases</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicteddiseases</em>' reference.
	 * @see #setPredicteddiseases(PredictedDiseases)
	 * @see esehat.EsehatPackage#getListOfDiseases_Predicteddiseases()
	 * @model required="true"
	 * @generated
	 */
	PredictedDiseases getPredicteddiseases();

	/**
	 * Sets the value of the '{@link esehat.ListOfDiseases#getPredicteddiseases <em>Predicteddiseases</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicteddiseases</em>' reference.
	 * @see #getPredicteddiseases()
	 * @generated
	 */
	void setPredicteddiseases(PredictedDiseases value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see esehat.EsehatPackage#getListOfDiseases_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link esehat.ListOfDiseases#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see esehat.EsehatPackage#getListOfDiseases_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link esehat.ListOfDiseases#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Confirmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmation</em>' attribute.
	 * @see #setConfirmation(boolean)
	 * @see esehat.EsehatPackage#getListOfDiseases_Confirmation()
	 * @model
	 * @generated
	 */
	boolean isConfirmation();

	/**
	 * Sets the value of the '{@link esehat.ListOfDiseases#isConfirmation <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmation</em>' attribute.
	 * @see #isConfirmation()
	 * @generated
	 */
	void setConfirmation(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getsymptom_details();

} // ListOfDiseases
