//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.07 à 02:11:03 PM CET 
//


package javaXSDclass;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the javaXSDclass package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnergyDepositionRateCalculationTimePointIdentifierUsed_QNAME = new QName("https://www.irdbb-medirad.com", "TimePointIdentifierUsed");
    private final static QName _EnergyDepositionRateCalculationDICOMData_QNAME = new QName("https://www.irdbb-medirad.com", "DICOMData");
    private final static QName _EnergyDepositionRateCalculationThreeDimEnergyDepositionRateMatrixAtTimePointProduced_QNAME = new QName("https://www.irdbb-medirad.com", "ThreeDimEnergyDepositionRateMatrixAtTimePointProduced");
    private final static QName _EnergyDepositionRateCalculationVOIIdentifierUsed_QNAME = new QName("https://www.irdbb-medirad.com", "VOIIdentifierUsed");
    private final static QName _EnergyDepositionRateCalculationVOIUsed_QNAME = new QName("https://www.irdbb-medirad.com", "VOIUsed");
    private final static QName _EnergyDepositionRateCalculationProcessExecutionContext_QNAME = new QName("https://www.irdbb-medirad.com", "ProcessExecutionContext");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowRegistrationVOISegmentationAndPropagation_QNAME = new QName("https://www.irdbb-medirad.com", "RegistrationVOISegmentationAndPropagation");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowRadioBiologicalCalculation_QNAME = new QName("https://www.irdbb-medirad.com", "RadioBiologicalCalculation");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowPatientId_QNAME = new QName("https://www.irdbb-medirad.com", "PatientId");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowVOIActivityDetermination_QNAME = new QName("https://www.irdbb-medirad.com", "VOIActivityDetermination");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowTimeActivityCurveFit_QNAME = new QName("https://www.irdbb-medirad.com", "TimeActivityCurveFit");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowVOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation_QNAME = new QName("https://www.irdbb-medirad.com", "VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowDoseRateCurveFitVOITimeIntegration_QNAME = new QName("https://www.irdbb-medirad.com", "DoseRateCurveFitVOITimeIntegration");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowPatientName_QNAME = new QName("https://www.irdbb-medirad.com", "PatientName");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowSPECTDataAcquisitionAndProcessing_QNAME = new QName("https://www.irdbb-medirad.com", "SPECTDataAcquisitionAndProcessing");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowAbsorbedDoseCalculation_QNAME = new QName("https://www.irdbb-medirad.com", "AbsorbedDoseCalculation");
    private final static QName _NonDicomFileSetDescriptorThreeDimDosimetryWorkflowClinicalResearchStudyId_QNAME = new QName("https://www.irdbb-medirad.com", "ClinicalResearchStudyId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: javaXSDclass
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NonDicomFileSetDescriptor }
     * 
     */
    public NonDicomFileSetDescriptor createNonDicomFileSetDescriptor() {
        return new NonDicomFileSetDescriptor();
    }

    /**
     * Create an instance of {@link NonDicomFileSetDescriptor.ReferencedClinicalResearchStudy }
     * 
     */
    public NonDicomFileSetDescriptor.ReferencedClinicalResearchStudy createNonDicomFileSetDescriptorReferencedClinicalResearchStudy() {
        return new NonDicomFileSetDescriptor.ReferencedClinicalResearchStudy();
    }

    /**
     * Create an instance of {@link NonDicomFileSetDescriptor.CalibrationWorkflow }
     * 
     */
    public NonDicomFileSetDescriptor.CalibrationWorkflow createNonDicomFileSetDescriptorCalibrationWorkflow() {
        return new NonDicomFileSetDescriptor.CalibrationWorkflow();
    }

    /**
     * Create an instance of {@link NonDicomFileSetDescriptor.WP2Subtask212WorkflowData }
     * 
     */
    public NonDicomFileSetDescriptor.WP2Subtask212WorkflowData createNonDicomFileSetDescriptorWP2Subtask212WorkflowData() {
        return new NonDicomFileSetDescriptor.WP2Subtask212WorkflowData();
    }

    /**
     * Create an instance of {@link NonDicomFileSetDescriptor.TwoDimDosimetryworkflow }
     * 
     */
    public NonDicomFileSetDescriptor.TwoDimDosimetryworkflow createNonDicomFileSetDescriptorTwoDimDosimetryworkflow() {
        return new NonDicomFileSetDescriptor.TwoDimDosimetryworkflow();
    }

    /**
     * Create an instance of {@link NonDicomFileSetDescriptor.HybridDosimetryworkflow }
     * 
     */
    public NonDicomFileSetDescriptor.HybridDosimetryworkflow createNonDicomFileSetDescriptorHybridDosimetryworkflow() {
        return new NonDicomFileSetDescriptor.HybridDosimetryworkflow();
    }

    /**
     * Create an instance of {@link NonDicomFileSetDescriptor.RegistrationVOISegmentation }
     * 
     */
    public NonDicomFileSetDescriptor.RegistrationVOISegmentation createNonDicomFileSetDescriptorRegistrationVOISegmentation() {
        return new NonDicomFileSetDescriptor.RegistrationVOISegmentation();
    }

    /**
     * Create an instance of {@link NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow }
     * 
     */
    public NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow createNonDicomFileSetDescriptorThreeDimDosimetryWorkflow() {
        return new NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow();
    }

    /**
     * Create an instance of {@link SPECTCTCalibrationWorkflow }
     * 
     */
    public SPECTCTCalibrationWorkflow createSPECTCTCalibrationWorkflow() {
        return new SPECTCTCalibrationWorkflow();
    }

    /**
     * Create an instance of {@link EnergyDepositionRateCalculation }
     * 
     */
    public EnergyDepositionRateCalculation createEnergyDepositionRateCalculation() {
        return new EnergyDepositionRateCalculation();
    }

    /**
     * Create an instance of {@link ROIPlanarActivityDetermination }
     * 
     */
    public ROIPlanarActivityDetermination createROIPlanarActivityDetermination() {
        return new ROIPlanarActivityDetermination();
    }

    /**
     * Create an instance of {@link CTNumberCalibrationWorkfow }
     * 
     */
    public CTNumberCalibrationWorkfow createCTNumberCalibrationWorkfow() {
        return new CTNumberCalibrationWorkfow();
    }

    /**
     * Create an instance of {@link PlanarDataAcquisition }
     * 
     */
    public PlanarDataAcquisition createPlanarDataAcquisition() {
        return new PlanarDataAcquisition();
    }

    /**
     * Create an instance of {@link VoxelBasedDistributionOfAbsorbedDoseType }
     * 
     */
    public VoxelBasedDistributionOfAbsorbedDoseType createVoxelBasedDistributionOfAbsorbedDoseType() {
        return new VoxelBasedDistributionOfAbsorbedDoseType();
    }

    /**
     * Create an instance of {@link VOIActivityDetermination }
     * 
     */
    public VOIActivityDetermination createVOIActivityDetermination() {
        return new VOIActivityDetermination();
    }

    /**
     * Create an instance of {@link DoseRateCurveFitVOITimeIntegration }
     * 
     */
    public DoseRateCurveFitVOITimeIntegration createDoseRateCurveFitVOITimeIntegration() {
        return new DoseRateCurveFitVOITimeIntegration();
    }

    /**
     * Create an instance of {@link DensityPhantom }
     * 
     */
    public DensityPhantom createDensityPhantom() {
        return new DensityPhantom();
    }

    /**
     * Create an instance of {@link MethodSettingType }
     * 
     */
    public MethodSettingType createMethodSettingType() {
        return new MethodSettingType();
    }

    /**
     * Create an instance of {@link RadioBiologicalCalculation }
     * 
     */
    public RadioBiologicalCalculation createRadioBiologicalCalculation() {
        return new RadioBiologicalCalculation();
    }

    /**
     * Create an instance of {@link PatientOrganMass }
     * 
     */
    public PatientOrganMass createPatientOrganMass() {
        return new PatientOrganMass();
    }

    /**
     * Create an instance of {@link SumAndScalingAbsorbedDoseRateCalculation }
     * 
     */
    public SumAndScalingAbsorbedDoseRateCalculation createSumAndScalingAbsorbedDoseRateCalculation() {
        return new SumAndScalingAbsorbedDoseRateCalculation();
    }

    /**
     * Create an instance of {@link ActivityScaling }
     * 
     */
    public ActivityScaling createActivityScaling() {
        return new ActivityScaling();
    }

    /**
     * Create an instance of {@link HybridDosimetryViaAbsorbedDoseRateCalculation }
     * 
     */
    public HybridDosimetryViaAbsorbedDoseRateCalculation createHybridDosimetryViaAbsorbedDoseRateCalculation() {
        return new HybridDosimetryViaAbsorbedDoseRateCalculation();
    }

    /**
     * Create an instance of {@link CTNumberCalibrationCurve }
     * 
     */
    public CTNumberCalibrationCurve createCTNumberCalibrationCurve() {
        return new CTNumberCalibrationCurve();
    }

    /**
     * Create an instance of {@link TwoDimDosimetryViaAbsorbedDoseRateCalculation }
     * 
     */
    public TwoDimDosimetryViaAbsorbedDoseRateCalculation createTwoDimDosimetryViaAbsorbedDoseRateCalculation() {
        return new TwoDimDosimetryViaAbsorbedDoseRateCalculation();
    }

    /**
     * Create an instance of {@link PlanarDataSegmentationWithRegistrationAndPropagation }
     * 
     */
    public PlanarDataSegmentationWithRegistrationAndPropagation createPlanarDataSegmentationWithRegistrationAndPropagation() {
        return new PlanarDataSegmentationWithRegistrationAndPropagation();
    }

    /**
     * Create an instance of {@link CountsPerROIAtTimePoint }
     * 
     */
    public CountsPerROIAtTimePoint createCountsPerROIAtTimePoint() {
        return new CountsPerROIAtTimePoint();
    }

    /**
     * Create an instance of {@link SPECTRecoveryCoefficientCurve }
     * 
     */
    public SPECTRecoveryCoefficientCurve createSPECTRecoveryCoefficientCurve() {
        return new SPECTRecoveryCoefficientCurve();
    }

    /**
     * Create an instance of {@link PlanarDataSegmentationWithoutRegistration }
     * 
     */
    public PlanarDataSegmentationWithoutRegistration createPlanarDataSegmentationWithoutRegistration() {
        return new PlanarDataSegmentationWithoutRegistration();
    }

    /**
     * Create an instance of {@link AbsorbedDoseRatePerVOIAtTimePoint }
     * 
     */
    public AbsorbedDoseRatePerVOIAtTimePoint createAbsorbedDoseRatePerVOIAtTimePoint() {
        return new AbsorbedDoseRatePerVOIAtTimePoint();
    }

    /**
     * Create an instance of {@link CalibrationFactor }
     * 
     */
    public CalibrationFactor createCalibrationFactor() {
        return new CalibrationFactor();
    }

    /**
     * Create an instance of {@link Tank }
     * 
     */
    public Tank createTank() {
        return new Tank();
    }

    /**
     * Create an instance of {@link ROI }
     * 
     */
    public ROI createROI() {
        return new ROI();
    }

    /**
     * Create an instance of {@link DataActivityPerROIAtTimePoint }
     * 
     */
    public DataActivityPerROIAtTimePoint createDataActivityPerROIAtTimePoint() {
        return new DataActivityPerROIAtTimePoint();
    }

    /**
     * Create an instance of {@link VOI }
     * 
     */
    public VOI createVOI() {
        return new VOI();
    }

    /**
     * Create an instance of {@link TimeActivityCurveFit }
     * 
     */
    public TimeActivityCurveFit createTimeActivityCurveFit() {
        return new TimeActivityCurveFit();
    }

    /**
     * Create an instance of {@link SumAndScalingEnergyDepositionRate }
     * 
     */
    public SumAndScalingEnergyDepositionRate createSumAndScalingEnergyDepositionRate() {
        return new SumAndScalingEnergyDepositionRate();
    }

    /**
     * Create an instance of {@link MonteCarloMethodType }
     * 
     */
    public MonteCarloMethodType createMonteCarloMethodType() {
        return new MonteCarloMethodType();
    }

    /**
     * Create an instance of {@link DataActivityPerVOIAtTimePoint }
     * 
     */
    public DataActivityPerVOIAtTimePoint createDataActivityPerVOIAtTimePoint() {
        return new DataActivityPerVOIAtTimePoint();
    }

    /**
     * Create an instance of {@link AbsorbedDosePerVOIType }
     * 
     */
    public AbsorbedDosePerVOIType createAbsorbedDosePerVOIType() {
        return new AbsorbedDosePerVOIType();
    }

    /**
     * Create an instance of {@link RegistrationVOISegmentationAndPropagation }
     * 
     */
    public RegistrationVOISegmentationAndPropagation createRegistrationVOISegmentationAndPropagation() {
        return new RegistrationVOISegmentationAndPropagation();
    }

    /**
     * Create an instance of {@link VOIInSPECT }
     * 
     */
    public VOIInSPECT createVOIInSPECT() {
        return new VOIInSPECT();
    }

    /**
     * Create an instance of {@link PlanarImageCorrections }
     * 
     */
    public PlanarImageCorrections createPlanarImageCorrections() {
        return new PlanarImageCorrections();
    }

    /**
     * Create an instance of {@link SPECTDataAcquisitionAndProcessing }
     * 
     */
    public SPECTDataAcquisitionAndProcessing createSPECTDataAcquisitionAndProcessing() {
        return new SPECTDataAcquisitionAndProcessing();
    }

    /**
     * Create an instance of {@link SPECTAcqCTAcqAndReconstruction }
     * 
     */
    public SPECTAcqCTAcqAndReconstruction createSPECTAcqCTAcqAndReconstruction() {
        return new SPECTAcqCTAcqAndReconstruction();
    }

    /**
     * Create an instance of {@link AttenuatorType }
     * 
     */
    public AttenuatorType createAttenuatorType() {
        return new AttenuatorType();
    }

    /**
     * Create an instance of {@link PlanarCalibrationFactor }
     * 
     */
    public PlanarCalibrationFactor createPlanarCalibrationFactor() {
        return new PlanarCalibrationFactor();
    }

    /**
     * Create an instance of {@link CalculationOfAbsorbedDosesInVOIs }
     * 
     */
    public CalculationOfAbsorbedDosesInVOIs createCalculationOfAbsorbedDosesInVOIs() {
        return new CalculationOfAbsorbedDosesInVOIs();
    }

    /**
     * Create an instance of {@link CTAcqForCTNumberCalibrationCurve }
     * 
     */
    public CTAcqForCTNumberCalibrationCurve createCTAcqForCTNumberCalibrationCurve() {
        return new CTAcqForCTNumberCalibrationCurve();
    }

    /**
     * Create an instance of {@link ROIInSPECT }
     * 
     */
    public ROIInSPECT createROIInSPECT() {
        return new ROIInSPECT();
    }

    /**
     * Create an instance of {@link NMPhantom }
     * 
     */
    public NMPhantom createNMPhantom() {
        return new NMPhantom();
    }

    /**
     * Create an instance of {@link SPECTRecoveryCurveCalculation }
     * 
     */
    public SPECTRecoveryCurveCalculation createSPECTRecoveryCurveCalculation() {
        return new SPECTRecoveryCurveCalculation();
    }

    /**
     * Create an instance of {@link TimeAbsorbedDoseRateCurveFit }
     * 
     */
    public TimeAbsorbedDoseRateCurveFit createTimeAbsorbedDoseRateCurveFit() {
        return new TimeAbsorbedDoseRateCurveFit();
    }

    /**
     * Create an instance of {@link HotInsert }
     * 
     */
    public HotInsert createHotInsert() {
        return new HotInsert();
    }

    /**
     * Create an instance of {@link ProcessExecutionContext }
     * 
     */
    public ProcessExecutionContext createProcessExecutionContext() {
        return new ProcessExecutionContext();
    }

    /**
     * Create an instance of {@link PlanarDataAcquisitionAndProcessing }
     * 
     */
    public PlanarDataAcquisitionAndProcessing createPlanarDataAcquisitionAndProcessing() {
        return new PlanarDataAcquisitionAndProcessing();
    }

    /**
     * Create an instance of {@link SPECTReconstruction }
     * 
     */
    public SPECTReconstruction createSPECTReconstruction() {
        return new SPECTReconstruction();
    }

    /**
     * Create an instance of {@link NonDICOMData }
     * 
     */
    public NonDICOMData createNonDICOMData() {
        return new NonDICOMData();
    }

    /**
     * Create an instance of {@link PlanarImageSegmentation }
     * 
     */
    public PlanarImageSegmentation createPlanarImageSegmentation() {
        return new PlanarImageSegmentation();
    }

    /**
     * Create an instance of {@link AdministeredActivity }
     * 
     */
    public AdministeredActivity createAdministeredActivity() {
        return new AdministeredActivity();
    }

    /**
     * Create an instance of {@link MassPerVOIAtTimePoint }
     * 
     */
    public MassPerVOIAtTimePoint createMassPerVOIAtTimePoint() {
        return new MassPerVOIAtTimePoint();
    }

    /**
     * Create an instance of {@link CalibrationCoefficient }
     * 
     */
    public CalibrationCoefficient createCalibrationCoefficient() {
        return new CalibrationCoefficient();
    }

    /**
     * Create an instance of {@link TimeIntegratedActivityPerVOI }
     * 
     */
    public TimeIntegratedActivityPerVOI createTimeIntegratedActivityPerVOI() {
        return new TimeIntegratedActivityPerVOI();
    }

    /**
     * Create an instance of {@link DICOMData }
     * 
     */
    public DICOMData createDICOMData() {
        return new DICOMData();
    }

    /**
     * Create an instance of {@link CalculationOfVoxelMap }
     * 
     */
    public CalculationOfVoxelMap createCalculationOfVoxelMap() {
        return new CalculationOfVoxelMap();
    }

    /**
     * Create an instance of {@link AbsorbedDoseCalculation }
     * 
     */
    public AbsorbedDoseCalculation createAbsorbedDoseCalculation() {
        return new AbsorbedDoseCalculation();
    }

    /**
     * Create an instance of {@link MeanAbsorbedDoseInVOI }
     * 
     */
    public MeanAbsorbedDoseInVOI createMeanAbsorbedDoseInVOI() {
        return new MeanAbsorbedDoseInVOI();
    }

    /**
     * Create an instance of {@link PlanarSensitivityCalculation }
     * 
     */
    public PlanarSensitivityCalculation createPlanarSensitivityCalculation() {
        return new PlanarSensitivityCalculation();
    }

    /**
     * Create an instance of {@link PlanarDataCorrections }
     * 
     */
    public PlanarDataCorrections createPlanarDataCorrections() {
        return new PlanarDataCorrections();
    }

    /**
     * Create an instance of {@link TimePointDescription }
     * 
     */
    public TimePointDescription createTimePointDescription() {
        return new TimePointDescription();
    }

    /**
     * Create an instance of {@link PlanarCalibrationWorkflow }
     * 
     */
    public PlanarCalibrationWorkflow createPlanarCalibrationWorkflow() {
        return new PlanarCalibrationWorkflow();
    }

    /**
     * Create an instance of {@link CTSegmentation }
     * 
     */
    public CTSegmentation createCTSegmentation() {
        return new CTSegmentation();
    }

    /**
     * Create an instance of {@link PlanarAcquisition }
     * 
     */
    public PlanarAcquisition createPlanarAcquisition() {
        return new PlanarAcquisition();
    }

    /**
     * Create an instance of {@link CountsPerVOIAtTimePoint }
     * 
     */
    public CountsPerVOIAtTimePoint createCountsPerVOIAtTimePoint() {
        return new CountsPerVOIAtTimePoint();
    }

    /**
     * Create an instance of {@link EnergyDepositionRatePerVOIAtTimePoint }
     * 
     */
    public EnergyDepositionRatePerVOIAtTimePoint createEnergyDepositionRatePerVOIAtTimePoint() {
        return new EnergyDepositionRatePerVOIAtTimePoint();
    }

    /**
     * Create an instance of {@link TimeAbsorbedDoseCurveFit }
     * 
     */
    public TimeAbsorbedDoseCurveFit createTimeAbsorbedDoseCurveFit() {
        return new TimeAbsorbedDoseCurveFit();
    }

    /**
     * Create an instance of {@link HybridDosimetryViaTimeActivityCurveFit }
     * 
     */
    public HybridDosimetryViaTimeActivityCurveFit createHybridDosimetryViaTimeActivityCurveFit() {
        return new HybridDosimetryViaTimeActivityCurveFit();
    }

    /**
     * Create an instance of {@link VOISegmentationVOIMassDetermination }
     * 
     */
    public VOISegmentationVOIMassDetermination createVOISegmentationVOIMassDetermination() {
        return new VOISegmentationVOIMassDetermination();
    }

    /**
     * Create an instance of {@link MeanAbsorbedDoseInROI }
     * 
     */
    public MeanAbsorbedDoseInROI createMeanAbsorbedDoseInROI() {
        return new MeanAbsorbedDoseInROI();
    }

    /**
     * Create an instance of {@link TimeIntegratedActivityCoefficientPerVOI }
     * 
     */
    public TimeIntegratedActivityCoefficientPerVOI createTimeIntegratedActivityCoefficientPerVOI() {
        return new TimeIntegratedActivityCoefficientPerVOI();
    }

    /**
     * Create an instance of {@link VOIInCT }
     * 
     */
    public VOIInCT createVOIInCT() {
        return new VOIInCT();
    }

    /**
     * Create an instance of {@link TimeIntegratedActivityCoefficientPerROI }
     * 
     */
    public TimeIntegratedActivityCoefficientPerROI createTimeIntegratedActivityCoefficientPerROI() {
        return new TimeIntegratedActivityCoefficientPerROI();
    }

    /**
     * Create an instance of {@link TimeIntegratedActivityPerROI }
     * 
     */
    public TimeIntegratedActivityPerROI createTimeIntegratedActivityPerROI() {
        return new TimeIntegratedActivityPerROI();
    }

    /**
     * Create an instance of {@link MeanAbsorbedDoseRateInVOI }
     * 
     */
    public MeanAbsorbedDoseRateInVOI createMeanAbsorbedDoseRateInVOI() {
        return new MeanAbsorbedDoseRateInVOI();
    }

    /**
     * Create an instance of {@link TwoDimDosimetryViaTimeActivityCurveFit }
     * 
     */
    public TwoDimDosimetryViaTimeActivityCurveFit createTwoDimDosimetryViaTimeActivityCurveFit() {
        return new TwoDimDosimetryViaTimeActivityCurveFit();
    }

    /**
     * Create an instance of {@link MeanAbsorbedDoseRateInROI }
     * 
     */
    public MeanAbsorbedDoseRateInROI createMeanAbsorbedDoseRateInROI() {
        return new MeanAbsorbedDoseRateInROI();
    }

    /**
     * Create an instance of {@link CalculationOfCTNumberCalibrationCurve }
     * 
     */
    public CalculationOfCTNumberCalibrationCurve createCalculationOfCTNumberCalibrationCurve() {
        return new CalculationOfCTNumberCalibrationCurve();
    }

    /**
     * Create an instance of {@link VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation }
     * 
     */
    public VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation createVOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation() {
        return new VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation();
    }

    /**
     * Create an instance of {@link ColdInsert }
     * 
     */
    public ColdInsert createColdInsert() {
        return new ColdInsert();
    }

    /**
     * Create an instance of {@link SPECTSensitivityCalculation }
     * 
     */
    public SPECTSensitivityCalculation createSPECTSensitivityCalculation() {
        return new SPECTSensitivityCalculation();
    }

    /**
     * Create an instance of {@link AbsorbedDoseRateCalculation }
     * 
     */
    public AbsorbedDoseRateCalculation createAbsorbedDoseRateCalculation() {
        return new AbsorbedDoseRateCalculation();
    }

    /**
     * Create an instance of {@link SimpleCTMonteCarloDosimetry }
     * 
     */
    public SimpleCTMonteCarloDosimetry createSimpleCTMonteCarloDosimetry() {
        return new SimpleCTMonteCarloDosimetry();
    }

    /**
     * Create an instance of {@link SegmentationMethodType }
     * 
     */
    public SegmentationMethodType createSegmentationMethodType() {
        return new SegmentationMethodType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "TimePointIdentifierUsed", scope = EnergyDepositionRateCalculation.class)
    public JAXBElement<String> createEnergyDepositionRateCalculationTimePointIdentifierUsed(String value) {
        return new JAXBElement<String>(_EnergyDepositionRateCalculationTimePointIdentifierUsed_QNAME, String.class, EnergyDepositionRateCalculation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "DICOMData", scope = EnergyDepositionRateCalculation.class)
    public JAXBElement<String> createEnergyDepositionRateCalculationDICOMData(String value) {
        return new JAXBElement<String>(_EnergyDepositionRateCalculationDICOMData_QNAME, String.class, EnergyDepositionRateCalculation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonDICOMData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "ThreeDimEnergyDepositionRateMatrixAtTimePointProduced", scope = EnergyDepositionRateCalculation.class)
    public JAXBElement<NonDICOMData> createEnergyDepositionRateCalculationThreeDimEnergyDepositionRateMatrixAtTimePointProduced(NonDICOMData value) {
        return new JAXBElement<NonDICOMData>(_EnergyDepositionRateCalculationThreeDimEnergyDepositionRateMatrixAtTimePointProduced_QNAME, NonDICOMData.class, EnergyDepositionRateCalculation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "VOIIdentifierUsed", scope = EnergyDepositionRateCalculation.class)
    public JAXBElement<String> createEnergyDepositionRateCalculationVOIIdentifierUsed(String value) {
        return new JAXBElement<String>(_EnergyDepositionRateCalculationVOIIdentifierUsed_QNAME, String.class, EnergyDepositionRateCalculation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "VOIUsed", scope = EnergyDepositionRateCalculation.class)
    public JAXBElement<String> createEnergyDepositionRateCalculationVOIUsed(String value) {
        return new JAXBElement<String>(_EnergyDepositionRateCalculationVOIUsed_QNAME, String.class, EnergyDepositionRateCalculation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessExecutionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "ProcessExecutionContext", scope = EnergyDepositionRateCalculation.class)
    public JAXBElement<ProcessExecutionContext> createEnergyDepositionRateCalculationProcessExecutionContext(ProcessExecutionContext value) {
        return new JAXBElement<ProcessExecutionContext>(_EnergyDepositionRateCalculationProcessExecutionContext_QNAME, ProcessExecutionContext.class, EnergyDepositionRateCalculation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationVOISegmentationAndPropagation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "RegistrationVOISegmentationAndPropagation", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<RegistrationVOISegmentationAndPropagation> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowRegistrationVOISegmentationAndPropagation(RegistrationVOISegmentationAndPropagation value) {
        return new JAXBElement<RegistrationVOISegmentationAndPropagation>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowRegistrationVOISegmentationAndPropagation_QNAME, RegistrationVOISegmentationAndPropagation.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RadioBiologicalCalculation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "RadioBiologicalCalculation", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<RadioBiologicalCalculation> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowRadioBiologicalCalculation(RadioBiologicalCalculation value) {
        return new JAXBElement<RadioBiologicalCalculation>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowRadioBiologicalCalculation_QNAME, RadioBiologicalCalculation.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "PatientId", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<String> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowPatientId(String value) {
        return new JAXBElement<String>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowPatientId_QNAME, String.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VOIActivityDetermination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "VOIActivityDetermination", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<VOIActivityDetermination> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowVOIActivityDetermination(VOIActivityDetermination value) {
        return new JAXBElement<VOIActivityDetermination>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowVOIActivityDetermination_QNAME, VOIActivityDetermination.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeActivityCurveFit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "TimeActivityCurveFit", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<TimeActivityCurveFit> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowTimeActivityCurveFit(TimeActivityCurveFit value) {
        return new JAXBElement<TimeActivityCurveFit>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowTimeActivityCurveFit_QNAME, TimeActivityCurveFit.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowVOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation(VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation value) {
        return new JAXBElement<VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowVOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation_QNAME, VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoseRateCurveFitVOITimeIntegration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "DoseRateCurveFitVOITimeIntegration", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<DoseRateCurveFitVOITimeIntegration> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowDoseRateCurveFitVOITimeIntegration(DoseRateCurveFitVOITimeIntegration value) {
        return new JAXBElement<DoseRateCurveFitVOITimeIntegration>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowDoseRateCurveFitVOITimeIntegration_QNAME, DoseRateCurveFitVOITimeIntegration.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "PatientName", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<String> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowPatientName(String value) {
        return new JAXBElement<String>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowPatientName_QNAME, String.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPECTDataAcquisitionAndProcessing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "SPECTDataAcquisitionAndProcessing", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<SPECTDataAcquisitionAndProcessing> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowSPECTDataAcquisitionAndProcessing(SPECTDataAcquisitionAndProcessing value) {
        return new JAXBElement<SPECTDataAcquisitionAndProcessing>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowSPECTDataAcquisitionAndProcessing_QNAME, SPECTDataAcquisitionAndProcessing.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbsorbedDoseCalculation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "AbsorbedDoseCalculation", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<AbsorbedDoseCalculation> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowAbsorbedDoseCalculation(AbsorbedDoseCalculation value) {
        return new JAXBElement<AbsorbedDoseCalculation>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowAbsorbedDoseCalculation_QNAME, AbsorbedDoseCalculation.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.irdbb-medirad.com", name = "ClinicalResearchStudyId", scope = NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class)
    public JAXBElement<String> createNonDicomFileSetDescriptorThreeDimDosimetryWorkflowClinicalResearchStudyId(String value) {
        return new JAXBElement<String>(_NonDicomFileSetDescriptorThreeDimDosimetryWorkflowClinicalResearchStudyId_QNAME, String.class, NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow.class, value);
    }

}
