/**
 */
package esehat.util;

import esehat.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see esehat.EsehatPackage
 * @generated
 */
public class EsehatAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EsehatPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsehatAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EsehatPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsehatSwitch<Adapter> modelSwitch = new EsehatSwitch<Adapter>() {
		@Override
		public Adapter caseESEHAT(ESEHAT object) {
			return createESEHATAdapter();
		}

		@Override
		public Adapter caseNutritionistConsultation(NutritionistConsultation object) {
			return createNutritionistConsultationAdapter();
		}

		@Override
		public Adapter caseDoctorConcultation(DoctorConcultation object) {
			return createDoctorConcultationAdapter();
		}

		@Override
		public Adapter caseDiseaseDetection(DiseaseDetection object) {
			return createDiseaseDetectionAdapter();
		}

		@Override
		public Adapter casePatientDetail(PatientDetail object) {
			return createPatientDetailAdapter();
		}

		@Override
		public Adapter caseMatchedSymptom(MatchedSymptom object) {
			return createMatchedSymptomAdapter();
		}

		@Override
		public Adapter caseML_Algorithm(ML_Algorithm object) {
			return createML_AlgorithmAdapter();
		}

		@Override
		public Adapter caseListOfDiseases(ListOfDiseases object) {
			return createListOfDiseasesAdapter();
		}

		@Override
		public Adapter casePredictedDiseases(PredictedDiseases object) {
			return createPredictedDiseasesAdapter();
		}

		@Override
		public Adapter caseDietPlan(DietPlan object) {
			return createDietPlanAdapter();
		}

		@Override
		public Adapter caseDiseasaseDiscriptionDataset(DiseasaseDiscriptionDataset object) {
			return createDiseasaseDiscriptionDatasetAdapter();
		}

		@Override
		public Adapter caseSymptomsDataset(SymptomsDataset object) {
			return createSymptomsDatasetAdapter();
		}

		@Override
		public Adapter casePrecautionsDataset(PrecautionsDataset object) {
			return createPrecautionsDatasetAdapter();
		}

		@Override
		public Adapter caseRandom_Forest_Tree(Random_Forest_Tree object) {
			return createRandom_Forest_TreeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.ESEHAT <em>ESEHAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.ESEHAT
	 * @generated
	 */
	public Adapter createESEHATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.NutritionistConsultation <em>Nutritionist Consultation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.NutritionistConsultation
	 * @generated
	 */
	public Adapter createNutritionistConsultationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.DoctorConcultation <em>Doctor Concultation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.DoctorConcultation
	 * @generated
	 */
	public Adapter createDoctorConcultationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.DiseaseDetection <em>Disease Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.DiseaseDetection
	 * @generated
	 */
	public Adapter createDiseaseDetectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.PatientDetail <em>Patient Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.PatientDetail
	 * @generated
	 */
	public Adapter createPatientDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.MatchedSymptom <em>Matched Symptom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.MatchedSymptom
	 * @generated
	 */
	public Adapter createMatchedSymptomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.ML_Algorithm <em>ML Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.ML_Algorithm
	 * @generated
	 */
	public Adapter createML_AlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.ListOfDiseases <em>List Of Diseases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.ListOfDiseases
	 * @generated
	 */
	public Adapter createListOfDiseasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.PredictedDiseases <em>Predicted Diseases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.PredictedDiseases
	 * @generated
	 */
	public Adapter createPredictedDiseasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.DietPlan <em>Diet Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.DietPlan
	 * @generated
	 */
	public Adapter createDietPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.DiseasaseDiscriptionDataset <em>Diseasase Discription Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.DiseasaseDiscriptionDataset
	 * @generated
	 */
	public Adapter createDiseasaseDiscriptionDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.SymptomsDataset <em>Symptoms Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.SymptomsDataset
	 * @generated
	 */
	public Adapter createSymptomsDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.PrecautionsDataset <em>Precautions Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.PrecautionsDataset
	 * @generated
	 */
	public Adapter createPrecautionsDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link esehat.Random_Forest_Tree <em>Random Forest Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see esehat.Random_Forest_Tree
	 * @generated
	 */
	public Adapter createRandom_Forest_TreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EsehatAdapterFactory
