/**
 */
package esehat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precautions Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.PrecautionsDataset#getPredicteddiseases <em>Predicteddiseases</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getPrecautionsDataset()
 * @model
 * @generated
 */
public interface PrecautionsDataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicteddiseases</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicteddiseases</em>' reference.
	 * @see #setPredicteddiseases(PredictedDiseases)
	 * @see esehat.EsehatPackage#getPrecautionsDataset_Predicteddiseases()
	 * @model required="true"
	 * @generated
	 */
	PredictedDiseases getPredicteddiseases();

	/**
	 * Sets the value of the '{@link esehat.PrecautionsDataset#getPredicteddiseases <em>Predicteddiseases</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicteddiseases</em>' reference.
	 * @see #getPredicteddiseases()
	 * @generated
	 */
	void setPredicteddiseases(PredictedDiseases value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void symptom_precautions();

} // PrecautionsDataset
