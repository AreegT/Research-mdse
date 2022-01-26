/**
 */
package esehat.provider;

import esehat.ESEHAT;
import esehat.EsehatFactory;
import esehat.EsehatPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link esehat.ESEHAT} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESEHATItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESEHATItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__DOCTORCONCULTATION);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__NUTRITIONISTCONSULTATION);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__DISEASEDETECTION);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__SYMPTOMSDATASET);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__PATIENTDETAIL);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__LISTOFDISEASES);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__ML_ALGORITHM);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__MATCHEDSYMPTOM);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__DIETPLAN);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__PREDICTEDDISEASES);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__PRECAUTIONSDATASET);
			childrenFeatures.add(EsehatPackage.Literals.ESEHAT__DISEASASEDISCRIPTIONDATASET);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ESEHAT.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ESEHAT"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ESEHAT_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ESEHAT.class)) {
		case EsehatPackage.ESEHAT__DOCTORCONCULTATION:
		case EsehatPackage.ESEHAT__NUTRITIONISTCONSULTATION:
		case EsehatPackage.ESEHAT__DISEASEDETECTION:
		case EsehatPackage.ESEHAT__SYMPTOMSDATASET:
		case EsehatPackage.ESEHAT__PATIENTDETAIL:
		case EsehatPackage.ESEHAT__LISTOFDISEASES:
		case EsehatPackage.ESEHAT__ML_ALGORITHM:
		case EsehatPackage.ESEHAT__MATCHEDSYMPTOM:
		case EsehatPackage.ESEHAT__DIETPLAN:
		case EsehatPackage.ESEHAT__PREDICTEDDISEASES:
		case EsehatPackage.ESEHAT__PRECAUTIONSDATASET:
		case EsehatPackage.ESEHAT__DISEASASEDISCRIPTIONDATASET:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__DOCTORCONCULTATION,
				EsehatFactory.eINSTANCE.createDoctorConcultation()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__NUTRITIONISTCONSULTATION,
				EsehatFactory.eINSTANCE.createNutritionistConsultation()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__DISEASEDETECTION,
				EsehatFactory.eINSTANCE.createDiseaseDetection()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__SYMPTOMSDATASET,
				EsehatFactory.eINSTANCE.createSymptomsDataset()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__PATIENTDETAIL,
				EsehatFactory.eINSTANCE.createPatientDetail()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__LISTOFDISEASES,
				EsehatFactory.eINSTANCE.createListOfDiseases()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__ML_ALGORITHM,
				EsehatFactory.eINSTANCE.createML_Algorithm()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__MATCHEDSYMPTOM,
				EsehatFactory.eINSTANCE.createMatchedSymptom()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__DIETPLAN,
				EsehatFactory.eINSTANCE.createDietPlan()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__PREDICTEDDISEASES,
				EsehatFactory.eINSTANCE.createPredictedDiseases()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__PRECAUTIONSDATASET,
				EsehatFactory.eINSTANCE.createPrecautionsDataset()));

		newChildDescriptors.add(createChildParameter(EsehatPackage.Literals.ESEHAT__DISEASASEDISCRIPTIONDATASET,
				EsehatFactory.eINSTANCE.createDiseasaseDiscriptionDataset()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EsehatEditPlugin.INSTANCE;
	}

}
