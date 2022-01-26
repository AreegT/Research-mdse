/**
 */
package esehat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.PatientDetail#getP_Name <em>PName</em>}</li>
 *   <li>{@link esehat.PatientDetail#getP_Gender <em>PGender</em>}</li>
 *   <li>{@link esehat.PatientDetail#getP_Age <em>PAge</em>}</li>
 *   <li>{@link esehat.PatientDetail#getSymptoms <em>Symptoms</em>}</li>
 *   <li>{@link esehat.PatientDetail#getSymptomsdataset <em>Symptomsdataset</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getPatientDetail()
 * @model
 * @generated
 */
public interface PatientDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>PName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PName</em>' attribute.
	 * @see #setP_Name(String)
	 * @see esehat.EsehatPackage#getPatientDetail_P_Name()
	 * @model
	 * @generated
	 */
	String getP_Name();

	/**
	 * Sets the value of the '{@link esehat.PatientDetail#getP_Name <em>PName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PName</em>' attribute.
	 * @see #getP_Name()
	 * @generated
	 */
	void setP_Name(String value);

	/**
	 * Returns the value of the '<em><b>PGender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PGender</em>' attribute.
	 * @see #setP_Gender(String)
	 * @see esehat.EsehatPackage#getPatientDetail_P_Gender()
	 * @model
	 * @generated
	 */
	String getP_Gender();

	/**
	 * Sets the value of the '{@link esehat.PatientDetail#getP_Gender <em>PGender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGender</em>' attribute.
	 * @see #getP_Gender()
	 * @generated
	 */
	void setP_Gender(String value);

	/**
	 * Returns the value of the '<em><b>PAge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PAge</em>' attribute.
	 * @see #setP_Age(int)
	 * @see esehat.EsehatPackage#getPatientDetail_P_Age()
	 * @model
	 * @generated
	 */
	int getP_Age();

	/**
	 * Sets the value of the '{@link esehat.PatientDetail#getP_Age <em>PAge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PAge</em>' attribute.
	 * @see #getP_Age()
	 * @generated
	 */
	void setP_Age(int value);

	/**
	 * Returns the value of the '<em><b>Symptoms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symptoms</em>' attribute.
	 * @see #setSymptoms(String)
	 * @see esehat.EsehatPackage#getPatientDetail_Symptoms()
	 * @model
	 * @generated
	 */
	String getSymptoms();

	/**
	 * Sets the value of the '{@link esehat.PatientDetail#getSymptoms <em>Symptoms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symptoms</em>' attribute.
	 * @see #getSymptoms()
	 * @generated
	 */
	void setSymptoms(String value);

	/**
	 * Returns the value of the '<em><b>Symptomsdataset</b></em>' reference list.
	 * The list contents are of type {@link esehat.SymptomsDataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symptomsdataset</em>' reference list.
	 * @see esehat.EsehatPackage#getPatientDetail_Symptomsdataset()
	 * @model required="true"
	 * @generated
	 */
	EList<SymptomsDataset> getSymptomsdataset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void submit();

} // PatientDetail
