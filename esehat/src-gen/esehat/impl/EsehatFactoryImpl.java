/**
 */
package esehat.impl;

import esehat.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsehatFactoryImpl extends EFactoryImpl implements EsehatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EsehatFactory init() {
		try {
			EsehatFactory theEsehatFactory = (EsehatFactory) EPackage.Registry.INSTANCE
					.getEFactory(EsehatPackage.eNS_URI);
			if (theEsehatFactory != null) {
				return theEsehatFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EsehatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsehatFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EsehatPackage.ESEHAT:
			return createESEHAT();
		case EsehatPackage.NUTRITIONIST_CONSULTATION:
			return createNutritionistConsultation();
		case EsehatPackage.DOCTOR_CONCULTATION:
			return createDoctorConcultation();
		case EsehatPackage.DISEASE_DETECTION:
			return createDiseaseDetection();
		case EsehatPackage.PATIENT_DETAIL:
			return createPatientDetail();
		case EsehatPackage.MATCHED_SYMPTOM:
			return createMatchedSymptom();
		case EsehatPackage.ML_ALGORITHM:
			return createML_Algorithm();
		case EsehatPackage.LIST_OF_DISEASES:
			return createListOfDiseases();
		case EsehatPackage.PREDICTED_DISEASES:
			return createPredictedDiseases();
		case EsehatPackage.DIET_PLAN:
			return createDietPlan();
		case EsehatPackage.DISEASASE_DISCRIPTION_DATASET:
			return createDiseasaseDiscriptionDataset();
		case EsehatPackage.SYMPTOMS_DATASET:
			return createSymptomsDataset();
		case EsehatPackage.PRECAUTIONS_DATASET:
			return createPrecautionsDataset();
		case EsehatPackage.RANDOM_FOREST_TREE:
			return createRandom_Forest_Tree();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESEHAT createESEHAT() {
		ESEHATImpl esehat = new ESEHATImpl();
		return esehat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionistConsultation createNutritionistConsultation() {
		NutritionistConsultationImpl nutritionistConsultation = new NutritionistConsultationImpl();
		return nutritionistConsultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoctorConcultation createDoctorConcultation() {
		DoctorConcultationImpl doctorConcultation = new DoctorConcultationImpl();
		return doctorConcultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseDetection createDiseaseDetection() {
		DiseaseDetectionImpl diseaseDetection = new DiseaseDetectionImpl();
		return diseaseDetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientDetail createPatientDetail() {
		PatientDetailImpl patientDetail = new PatientDetailImpl();
		return patientDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedSymptom createMatchedSymptom() {
		MatchedSymptomImpl matchedSymptom = new MatchedSymptomImpl();
		return matchedSymptom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML_Algorithm createML_Algorithm() {
		ML_AlgorithmImpl mL_Algorithm = new ML_AlgorithmImpl();
		return mL_Algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiseases createListOfDiseases() {
		ListOfDiseasesImpl listOfDiseases = new ListOfDiseasesImpl();
		return listOfDiseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictedDiseases createPredictedDiseases() {
		PredictedDiseasesImpl predictedDiseases = new PredictedDiseasesImpl();
		return predictedDiseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DietPlan createDietPlan() {
		DietPlanImpl dietPlan = new DietPlanImpl();
		return dietPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseasaseDiscriptionDataset createDiseasaseDiscriptionDataset() {
		DiseasaseDiscriptionDatasetImpl diseasaseDiscriptionDataset = new DiseasaseDiscriptionDatasetImpl();
		return diseasaseDiscriptionDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymptomsDataset createSymptomsDataset() {
		SymptomsDatasetImpl symptomsDataset = new SymptomsDatasetImpl();
		return symptomsDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecautionsDataset createPrecautionsDataset() {
		PrecautionsDatasetImpl precautionsDataset = new PrecautionsDatasetImpl();
		return precautionsDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Random_Forest_Tree createRandom_Forest_Tree() {
		Random_Forest_TreeImpl random_Forest_Tree = new Random_Forest_TreeImpl();
		return random_Forest_Tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsehatPackage getEsehatPackage() {
		return (EsehatPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EsehatPackage getPackage() {
		return EsehatPackage.eINSTANCE;
	}

} //EsehatFactoryImpl
