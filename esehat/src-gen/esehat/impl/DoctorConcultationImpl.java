/**
 */
package esehat.impl;

import esehat.DoctorConcultation;
import esehat.EsehatPackage;
import esehat.PredictedDiseases;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doctor Concultation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.DoctorConcultationImpl#getName <em>Name</em>}</li>
 *   <li>{@link esehat.impl.DoctorConcultationImpl#getPredicteddiseases <em>Predicteddiseases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoctorConcultationImpl extends MinimalEObjectImpl.Container implements DoctorConcultation {
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
	 * The cached value of the '{@link #getPredicteddiseases() <em>Predicteddiseases</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicteddiseases()
	 * @generated
	 * @ordered
	 */
	protected PredictedDiseases predicteddiseases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorConcultationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.DOCTOR_CONCULTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.DOCTOR_CONCULTATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictedDiseases getPredicteddiseases() {
		if (predicteddiseases != null && predicteddiseases.eIsProxy()) {
			InternalEObject oldPredicteddiseases = (InternalEObject) predicteddiseases;
			predicteddiseases = (PredictedDiseases) eResolveProxy(oldPredicteddiseases);
			if (predicteddiseases != oldPredicteddiseases) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EsehatPackage.DOCTOR_CONCULTATION__PREDICTEDDISEASES, oldPredicteddiseases,
							predicteddiseases));
			}
		}
		return predicteddiseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictedDiseases basicGetPredicteddiseases() {
		return predicteddiseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicteddiseases(PredictedDiseases newPredicteddiseases, NotificationChain msgs) {
		PredictedDiseases oldPredicteddiseases = predicteddiseases;
		predicteddiseases = newPredicteddiseases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EsehatPackage.DOCTOR_CONCULTATION__PREDICTEDDISEASES, oldPredicteddiseases, newPredicteddiseases);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicteddiseases(PredictedDiseases newPredicteddiseases) {
		if (newPredicteddiseases != predicteddiseases) {
			NotificationChain msgs = null;
			if (predicteddiseases != null)
				msgs = ((InternalEObject) predicteddiseases).eInverseRemove(this,
						EsehatPackage.PREDICTED_DISEASES__DOCTORCONCULTATION, PredictedDiseases.class, msgs);
			if (newPredicteddiseases != null)
				msgs = ((InternalEObject) newPredicteddiseases).eInverseAdd(this,
						EsehatPackage.PREDICTED_DISEASES__DOCTORCONCULTATION, PredictedDiseases.class, msgs);
			msgs = basicSetPredicteddiseases(newPredicteddiseases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.DOCTOR_CONCULTATION__PREDICTEDDISEASES,
					newPredicteddiseases, newPredicteddiseases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsehatPackage.DOCTOR_CONCULTATION__PREDICTEDDISEASES:
			if (predicteddiseases != null)
				msgs = ((InternalEObject) predicteddiseases).eInverseRemove(this,
						EsehatPackage.PREDICTED_DISEASES__DOCTORCONCULTATION, PredictedDiseases.class, msgs);
			return basicSetPredicteddiseases((PredictedDiseases) otherEnd, msgs);
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
		case EsehatPackage.DOCTOR_CONCULTATION__PREDICTEDDISEASES:
			return basicSetPredicteddiseases(null, msgs);
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
		case EsehatPackage.DOCTOR_CONCULTATION__NAME:
			return getName();
		case EsehatPackage.DOCTOR_CONCULTATION__PREDICTEDDISEASES:
			if (resolve)
				return getPredicteddiseases();
			return basicGetPredicteddiseases();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EsehatPackage.DOCTOR_CONCULTATION__NAME:
			setName((String) newValue);
			return;
		case EsehatPackage.DOCTOR_CONCULTATION__PREDICTEDDISEASES:
			setPredicteddiseases((PredictedDiseases) newValue);
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
		case EsehatPackage.DOCTOR_CONCULTATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EsehatPackage.DOCTOR_CONCULTATION__PREDICTEDDISEASES:
			setPredicteddiseases((PredictedDiseases) null);
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
		case EsehatPackage.DOCTOR_CONCULTATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EsehatPackage.DOCTOR_CONCULTATION__PREDICTEDDISEASES:
			return predicteddiseases != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DoctorConcultationImpl
