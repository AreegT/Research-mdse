/**
 */
package esehat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diet Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.DietPlan#getName <em>Name</em>}</li>
 *   <li>{@link esehat.DietPlan#getNutritionistconsultation <em>Nutritionistconsultation</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getDietPlan()
 * @model
 * @generated
 */
public interface DietPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see esehat.EsehatPackage#getDietPlan_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link esehat.DietPlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nutritionistconsultation</b></em>' reference list.
	 * The list contents are of type {@link esehat.NutritionistConsultation}.
	 * It is bidirectional and its opposite is '{@link esehat.NutritionistConsultation#getDietplan <em>Dietplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutritionistconsultation</em>' reference list.
	 * @see esehat.EsehatPackage#getDietPlan_Nutritionistconsultation()
	 * @see esehat.NutritionistConsultation#getDietplan
	 * @model opposite="dietplan"
	 * @generated
	 */
	EList<NutritionistConsultation> getNutritionistconsultation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getdietplan();

} // DietPlan
