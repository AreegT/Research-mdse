/**
 */
package esehat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doctor Concultation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.DoctorConcultation#getName <em>Name</em>}</li>
 *   <li>{@link esehat.DoctorConcultation#getPredicteddiseases <em>Predicteddiseases</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getDoctorConcultation()
 * @model
 * @generated
 */
public interface DoctorConcultation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see esehat.EsehatPackage#getDoctorConcultation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link esehat.DoctorConcultation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Predicteddiseases</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link esehat.PredictedDiseases#getDoctorconcultation <em>Doctorconcultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicteddiseases</em>' reference.
	 * @see #setPredicteddiseases(PredictedDiseases)
	 * @see esehat.EsehatPackage#getDoctorConcultation_Predicteddiseases()
	 * @see esehat.PredictedDiseases#getDoctorconcultation
	 * @model opposite="doctorconcultation" required="true"
	 * @generated
	 */
	PredictedDiseases getPredicteddiseases();

	/**
	 * Sets the value of the '{@link esehat.DoctorConcultation#getPredicteddiseases <em>Predicteddiseases</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicteddiseases</em>' reference.
	 * @see #getPredicteddiseases()
	 * @generated
	 */
	void setPredicteddiseases(PredictedDiseases value);

} // DoctorConcultation
