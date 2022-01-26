/**
 */
package aseproject.provider;

import aseproject.AseprojectFactory;
import aseproject.AseprojectPackage;
import aseproject.CRIPS;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aseproject.CRIPS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CRIPSItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRIPSItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CRIPS_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CRIPS_name_feature", "_UI_CRIPS_type"),
						AseprojectPackage.Literals.CRIPS__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__CONTIGENCY);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__ENTITY);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__CPB);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__INTELLIGENTRATER);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__REPOSITORY);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__RESPONSE);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__VULNERABILITY);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__HAZARD);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__RISK);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__FEEDBACK);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__RESOURCE);
			childrenFeatures.add(AseprojectPackage.Literals.CRIPS__MEMBER);
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
	 * This returns CRIPS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CRIPS"));
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
		String label = ((CRIPS) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_CRIPS_type")
				: getString("_UI_CRIPS_type") + " " + label;
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

		switch (notification.getFeatureID(CRIPS.class)) {
		case AseprojectPackage.CRIPS__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AseprojectPackage.CRIPS__CONTIGENCY:
		case AseprojectPackage.CRIPS__ENTITY:
		case AseprojectPackage.CRIPS__CPB:
		case AseprojectPackage.CRIPS__INTELLIGENTRATER:
		case AseprojectPackage.CRIPS__REPOSITORY:
		case AseprojectPackage.CRIPS__RESPONSE:
		case AseprojectPackage.CRIPS__VULNERABILITY:
		case AseprojectPackage.CRIPS__HAZARD:
		case AseprojectPackage.CRIPS__RISK:
		case AseprojectPackage.CRIPS__FEEDBACK:
		case AseprojectPackage.CRIPS__RESOURCE:
		case AseprojectPackage.CRIPS__MEMBER:
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

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__CONTIGENCY,
				AseprojectFactory.eINSTANCE.createContigency()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__ENTITY,
				AseprojectFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__ENTITY,
				AseprojectFactory.eINSTANCE.createTangible()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__ENTITY,
				AseprojectFactory.eINSTANCE.createIntangible()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__ENTITY,
				AseprojectFactory.eINSTANCE.createResponder()));

		newChildDescriptors.add(
				createChildParameter(AseprojectPackage.Literals.CRIPS__CPB, AseprojectFactory.eINSTANCE.createCPB()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__INTELLIGENTRATER,
				AseprojectFactory.eINSTANCE.createIntelligentRater()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__REPOSITORY,
				AseprojectFactory.eINSTANCE.createRepository()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__RESPONSE,
				AseprojectFactory.eINSTANCE.createResponse()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__VULNERABILITY,
				AseprojectFactory.eINSTANCE.createVulnerability()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__HAZARD,
				AseprojectFactory.eINSTANCE.createHazard()));

		newChildDescriptors.add(
				createChildParameter(AseprojectPackage.Literals.CRIPS__RISK, AseprojectFactory.eINSTANCE.createRisk()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__FEEDBACK,
				AseprojectFactory.eINSTANCE.createFeedBack()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__RESOURCE,
				AseprojectFactory.eINSTANCE.createResource()));

		newChildDescriptors.add(createChildParameter(AseprojectPackage.Literals.CRIPS__MEMBER,
				AseprojectFactory.eINSTANCE.createMember()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AseprojectEditPlugin.INSTANCE;
	}

}
