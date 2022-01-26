/**
 */
package esehat;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disease Detection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.DiseaseDetection#getPatientdetail <em>Patientdetail</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getDiseaseDetection()
 * @model
 * @generated
 */
public interface DiseaseDetection extends EObject {

	/**
	 * Returns the value of the '<em><b>Patientdetail</b></em>' reference list.
	 * The list contents are of type {@link esehat.PatientDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patientdetail</em>' reference list.
	 * @see esehat.EsehatPackage#getDiseaseDetection_Patientdetail()
	 * @model
	 * @generated
	 */
	EList<PatientDetail> getPatientdetail();
} // DiseaseDetection
