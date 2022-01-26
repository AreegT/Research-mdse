/**
 */
package esehat.impl;

import esehat.EsehatPackage;
import esehat.ListOfDiseases;
import esehat.ML_Algorithm;
import esehat.MatchedSymptom;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.ML_AlgorithmImpl#getMatchedsymptom <em>Matchedsymptom</em>}</li>
 *   <li>{@link esehat.impl.ML_AlgorithmImpl#getListofdiseases <em>Listofdiseases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ML_AlgorithmImpl extends MinimalEObjectImpl.Container implements ML_Algorithm {
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
	 * The cached value of the '{@link #getListofdiseases() <em>Listofdiseases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListofdiseases()
	 * @generated
	 * @ordered
	 */
	protected EList<ListOfDiseases> listofdiseases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ML_AlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.ML_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchedSymptom> getMatchedsymptom() {
		if (matchedsymptom == null) {
			matchedsymptom = new EObjectWithInverseResolvingEList<MatchedSymptom>(MatchedSymptom.class, this,
					EsehatPackage.ML_ALGORITHM__MATCHEDSYMPTOM, EsehatPackage.MATCHED_SYMPTOM__ML_ALGORITHM);
		}
		return matchedsymptom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListOfDiseases> getListofdiseases() {
		if (listofdiseases == null) {
			listofdiseases = new EObjectWithInverseResolvingEList<ListOfDiseases>(ListOfDiseases.class, this,
					EsehatPackage.ML_ALGORITHM__LISTOFDISEASES, EsehatPackage.LIST_OF_DISEASES__ML_ALGORITHM);
		}
		return listofdiseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void multipletrees() {
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
		case EsehatPackage.ML_ALGORITHM__MATCHEDSYMPTOM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMatchedsymptom()).basicAdd(otherEnd, msgs);
		case EsehatPackage.ML_ALGORITHM__LISTOFDISEASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getListofdiseases()).basicAdd(otherEnd, msgs);
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
		case EsehatPackage.ML_ALGORITHM__MATCHEDSYMPTOM:
			return ((InternalEList<?>) getMatchedsymptom()).basicRemove(otherEnd, msgs);
		case EsehatPackage.ML_ALGORITHM__LISTOFDISEASES:
			return ((InternalEList<?>) getListofdiseases()).basicRemove(otherEnd, msgs);
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
		case EsehatPackage.ML_ALGORITHM__MATCHEDSYMPTOM:
			return getMatchedsymptom();
		case EsehatPackage.ML_ALGORITHM__LISTOFDISEASES:
			return getListofdiseases();
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
		case EsehatPackage.ML_ALGORITHM__MATCHEDSYMPTOM:
			getMatchedsymptom().clear();
			getMatchedsymptom().addAll((Collection<? extends MatchedSymptom>) newValue);
			return;
		case EsehatPackage.ML_ALGORITHM__LISTOFDISEASES:
			getListofdiseases().clear();
			getListofdiseases().addAll((Collection<? extends ListOfDiseases>) newValue);
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
		case EsehatPackage.ML_ALGORITHM__MATCHEDSYMPTOM:
			getMatchedsymptom().clear();
			return;
		case EsehatPackage.ML_ALGORITHM__LISTOFDISEASES:
			getListofdiseases().clear();
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
		case EsehatPackage.ML_ALGORITHM__MATCHEDSYMPTOM:
			return matchedsymptom != null && !matchedsymptom.isEmpty();
		case EsehatPackage.ML_ALGORITHM__LISTOFDISEASES:
			return listofdiseases != null && !listofdiseases.isEmpty();
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
		case EsehatPackage.ML_ALGORITHM___MULTIPLETREES:
			multipletrees();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ML_AlgorithmImpl
