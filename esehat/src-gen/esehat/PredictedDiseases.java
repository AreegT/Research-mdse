/**
 */
package esehat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicted Diseases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.PredictedDiseases#getName <em>Name</em>}</li>
 *   <li>{@link esehat.PredictedDiseases#getConsult <em>Consult</em>}</li>
 *   <li>{@link esehat.PredictedDiseases#getDoctorconcultation <em>Doctorconcultation</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getPredictedDiseases()
 * @model
 * @generated
 */
public interface PredictedDiseases extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see esehat.EsehatPackage#getPredictedDiseases_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link esehat.PredictedDiseases#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Consult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consult</em>' attribute.
	 * @see #setConsult(String)
	 * @see esehat.EsehatPackage#getPredictedDiseases_Consult()
	 * @model
	 * @generated
	 */
	String getConsult();

	/**
	 * Sets the value of the '{@link esehat.PredictedDiseases#getConsult <em>Consult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consult</em>' attribute.
	 * @see #getConsult()
	 * @generated
	 */
	void setConsult(String value);

	/**
	 * Returns the value of the '<em><b>Doctorconcultation</b></em>' reference list.
	 * The list contents are of type {@link esehat.DoctorConcultation}.
	 * It is bidirectional and its opposite is '{@link esehat.DoctorConcultation#getPredicteddiseases <em>Predicteddiseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctorconcultation</em>' reference list.
	 * @see esehat.EsehatPackage#getPredictedDiseases_Doctorconcultation()
	 * @see esehat.DoctorConcultation#getPredicteddiseases
	 * @model opposite="predicteddiseases"
	 * @generated
	 */
	EList<DoctorConcultation> getDoctorconcultation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getsymptom_details();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getsymptom_precautions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void seediet_plan();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void consult_doctor();

} // PredictedDiseases
