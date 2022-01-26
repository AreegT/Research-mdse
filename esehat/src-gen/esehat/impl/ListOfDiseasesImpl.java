/**
 */
package esehat.impl;

import esehat.EsehatPackage;
import esehat.ListOfDiseases;
import esehat.ML_Algorithm;
import esehat.PredictedDiseases;

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
 * An implementation of the model object '<em><b>List Of Diseases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.ListOfDiseasesImpl#getMl_algorithm <em>Ml algorithm</em>}</li>
 *   <li>{@link esehat.impl.ListOfDiseasesImpl#getPredicteddiseases <em>Predicteddiseases</em>}</li>
 *   <li>{@link esehat.impl.ListOfDiseasesImpl#getName <em>Name</em>}</li>
 *   <li>{@link esehat.impl.ListOfDiseasesImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link esehat.impl.ListOfDiseasesImpl#isConfirmation <em>Confirmation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDiseasesImpl extends MinimalEObjectImpl.Container implements ListOfDiseases {
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
	 * The cached value of the '{@link #getPredicteddiseases() <em>Predicteddiseases</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicteddiseases()
	 * @generated
	 * @ordered
	 */
	protected PredictedDiseases predicteddiseases;

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
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConfirmation() <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIRMATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfirmation() <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmation()
	 * @generated
	 * @ordered
	 */
	protected boolean confirmation = CONFIRMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDiseasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.LIST_OF_DISEASES;
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
							EsehatPackage.LIST_OF_DISEASES__ML_ALGORITHM, oldMl_algorithm, ml_algorithm));
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
					EsehatPackage.LIST_OF_DISEASES__ML_ALGORITHM, oldMl_algorithm, newMl_algorithm);
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
				msgs = ((InternalEObject) ml_algorithm).eInverseRemove(this, EsehatPackage.ML_ALGORITHM__LISTOFDISEASES,
						ML_Algorithm.class, msgs);
			if (newMl_algorithm != null)
				msgs = ((InternalEObject) newMl_algorithm).eInverseAdd(this, EsehatPackage.ML_ALGORITHM__LISTOFDISEASES,
						ML_Algorithm.class, msgs);
			msgs = basicSetMl_algorithm(newMl_algorithm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.LIST_OF_DISEASES__ML_ALGORITHM,
					newMl_algorithm, newMl_algorithm));
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
							EsehatPackage.LIST_OF_DISEASES__PREDICTEDDISEASES, oldPredicteddiseases,
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
	public void setPredicteddiseases(PredictedDiseases newPredicteddiseases) {
		PredictedDiseases oldPredicteddiseases = predicteddiseases;
		predicteddiseases = newPredicteddiseases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.LIST_OF_DISEASES__PREDICTEDDISEASES,
					oldPredicteddiseases, predicteddiseases));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.LIST_OF_DISEASES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.LIST_OF_DISEASES__LANGUAGE, oldLanguage,
					language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfirmation() {
		return confirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmation(boolean newConfirmation) {
		boolean oldConfirmation = confirmation;
		confirmation = newConfirmation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.LIST_OF_DISEASES__CONFIRMATION,
					oldConfirmation, confirmation));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsehatPackage.LIST_OF_DISEASES__ML_ALGORITHM:
			if (ml_algorithm != null)
				msgs = ((InternalEObject) ml_algorithm).eInverseRemove(this, EsehatPackage.ML_ALGORITHM__LISTOFDISEASES,
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
		case EsehatPackage.LIST_OF_DISEASES__ML_ALGORITHM:
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
		case EsehatPackage.LIST_OF_DISEASES__ML_ALGORITHM:
			if (resolve)
				return getMl_algorithm();
			return basicGetMl_algorithm();
		case EsehatPackage.LIST_OF_DISEASES__PREDICTEDDISEASES:
			if (resolve)
				return getPredicteddiseases();
			return basicGetPredicteddiseases();
		case EsehatPackage.LIST_OF_DISEASES__NAME:
			return getName();
		case EsehatPackage.LIST_OF_DISEASES__LANGUAGE:
			return getLanguage();
		case EsehatPackage.LIST_OF_DISEASES__CONFIRMATION:
			return isConfirmation();
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
		case EsehatPackage.LIST_OF_DISEASES__ML_ALGORITHM:
			setMl_algorithm((ML_Algorithm) newValue);
			return;
		case EsehatPackage.LIST_OF_DISEASES__PREDICTEDDISEASES:
			setPredicteddiseases((PredictedDiseases) newValue);
			return;
		case EsehatPackage.LIST_OF_DISEASES__NAME:
			setName((String) newValue);
			return;
		case EsehatPackage.LIST_OF_DISEASES__LANGUAGE:
			setLanguage((String) newValue);
			return;
		case EsehatPackage.LIST_OF_DISEASES__CONFIRMATION:
			setConfirmation((Boolean) newValue);
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
		case EsehatPackage.LIST_OF_DISEASES__ML_ALGORITHM:
			setMl_algorithm((ML_Algorithm) null);
			return;
		case EsehatPackage.LIST_OF_DISEASES__PREDICTEDDISEASES:
			setPredicteddiseases((PredictedDiseases) null);
			return;
		case EsehatPackage.LIST_OF_DISEASES__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EsehatPackage.LIST_OF_DISEASES__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
			return;
		case EsehatPackage.LIST_OF_DISEASES__CONFIRMATION:
			setConfirmation(CONFIRMATION_EDEFAULT);
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
		case EsehatPackage.LIST_OF_DISEASES__ML_ALGORITHM:
			return ml_algorithm != null;
		case EsehatPackage.LIST_OF_DISEASES__PREDICTEDDISEASES:
			return predicteddiseases != null;
		case EsehatPackage.LIST_OF_DISEASES__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EsehatPackage.LIST_OF_DISEASES__LANGUAGE:
			return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
		case EsehatPackage.LIST_OF_DISEASES__CONFIRMATION:
			return confirmation != CONFIRMATION_EDEFAULT;
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
		case EsehatPackage.LIST_OF_DISEASES___GETSYMPTOM_DETAILS:
			getsymptom_details();
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
		result.append(", language: ");
		result.append(language);
		result.append(", confirmation: ");
		result.append(confirmation);
		result.append(')');
		return result.toString();
	}

} //ListOfDiseasesImpl
