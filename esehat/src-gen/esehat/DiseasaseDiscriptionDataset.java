/**
 */
package esehat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diseasase Discription Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esehat.DiseasaseDiscriptionDataset#getListofdiseases <em>Listofdiseases</em>}</li>
 * </ul>
 *
 * @see esehat.EsehatPackage#getDiseasaseDiscriptionDataset()
 * @model
 * @generated
 */
public interface DiseasaseDiscriptionDataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Listofdiseases</b></em>' reference list.
	 * The list contents are of type {@link esehat.ListOfDiseases}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listofdiseases</em>' reference list.
	 * @see esehat.EsehatPackage#getDiseasaseDiscriptionDataset_Listofdiseases()
	 * @model required="true"
	 * @generated
	 */
	EList<ListOfDiseases> getListofdiseases();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void symptom_details();

} // DiseasaseDiscriptionDataset
