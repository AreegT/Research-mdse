/**
 */
package esehat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutritionist Consultation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.NutritionistConsultation#getName <em>Name</em>}</li>
 *   <li>{@link esehat.NutritionistConsultation#getDietplan <em>Dietplan</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getNutritionistConsultation()
 * @model
 * @generated
 */
public interface NutritionistConsultation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see esehat.EsehatPackage#getNutritionistConsultation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link esehat.NutritionistConsultation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dietplan</b></em>' reference list.
	 * The list contents are of type {@link esehat.DietPlan}.
	 * It is bidirectional and its opposite is '{@link esehat.DietPlan#getNutritionistconsultation <em>Nutritionistconsultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dietplan</em>' reference list.
	 * @see esehat.EsehatPackage#getNutritionistConsultation_Dietplan()
	 * @see esehat.DietPlan#getNutritionistconsultation
	 * @model opposite="nutritionistconsultation" required="true"
	 * @generated
	 */
	EList<DietPlan> getDietplan();

} // NutritionistConsultation
