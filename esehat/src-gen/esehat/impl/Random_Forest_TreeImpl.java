/**
 */
package esehat.impl;

import esehat.EsehatPackage;
import esehat.ML_Algorithm;
import esehat.Random_Forest_Tree;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Forest Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esehat.impl.Random_Forest_TreeImpl#getMl_algorithm <em>Ml algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Random_Forest_TreeImpl extends MinimalEObjectImpl.Container implements Random_Forest_Tree {
	/**
	 * The cached value of the '{@link #getMl_algorithm() <em>Ml algorithm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMl_algorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<ML_Algorithm> ml_algorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Random_Forest_TreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsehatPackage.Literals.RANDOM_FOREST_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ML_Algorithm> getMl_algorithm() {
		if (ml_algorithm == null) {
			ml_algorithm = new EObjectResolvingEList<ML_Algorithm>(ML_Algorithm.class, this,
					EsehatPackage.RANDOM_FOREST_TREE__ML_ALGORITHM);
		}
		return ml_algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EsehatPackage.RANDOM_FOREST_TREE__ML_ALGORITHM:
			return getMl_algorithm();
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
		case EsehatPackage.RANDOM_FOREST_TREE__ML_ALGORITHM:
			getMl_algorithm().clear();
			getMl_algorithm().addAll((Collection<? extends ML_Algorithm>) newValue);
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
		case EsehatPackage.RANDOM_FOREST_TREE__ML_ALGORITHM:
			getMl_algorithm().clear();
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
		case EsehatPackage.RANDOM_FOREST_TREE__ML_ALGORITHM:
			return ml_algorithm != null && !ml_algorithm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Random_Forest_TreeImpl
