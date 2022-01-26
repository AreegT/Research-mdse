/**
 */
package esehat.impl;

import esehat.DoctorConcultation;
import esehat.EsehatPackage;
import esehat.PredictedDiseases;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicted Diseases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.PredictedDiseasesImpl#getName <em>Name</em>}</li>
 *   <li>{@link esehat.impl.PredictedDiseasesImpl#getConsult <em>Consult</em>}</li>
 *   <li>{@link esehat.impl.PredictedDiseasesImpl#getDoctorconcultation <em>Doctorconcultation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictedDiseasesImpl extends MinimalEObjectImpl.Container implements PredictedDiseases {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsult() <em>Consult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsult()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsult() <em>Consult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsult()
	 * @generated
	 * @ordered
	 */
	protected String consult = CONSULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDoctorconcultation() <em>Doctorconcultation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctorconcultation()
	 * @generated
	 * @ordered
	 */
	protected EList<DoctorConcultation> doctorconcultation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredictedDiseasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.PREDICTED_DISEASES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.PREDICTED_DISEASES__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsult() {
		return consult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsult(String newConsult) {
		String oldConsult = consult;
		consult = newConsult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.PREDICTED_DISEASES__CONSULT, oldConsult,
					consult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DoctorConcultation> getDoctorconcultation() {
		if (doctorconcultation == null) {
			doctorconcultation = new EObjectWithInverseResolvingEList<DoctorConcultation>(DoctorConcultation.class,
					this, EsehatPackage.PREDICTED_DISEASES__DOCTORCONCULTATION,
					EsehatPackage.DOCTOR_CONCULTATION__PREDICTEDDISEASES);
		}
		return doctorconcultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getsymptom_details() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getsymptom_precautions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void seediet_plan() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void consult_doctor() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsehatPackage.PREDICTED_DISEASES__DOCTORCONCULTATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDoctorconcultation()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsehatPackage.PREDICTED_DISEASES__DOCTORCONCULTATION:
			return ((InternalEList<?>) getDoctorconcultation()).basicRemove(otherEnd, msgs);
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
		case EsehatPackage.PREDICTED_DISEASES__NAME:
			return getName();
		case EsehatPackage.PREDICTED_DISEASES__CONSULT:
			return getConsult();
		case EsehatPackage.PREDICTED_DISEASES__DOCTORCONCULTATION:
			return getDoctorconcultation();
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
		case EsehatPackage.PREDICTED_DISEASES__NAME:
			setName((String) newValue);
			return;
		case EsehatPackage.PREDICTED_DISEASES__CONSULT:
			setConsult((String) newValue);
			return;
		case EsehatPackage.PREDICTED_DISEASES__DOCTORCONCULTATION:
			getDoctorconcultation().clear();
			getDoctorconcultation().addAll((Collection<? extends DoctorConcultation>) newValue);
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
		case EsehatPackage.PREDICTED_DISEASES__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EsehatPackage.PREDICTED_DISEASES__CONSULT:
			setConsult(CONSULT_EDEFAULT);
			return;
		case EsehatPackage.PREDICTED_DISEASES__DOCTORCONCULTATION:
			getDoctorconcultation().clear();
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
		case EsehatPackage.PREDICTED_DISEASES__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EsehatPackage.PREDICTED_DISEASES__CONSULT:
			return CONSULT_EDEFAULT == null ? consult != null : !CONSULT_EDEFAULT.equals(consult);
		case EsehatPackage.PREDICTED_DISEASES__DOCTORCONCULTATION:
			return doctorconcultation != null && !doctorconcultation.isEmpty();
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
		case EsehatPackage.PREDICTED_DISEASES___GETSYMPTOM_DETAILS:
			getsymptom_details();
			return null;
		case EsehatPackage.PREDICTED_DISEASES___GETSYMPTOM_PRECAUTIONS:
			getsymptom_precautions();
			return null;
		case EsehatPackage.PREDICTED_DISEASES___SEEDIET_PLAN:
			seediet_plan();
			return null;
		case EsehatPackage.PREDICTED_DISEASES___CONSULT_DOCTOR:
			consult_doctor();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", consult: ");
		result.append(consult);
		result.append(')');
		return result.toString();
	}

} //PredictedDiseasesImpl
