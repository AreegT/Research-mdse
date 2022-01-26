/**
 */
package esehat.util;

import esehat.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see esehat.EsehatPackage
 * @generated
 */
public class EsehatSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EsehatPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsehatSwitch() {
		if (modelPackage == null) {
			modelPackage = EsehatPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EsehatPackage.ESEHAT: {
			ESEHAT esehat = (ESEHAT) theEObject;
			T result = caseESEHAT(esehat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.NUTRITIONIST_CONSULTATION: {
			NutritionistConsultation nutritionistConsultation = (NutritionistConsultation) theEObject;
			T result = caseNutritionistConsultation(nutritionistConsultation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.DOCTOR_CONCULTATION: {
			DoctorConcultation doctorConcultation = (DoctorConcultation) theEObject;
			T result = caseDoctorConcultation(doctorConcultation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.DISEASE_DETECTION: {
			DiseaseDetection diseaseDetection = (DiseaseDetection) theEObject;
			T result = caseDiseaseDetection(diseaseDetection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.PATIENT_DETAIL: {
			PatientDetail patientDetail = (PatientDetail) theEObject;
			T result = casePatientDetail(patientDetail);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.MATCHED_SYMPTOM: {
			MatchedSymptom matchedSymptom = (MatchedSymptom) theEObject;
			T result = caseMatchedSymptom(matchedSymptom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.ML_ALGORITHM: {
			ML_Algorithm mL_Algorithm = (ML_Algorithm) theEObject;
			T result = caseML_Algorithm(mL_Algorithm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.LIST_OF_DISEASES: {
			ListOfDiseases listOfDiseases = (ListOfDiseases) theEObject;
			T result = caseListOfDiseases(listOfDiseases);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.PREDICTED_DISEASES: {
			PredictedDiseases predictedDiseases = (PredictedDiseases) theEObject;
			T result = casePredictedDiseases(predictedDiseases);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.DIET_PLAN: {
			DietPlan dietPlan = (DietPlan) theEObject;
			T result = caseDietPlan(dietPlan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.DISEASASE_DISCRIPTION_DATASET: {
			DiseasaseDiscriptionDataset diseasaseDiscriptionDataset = (DiseasaseDiscriptionDataset) theEObject;
			T result = caseDiseasaseDiscriptionDataset(diseasaseDiscriptionDataset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.SYMPTOMS_DATASET: {
			SymptomsDataset symptomsDataset = (SymptomsDataset) theEObject;
			T result = caseSymptomsDataset(symptomsDataset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.PRECAUTIONS_DATASET: {
			PrecautionsDataset precautionsDataset = (PrecautionsDataset) theEObject;
			T result = casePrecautionsDataset(precautionsDataset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EsehatPackage.RANDOM_FOREST_TREE: {
			Random_Forest_Tree random_Forest_Tree = (Random_Forest_Tree) theEObject;
			T result = caseRandom_Forest_Tree(random_Forest_Tree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESEHAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESEHAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESEHAT(ESEHAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutritionist Consultation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutritionist Consultation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionistConsultation(NutritionistConsultation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doctor Concultation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doctor Concultation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoctorConcultation(DoctorConcultation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease Detection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease Detection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiseaseDetection(DiseaseDetection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientDetail(PatientDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matched Symptom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matched Symptom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchedSymptom(MatchedSymptom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseML_Algorithm(ML_Algorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Diseases</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Diseases</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDiseases(ListOfDiseases object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicted Diseases</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicted Diseases</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredictedDiseases(PredictedDiseases object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diet Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diet Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDietPlan(DietPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diseasase Discription Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diseasase Discription Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiseasaseDiscriptionDataset(DiseasaseDiscriptionDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symptoms Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symptoms Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymptomsDataset(SymptomsDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precautions Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precautions Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecautionsDataset(PrecautionsDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Forest Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Forest Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandom_Forest_Tree(Random_Forest_Tree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EsehatSwitch
