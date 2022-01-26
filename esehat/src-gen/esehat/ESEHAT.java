/**
 */
package esehat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESEHAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.ESEHAT#getDoctorconcultation <em>Doctorconcultation</em>}</li>
 *   <li>{@link esehat.ESEHAT#getNutritionistconsultation <em>Nutritionistconsultation</em>}</li>
 *   <li>{@link esehat.ESEHAT#getDiseasedetection <em>Diseasedetection</em>}</li>
 *   <li>{@link esehat.ESEHAT#getSymptomsdataset <em>Symptomsdataset</em>}</li>
 *   <li>{@link esehat.ESEHAT#getPatientdetail <em>Patientdetail</em>}</li>
 *   <li>{@link esehat.ESEHAT#getListofdiseases <em>Listofdiseases</em>}</li>
 *   <li>{@link esehat.ESEHAT#getMl_algorithm <em>Ml algorithm</em>}</li>
 *   <li>{@link esehat.ESEHAT#getMatchedsymptom <em>Matchedsymptom</em>}</li>
 *   <li>{@link esehat.ESEHAT#getDietplan <em>Dietplan</em>}</li>
 *   <li>{@link esehat.ESEHAT#getPredicteddiseases <em>Predicteddiseases</em>}</li>
 *   <li>{@link esehat.ESEHAT#getPrecautionsdataset <em>Precautionsdataset</em>}</li>
 *   <li>{@link esehat.ESEHAT#getDiseasasediscriptiondataset <em>Diseasasediscriptiondataset</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getESEHAT()
 * @model
 * @generated
 */
public interface ESEHAT extends EObject {
	/**
	 * Returns the value of the '<em><b>Doctorconcultation</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.DoctorConcultation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctorconcultation</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Doctorconcultation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DoctorConcultation> getDoctorconcultation();

	/**
	 * Returns the value of the '<em><b>Nutritionistconsultation</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.NutritionistConsultation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutritionistconsultation</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Nutritionistconsultation()
	 * @model containment="true"
	 * @generated
	 */
	EList<NutritionistConsultation> getNutritionistconsultation();

	/**
	 * Returns the value of the '<em><b>Diseasedetection</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.DiseaseDetection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diseasedetection</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Diseasedetection()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiseaseDetection> getDiseasedetection();

	/**
	 * Returns the value of the '<em><b>Symptomsdataset</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.SymptomsDataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symptomsdataset</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Symptomsdataset()
	 * @model containment="true"
	 * @generated
	 */
	EList<SymptomsDataset> getSymptomsdataset();

	/**
	 * Returns the value of the '<em><b>Patientdetail</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.PatientDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patientdetail</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Patientdetail()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatientDetail> getPatientdetail();

	/**
	 * Returns the value of the '<em><b>Listofdiseases</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.ListOfDiseases}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listofdiseases</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Listofdiseases()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListOfDiseases> getListofdiseases();

	/**
	 * Returns the value of the '<em><b>Ml algorithm</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.ML_Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ml algorithm</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Ml_algorithm()
	 * @model containment="true"
	 * @generated
	 */
	EList<ML_Algorithm> getMl_algorithm();

	/**
	 * Returns the value of the '<em><b>Matchedsymptom</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.MatchedSymptom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchedsymptom</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Matchedsymptom()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchedSymptom> getMatchedsymptom();

	/**
	 * Returns the value of the '<em><b>Dietplan</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.DietPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dietplan</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Dietplan()
	 * @model containment="true"
	 * @generated
	 */
	EList<DietPlan> getDietplan();

	/**
	 * Returns the value of the '<em><b>Predicteddiseases</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.PredictedDiseases}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicteddiseases</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Predicteddiseases()
	 * @model containment="true"
	 * @generated
	 */
	EList<PredictedDiseases> getPredicteddiseases();

	/**
	 * Returns the value of the '<em><b>Precautionsdataset</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.PrecautionsDataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precautionsdataset</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Precautionsdataset()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrecautionsDataset> getPrecautionsdataset();

	/**
	 * Returns the value of the '<em><b>Diseasasediscriptiondataset</b></em>' containment reference list.
	 * The list contents are of type {@link esehat.DiseasaseDiscriptionDataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diseasasediscriptiondataset</em>' containment reference list.
	 * @see esehat.EsehatPackage#getESEHAT_Diseasasediscriptiondataset()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiseasaseDiscriptionDataset> getDiseasasediscriptiondataset();

} // ESEHAT
