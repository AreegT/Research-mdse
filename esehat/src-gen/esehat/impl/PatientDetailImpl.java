/**
 */
package esehat.impl;

import esehat.EsehatPackage;
import esehat.PatientDetail;
import esehat.SymptomsDataset;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.PatientDetailImpl#getP_Name <em>PName</em>}</li>
 *   <li>{@link esehat.impl.PatientDetailImpl#getP_Gender <em>PGender</em>}</li>
 *   <li>{@link esehat.impl.PatientDetailImpl#getP_Age <em>PAge</em>}</li>
 *   <li>{@link esehat.impl.PatientDetailImpl#getSymptoms <em>Symptoms</em>}</li>
 *   <li>{@link esehat.impl.PatientDetailImpl#getSymptomsdataset <em>Symptomsdataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientDetailImpl extends MinimalEObjectImpl.Container implements PatientDetail {
	/**
	 * The default value of the '{@link #getP_Name() <em>PName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Name()
	 * @generated
	 * @ordered
	 */
	protected static final String PNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getP_Name() <em>PName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Name()
	 * @generated
	 * @ordered
	 */
	protected String p_Name = PNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getP_Gender() <em>PGender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Gender()
	 * @generated
	 * @ordered
	 */
	protected static final String PGENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getP_Gender() <em>PGender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Gender()
	 * @generated
	 * @ordered
	 */
	protected String p_Gender = PGENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getP_Age() <em>PAge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Age()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getP_Age() <em>PAge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Age()
	 * @generated
	 * @ordered
	 */
	protected int p_Age = PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymptoms() <em>Symptoms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptoms()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMPTOMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymptoms() <em>Symptoms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptoms()
	 * @generated
	 * @ordered
	 */
	protected String symptoms = SYMPTOMS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSymptomsdataset() <em>Symptomsdataset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptomsdataset()
	 * @generated
	 * @ordered
	 */
	protected EList<SymptomsDataset> symptomsdataset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.PATIENT_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getP_Name() {
		return p_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP_Name(String newP_Name) {
		String oldP_Name = p_Name;
		p_Name = newP_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.PATIENT_DETAIL__PNAME, oldP_Name,
					p_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getP_Gender() {
		return p_Gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP_Gender(String newP_Gender) {
		String oldP_Gender = p_Gender;
		p_Gender = newP_Gender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.PATIENT_DETAIL__PGENDER, oldP_Gender,
					p_Gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getP_Age() {
		return p_Age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP_Age(int newP_Age) {
		int oldP_Age = p_Age;
		p_Age = newP_Age;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.PATIENT_DETAIL__PAGE, oldP_Age, p_Age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymptoms() {
		return symptoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymptoms(String newSymptoms) {
		String oldSymptoms = symptoms;
		symptoms = newSymptoms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.PATIENT_DETAIL__SYMPTOMS, oldSymptoms,
					symptoms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SymptomsDataset> getSymptomsdataset() {
		if (symptomsdataset == null) {
			symptomsdataset = new EObjectResolvingEList<SymptomsDataset>(SymptomsDataset.class, this,
					EsehatPackage.PATIENT_DETAIL__SYMPTOMSDATASET);
		}
		return symptomsdataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void submit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EsehatPackage.PATIENT_DETAIL__PNAME:
			return getP_Name();
		case EsehatPackage.PATIENT_DETAIL__PGENDER:
			return getP_Gender();
		case EsehatPackage.PATIENT_DETAIL__PAGE:
			return getP_Age();
		case EsehatPackage.PATIENT_DETAIL__SYMPTOMS:
			return getSymptoms();
		case EsehatPackage.PATIENT_DETAIL__SYMPTOMSDATASET:
			return getSymptomsdataset();
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
		case EsehatPackage.PATIENT_DETAIL__PNAME:
			setP_Name((String) newValue);
			return;
		case EsehatPackage.PATIENT_DETAIL__PGENDER:
			setP_Gender((String) newValue);
			return;
		case EsehatPackage.PATIENT_DETAIL__PAGE:
			setP_Age((Integer) newValue);
			return;
		case EsehatPackage.PATIENT_DETAIL__SYMPTOMS:
			setSymptoms((String) newValue);
			return;
		case EsehatPackage.PATIENT_DETAIL__SYMPTOMSDATASET:
			getSymptomsdataset().clear();
			getSymptomsdataset().addAll((Collection<? extends SymptomsDataset>) newValue);
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
		case EsehatPackage.PATIENT_DETAIL__PNAME:
			setP_Name(PNAME_EDEFAULT);
			return;
		case EsehatPackage.PATIENT_DETAIL__PGENDER:
			setP_Gender(PGENDER_EDEFAULT);
			return;
		case EsehatPackage.PATIENT_DETAIL__PAGE:
			setP_Age(PAGE_EDEFAULT);
			return;
		case EsehatPackage.PATIENT_DETAIL__SYMPTOMS:
			setSymptoms(SYMPTOMS_EDEFAULT);
			return;
		case EsehatPackage.PATIENT_DETAIL__SYMPTOMSDATASET:
			getSymptomsdataset().clear();
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
		case EsehatPackage.PATIENT_DETAIL__PNAME:
			return PNAME_EDEFAULT == null ? p_Name != null : !PNAME_EDEFAULT.equals(p_Name);
		case EsehatPackage.PATIENT_DETAIL__PGENDER:
			return PGENDER_EDEFAULT == null ? p_Gender != null : !PGENDER_EDEFAULT.equals(p_Gender);
		case EsehatPackage.PATIENT_DETAIL__PAGE:
			return p_Age != PAGE_EDEFAULT;
		case EsehatPackage.PATIENT_DETAIL__SYMPTOMS:
			return SYMPTOMS_EDEFAULT == null ? symptoms != null : !SYMPTOMS_EDEFAULT.equals(symptoms);
		case EsehatPackage.PATIENT_DETAIL__SYMPTOMSDATASET:
			return symptomsdataset != null && !symptomsdataset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case EsehatPackage.PATIENT_DETAIL___SUBMIT:
			submit();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (P_Name: ");
		result.append(p_Name);
		result.append(", P_Gender: ");
		result.append(p_Gender);
		result.append(", P_Age: ");
		result.append(p_Age);
		result.append(", Symptoms: ");
		result.append(symptoms);
		result.append(')');
		return result.toString();
	}

} //PatientDetailImpl
