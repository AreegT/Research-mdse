/**
 */
package esehat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see esehat.EsehatFactory
 * @model kind="package"
 * @generated
 */
public interface EsehatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esehat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/esehat";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "esehat";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EsehatPackage eINSTANCE = esehat.impl.EsehatPackageImpl.init();

	/**
	 * The meta object id for the '{@link esehat.impl.ESEHATImpl <em>ESEHAT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.ESEHATImpl
	 * @see esehat.impl.EsehatPackageImpl#getESEHAT()
	 * @generated
	 */
	int ESEHAT = 0;

	/**
	 * The feature id for the '<em><b>Doctorconcultation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__DOCTORCONCULTATION = 0;

	/**
	 * The feature id for the '<em><b>Nutritionistconsultation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__NUTRITIONISTCONSULTATION = 1;

	/**
	 * The feature id for the '<em><b>Diseasedetection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__DISEASEDETECTION = 2;

	/**
	 * The feature id for the '<em><b>Symptomsdataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__SYMPTOMSDATASET = 3;

	/**
	 * The feature id for the '<em><b>Patientdetail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__PATIENTDETAIL = 4;

	/**
	 * The feature id for the '<em><b>Listofdiseases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__LISTOFDISEASES = 5;

	/**
	 * The feature id for the '<em><b>Ml algorithm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__ML_ALGORITHM = 6;

	/**
	 * The feature id for the '<em><b>Matchedsymptom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__MATCHEDSYMPTOM = 7;

	/**
	 * The feature id for the '<em><b>Dietplan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__DIETPLAN = 8;

	/**
	 * The feature id for the '<em><b>Predicteddiseases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__PREDICTEDDISEASES = 9;

	/**
	 * The feature id for the '<em><b>Precautionsdataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__PRECAUTIONSDATASET = 10;

	/**
	 * The feature id for the '<em><b>Diseasasediscriptiondataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT__DISEASASEDISCRIPTIONDATASET = 11;

	/**
	 * The number of structural features of the '<em>ESEHAT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>ESEHAT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESEHAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link esehat.impl.NutritionistConsultationImpl <em>Nutritionist Consultation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.NutritionistConsultationImpl
	 * @see esehat.impl.EsehatPackageImpl#getNutritionistConsultation()
	 * @generated
	 */
	int NUTRITIONIST_CONSULTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST_CONSULTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dietplan</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST_CONSULTATION__DIETPLAN = 1;

	/**
	 * The number of structural features of the '<em>Nutritionist Consultation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST_CONSULTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nutritionist Consultation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST_CONSULTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link esehat.impl.DoctorConcultationImpl <em>Doctor Concultation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.DoctorConcultationImpl
	 * @see esehat.impl.EsehatPackageImpl#getDoctorConcultation()
	 * @generated
	 */
	int DOCTOR_CONCULTATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_CONCULTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Predicteddiseases</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_CONCULTATION__PREDICTEDDISEASES = 1;

	/**
	 * The number of structural features of the '<em>Doctor Concultation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_CONCULTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Doctor Concultation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_CONCULTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link esehat.impl.DiseaseDetectionImpl <em>Disease Detection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.DiseaseDetectionImpl
	 * @see esehat.impl.EsehatPackageImpl#getDiseaseDetection()
	 * @generated
	 */
	int DISEASE_DETECTION = 3;

	/**
	 * The feature id for the '<em><b>Patientdetail</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_DETECTION__PATIENTDETAIL = 0;

	/**
	 * The number of structural features of the '<em>Disease Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_DETECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Disease Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_DETECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link esehat.impl.PatientDetailImpl <em>Patient Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.PatientDetailImpl
	 * @see esehat.impl.EsehatPackageImpl#getPatientDetail()
	 * @generated
	 */
	int PATIENT_DETAIL = 4;

	/**
	 * The feature id for the '<em><b>PName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_DETAIL__PNAME = 0;

	/**
	 * The feature id for the '<em><b>PGender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_DETAIL__PGENDER = 1;

	/**
	 * The feature id for the '<em><b>PAge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_DETAIL__PAGE = 2;

	/**
	 * The feature id for the '<em><b>Symptoms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_DETAIL__SYMPTOMS = 3;

	/**
	 * The feature id for the '<em><b>Symptomsdataset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_DETAIL__SYMPTOMSDATASET = 4;

	/**
	 * The number of structural features of the '<em>Patient Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_DETAIL_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Submit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_DETAIL___SUBMIT = 0;

	/**
	 * The number of operations of the '<em>Patient Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_DETAIL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link esehat.impl.MatchedSymptomImpl <em>Matched Symptom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.MatchedSymptomImpl
	 * @see esehat.impl.EsehatPackageImpl#getMatchedSymptom()
	 * @generated
	 */
	int MATCHED_SYMPTOM = 5;

	/**
	 * The feature id for the '<em><b>Ml algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_SYMPTOM__ML_ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_SYMPTOM__DAYS = 1;

	/**
	 * The number of structural features of the '<em>Matched Symptom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_SYMPTOM_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Getmatchedsymptoms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_SYMPTOM___GETMATCHEDSYMPTOMS = 0;

	/**
	 * The operation id for the '<em>Submit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_SYMPTOM___SUBMIT = 1;

	/**
	 * The number of operations of the '<em>Matched Symptom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_SYMPTOM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link esehat.impl.ML_AlgorithmImpl <em>ML Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.ML_AlgorithmImpl
	 * @see esehat.impl.EsehatPackageImpl#getML_Algorithm()
	 * @generated
	 */
	int ML_ALGORITHM = 6;

	/**
	 * The feature id for the '<em><b>Matchedsymptom</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__MATCHEDSYMPTOM = 0;

	/**
	 * The feature id for the '<em><b>Listofdiseases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__LISTOFDISEASES = 1;

	/**
	 * The number of structural features of the '<em>ML Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Multipletrees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM___MULTIPLETREES = 0;

	/**
	 * The number of operations of the '<em>ML Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link esehat.impl.ListOfDiseasesImpl <em>List Of Diseases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.ListOfDiseasesImpl
	 * @see esehat.impl.EsehatPackageImpl#getListOfDiseases()
	 * @generated
	 */
	int LIST_OF_DISEASES = 7;

	/**
	 * The feature id for the '<em><b>Ml algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DISEASES__ML_ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Predicteddiseases</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DISEASES__PREDICTEDDISEASES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DISEASES__NAME = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DISEASES__LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Confirmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DISEASES__CONFIRMATION = 4;

	/**
	 * The number of structural features of the '<em>List Of Diseases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DISEASES_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Getsymptom details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DISEASES___GETSYMPTOM_DETAILS = 0;

	/**
	 * The number of operations of the '<em>List Of Diseases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DISEASES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link esehat.impl.PredictedDiseasesImpl <em>Predicted Diseases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.PredictedDiseasesImpl
	 * @see esehat.impl.EsehatPackageImpl#getPredictedDiseases()
	 * @generated
	 */
	int PREDICTED_DISEASES = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DISEASES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Consult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DISEASES__CONSULT = 1;

	/**
	 * The feature id for the '<em><b>Doctorconcultation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DISEASES__DOCTORCONCULTATION = 2;

	/**
	 * The number of structural features of the '<em>Predicted Diseases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DISEASES_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Getsymptom details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DISEASES___GETSYMPTOM_DETAILS = 0;

	/**
	 * The operation id for the '<em>Getsymptom precautions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DISEASES___GETSYMPTOM_PRECAUTIONS = 1;

	/**
	 * The operation id for the '<em>Seediet plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DISEASES___SEEDIET_PLAN = 2;

	/**
	 * The operation id for the '<em>Consult doctor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DISEASES___CONSULT_DOCTOR = 3;

	/**
	 * The number of operations of the '<em>Predicted Diseases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DISEASES_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link esehat.impl.DietPlanImpl <em>Diet Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.DietPlanImpl
	 * @see esehat.impl.EsehatPackageImpl#getDietPlan()
	 * @generated
	 */
	int DIET_PLAN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_PLAN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nutritionistconsultation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_PLAN__NUTRITIONISTCONSULTATION = 1;

	/**
	 * The number of structural features of the '<em>Diet Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_PLAN_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Getdietplan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_PLAN___GETDIETPLAN = 0;

	/**
	 * The number of operations of the '<em>Diet Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_PLAN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link esehat.impl.DiseasaseDiscriptionDatasetImpl <em>Diseasase Discription Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.DiseasaseDiscriptionDatasetImpl
	 * @see esehat.impl.EsehatPackageImpl#getDiseasaseDiscriptionDataset()
	 * @generated
	 */
	int DISEASASE_DISCRIPTION_DATASET = 10;

	/**
	 * The feature id for the '<em><b>Listofdiseases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASASE_DISCRIPTION_DATASET__LISTOFDISEASES = 0;

	/**
	 * The number of structural features of the '<em>Diseasase Discription Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASASE_DISCRIPTION_DATASET_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Symptom details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASASE_DISCRIPTION_DATASET___SYMPTOM_DETAILS = 0;

	/**
	 * The number of operations of the '<em>Diseasase Discription Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASASE_DISCRIPTION_DATASET_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link esehat.impl.SymptomsDatasetImpl <em>Symptoms Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.SymptomsDatasetImpl
	 * @see esehat.impl.EsehatPackageImpl#getSymptomsDataset()
	 * @generated
	 */
	int SYMPTOMS_DATASET = 11;

	/**
	 * The feature id for the '<em><b>Matchedsymptom</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS_DATASET__MATCHEDSYMPTOM = 0;

	/**
	 * The number of structural features of the '<em>Symptoms Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS_DATASET_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Matchedsymptoms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS_DATASET___MATCHEDSYMPTOMS = 0;

	/**
	 * The number of operations of the '<em>Symptoms Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS_DATASET_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link esehat.impl.PrecautionsDatasetImpl <em>Precautions Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.PrecautionsDatasetImpl
	 * @see esehat.impl.EsehatPackageImpl#getPrecautionsDataset()
	 * @generated
	 */
	int PRECAUTIONS_DATASET = 12;

	/**
	 * The feature id for the '<em><b>Predicteddiseases</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECAUTIONS_DATASET__PREDICTEDDISEASES = 0;

	/**
	 * The number of structural features of the '<em>Precautions Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECAUTIONS_DATASET_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Symptom precautions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECAUTIONS_DATASET___SYMPTOM_PRECAUTIONS = 0;

	/**
	 * The number of operations of the '<em>Precautions Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECAUTIONS_DATASET_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link esehat.impl.Random_Forest_TreeImpl <em>Random Forest Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esehat.impl.Random_Forest_TreeImpl
	 * @see esehat.impl.EsehatPackageImpl#getRandom_Forest_Tree()
	 * @generated
	 */
	int RANDOM_FOREST_TREE = 13;

	/**
	 * The feature id for the '<em><b>Ml algorithm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_TREE__ML_ALGORITHM = 0;

	/**
	 * The number of structural features of the '<em>Random Forest Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_TREE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Random Forest Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_TREE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link esehat.ESEHAT <em>ESEHAT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESEHAT</em>'.
	 * @see esehat.ESEHAT
	 * @generated
	 */
	EClass getESEHAT();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getDoctorconcultation <em>Doctorconcultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doctorconcultation</em>'.
	 * @see esehat.ESEHAT#getDoctorconcultation()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Doctorconcultation();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getNutritionistconsultation <em>Nutritionistconsultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nutritionistconsultation</em>'.
	 * @see esehat.ESEHAT#getNutritionistconsultation()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Nutritionistconsultation();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getDiseasedetection <em>Diseasedetection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diseasedetection</em>'.
	 * @see esehat.ESEHAT#getDiseasedetection()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Diseasedetection();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getSymptomsdataset <em>Symptomsdataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symptomsdataset</em>'.
	 * @see esehat.ESEHAT#getSymptomsdataset()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Symptomsdataset();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getPatientdetail <em>Patientdetail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patientdetail</em>'.
	 * @see esehat.ESEHAT#getPatientdetail()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Patientdetail();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getListofdiseases <em>Listofdiseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listofdiseases</em>'.
	 * @see esehat.ESEHAT#getListofdiseases()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Listofdiseases();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getMl_algorithm <em>Ml algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ml algorithm</em>'.
	 * @see esehat.ESEHAT#getMl_algorithm()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Ml_algorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getMatchedsymptom <em>Matchedsymptom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchedsymptom</em>'.
	 * @see esehat.ESEHAT#getMatchedsymptom()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Matchedsymptom();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getDietplan <em>Dietplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dietplan</em>'.
	 * @see esehat.ESEHAT#getDietplan()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Dietplan();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getPredicteddiseases <em>Predicteddiseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicteddiseases</em>'.
	 * @see esehat.ESEHAT#getPredicteddiseases()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Predicteddiseases();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getPrecautionsdataset <em>Precautionsdataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precautionsdataset</em>'.
	 * @see esehat.ESEHAT#getPrecautionsdataset()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Precautionsdataset();

	/**
	 * Returns the meta object for the containment reference list '{@link esehat.ESEHAT#getDiseasasediscriptiondataset <em>Diseasasediscriptiondataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diseasasediscriptiondataset</em>'.
	 * @see esehat.ESEHAT#getDiseasasediscriptiondataset()
	 * @see #getESEHAT()
	 * @generated
	 */
	EReference getESEHAT_Diseasasediscriptiondataset();

	/**
	 * Returns the meta object for class '{@link esehat.NutritionistConsultation <em>Nutritionist Consultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nutritionist Consultation</em>'.
	 * @see esehat.NutritionistConsultation
	 * @generated
	 */
	EClass getNutritionistConsultation();

	/**
	 * Returns the meta object for the attribute '{@link esehat.NutritionistConsultation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see esehat.NutritionistConsultation#getName()
	 * @see #getNutritionistConsultation()
	 * @generated
	 */
	EAttribute getNutritionistConsultation_Name();

	/**
	 * Returns the meta object for the reference list '{@link esehat.NutritionistConsultation#getDietplan <em>Dietplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dietplan</em>'.
	 * @see esehat.NutritionistConsultation#getDietplan()
	 * @see #getNutritionistConsultation()
	 * @generated
	 */
	EReference getNutritionistConsultation_Dietplan();

	/**
	 * Returns the meta object for class '{@link esehat.DoctorConcultation <em>Doctor Concultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor Concultation</em>'.
	 * @see esehat.DoctorConcultation
	 * @generated
	 */
	EClass getDoctorConcultation();

	/**
	 * Returns the meta object for the attribute '{@link esehat.DoctorConcultation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see esehat.DoctorConcultation#getName()
	 * @see #getDoctorConcultation()
	 * @generated
	 */
	EAttribute getDoctorConcultation_Name();

	/**
	 * Returns the meta object for the reference '{@link esehat.DoctorConcultation#getPredicteddiseases <em>Predicteddiseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicteddiseases</em>'.
	 * @see esehat.DoctorConcultation#getPredicteddiseases()
	 * @see #getDoctorConcultation()
	 * @generated
	 */
	EReference getDoctorConcultation_Predicteddiseases();

	/**
	 * Returns the meta object for class '{@link esehat.DiseaseDetection <em>Disease Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Detection</em>'.
	 * @see esehat.DiseaseDetection
	 * @generated
	 */
	EClass getDiseaseDetection();

	/**
	 * Returns the meta object for the reference list '{@link esehat.DiseaseDetection#getPatientdetail <em>Patientdetail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patientdetail</em>'.
	 * @see esehat.DiseaseDetection#getPatientdetail()
	 * @see #getDiseaseDetection()
	 * @generated
	 */
	EReference getDiseaseDetection_Patientdetail();

	/**
	 * Returns the meta object for class '{@link esehat.PatientDetail <em>Patient Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Detail</em>'.
	 * @see esehat.PatientDetail
	 * @generated
	 */
	EClass getPatientDetail();

	/**
	 * Returns the meta object for the attribute '{@link esehat.PatientDetail#getP_Name <em>PName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PName</em>'.
	 * @see esehat.PatientDetail#getP_Name()
	 * @see #getPatientDetail()
	 * @generated
	 */
	EAttribute getPatientDetail_P_Name();

	/**
	 * Returns the meta object for the attribute '{@link esehat.PatientDetail#getP_Gender <em>PGender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PGender</em>'.
	 * @see esehat.PatientDetail#getP_Gender()
	 * @see #getPatientDetail()
	 * @generated
	 */
	EAttribute getPatientDetail_P_Gender();

	/**
	 * Returns the meta object for the attribute '{@link esehat.PatientDetail#getP_Age <em>PAge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PAge</em>'.
	 * @see esehat.PatientDetail#getP_Age()
	 * @see #getPatientDetail()
	 * @generated
	 */
	EAttribute getPatientDetail_P_Age();

	/**
	 * Returns the meta object for the attribute '{@link esehat.PatientDetail#getSymptoms <em>Symptoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symptoms</em>'.
	 * @see esehat.PatientDetail#getSymptoms()
	 * @see #getPatientDetail()
	 * @generated
	 */
	EAttribute getPatientDetail_Symptoms();

	/**
	 * Returns the meta object for the reference list '{@link esehat.PatientDetail#getSymptomsdataset <em>Symptomsdataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Symptomsdataset</em>'.
	 * @see esehat.PatientDetail#getSymptomsdataset()
	 * @see #getPatientDetail()
	 * @generated
	 */
	EReference getPatientDetail_Symptomsdataset();

	/**
	 * Returns the meta object for the '{@link esehat.PatientDetail#submit() <em>Submit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Submit</em>' operation.
	 * @see esehat.PatientDetail#submit()
	 * @generated
	 */
	EOperation getPatientDetail__Submit();

	/**
	 * Returns the meta object for class '{@link esehat.MatchedSymptom <em>Matched Symptom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matched Symptom</em>'.
	 * @see esehat.MatchedSymptom
	 * @generated
	 */
	EClass getMatchedSymptom();

	/**
	 * Returns the meta object for the reference '{@link esehat.MatchedSymptom#getMl_algorithm <em>Ml algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ml algorithm</em>'.
	 * @see esehat.MatchedSymptom#getMl_algorithm()
	 * @see #getMatchedSymptom()
	 * @generated
	 */
	EReference getMatchedSymptom_Ml_algorithm();

	/**
	 * Returns the meta object for the attribute '{@link esehat.MatchedSymptom#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days</em>'.
	 * @see esehat.MatchedSymptom#getDays()
	 * @see #getMatchedSymptom()
	 * @generated
	 */
	EAttribute getMatchedSymptom_Days();

	/**
	 * Returns the meta object for the '{@link esehat.MatchedSymptom#getmatchedsymptoms() <em>Getmatchedsymptoms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Getmatchedsymptoms</em>' operation.
	 * @see esehat.MatchedSymptom#getmatchedsymptoms()
	 * @generated
	 */
	EOperation getMatchedSymptom__Getmatchedsymptoms();

	/**
	 * Returns the meta object for the '{@link esehat.MatchedSymptom#submit() <em>Submit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Submit</em>' operation.
	 * @see esehat.MatchedSymptom#submit()
	 * @generated
	 */
	EOperation getMatchedSymptom__Submit();

	/**
	 * Returns the meta object for class '{@link esehat.ML_Algorithm <em>ML Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML Algorithm</em>'.
	 * @see esehat.ML_Algorithm
	 * @generated
	 */
	EClass getML_Algorithm();

	/**
	 * Returns the meta object for the reference list '{@link esehat.ML_Algorithm#getMatchedsymptom <em>Matchedsymptom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matchedsymptom</em>'.
	 * @see esehat.ML_Algorithm#getMatchedsymptom()
	 * @see #getML_Algorithm()
	 * @generated
	 */
	EReference getML_Algorithm_Matchedsymptom();

	/**
	 * Returns the meta object for the reference list '{@link esehat.ML_Algorithm#getListofdiseases <em>Listofdiseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Listofdiseases</em>'.
	 * @see esehat.ML_Algorithm#getListofdiseases()
	 * @see #getML_Algorithm()
	 * @generated
	 */
	EReference getML_Algorithm_Listofdiseases();

	/**
	 * Returns the meta object for the '{@link esehat.ML_Algorithm#multipletrees() <em>Multipletrees</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Multipletrees</em>' operation.
	 * @see esehat.ML_Algorithm#multipletrees()
	 * @generated
	 */
	EOperation getML_Algorithm__Multipletrees();

	/**
	 * Returns the meta object for class '{@link esehat.ListOfDiseases <em>List Of Diseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Diseases</em>'.
	 * @see esehat.ListOfDiseases
	 * @generated
	 */
	EClass getListOfDiseases();

	/**
	 * Returns the meta object for the reference '{@link esehat.ListOfDiseases#getMl_algorithm <em>Ml algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ml algorithm</em>'.
	 * @see esehat.ListOfDiseases#getMl_algorithm()
	 * @see #getListOfDiseases()
	 * @generated
	 */
	EReference getListOfDiseases_Ml_algorithm();

	/**
	 * Returns the meta object for the reference '{@link esehat.ListOfDiseases#getPredicteddiseases <em>Predicteddiseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicteddiseases</em>'.
	 * @see esehat.ListOfDiseases#getPredicteddiseases()
	 * @see #getListOfDiseases()
	 * @generated
	 */
	EReference getListOfDiseases_Predicteddiseases();

	/**
	 * Returns the meta object for the attribute '{@link esehat.ListOfDiseases#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see esehat.ListOfDiseases#getName()
	 * @see #getListOfDiseases()
	 * @generated
	 */
	EAttribute getListOfDiseases_Name();

	/**
	 * Returns the meta object for the attribute '{@link esehat.ListOfDiseases#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see esehat.ListOfDiseases#getLanguage()
	 * @see #getListOfDiseases()
	 * @generated
	 */
	EAttribute getListOfDiseases_Language();

	/**
	 * Returns the meta object for the attribute '{@link esehat.ListOfDiseases#isConfirmation <em>Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmation</em>'.
	 * @see esehat.ListOfDiseases#isConfirmation()
	 * @see #getListOfDiseases()
	 * @generated
	 */
	EAttribute getListOfDiseases_Confirmation();

	/**
	 * Returns the meta object for the '{@link esehat.ListOfDiseases#getsymptom_details() <em>Getsymptom details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Getsymptom details</em>' operation.
	 * @see esehat.ListOfDiseases#getsymptom_details()
	 * @generated
	 */
	EOperation getListOfDiseases__Getsymptom_details();

	/**
	 * Returns the meta object for class '{@link esehat.PredictedDiseases <em>Predicted Diseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicted Diseases</em>'.
	 * @see esehat.PredictedDiseases
	 * @generated
	 */
	EClass getPredictedDiseases();

	/**
	 * Returns the meta object for the attribute '{@link esehat.PredictedDiseases#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see esehat.PredictedDiseases#getName()
	 * @see #getPredictedDiseases()
	 * @generated
	 */
	EAttribute getPredictedDiseases_Name();

	/**
	 * Returns the meta object for the attribute '{@link esehat.PredictedDiseases#getConsult <em>Consult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consult</em>'.
	 * @see esehat.PredictedDiseases#getConsult()
	 * @see #getPredictedDiseases()
	 * @generated
	 */
	EAttribute getPredictedDiseases_Consult();

	/**
	 * Returns the meta object for the reference list '{@link esehat.PredictedDiseases#getDoctorconcultation <em>Doctorconcultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Doctorconcultation</em>'.
	 * @see esehat.PredictedDiseases#getDoctorconcultation()
	 * @see #getPredictedDiseases()
	 * @generated
	 */
	EReference getPredictedDiseases_Doctorconcultation();

	/**
	 * Returns the meta object for the '{@link esehat.PredictedDiseases#getsymptom_details() <em>Getsymptom details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Getsymptom details</em>' operation.
	 * @see esehat.PredictedDiseases#getsymptom_details()
	 * @generated
	 */
	EOperation getPredictedDiseases__Getsymptom_details();

	/**
	 * Returns the meta object for the '{@link esehat.PredictedDiseases#getsymptom_precautions() <em>Getsymptom precautions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Getsymptom precautions</em>' operation.
	 * @see esehat.PredictedDiseases#getsymptom_precautions()
	 * @generated
	 */
	EOperation getPredictedDiseases__Getsymptom_precautions();

	/**
	 * Returns the meta object for the '{@link esehat.PredictedDiseases#seediet_plan() <em>Seediet plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Seediet plan</em>' operation.
	 * @see esehat.PredictedDiseases#seediet_plan()
	 * @generated
	 */
	EOperation getPredictedDiseases__Seediet_plan();

	/**
	 * Returns the meta object for the '{@link esehat.PredictedDiseases#consult_doctor() <em>Consult doctor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Consult doctor</em>' operation.
	 * @see esehat.PredictedDiseases#consult_doctor()
	 * @generated
	 */
	EOperation getPredictedDiseases__Consult_doctor();

	/**
	 * Returns the meta object for class '{@link esehat.DietPlan <em>Diet Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diet Plan</em>'.
	 * @see esehat.DietPlan
	 * @generated
	 */
	EClass getDietPlan();

	/**
	 * Returns the meta object for the attribute '{@link esehat.DietPlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see esehat.DietPlan#getName()
	 * @see #getDietPlan()
	 * @generated
	 */
	EAttribute getDietPlan_Name();

	/**
	 * Returns the meta object for the reference list '{@link esehat.DietPlan#getNutritionistconsultation <em>Nutritionistconsultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nutritionistconsultation</em>'.
	 * @see esehat.DietPlan#getNutritionistconsultation()
	 * @see #getDietPlan()
	 * @generated
	 */
	EReference getDietPlan_Nutritionistconsultation();

	/**
	 * Returns the meta object for the '{@link esehat.DietPlan#getdietplan() <em>Getdietplan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Getdietplan</em>' operation.
	 * @see esehat.DietPlan#getdietplan()
	 * @generated
	 */
	EOperation getDietPlan__Getdietplan();

	/**
	 * Returns the meta object for class '{@link esehat.DiseasaseDiscriptionDataset <em>Diseasase Discription Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diseasase Discription Dataset</em>'.
	 * @see esehat.DiseasaseDiscriptionDataset
	 * @generated
	 */
	EClass getDiseasaseDiscriptionDataset();

	/**
	 * Returns the meta object for the reference list '{@link esehat.DiseasaseDiscriptionDataset#getListofdiseases <em>Listofdiseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Listofdiseases</em>'.
	 * @see esehat.DiseasaseDiscriptionDataset#getListofdiseases()
	 * @see #getDiseasaseDiscriptionDataset()
	 * @generated
	 */
	EReference getDiseasaseDiscriptionDataset_Listofdiseases();

	/**
	 * Returns the meta object for the '{@link esehat.DiseasaseDiscriptionDataset#symptom_details() <em>Symptom details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Symptom details</em>' operation.
	 * @see esehat.DiseasaseDiscriptionDataset#symptom_details()
	 * @generated
	 */
	EOperation getDiseasaseDiscriptionDataset__Symptom_details();

	/**
	 * Returns the meta object for class '{@link esehat.SymptomsDataset <em>Symptoms Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symptoms Dataset</em>'.
	 * @see esehat.SymptomsDataset
	 * @generated
	 */
	EClass getSymptomsDataset();

	/**
	 * Returns the meta object for the reference list '{@link esehat.SymptomsDataset#getMatchedsymptom <em>Matchedsymptom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matchedsymptom</em>'.
	 * @see esehat.SymptomsDataset#getMatchedsymptom()
	 * @see #getSymptomsDataset()
	 * @generated
	 */
	EReference getSymptomsDataset_Matchedsymptom();

	/**
	 * Returns the meta object for the '{@link esehat.SymptomsDataset#matchedsymptoms() <em>Matchedsymptoms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matchedsymptoms</em>' operation.
	 * @see esehat.SymptomsDataset#matchedsymptoms()
	 * @generated
	 */
	EOperation getSymptomsDataset__Matchedsymptoms();

	/**
	 * Returns the meta object for class '{@link esehat.PrecautionsDataset <em>Precautions Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precautions Dataset</em>'.
	 * @see esehat.PrecautionsDataset
	 * @generated
	 */
	EClass getPrecautionsDataset();

	/**
	 * Returns the meta object for the reference '{@link esehat.PrecautionsDataset#getPredicteddiseases <em>Predicteddiseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicteddiseases</em>'.
	 * @see esehat.PrecautionsDataset#getPredicteddiseases()
	 * @see #getPrecautionsDataset()
	 * @generated
	 */
	EReference getPrecautionsDataset_Predicteddiseases();

	/**
	 * Returns the meta object for the '{@link esehat.PrecautionsDataset#symptom_precautions() <em>Symptom precautions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Symptom precautions</em>' operation.
	 * @see esehat.PrecautionsDataset#symptom_precautions()
	 * @generated
	 */
	EOperation getPrecautionsDataset__Symptom_precautions();

	/**
	 * Returns the meta object for class '{@link esehat.Random_Forest_Tree <em>Random Forest Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Forest Tree</em>'.
	 * @see esehat.Random_Forest_Tree
	 * @generated
	 */
	EClass getRandom_Forest_Tree();

	/**
	 * Returns the meta object for the reference list '{@link esehat.Random_Forest_Tree#getMl_algorithm <em>Ml algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ml algorithm</em>'.
	 * @see esehat.Random_Forest_Tree#getMl_algorithm()
	 * @see #getRandom_Forest_Tree()
	 * @generated
	 */
	EReference getRandom_Forest_Tree_Ml_algorithm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EsehatFactory getEsehatFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link esehat.impl.ESEHATImpl <em>ESEHAT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.ESEHATImpl
		 * @see esehat.impl.EsehatPackageImpl#getESEHAT()
		 * @generated
		 */
		EClass ESEHAT = eINSTANCE.getESEHAT();

		/**
		 * The meta object literal for the '<em><b>Doctorconcultation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__DOCTORCONCULTATION = eINSTANCE.getESEHAT_Doctorconcultation();

		/**
		 * The meta object literal for the '<em><b>Nutritionistconsultation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__NUTRITIONISTCONSULTATION = eINSTANCE.getESEHAT_Nutritionistconsultation();

		/**
		 * The meta object literal for the '<em><b>Diseasedetection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__DISEASEDETECTION = eINSTANCE.getESEHAT_Diseasedetection();

		/**
		 * The meta object literal for the '<em><b>Symptomsdataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__SYMPTOMSDATASET = eINSTANCE.getESEHAT_Symptomsdataset();

		/**
		 * The meta object literal for the '<em><b>Patientdetail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__PATIENTDETAIL = eINSTANCE.getESEHAT_Patientdetail();

		/**
		 * The meta object literal for the '<em><b>Listofdiseases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__LISTOFDISEASES = eINSTANCE.getESEHAT_Listofdiseases();

		/**
		 * The meta object literal for the '<em><b>Ml algorithm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__ML_ALGORITHM = eINSTANCE.getESEHAT_Ml_algorithm();

		/**
		 * The meta object literal for the '<em><b>Matchedsymptom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__MATCHEDSYMPTOM = eINSTANCE.getESEHAT_Matchedsymptom();

		/**
		 * The meta object literal for the '<em><b>Dietplan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__DIETPLAN = eINSTANCE.getESEHAT_Dietplan();

		/**
		 * The meta object literal for the '<em><b>Predicteddiseases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__PREDICTEDDISEASES = eINSTANCE.getESEHAT_Predicteddiseases();

		/**
		 * The meta object literal for the '<em><b>Precautionsdataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__PRECAUTIONSDATASET = eINSTANCE.getESEHAT_Precautionsdataset();

		/**
		 * The meta object literal for the '<em><b>Diseasasediscriptiondataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESEHAT__DISEASASEDISCRIPTIONDATASET = eINSTANCE.getESEHAT_Diseasasediscriptiondataset();

		/**
		 * The meta object literal for the '{@link esehat.impl.NutritionistConsultationImpl <em>Nutritionist Consultation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.NutritionistConsultationImpl
		 * @see esehat.impl.EsehatPackageImpl#getNutritionistConsultation()
		 * @generated
		 */
		EClass NUTRITIONIST_CONSULTATION = eINSTANCE.getNutritionistConsultation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTRITIONIST_CONSULTATION__NAME = eINSTANCE.getNutritionistConsultation_Name();

		/**
		 * The meta object literal for the '<em><b>Dietplan</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTRITIONIST_CONSULTATION__DIETPLAN = eINSTANCE.getNutritionistConsultation_Dietplan();

		/**
		 * The meta object literal for the '{@link esehat.impl.DoctorConcultationImpl <em>Doctor Concultation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.DoctorConcultationImpl
		 * @see esehat.impl.EsehatPackageImpl#getDoctorConcultation()
		 * @generated
		 */
		EClass DOCTOR_CONCULTATION = eINSTANCE.getDoctorConcultation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR_CONCULTATION__NAME = eINSTANCE.getDoctorConcultation_Name();

		/**
		 * The meta object literal for the '<em><b>Predicteddiseases</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_CONCULTATION__PREDICTEDDISEASES = eINSTANCE.getDoctorConcultation_Predicteddiseases();

		/**
		 * The meta object literal for the '{@link esehat.impl.DiseaseDetectionImpl <em>Disease Detection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.DiseaseDetectionImpl
		 * @see esehat.impl.EsehatPackageImpl#getDiseaseDetection()
		 * @generated
		 */
		EClass DISEASE_DETECTION = eINSTANCE.getDiseaseDetection();

		/**
		 * The meta object literal for the '<em><b>Patientdetail</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISEASE_DETECTION__PATIENTDETAIL = eINSTANCE.getDiseaseDetection_Patientdetail();

		/**
		 * The meta object literal for the '{@link esehat.impl.PatientDetailImpl <em>Patient Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.PatientDetailImpl
		 * @see esehat.impl.EsehatPackageImpl#getPatientDetail()
		 * @generated
		 */
		EClass PATIENT_DETAIL = eINSTANCE.getPatientDetail();

		/**
		 * The meta object literal for the '<em><b>PName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_DETAIL__PNAME = eINSTANCE.getPatientDetail_P_Name();

		/**
		 * The meta object literal for the '<em><b>PGender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_DETAIL__PGENDER = eINSTANCE.getPatientDetail_P_Gender();

		/**
		 * The meta object literal for the '<em><b>PAge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_DETAIL__PAGE = eINSTANCE.getPatientDetail_P_Age();

		/**
		 * The meta object literal for the '<em><b>Symptoms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_DETAIL__SYMPTOMS = eINSTANCE.getPatientDetail_Symptoms();

		/**
		 * The meta object literal for the '<em><b>Symptomsdataset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_DETAIL__SYMPTOMSDATASET = eINSTANCE.getPatientDetail_Symptomsdataset();

		/**
		 * The meta object literal for the '<em><b>Submit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATIENT_DETAIL___SUBMIT = eINSTANCE.getPatientDetail__Submit();

		/**
		 * The meta object literal for the '{@link esehat.impl.MatchedSymptomImpl <em>Matched Symptom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.MatchedSymptomImpl
		 * @see esehat.impl.EsehatPackageImpl#getMatchedSymptom()
		 * @generated
		 */
		EClass MATCHED_SYMPTOM = eINSTANCE.getMatchedSymptom();

		/**
		 * The meta object literal for the '<em><b>Ml algorithm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_SYMPTOM__ML_ALGORITHM = eINSTANCE.getMatchedSymptom_Ml_algorithm();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHED_SYMPTOM__DAYS = eINSTANCE.getMatchedSymptom_Days();

		/**
		 * The meta object literal for the '<em><b>Getmatchedsymptoms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATCHED_SYMPTOM___GETMATCHEDSYMPTOMS = eINSTANCE.getMatchedSymptom__Getmatchedsymptoms();

		/**
		 * The meta object literal for the '<em><b>Submit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATCHED_SYMPTOM___SUBMIT = eINSTANCE.getMatchedSymptom__Submit();

		/**
		 * The meta object literal for the '{@link esehat.impl.ML_AlgorithmImpl <em>ML Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.ML_AlgorithmImpl
		 * @see esehat.impl.EsehatPackageImpl#getML_Algorithm()
		 * @generated
		 */
		EClass ML_ALGORITHM = eINSTANCE.getML_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Matchedsymptom</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM__MATCHEDSYMPTOM = eINSTANCE.getML_Algorithm_Matchedsymptom();

		/**
		 * The meta object literal for the '<em><b>Listofdiseases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM__LISTOFDISEASES = eINSTANCE.getML_Algorithm_Listofdiseases();

		/**
		 * The meta object literal for the '<em><b>Multipletrees</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML_ALGORITHM___MULTIPLETREES = eINSTANCE.getML_Algorithm__Multipletrees();

		/**
		 * The meta object literal for the '{@link esehat.impl.ListOfDiseasesImpl <em>List Of Diseases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.ListOfDiseasesImpl
		 * @see esehat.impl.EsehatPackageImpl#getListOfDiseases()
		 * @generated
		 */
		EClass LIST_OF_DISEASES = eINSTANCE.getListOfDiseases();

		/**
		 * The meta object literal for the '<em><b>Ml algorithm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_DISEASES__ML_ALGORITHM = eINSTANCE.getListOfDiseases_Ml_algorithm();

		/**
		 * The meta object literal for the '<em><b>Predicteddiseases</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_DISEASES__PREDICTEDDISEASES = eINSTANCE.getListOfDiseases_Predicteddiseases();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_OF_DISEASES__NAME = eINSTANCE.getListOfDiseases_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_OF_DISEASES__LANGUAGE = eINSTANCE.getListOfDiseases_Language();

		/**
		 * The meta object literal for the '<em><b>Confirmation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_OF_DISEASES__CONFIRMATION = eINSTANCE.getListOfDiseases_Confirmation();

		/**
		 * The meta object literal for the '<em><b>Getsymptom details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST_OF_DISEASES___GETSYMPTOM_DETAILS = eINSTANCE.getListOfDiseases__Getsymptom_details();

		/**
		 * The meta object literal for the '{@link esehat.impl.PredictedDiseasesImpl <em>Predicted Diseases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.PredictedDiseasesImpl
		 * @see esehat.impl.EsehatPackageImpl#getPredictedDiseases()
		 * @generated
		 */
		EClass PREDICTED_DISEASES = eINSTANCE.getPredictedDiseases();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTED_DISEASES__NAME = eINSTANCE.getPredictedDiseases_Name();

		/**
		 * The meta object literal for the '<em><b>Consult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTED_DISEASES__CONSULT = eINSTANCE.getPredictedDiseases_Consult();

		/**
		 * The meta object literal for the '<em><b>Doctorconcultation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTED_DISEASES__DOCTORCONCULTATION = eINSTANCE.getPredictedDiseases_Doctorconcultation();

		/**
		 * The meta object literal for the '<em><b>Getsymptom details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREDICTED_DISEASES___GETSYMPTOM_DETAILS = eINSTANCE.getPredictedDiseases__Getsymptom_details();

		/**
		 * The meta object literal for the '<em><b>Getsymptom precautions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREDICTED_DISEASES___GETSYMPTOM_PRECAUTIONS = eINSTANCE
				.getPredictedDiseases__Getsymptom_precautions();

		/**
		 * The meta object literal for the '<em><b>Seediet plan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREDICTED_DISEASES___SEEDIET_PLAN = eINSTANCE.getPredictedDiseases__Seediet_plan();

		/**
		 * The meta object literal for the '<em><b>Consult doctor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREDICTED_DISEASES___CONSULT_DOCTOR = eINSTANCE.getPredictedDiseases__Consult_doctor();

		/**
		 * The meta object literal for the '{@link esehat.impl.DietPlanImpl <em>Diet Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.DietPlanImpl
		 * @see esehat.impl.EsehatPackageImpl#getDietPlan()
		 * @generated
		 */
		EClass DIET_PLAN = eINSTANCE.getDietPlan();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIET_PLAN__NAME = eINSTANCE.getDietPlan_Name();

		/**
		 * The meta object literal for the '<em><b>Nutritionistconsultation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_PLAN__NUTRITIONISTCONSULTATION = eINSTANCE.getDietPlan_Nutritionistconsultation();

		/**
		 * The meta object literal for the '<em><b>Getdietplan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIET_PLAN___GETDIETPLAN = eINSTANCE.getDietPlan__Getdietplan();

		/**
		 * The meta object literal for the '{@link esehat.impl.DiseasaseDiscriptionDatasetImpl <em>Diseasase Discription Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.DiseasaseDiscriptionDatasetImpl
		 * @see esehat.impl.EsehatPackageImpl#getDiseasaseDiscriptionDataset()
		 * @generated
		 */
		EClass DISEASASE_DISCRIPTION_DATASET = eINSTANCE.getDiseasaseDiscriptionDataset();

		/**
		 * The meta object literal for the '<em><b>Listofdiseases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISEASASE_DISCRIPTION_DATASET__LISTOFDISEASES = eINSTANCE
				.getDiseasaseDiscriptionDataset_Listofdiseases();

		/**
		 * The meta object literal for the '<em><b>Symptom details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISEASASE_DISCRIPTION_DATASET___SYMPTOM_DETAILS = eINSTANCE
				.getDiseasaseDiscriptionDataset__Symptom_details();

		/**
		 * The meta object literal for the '{@link esehat.impl.SymptomsDatasetImpl <em>Symptoms Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.SymptomsDatasetImpl
		 * @see esehat.impl.EsehatPackageImpl#getSymptomsDataset()
		 * @generated
		 */
		EClass SYMPTOMS_DATASET = eINSTANCE.getSymptomsDataset();

		/**
		 * The meta object literal for the '<em><b>Matchedsymptom</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPTOMS_DATASET__MATCHEDSYMPTOM = eINSTANCE.getSymptomsDataset_Matchedsymptom();

		/**
		 * The meta object literal for the '<em><b>Matchedsymptoms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPTOMS_DATASET___MATCHEDSYMPTOMS = eINSTANCE.getSymptomsDataset__Matchedsymptoms();

		/**
		 * The meta object literal for the '{@link esehat.impl.PrecautionsDatasetImpl <em>Precautions Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.PrecautionsDatasetImpl
		 * @see esehat.impl.EsehatPackageImpl#getPrecautionsDataset()
		 * @generated
		 */
		EClass PRECAUTIONS_DATASET = eINSTANCE.getPrecautionsDataset();

		/**
		 * The meta object literal for the '<em><b>Predicteddiseases</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECAUTIONS_DATASET__PREDICTEDDISEASES = eINSTANCE.getPrecautionsDataset_Predicteddiseases();

		/**
		 * The meta object literal for the '<em><b>Symptom precautions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRECAUTIONS_DATASET___SYMPTOM_PRECAUTIONS = eINSTANCE.getPrecautionsDataset__Symptom_precautions();

		/**
		 * The meta object literal for the '{@link esehat.impl.Random_Forest_TreeImpl <em>Random Forest Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esehat.impl.Random_Forest_TreeImpl
		 * @see esehat.impl.EsehatPackageImpl#getRandom_Forest_Tree()
		 * @generated
		 */
		EClass RANDOM_FOREST_TREE = eINSTANCE.getRandom_Forest_Tree();

		/**
		 * The meta object literal for the '<em><b>Ml algorithm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANDOM_FOREST_TREE__ML_ALGORITHM = eINSTANCE.getRandom_Forest_Tree_Ml_algorithm();

	}

} //EsehatPackage
