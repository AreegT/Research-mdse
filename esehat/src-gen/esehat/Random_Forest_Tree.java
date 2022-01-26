/**
 */
package esehat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Forest Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.Random_Forest_Tree#getMl_algorithm <em>Ml algorithm</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getRandom_Forest_Tree()
 * @model
 * @generated
 */
public interface Random_Forest_Tree extends EObject {
	/**
	 * Returns the value of the '<em><b>Ml algorithm</b></em>' reference list.
	 * The list contents are of type {@link esehat.ML_Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ml algorithm</em>' reference list.
	 * @see esehat.EsehatPackage#getRandom_Forest_Tree_Ml_algorithm()
	 * @model required="true"
	 * @generated
	 */
	EList<ML_Algorithm> getMl_algorithm();

} // Random_Forest_Tree
