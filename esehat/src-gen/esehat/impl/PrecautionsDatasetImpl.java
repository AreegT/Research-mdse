/**
 */
package esehat.impl;

import esehat.EsehatPackage;
import esehat.PrecautionsDataset;
import esehat.PredictedDiseases;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precautions Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.PrecautionsDatasetImpl#getPredicteddiseases <em>Predicteddiseases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrecautionsDatasetImpl extends MinimalEObjectImpl.Container implements PrecautionsDataset {
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
	protected PrecautionsDatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.PRECAUTIONS_DATASET;
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
							EsehatPackage.PRECAUTIONS_DATASET__PREDICTEDDISEASES, oldPredicteddiseases,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsehatPackage.PRECAUTIONS_DATASET__PREDICTEDDISEASES,
					oldPredicteddiseases, predicteddiseases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void symptom_precautions() {
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
		case EsehatPackage.PRECAUTIONS_DATASET__PREDICTEDDISEASES:
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
		case EsehatPackage.PRECAUTIONS_DATASET__PREDICTEDDISEASES:
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
		case EsehatPackage.PRECAUTIONS_DATASET__PREDICTEDDISEASES:
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
		case EsehatPackage.PRECAUTIONS_DATASET__PREDICTEDDISEASES:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case EsehatPackage.PRECAUTIONS_DATASET___SYMPTOM_PRECAUTIONS:
			symptom_precautions();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PrecautionsDatasetImpl
