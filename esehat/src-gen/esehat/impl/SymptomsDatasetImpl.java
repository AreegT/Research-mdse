/**
 */
package esehat.impl;

import esehat.EsehatPackage;
import esehat.MatchedSymptom;
import esehat.SymptomsDataset;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symptoms Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.SymptomsDatasetImpl#getMatchedsymptom <em>Matchedsymptom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymptomsDatasetImpl extends MinimalEObjectImpl.Container implements SymptomsDataset {
	/**
	 * The cached value of the '{@link #getMatchedsymptom() <em>Matchedsymptom</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedsymptom()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchedSymptom> matchedsymptom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymptomsDatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.SYMPTOMS_DATASET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchedSymptom> getMatchedsymptom() {
		if (matchedsymptom == null) {
			matchedsymptom = new EObjectResolvingEList<MatchedSymptom>(MatchedSymptom.class, this,
					EsehatPackage.SYMPTOMS_DATASET__MATCHEDSYMPTOM);
		}
		return matchedsymptom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void matchedsymptoms() {
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
		case EsehatPackage.SYMPTOMS_DATASET__MATCHEDSYMPTOM:
			return getMatchedsymptom();
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
		case EsehatPackage.SYMPTOMS_DATASET__MATCHEDSYMPTOM:
			getMatchedsymptom().clear();
			getMatchedsymptom().addAll((Collection<? extends MatchedSymptom>) newValue);
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
		case EsehatPackage.SYMPTOMS_DATASET__MATCHEDSYMPTOM:
			getMatchedsymptom().clear();
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
		case EsehatPackage.SYMPTOMS_DATASET__MATCHEDSYMPTOM:
			return matchedsymptom != null && !matchedsymptom.isEmpty();
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
		case EsehatPackage.SYMPTOMS_DATASET___MATCHEDSYMPTOMS:
			matchedsymptoms();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SymptomsDatasetImpl
