/**
 */
package esehat.impl;

import esehat.DiseasaseDiscriptionDataset;
import esehat.EsehatPackage;
import esehat.ListOfDiseases;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diseasase Discription Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.DiseasaseDiscriptionDatasetImpl#getListofdiseases <em>Listofdiseases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiseasaseDiscriptionDatasetImpl extends MinimalEObjectImpl.Container
		implements DiseasaseDiscriptionDataset {
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
	protected DiseasaseDiscriptionDatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.DISEASASE_DISCRIPTION_DATASET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListOfDiseases> getListofdiseases() {
		if (listofdiseases == null) {
			listofdiseases = new EObjectResolvingEList<ListOfDiseases>(ListOfDiseases.class, this,
					EsehatPackage.DISEASASE_DISCRIPTION_DATASET__LISTOFDISEASES);
		}
		return listofdiseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void symptom_details() {
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
		case EsehatPackage.DISEASASE_DISCRIPTION_DATASET__LISTOFDISEASES:
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
		case EsehatPackage.DISEASASE_DISCRIPTION_DATASET__LISTOFDISEASES:
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
		case EsehatPackage.DISEASASE_DISCRIPTION_DATASET__LISTOFDISEASES:
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
		case EsehatPackage.DISEASASE_DISCRIPTION_DATASET__LISTOFDISEASES:
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
		case EsehatPackage.DISEASASE_DISCRIPTION_DATASET___SYMPTOM_DETAILS:
			symptom_details();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiseasaseDiscriptionDatasetImpl
