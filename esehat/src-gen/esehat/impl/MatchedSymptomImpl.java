/**
 */
package esehat.impl;

import esehat.EsehatPackage;
import esehat.ML_Algorithm;
import esehat.MatchedSymptom;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matched Symptom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.MatchedSymptomImpl#getMl_algorithm <em>Ml algorithm</em>}</li>
 *   <li>{@link esehat.impl.MatchedSymptomImpl#getDays <em>Days</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchedSymptomImpl extends MinimalEObjectImpl.Container implements MatchedSymptom {
	/**
	 * The cached value of the '{@link #getMl_algorithm() <em>Ml algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMl_algorithm()
	 * @generated
	 * @ordered
	 */
	protected ML_Algorithm ml_algorithm;

	/**
	 * The default value of the '{@link #getDays() <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected static final int DAYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDays() <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected int days = DAYS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchedSymptomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.MATCHED_SYMPTOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML_Algorithm getMl_algorithm() {
		if (ml_algorithm != null && ml_algorithm.eIsProxy()) {
			InternalEObject oldMl_algorithm = (InternalEObject) ml_algorithm;
			ml_algorithm = (ML_Algorithm) eResolveProxy(oldMl_algorithm);
			if (ml_algorithm != oldMl_algorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EsehatPackage.MATCHED_SYMPTOM__ML_ALGORITHM, oldMl_algorithm, ml_algorithm));
			}
		}
		return ml_algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML_Algorithm basicGetMl_algorithm() {
		return ml_algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMl_algorithm(ML_Algorithm newMl_algorithm, NotificationChain msgs) {
		ML_Algorithm oldMl_algorithm = ml_algorithm;
		ml_algorithm = newMl_algorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EsehatPackage.MATCHED_SYMPTOM__ML_ALGORITHM, oldMl_algorithm, newMl_algorithm);
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
	public void setMl_algorithm(ML_Algorithm newMl_algorithm) {
		if (newMl_algorithm != ml_algorithm) {
			NotificationChain msgs = null;
			if (ml_algorithm != null)
				msgs = ((InternalEObject) ml_algorithm).eInverseRemove(this, EsehatPackage.ML_ALGORITHM__MATCHEDSYMPTOM,
						ML_Algorithm.class, msgs);
			if (newMl_algorithm != null)
				msgs = ((InternalEObject) newMl_algorithm).eInverseAdd(this, EsehatPackage.ML_ALGORITHM__MATCHEDSYMPTOM,
						ML_Algorithm.class, msgs);
			msgs = basicSetMl_algorithm(newMl_algorithm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.MATCHED_SYMPTOM__ML_ALGORITHM,
					newMl_algorithm, newMl_algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDays() {
		return days;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDays(int newDays) {
		int oldDays = days;
		days = newDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.MATCHED_SYMPTOM__DAYS, oldDays, days));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getmatchedsymptoms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsehatPackage.MATCHED_SYMPTOM__ML_ALGORITHM:
			if (ml_algorithm != null)
				msgs = ((InternalEObject) ml_algorithm).eInverseRemove(this, EsehatPackage.ML_ALGORITHM__MATCHEDSYMPTOM,
						ML_Algorithm.class, msgs);
			return basicSetMl_algorithm((ML_Algorithm) otherEnd, msgs);
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
		case EsehatPackage.MATCHED_SYMPTOM__ML_ALGORITHM:
			return basicSetMl_algorithm(null, msgs);
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
		case EsehatPackage.MATCHED_SYMPTOM__ML_ALGORITHM:
			if (resolve)
				return getMl_algorithm();
			return basicGetMl_algorithm();
		case EsehatPackage.MATCHED_SYMPTOM__DAYS:
			return getDays();
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
		case EsehatPackage.MATCHED_SYMPTOM__ML_ALGORITHM:
			setMl_algorithm((ML_Algorithm) newValue);
			return;
		case EsehatPackage.MATCHED_SYMPTOM__DAYS:
			setDays((Integer) newValue);
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
		case EsehatPackage.MATCHED_SYMPTOM__ML_ALGORITHM:
			setMl_algorithm((ML_Algorithm) null);
			return;
		case EsehatPackage.MATCHED_SYMPTOM__DAYS:
			setDays(DAYS_EDEFAULT);
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
		case EsehatPackage.MATCHED_SYMPTOM__ML_ALGORITHM:
			return ml_algorithm != null;
		case EsehatPackage.MATCHED_SYMPTOM__DAYS:
			return days != DAYS_EDEFAULT;
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
		case EsehatPackage.MATCHED_SYMPTOM___GETMATCHEDSYMPTOMS:
			getmatchedsymptoms();
			return null;
		case EsehatPackage.MATCHED_SYMPTOM___SUBMIT:
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
		result.append(" (Days: ");
		result.append(days);
		result.append(')');
		return result.toString();
	}

} //MatchedSymptomImpl
