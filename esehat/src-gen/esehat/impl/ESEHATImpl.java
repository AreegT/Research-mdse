/**
 */
package esehat.impl;

import esehat.DietPlan;
import esehat.DiseasaseDiscriptionDataset;
import esehat.DiseaseDetection;
import esehat.DoctorConcultation;
import esehat.ESEHAT;
import esehat.EsehatPackage;
import esehat.ListOfDiseases;
import esehat.ML_Algorithm;
import esehat.MatchedSymptom;
import esehat.NutritionistConsultation;
import esehat.PatientDetail;
import esehat.PrecautionsDataset;
import esehat.PredictedDiseases;
import esehat.SymptomsDataset;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESEHAT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.ESEHATImpl#getDoctorconcultation <em>Doctorconcultation</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getNutritionistconsultation <em>Nutritionistconsultation</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getDiseasedetection <em>Diseasedetection</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getSymptomsdataset <em>Symptomsdataset</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getPatientdetail <em>Patientdetail</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getListofdiseases <em>Listofdiseases</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getMl_algorithm <em>Ml algorithm</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getMatchedsymptom <em>Matchedsymptom</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getDietplan <em>Dietplan</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getPredicteddiseases <em>Predicteddiseases</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getPrecautionsdataset <em>Precautionsdataset</em>}</li>
 *   <li>{@link esehat.impl.ESEHATImpl#getDiseasasediscriptiondataset <em>Diseasasediscriptiondataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESEHATImpl extends MinimalEObjectImpl.Container implements ESEHAT {
	/**
	 * The cached value of the '{@link #getDoctorconcultation() <em>Doctorconcultation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctorconcultation()
	 * @generated
	 * @ordered
	 */
	protected EList<DoctorConcultation> doctorconcultation;

	/**
	 * The cached value of the '{@link #getNutritionistconsultation() <em>Nutritionistconsultation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionistconsultation()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionistConsultation> nutritionistconsultation;

	/**
	 * The cached value of the '{@link #getDiseasedetection() <em>Diseasedetection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseasedetection()
	 * @generated
	 * @ordered
	 */
	protected EList<DiseaseDetection> diseasedetection;

	/**
	 * The cached value of the '{@link #getSymptomsdataset() <em>Symptomsdataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptomsdataset()
	 * @generated
	 * @ordered
	 */
	protected EList<SymptomsDataset> symptomsdataset;

	/**
	 * The cached value of the '{@link #getPatientdetail() <em>Patientdetail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientdetail()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientDetail> patientdetail;

	/**
	 * The cached value of the '{@link #getListofdiseases() <em>Listofdiseases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListofdiseases()
	 * @generated
	 * @ordered
	 */
	protected EList<ListOfDiseases> listofdiseases;

	/**
	 * The cached value of the '{@link #getMl_algorithm() <em>Ml algorithm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMl_algorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<ML_Algorithm> ml_algorithm;

	/**
	 * The cached value of the '{@link #getMatchedsymptom() <em>Matchedsymptom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedsymptom()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchedSymptom> matchedsymptom;

	/**
	 * The cached value of the '{@link #getDietplan() <em>Dietplan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDietplan()
	 * @generated
	 * @ordered
	 */
	protected EList<DietPlan> dietplan;

	/**
	 * The cached value of the '{@link #getPredicteddiseases() <em>Predicteddiseases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicteddiseases()
	 * @generated
	 * @ordered
	 */
	protected EList<PredictedDiseases> predicteddiseases;

	/**
	 * The cached value of the '{@link #getPrecautionsdataset() <em>Precautionsdataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecautionsdataset()
	 * @generated
	 * @ordered
	 */
	protected EList<PrecautionsDataset> precautionsdataset;

	/**
	 * The cached value of the '{@link #getDiseasasediscriptiondataset() <em>Diseasasediscriptiondataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseasasediscriptiondataset()
	 * @generated
	 * @ordered
	 */
	protected EList<DiseasaseDiscriptionDataset> diseasasediscriptiondataset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESEHATImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.ESEHAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DoctorConcultation> getDoctorconcultation() {
		if (doctorconcultation == null) {
			doctorconcultation = new EObjectContainmentEList<DoctorConcultation>(DoctorConcultation.class, this,
					EsehatPackage.ESEHAT__DOCTORCONCULTATION);
		}
		return doctorconcultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionistConsultation> getNutritionistconsultation() {
		if (nutritionistconsultation == null) {
			nutritionistconsultation = new EObjectContainmentEList<NutritionistConsultation>(
					NutritionistConsultation.class, this, EsehatPackage.ESEHAT__NUTRITIONISTCONSULTATION);
		}
		return nutritionistconsultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiseaseDetection> getDiseasedetection() {
		if (diseasedetection == null) {
			diseasedetection = new EObjectContainmentEList<DiseaseDetection>(DiseaseDetection.class, this,
					EsehatPackage.ESEHAT__DISEASEDETECTION);
		}
		return diseasedetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SymptomsDataset> getSymptomsdataset() {
		if (symptomsdataset == null) {
			symptomsdataset = new EObjectContainmentEList<SymptomsDataset>(SymptomsDataset.class, this,
					EsehatPackage.ESEHAT__SYMPTOMSDATASET);
		}
		return symptomsdataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientDetail> getPatientdetail() {
		if (patientdetail == null) {
			patientdetail = new EObjectContainmentEList<PatientDetail>(PatientDetail.class, this,
					EsehatPackage.ESEHAT__PATIENTDETAIL);
		}
		return patientdetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListOfDiseases> getListofdiseases() {
		if (listofdiseases == null) {
			listofdiseases = new EObjectContainmentEList<ListOfDiseases>(ListOfDiseases.class, this,
					EsehatPackage.ESEHAT__LISTOFDISEASES);
		}
		return listofdiseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ML_Algorithm> getMl_algorithm() {
		if (ml_algorithm == null) {
			ml_algorithm = new EObjectContainmentEList<ML_Algorithm>(ML_Algorithm.class, this,
					EsehatPackage.ESEHAT__ML_ALGORITHM);
		}
		return ml_algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchedSymptom> getMatchedsymptom() {
		if (matchedsymptom == null) {
			matchedsymptom = new EObjectContainmentEList<MatchedSymptom>(MatchedSymptom.class, this,
					EsehatPackage.ESEHAT__MATCHEDSYMPTOM);
		}
		return matchedsymptom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DietPlan> getDietplan() {
		if (dietplan == null) {
			dietplan = new EObjectContainmentEList<DietPlan>(DietPlan.class, this, EsehatPackage.ESEHAT__DIETPLAN);
		}
		return dietplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PredictedDiseases> getPredicteddiseases() {
		if (predicteddiseases == null) {
			predicteddiseases = new EObjectContainmentEList<PredictedDiseases>(PredictedDiseases.class, this,
					EsehatPackage.ESEHAT__PREDICTEDDISEASES);
		}
		return predicteddiseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrecautionsDataset> getPrecautionsdataset() {
		if (precautionsdataset == null) {
			precautionsdataset = new EObjectContainmentEList<PrecautionsDataset>(PrecautionsDataset.class, this,
					EsehatPackage.ESEHAT__PRECAUTIONSDATASET);
		}
		return precautionsdataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiseasaseDiscriptionDataset> getDiseasasediscriptiondataset() {
		if (diseasasediscriptiondataset == null) {
			diseasasediscriptiondataset = new EObjectContainmentEList<DiseasaseDiscriptionDataset>(
					DiseasaseDiscriptionDataset.class, this, EsehatPackage.ESEHAT__DISEASASEDISCRIPTIONDATASET);
		}
		return diseasasediscriptiondataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsehatPackage.ESEHAT__DOCTORCONCULTATION:
			return ((InternalEList<?>) getDoctorconcultation()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__NUTRITIONISTCONSULTATION:
			return ((InternalEList<?>) getNutritionistconsultation()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__DISEASEDETECTION:
			return ((InternalEList<?>) getDiseasedetection()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__SYMPTOMSDATASET:
			return ((InternalEList<?>) getSymptomsdataset()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__PATIENTDETAIL:
			return ((InternalEList<?>) getPatientdetail()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__LISTOFDISEASES:
			return ((InternalEList<?>) getListofdiseases()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__ML_ALGORITHM:
			return ((InternalEList<?>) getMl_algorithm()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__MATCHEDSYMPTOM:
			return ((InternalEList<?>) getMatchedsymptom()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__DIETPLAN:
			return ((InternalEList<?>) getDietplan()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__PREDICTEDDISEASES:
			return ((InternalEList<?>) getPredicteddiseases()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__PRECAUTIONSDATASET:
			return ((InternalEList<?>) getPrecautionsdataset()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ESEHAT__DISEASASEDISCRIPTIONDATASET:
			return ((InternalEList<?>) getDiseasasediscriptiondataset()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EsehatPackage.ESEHAT__DOCTORCONCULTATION:
			return getDoctorconcultation();
		case EsehatPackage.ESEHAT__NUTRITIONISTCONSULTATION:
			return getNutritionistconsultation();
		case EsehatPackage.ESEHAT__DISEASEDETECTION:
			return getDiseasedetection();
		case EsehatPackage.ESEHAT__SYMPTOMSDATASET:
			return getSymptomsdataset();
		case EsehatPackage.ESEHAT__PATIENTDETAIL:
			return getPatientdetail();
		case EsehatPackage.ESEHAT__LISTOFDISEASES:
			return getListofdiseases();
		case EsehatPackage.ESEHAT__ML_ALGORITHM:
			return getMl_algorithm();
		case EsehatPackage.ESEHAT__MATCHEDSYMPTOM:
			return getMatchedsymptom();
		case EsehatPackage.ESEHAT__DIETPLAN:
			return getDietplan();
		case EsehatPackage.ESEHAT__PREDICTEDDISEASES:
			return getPredicteddiseases();
		case EsehatPackage.ESEHAT__PRECAUTIONSDATASET:
			return getPrecautionsdataset();
		case EsehatPackage.ESEHAT__DISEASASEDISCRIPTIONDATASET:
			return getDiseasasediscriptiondataset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EsehatPackage.ESEHAT__DOCTORCONCULTATION:
			getDoctorconcultation().clear();
			getDoctorconcultation().addAll((Collection<? extends DoctorConcultation>) newValue);
			return;
		case EsehatPackage.ESEHAT__NUTRITIONISTCONSULTATION:
			getNutritionistconsultation().clear();
			getNutritionistconsultation().addAll((Collection<? extends NutritionistConsultation>) newValue);
			return;
		case EsehatPackage.ESEHAT__DISEASEDETECTION:
			getDiseasedetection().clear();
			getDiseasedetection().addAll((Collection<? extends DiseaseDetection>) newValue);
			return;
		case EsehatPackage.ESEHAT__SYMPTOMSDATASET:
			getSymptomsdataset().clear();
			getSymptomsdataset().addAll((Collection<? extends SymptomsDataset>) newValue);
			return;
		case EsehatPackage.ESEHAT__PATIENTDETAIL:
			getPatientdetail().clear();
			getPatientdetail().addAll((Collection<? extends PatientDetail>) newValue);
			return;
		case EsehatPackage.ESEHAT__LISTOFDISEASES:
			getListofdiseases().clear();
			getListofdiseases().addAll((Collection<? extends ListOfDiseases>) newValue);
			return;
		case EsehatPackage.ESEHAT__ML_ALGORITHM:
			getMl_algorithm().clear();
			getMl_algorithm().addAll((Collection<? extends ML_Algorithm>) newValue);
			return;
		case EsehatPackage.ESEHAT__MATCHEDSYMPTOM:
			getMatchedsymptom().clear();
			getMatchedsymptom().addAll((Collection<? extends MatchedSymptom>) newValue);
			return;
		case EsehatPackage.ESEHAT__DIETPLAN:
			getDietplan().clear();
			getDietplan().addAll((Collection<? extends DietPlan>) newValue);
			return;
		case EsehatPackage.ESEHAT__PREDICTEDDISEASES:
			getPredicteddiseases().clear();
			getPredicteddiseases().addAll((Collection<? extends PredictedDiseases>) newValue);
			return;
		case EsehatPackage.ESEHAT__PRECAUTIONSDATASET:
			getPrecautionsdataset().clear();
			getPrecautionsdataset().addAll((Collection<? extends PrecautionsDataset>) newValue);
			return;
		case EsehatPackage.ESEHAT__DISEASASEDISCRIPTIONDATASET:
			getDiseasasediscriptiondataset().clear();
			getDiseasasediscriptiondataset().addAll((Collection<? extends DiseasaseDiscriptionDataset>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EsehatPackage.ESEHAT__DOCTORCONCULTATION:
			getDoctorconcultation().clear();
			return;
		case EsehatPackage.ESEHAT__NUTRITIONISTCONSULTATION:
			getNutritionistconsultation().clear();
			return;
		case EsehatPackage.ESEHAT__DISEASEDETECTION:
			getDiseasedetection().clear();
			return;
		case EsehatPackage.ESEHAT__SYMPTOMSDATASET:
			getSymptomsdataset().clear();
			return;
		case EsehatPackage.ESEHAT__PATIENTDETAIL:
			getPatientdetail().clear();
			return;
		case EsehatPackage.ESEHAT__LISTOFDISEASES:
			getListofdiseases().clear();
			return;
		case EsehatPackage.ESEHAT__ML_ALGORITHM:
			getMl_algorithm().clear();
			return;
		case EsehatPackage.ESEHAT__MATCHEDSYMPTOM:
			getMatchedsymptom().clear();
			return;
		case EsehatPackage.ESEHAT__DIETPLAN:
			getDietplan().clear();
			return;
		case EsehatPackage.ESEHAT__PREDICTEDDISEASES:
			getPredicteddiseases().clear();
			return;
		case EsehatPackage.ESEHAT__PRECAUTIONSDATASET:
			getPrecautionsdataset().clear();
			return;
		case EsehatPackage.ESEHAT__DISEASASEDISCRIPTIONDATASET:
			getDiseasasediscriptiondataset().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EsehatPackage.ESEHAT__DOCTORCONCULTATION:
			return doctorconcultation != null && !doctorconcultation.isEmpty();
		case EsehatPackage.ESEHAT__NUTRITIONISTCONSULTATION:
			return nutritionistconsultation != null && !nutritionistconsultation.isEmpty();
		case EsehatPackage.ESEHAT__DISEASEDETECTION:
			return diseasedetection != null && !diseasedetection.isEmpty();
		case EsehatPackage.ESEHAT__SYMPTOMSDATASET:
			return symptomsdataset != null && !symptomsdataset.isEmpty();
		case EsehatPackage.ESEHAT__PATIENTDETAIL:
			return patientdetail != null && !patientdetail.isEmpty();
		case EsehatPackage.ESEHAT__LISTOFDISEASES:
			return listofdiseases != null && !listofdiseases.isEmpty();
		case EsehatPackage.ESEHAT__ML_ALGORITHM:
			return ml_algorithm != null && !ml_algorithm.isEmpty();
		case EsehatPackage.ESEHAT__MATCHEDSYMPTOM:
			return matchedsymptom != null && !matchedsymptom.isEmpty();
		case EsehatPackage.ESEHAT__DIETPLAN:
			return dietplan != null && !dietplan.isEmpty();
		case EsehatPackage.ESEHAT__PREDICTEDDISEASES:
			return predicteddiseases != null && !predicteddiseases.isEmpty();
		case EsehatPackage.ESEHAT__PRECAUTIONSDATASET:
			return precautionsdataset != null && !precautionsdataset.isEmpty();
		case EsehatPackage.ESEHAT__DISEASASEDISCRIPTIONDATASET:
			return diseasasediscriptiondataset != null && !diseasasediscriptiondataset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ESEHATImpl
