/**
 */
package esehat;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see esehat.EsehatPackage
 * @generated
 */
public interface EsehatFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EsehatFactory eINSTANCE = esehat.impl.EsehatFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ESEHAT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ESEHAT</em>'.
	 * @generated
	 */
	ESEHAT createESEHAT();

	/**
	 * Returns a new object of class '<em>Nutritionist Consultation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutritionist Consultation</em>'.
	 * @generated
	 */
	NutritionistConsultation createNutritionistConsultation();

	/**
	 * Returns a new object of class '<em>Doctor Concultation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doctor Concultation</em>'.
	 * @generated
	 */
	DoctorConcultation createDoctorConcultation();

	/**
	 * Returns a new object of class '<em>Disease Detection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disease Detection</em>'.
	 * @generated
	 */
	DiseaseDetection createDiseaseDetection();

	/**
	 * Returns a new object of class '<em>Patient Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Detail</em>'.
	 * @generated
	 */
	PatientDetail createPatientDetail();

	/**
	 * Returns a new object of class '<em>Matched Symptom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matched Symptom</em>'.
	 * @generated
	 */
	MatchedSymptom createMatchedSymptom();

	/**
	 * Returns a new object of class '<em>ML Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML Algorithm</em>'.
	 * @generated
	 */
	ML_Algorithm createML_Algorithm();

	/**
	 * Returns a new object of class '<em>List Of Diseases</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Of Diseases</em>'.
	 * @generated
	 */
	ListOfDiseases createListOfDiseases();

	/**
	 * Returns a new object of class '<em>Predicted Diseases</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicted Diseases</em>'.
	 * @generated
	 */
	PredictedDiseases createPredictedDiseases();

	/**
	 * Returns a new object of class '<em>Diet Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diet Plan</em>'.
	 * @generated
	 */
	DietPlan createDietPlan();

	/**
	 * Returns a new object of class '<em>Diseasase Discription Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diseasase Discription Dataset</em>'.
	 * @generated
	 */
	DiseasaseDiscriptionDataset createDiseasaseDiscriptionDataset();

	/**
	 * Returns a new object of class '<em>Symptoms Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symptoms Dataset</em>'.
	 * @generated
	 */
	SymptomsDataset createSymptomsDataset();

	/**
	 * Returns a new object of class '<em>Precautions Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precautions Dataset</em>'.
	 * @generated
	 */
	PrecautionsDataset createPrecautionsDataset();

	/**
	 * Returns a new object of class '<em>Random Forest Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Forest Tree</em>'.
	 * @generated
	 */
	Random_Forest_Tree createRandom_Forest_Tree();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EsehatPackage getEsehatPackage();

} //EsehatFactory
