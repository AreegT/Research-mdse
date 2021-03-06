/**
 */
package esehat.provider;

import esehat.util.EsehatAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EsehatItemProviderAdapterFactory extends EsehatAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsehatItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.ESEHAT} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESEHATItemProvider esehatItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.ESEHAT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createESEHATAdapter() {
		if (esehatItemProvider == null) {
			esehatItemProvider = new ESEHATItemProvider(this);
		}

		return esehatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.NutritionistConsultation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionistConsultationItemProvider nutritionistConsultationItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.NutritionistConsultation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNutritionistConsultationAdapter() {
		if (nutritionistConsultationItemProvider == null) {
			nutritionistConsultationItemProvider = new NutritionistConsultationItemProvider(this);
		}

		return nutritionistConsultationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.DoctorConcultation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorConcultationItemProvider doctorConcultationItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.DoctorConcultation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoctorConcultationAdapter() {
		if (doctorConcultationItemProvider == null) {
			doctorConcultationItemProvider = new DoctorConcultationItemProvider(this);
		}

		return doctorConcultationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.DiseaseDetection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiseaseDetectionItemProvider diseaseDetectionItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.DiseaseDetection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiseaseDetectionAdapter() {
		if (diseaseDetectionItemProvider == null) {
			diseaseDetectionItemProvider = new DiseaseDetectionItemProvider(this);
		}

		return diseaseDetectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.PatientDetail} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientDetailItemProvider patientDetailItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.PatientDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatientDetailAdapter() {
		if (patientDetailItemProvider == null) {
			patientDetailItemProvider = new PatientDetailItemProvider(this);
		}

		return patientDetailItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.MatchedSymptom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchedSymptomItemProvider matchedSymptomItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.MatchedSymptom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchedSymptomAdapter() {
		if (matchedSymptomItemProvider == null) {
			matchedSymptomItemProvider = new MatchedSymptomItemProvider(this);
		}

		return matchedSymptomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.ML_Algorithm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ML_AlgorithmItemProvider mL_AlgorithmItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.ML_Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createML_AlgorithmAdapter() {
		if (mL_AlgorithmItemProvider == null) {
			mL_AlgorithmItemProvider = new ML_AlgorithmItemProvider(this);
		}

		return mL_AlgorithmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.ListOfDiseases} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDiseasesItemProvider listOfDiseasesItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.ListOfDiseases}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListOfDiseasesAdapter() {
		if (listOfDiseasesItemProvider == null) {
			listOfDiseasesItemProvider = new ListOfDiseasesItemProvider(this);
		}

		return listOfDiseasesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.PredictedDiseases} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredictedDiseasesItemProvider predictedDiseasesItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.PredictedDiseases}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredictedDiseasesAdapter() {
		if (predictedDiseasesItemProvider == null) {
			predictedDiseasesItemProvider = new PredictedDiseasesItemProvider(this);
		}

		return predictedDiseasesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.DietPlan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DietPlanItemProvider dietPlanItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.DietPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDietPlanAdapter() {
		if (dietPlanItemProvider == null) {
			dietPlanItemProvider = new DietPlanItemProvider(this);
		}

		return dietPlanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.DiseasaseDiscriptionDataset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiseasaseDiscriptionDatasetItemProvider diseasaseDiscriptionDatasetItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.DiseasaseDiscriptionDataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiseasaseDiscriptionDatasetAdapter() {
		if (diseasaseDiscriptionDatasetItemProvider == null) {
			diseasaseDiscriptionDatasetItemProvider = new DiseasaseDiscriptionDatasetItemProvider(this);
		}

		return diseasaseDiscriptionDatasetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.SymptomsDataset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymptomsDatasetItemProvider symptomsDatasetItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.SymptomsDataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymptomsDatasetAdapter() {
		if (symptomsDatasetItemProvider == null) {
			symptomsDatasetItemProvider = new SymptomsDatasetItemProvider(this);
		}

		return symptomsDatasetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.PrecautionsDataset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecautionsDatasetItemProvider precautionsDatasetItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.PrecautionsDataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrecautionsDatasetAdapter() {
		if (precautionsDatasetItemProvider == null) {
			precautionsDatasetItemProvider = new PrecautionsDatasetItemProvider(this);
		}

		return precautionsDatasetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link esehat.Random_Forest_Tree} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Random_Forest_TreeItemProvider random_Forest_TreeItemProvider;

	/**
	 * This creates an adapter for a {@link esehat.Random_Forest_Tree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRandom_Forest_TreeAdapter() {
		if (random_Forest_TreeItemProvider == null) {
			random_Forest_TreeItemProvider = new Random_Forest_TreeItemProvider(this);
		}

		return random_Forest_TreeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (esehatItemProvider != null)
			esehatItemProvider.dispose();
		if (nutritionistConsultationItemProvider != null)
			nutritionistConsultationItemProvider.dispose();
		if (doctorConcultationItemProvider != null)
			doctorConcultationItemProvider.dispose();
		if (diseaseDetectionItemProvider != null)
			diseaseDetectionItemProvider.dispose();
		if (patientDetailItemProvider != null)
			patientDetailItemProvider.dispose();
		if (matchedSymptomItemProvider != null)
			matchedSymptomItemProvider.dispose();
		if (mL_AlgorithmItemProvider != null)
			mL_AlgorithmItemProvider.dispose();
		if (listOfDiseasesItemProvider != null)
			listOfDiseasesItemProvider.dispose();
		if (predictedDiseasesItemProvider != null)
			predictedDiseasesItemProvider.dispose();
		if (dietPlanItemProvider != null)
			dietPlanItemProvider.dispose();
		if (diseasaseDiscriptionDatasetItemProvider != null)
			diseasaseDiscriptionDatasetItemProvider.dispose();
		if (symptomsDatasetItemProvider != null)
			symptomsDatasetItemProvider.dispose();
		if (precautionsDatasetItemProvider != null)
			precautionsDatasetItemProvider.dispose();
		if (random_Forest_TreeItemProvider != null)
			random_Forest_TreeItemProvider.dispose();
	}

}
