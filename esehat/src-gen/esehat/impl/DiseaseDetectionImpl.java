/**
 */
package esehat.impl;

import esehat.DiseaseDetection;
import esehat.EsehatPackage;

import esehat.PatientDetail;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disease Detection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.DiseaseDetectionImpl#getPatientdetail <em>Patientdetail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiseaseDetectionImpl extends MinimalEObjectImpl.Container implements DiseaseDetection {
	/**
	 * The cached value of the '{@link #getPatientdetail() <em>Patientdetail</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientdetail()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientDetail> patientdetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiseaseDetectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.DISEASE_DETECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientDetail> getPatientdetail() {
		if (patientdetail == null) {
			patientdetail = new EObjectResolvingEList<PatientDetail>(PatientDetail.class, this,
					EsehatPackage.DISEASE_DETECTION__PATIENTDETAIL);
		}
		return patientdetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EsehatPackage.DISEASE_DETECTION__PATIENTDETAIL:
			return getPatientdetail();
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
		case EsehatPackage.DISEASE_DETECTION__PATIENTDETAIL:
			getPatientdetail().clear();
			getPatientdetail().addAll((Collection<? extends PatientDetail>) newValue);
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
		case EsehatPackage.DISEASE_DETECTION__PATIENTDETAIL:
			getPatientdetail().clear();
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
		case EsehatPackage.DISEASE_DETECTION__PATIENTDETAIL:
			return patientdetail != null && !patientdetail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiseaseDetectionImpl
