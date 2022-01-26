/**
 */
package esehat.impl;

import esehat.DietPlan;
import esehat.DiseasaseDiscriptionDataset;
import esehat.DiseaseDetection;
import esehat.DoctorConcultation;
import esehat.EsehatFactory;
import esehat.EsehatPackage;
import esehat.ListOfDiseases;
import esehat.ML_Algorithm;
import esehat.MatchedSymptom;
import esehat.NutritionistConsultation;
import esehat.PatientDetail;
import esehat.PrecautionsDataset;
import esehat.PredictedDiseases;
import esehat.Random_Forest_Tree;
import esehat.SymptomsDataset;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsehatPackageImpl extends EPackageImpl implements EsehatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esehatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionistConsultationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorConcultationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diseaseDetectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchedSymptomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mL_AlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDiseasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predictedDiseasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dietPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diseasaseDiscriptionDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symptomsDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precautionsDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass random_Forest_TreeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see esehat.EsehatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EsehatPackageImpl() {
		super(eNS_URI, EsehatFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EsehatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EsehatPackage init() {
		if (isInited)
			return (EsehatPackage) EPackage.Registry.INSTANCE.getEPackage(EsehatPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEsehatPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EsehatPackageImpl theEsehatPackage = registeredEsehatPackage instanceof EsehatPackageImpl
				? (EsehatPackageImpl) registeredEsehatPackage
				: new EsehatPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEsehatPackage.createPackageContents();

		// Initialize created meta-data
		theEsehatPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEsehatPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EsehatPackage.eNS_URI, theEsehatPackage);
		return theEsehatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESEHAT() {
		return esehatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Doctorconcultation() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Nutritionistconsultation() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Diseasedetection() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Symptomsdataset() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Patientdetail() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Listofdiseases() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Ml_algorithm() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Matchedsymptom() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Dietplan() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Predicteddiseases() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Precautionsdataset() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESEHAT_Diseasasediscriptiondataset() {
		return (EReference) esehatEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionistConsultation() {
		return nutritionistConsultationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutritionistConsultation_Name() {
		return (EAttribute) nutritionistConsultationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionistConsultation_Dietplan() {
		return (EReference) nutritionistConsultationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoctorConcultation() {
		return doctorConcultationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctorConcultation_Name() {
		return (EAttribute) doctorConcultationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorConcultation_Predicteddiseases() {
		return (EReference) doctorConcultationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiseaseDetection() {
		return diseaseDetectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiseaseDetection_Patientdetail() {
		return (EReference) diseaseDetectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientDetail() {
		return patientDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientDetail_P_Name() {
		return (EAttribute) patientDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientDetail_P_Gender() {
		return (EAttribute) patientDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientDetail_P_Age() {
		return (EAttribute) patientDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientDetail_Symptoms() {
		return (EAttribute) patientDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientDetail_Symptomsdataset() {
		return (EReference) patientDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatientDetail__Submit() {
		return patientDetailEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchedSymptom() {
		return matchedSymptomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedSymptom_Ml_algorithm() {
		return (EReference) matchedSymptomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchedSymptom_Days() {
		return (EAttribute) matchedSymptomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatchedSymptom__Getmatchedsymptoms() {
		return matchedSymptomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatchedSymptom__Submit() {
		return matchedSymptomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getML_Algorithm() {
		return mL_AlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getML_Algorithm_Matchedsymptom() {
		return (EReference) mL_AlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getML_Algorithm_Listofdiseases() {
		return (EReference) mL_AlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getML_Algorithm__Multipletrees() {
		return mL_AlgorithmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDiseases() {
		return listOfDiseasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDiseases_Ml_algorithm() {
		return (EReference) listOfDiseasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDiseases_Predicteddiseases() {
		return (EReference) listOfDiseasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfDiseases_Name() {
		return (EAttribute) listOfDiseasesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfDiseases_Language() {
		return (EAttribute) listOfDiseasesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfDiseases_Confirmation() {
		return (EAttribute) listOfDiseasesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getListOfDiseases__Getsymptom_details() {
		return listOfDiseasesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredictedDiseases() {
		return predictedDiseasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredictedDiseases_Name() {
		return (EAttribute) predictedDiseasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredictedDiseases_Consult() {
		return (EAttribute) predictedDiseasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredictedDiseases_Doctorconcultation() {
		return (EReference) predictedDiseasesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPredictedDiseases__Getsymptom_details() {
		return predictedDiseasesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPredictedDiseases__Getsymptom_precautions() {
		return predictedDiseasesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPredictedDiseases__Seediet_plan() {
		return predictedDiseasesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPredictedDiseases__Consult_doctor() {
		return predictedDiseasesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDietPlan() {
		return dietPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDietPlan_Name() {
		return (EAttribute) dietPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDietPlan_Nutritionistconsultation() {
		return (EReference) dietPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDietPlan__Getdietplan() {
		return dietPlanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiseasaseDiscriptionDataset() {
		return diseasaseDiscriptionDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiseasaseDiscriptionDataset_Listofdiseases() {
		return (EReference) diseasaseDiscriptionDatasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiseasaseDiscriptionDataset__Symptom_details() {
		return diseasaseDiscriptionDatasetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymptomsDataset() {
		return symptomsDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymptomsDataset_Matchedsymptom() {
		return (EReference) symptomsDatasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymptomsDataset__Matchedsymptoms() {
		return symptomsDatasetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecautionsDataset() {
		return precautionsDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecautionsDataset_Predicteddiseases() {
		return (EReference) precautionsDatasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrecautionsDataset__Symptom_precautions() {
		return precautionsDatasetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandom_Forest_Tree() {
		return random_Forest_TreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRandom_Forest_Tree_Ml_algorithm() {
		return (EReference) random_Forest_TreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsehatFactory getEsehatFactory() {
		return (EsehatFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		esehatEClass = createEClass(ESEHAT);
		createEReference(esehatEClass, ESEHAT__DOCTORCONCULTATION);
		createEReference(esehatEClass, ESEHAT__NUTRITIONISTCONSULTATION);
		createEReference(esehatEClass, ESEHAT__DISEASEDETECTION);
		createEReference(esehatEClass, ESEHAT__SYMPTOMSDATASET);
		createEReference(esehatEClass, ESEHAT__PATIENTDETAIL);
		createEReference(esehatEClass, ESEHAT__LISTOFDISEASES);
		createEReference(esehatEClass, ESEHAT__ML_ALGORITHM);
		createEReference(esehatEClass, ESEHAT__MATCHEDSYMPTOM);
		createEReference(esehatEClass, ESEHAT__DIETPLAN);
		createEReference(esehatEClass, ESEHAT__PREDICTEDDISEASES);
		createEReference(esehatEClass, ESEHAT__PRECAUTIONSDATASET);
		createEReference(esehatEClass, ESEHAT__DISEASASEDISCRIPTIONDATASET);

		nutritionistConsultationEClass = createEClass(NUTRITIONIST_CONSULTATION);
		createEAttribute(nutritionistConsultationEClass, NUTRITIONIST_CONSULTATION__NAME);
		createEReference(nutritionistConsultationEClass, NUTRITIONIST_CONSULTATION__DIETPLAN);

		doctorConcultationEClass = createEClass(DOCTOR_CONCULTATION);
		createEAttribute(doctorConcultationEClass, DOCTOR_CONCULTATION__NAME);
		createEReference(doctorConcultationEClass, DOCTOR_CONCULTATION__PREDICTEDDISEASES);

		diseaseDetectionEClass = createEClass(DISEASE_DETECTION);
		createEReference(diseaseDetectionEClass, DISEASE_DETECTION__PATIENTDETAIL);

		patientDetailEClass = createEClass(PATIENT_DETAIL);
		createEAttribute(patientDetailEClass, PATIENT_DETAIL__PNAME);
		createEAttribute(patientDetailEClass, PATIENT_DETAIL__PGENDER);
		createEAttribute(patientDetailEClass, PATIENT_DETAIL__PAGE);
		createEAttribute(patientDetailEClass, PATIENT_DETAIL__SYMPTOMS);
		createEReference(patientDetailEClass, PATIENT_DETAIL__SYMPTOMSDATASET);
		createEOperation(patientDetailEClass, PATIENT_DETAIL___SUBMIT);

		matchedSymptomEClass = createEClass(MATCHED_SYMPTOM);
		createEReference(matchedSymptomEClass, MATCHED_SYMPTOM__ML_ALGORITHM);
		createEAttribute(matchedSymptomEClass, MATCHED_SYMPTOM__DAYS);
		createEOperation(matchedSymptomEClass, MATCHED_SYMPTOM___GETMATCHEDSYMPTOMS);
		createEOperation(matchedSymptomEClass, MATCHED_SYMPTOM___SUBMIT);

		mL_AlgorithmEClass = createEClass(ML_ALGORITHM);
		createEReference(mL_AlgorithmEClass, ML_ALGORITHM__MATCHEDSYMPTOM);
		createEReference(mL_AlgorithmEClass, ML_ALGORITHM__LISTOFDISEASES);
		createEOperation(mL_AlgorithmEClass, ML_ALGORITHM___MULTIPLETREES);

		listOfDiseasesEClass = createEClass(LIST_OF_DISEASES);
		createEReference(listOfDiseasesEClass, LIST_OF_DISEASES__ML_ALGORITHM);
		createEReference(listOfDiseasesEClass, LIST_OF_DISEASES__PREDICTEDDISEASES);
		createEAttribute(listOfDiseasesEClass, LIST_OF_DISEASES__NAME);
		createEAttribute(listOfDiseasesEClass, LIST_OF_DISEASES__LANGUAGE);
		createEAttribute(listOfDiseasesEClass, LIST_OF_DISEASES__CONFIRMATION);
		createEOperation(listOfDiseasesEClass, LIST_OF_DISEASES___GETSYMPTOM_DETAILS);

		predictedDiseasesEClass = createEClass(PREDICTED_DISEASES);
		createEAttribute(predictedDiseasesEClass, PREDICTED_DISEASES__NAME);
		createEAttribute(predictedDiseasesEClass, PREDICTED_DISEASES__CONSULT);
		createEReference(predictedDiseasesEClass, PREDICTED_DISEASES__DOCTORCONCULTATION);
		createEOperation(predictedDiseasesEClass, PREDICTED_DISEASES___GETSYMPTOM_DETAILS);
		createEOperation(predictedDiseasesEClass, PREDICTED_DISEASES___GETSYMPTOM_PRECAUTIONS);
		createEOperation(predictedDiseasesEClass, PREDICTED_DISEASES___SEEDIET_PLAN);
		createEOperation(predictedDiseasesEClass, PREDICTED_DISEASES___CONSULT_DOCTOR);

		dietPlanEClass = createEClass(DIET_PLAN);
		createEAttribute(dietPlanEClass, DIET_PLAN__NAME);
		createEReference(dietPlanEClass, DIET_PLAN__NUTRITIONISTCONSULTATION);
		createEOperation(dietPlanEClass, DIET_PLAN___GETDIETPLAN);

		diseasaseDiscriptionDatasetEClass = createEClass(DISEASASE_DISCRIPTION_DATASET);
		createEReference(diseasaseDiscriptionDatasetEClass, DISEASASE_DISCRIPTION_DATASET__LISTOFDISEASES);
		createEOperation(diseasaseDiscriptionDatasetEClass, DISEASASE_DISCRIPTION_DATASET___SYMPTOM_DETAILS);

		symptomsDatasetEClass = createEClass(SYMPTOMS_DATASET);
		createEReference(symptomsDatasetEClass, SYMPTOMS_DATASET__MATCHEDSYMPTOM);
		createEOperation(symptomsDatasetEClass, SYMPTOMS_DATASET___MATCHEDSYMPTOMS);

		precautionsDatasetEClass = createEClass(PRECAUTIONS_DATASET);
		createEReference(precautionsDatasetEClass, PRECAUTIONS_DATASET__PREDICTEDDISEASES);
		createEOperation(precautionsDatasetEClass, PRECAUTIONS_DATASET___SYMPTOM_PRECAUTIONS);

		random_Forest_TreeEClass = createEClass(RANDOM_FOREST_TREE);
		createEReference(random_Forest_TreeEClass, RANDOM_FOREST_TREE__ML_ALGORITHM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(esehatEClass, esehat.ESEHAT.class, "ESEHAT", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESEHAT_Doctorconcultation(), this.getDoctorConcultation(), null, "doctorconcultation", null,
				0, -1, esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Nutritionistconsultation(), this.getNutritionistConsultation(), null,
				"nutritionistconsultation", null, 0, -1, esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Diseasedetection(), this.getDiseaseDetection(), null, "diseasedetection", null, 0, -1,
				esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Symptomsdataset(), this.getSymptomsDataset(), null, "symptomsdataset", null, 0, -1,
				esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Patientdetail(), this.getPatientDetail(), null, "patientdetail", null, 0, -1,
				esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Listofdiseases(), this.getListOfDiseases(), null, "listofdiseases", null, 0, -1,
				esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Ml_algorithm(), this.getML_Algorithm(), null, "ml_algorithm", null, 0, -1,
				esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Matchedsymptom(), this.getMatchedSymptom(), null, "matchedsymptom", null, 0, -1,
				esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Dietplan(), this.getDietPlan(), null, "dietplan", null, 0, -1, esehat.ESEHAT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Predicteddiseases(), this.getPredictedDiseases(), null, "predicteddiseases", null, 0,
				-1, esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Precautionsdataset(), this.getPrecautionsDataset(), null, "precautionsdataset", null,
				0, -1, esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESEHAT_Diseasasediscriptiondataset(), this.getDiseasaseDiscriptionDataset(), null,
				"diseasasediscriptiondataset", null, 0, -1, esehat.ESEHAT.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nutritionistConsultationEClass, NutritionistConsultation.class, "NutritionistConsultation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNutritionistConsultation_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				NutritionistConsultation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutritionistConsultation_Dietplan(), this.getDietPlan(),
				this.getDietPlan_Nutritionistconsultation(), "dietplan", null, 1, -1, NutritionistConsultation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doctorConcultationEClass, DoctorConcultation.class, "DoctorConcultation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoctorConcultation_Name(), ecorePackage.getEString(), "Name", null, 0, 1,
				DoctorConcultation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorConcultation_Predicteddiseases(), this.getPredictedDiseases(),
				this.getPredictedDiseases_Doctorconcultation(), "predicteddiseases", null, 1, 1,
				DoctorConcultation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diseaseDetectionEClass, DiseaseDetection.class, "DiseaseDetection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiseaseDetection_Patientdetail(), this.getPatientDetail(), null, "patientdetail", null, 0, -1,
				DiseaseDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientDetailEClass, PatientDetail.class, "PatientDetail", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatientDetail_P_Name(), ecorePackage.getEString(), "P_Name", null, 0, 1, PatientDetail.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatientDetail_P_Gender(), ecorePackage.getEString(), "P_Gender", null, 0, 1,
				PatientDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatientDetail_P_Age(), ecorePackage.getEInt(), "P_Age", null, 0, 1, PatientDetail.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatientDetail_Symptoms(), ecorePackage.getEString(), "Symptoms", null, 0, 1,
				PatientDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPatientDetail_Symptomsdataset(), this.getSymptomsDataset(), null, "symptomsdataset", null, 1,
				-1, PatientDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPatientDetail__Submit(), null, "submit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(matchedSymptomEClass, MatchedSymptom.class, "MatchedSymptom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchedSymptom_Ml_algorithm(), this.getML_Algorithm(), this.getML_Algorithm_Matchedsymptom(),
				"ml_algorithm", null, 1, 1, MatchedSymptom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatchedSymptom_Days(), ecorePackage.getEInt(), "Days", null, 0, 1, MatchedSymptom.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMatchedSymptom__Getmatchedsymptoms(), null, "getmatchedsymptoms", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getMatchedSymptom__Submit(), null, "submit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mL_AlgorithmEClass, ML_Algorithm.class, "ML_Algorithm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getML_Algorithm_Matchedsymptom(), this.getMatchedSymptom(),
				this.getMatchedSymptom_Ml_algorithm(), "matchedsymptom", null, 1, -1, ML_Algorithm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getML_Algorithm_Listofdiseases(), this.getListOfDiseases(),
				this.getListOfDiseases_Ml_algorithm(), "listofdiseases", null, 1, -1, ML_Algorithm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getML_Algorithm__Multipletrees(), null, "multipletrees", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listOfDiseasesEClass, ListOfDiseases.class, "ListOfDiseases", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListOfDiseases_Ml_algorithm(), this.getML_Algorithm(), this.getML_Algorithm_Listofdiseases(),
				"ml_algorithm", null, 1, 1, ListOfDiseases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListOfDiseases_Predicteddiseases(), this.getPredictedDiseases(), null, "predicteddiseases",
				null, 1, 1, ListOfDiseases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListOfDiseases_Name(), ecorePackage.getEString(), "name", null, 0, 1, ListOfDiseases.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListOfDiseases_Language(), ecorePackage.getEString(), "language", null, 0, 1,
				ListOfDiseases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getListOfDiseases_Confirmation(), ecorePackage.getEBoolean(), "confirmation", null, 0, 1,
				ListOfDiseases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getListOfDiseases__Getsymptom_details(), null, "getsymptom_details", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(predictedDiseasesEClass, PredictedDiseases.class, "PredictedDiseases", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredictedDiseases_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				PredictedDiseases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredictedDiseases_Consult(), ecorePackage.getEString(), "consult", null, 0, 1,
				PredictedDiseases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPredictedDiseases_Doctorconcultation(), this.getDoctorConcultation(),
				this.getDoctorConcultation_Predicteddiseases(), "doctorconcultation", null, 0, -1,
				PredictedDiseases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPredictedDiseases__Getsymptom_details(), null, "getsymptom_details", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getPredictedDiseases__Getsymptom_precautions(), null, "getsymptom_precautions", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getPredictedDiseases__Seediet_plan(), null, "seediet_plan", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPredictedDiseases__Consult_doctor(), null, "consult_doctor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dietPlanEClass, DietPlan.class, "DietPlan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDietPlan_Name(), ecorePackage.getEString(), "name", null, 0, 1, DietPlan.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietPlan_Nutritionistconsultation(), this.getNutritionistConsultation(),
				this.getNutritionistConsultation_Dietplan(), "nutritionistconsultation", null, 0, -1, DietPlan.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDietPlan__Getdietplan(), null, "getdietplan", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diseasaseDiscriptionDatasetEClass, DiseasaseDiscriptionDataset.class, "DiseasaseDiscriptionDataset",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiseasaseDiscriptionDataset_Listofdiseases(), this.getListOfDiseases(), null,
				"listofdiseases", null, 1, -1, DiseasaseDiscriptionDataset.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDiseasaseDiscriptionDataset__Symptom_details(), null, "symptom_details", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(symptomsDatasetEClass, SymptomsDataset.class, "SymptomsDataset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymptomsDataset_Matchedsymptom(), this.getMatchedSymptom(), null, "matchedsymptom", null, 1,
				-1, SymptomsDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSymptomsDataset__Matchedsymptoms(), null, "matchedsymptoms", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(precautionsDatasetEClass, PrecautionsDataset.class, "PrecautionsDataset", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrecautionsDataset_Predicteddiseases(), this.getPredictedDiseases(), null,
				"predicteddiseases", null, 1, 1, PrecautionsDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPrecautionsDataset__Symptom_precautions(), null, "symptom_precautions", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(random_Forest_TreeEClass, Random_Forest_Tree.class, "Random_Forest_Tree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRandom_Forest_Tree_Ml_algorithm(), this.getML_Algorithm(), null, "ml_algorithm", null, 1, -1,
				Random_Forest_Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EsehatPackageImpl
