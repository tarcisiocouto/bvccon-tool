/**
 */
package bvccon.impl;

import bvccon.AndContribution;
import bvccon.BreakContribution;
import bvccon.BvcconFactory;
import bvccon.BvcconPackage;
import bvccon.EqualContribution;
import bvccon.HelpContribution;
import bvccon.HurtContribution;
import bvccon.MakeContribution;
import bvccon.NFRElement;
import bvccon.NFRLink;
import bvccon.NFRModel;
import bvccon.NFROperationalization;
import bvccon.NFRSoftgoal;
import bvccon.NFRSoftgoalContribution;
import bvccon.NFRSoftgoalContributionOperational;
import bvccon.OrContribution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BvcconPackageImpl extends EPackageImpl implements BvcconPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nfrModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nfrElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nfrLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nfrSoftgoalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nfrOperationalizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nfrSoftgoalContributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nfrSoftgoalContributionOperationalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass breakContributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass makeContributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orContributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andContributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalContributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hurtContributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass helpContributionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see bvccon.BvcconPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BvcconPackageImpl()
  {
    super(eNS_URI, BvcconFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BvcconPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BvcconPackage init()
  {
    if (isInited) return (BvcconPackage)EPackage.Registry.INSTANCE.getEPackage(BvcconPackage.eNS_URI);

    // Obtain or create and register package
    BvcconPackageImpl theBvcconPackage = (BvcconPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BvcconPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BvcconPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBvcconPackage.createPackageContents();

    // Initialize created meta-data
    theBvcconPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBvcconPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BvcconPackage.eNS_URI, theBvcconPackage);
    return theBvcconPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNFRModel()
  {
    return nfrModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNFRModel_Id()
  {
    return (EAttribute)nfrModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNFRModel_Nfrs()
  {
    return (EReference)nfrModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNFRModel_Contributions()
  {
    return (EReference)nfrModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNFRModel_ContributionsOperationals()
  {
    return (EReference)nfrModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNFRModel_Nfroperationalizations()
  {
    return (EReference)nfrModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNFRElement()
  {
    return nfrElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNFRElement_Name()
  {
    return (EAttribute)nfrElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNFRElement_Id()
  {
    return (EAttribute)nfrElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNFRLink()
  {
    return nfrLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNFRSoftgoal()
  {
    return nfrSoftgoalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNFRSoftgoal_NFRSoftgoalPriority()
  {
    return (EAttribute)nfrSoftgoalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNFROperationalization()
  {
    return nfrOperationalizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNFRSoftgoalContribution()
  {
    return nfrSoftgoalContributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNFRSoftgoalContribution_Source()
  {
    return (EReference)nfrSoftgoalContributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNFRSoftgoalContribution_Target()
  {
    return (EReference)nfrSoftgoalContributionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNFRSoftgoalContributionOperational()
  {
    return nfrSoftgoalContributionOperationalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNFRSoftgoalContributionOperational_Source()
  {
    return (EReference)nfrSoftgoalContributionOperationalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNFRSoftgoalContributionOperational_Target()
  {
    return (EReference)nfrSoftgoalContributionOperationalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBreakContribution()
  {
    return breakContributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBreakContribution_Name()
  {
    return (EAttribute)breakContributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMakeContribution()
  {
    return makeContributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMakeContribution_Name()
  {
    return (EAttribute)makeContributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrContribution()
  {
    return orContributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrContribution_Name()
  {
    return (EAttribute)orContributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndContribution()
  {
    return andContributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndContribution_Name()
  {
    return (EAttribute)andContributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualContribution()
  {
    return equalContributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEqualContribution_Name()
  {
    return (EAttribute)equalContributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHurtContribution()
  {
    return hurtContributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHurtContribution_Name()
  {
    return (EAttribute)hurtContributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHelpContribution()
  {
    return helpContributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelpContribution_Name()
  {
    return (EAttribute)helpContributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BvcconFactory getBvcconFactory()
  {
    return (BvcconFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    nfrModelEClass = createEClass(NFR_MODEL);
    createEAttribute(nfrModelEClass, NFR_MODEL__ID);
    createEReference(nfrModelEClass, NFR_MODEL__NFRS);
    createEReference(nfrModelEClass, NFR_MODEL__CONTRIBUTIONS);
    createEReference(nfrModelEClass, NFR_MODEL__CONTRIBUTIONS_OPERATIONALS);
    createEReference(nfrModelEClass, NFR_MODEL__NFROPERATIONALIZATIONS);

    nfrElementEClass = createEClass(NFR_ELEMENT);
    createEAttribute(nfrElementEClass, NFR_ELEMENT__NAME);
    createEAttribute(nfrElementEClass, NFR_ELEMENT__ID);

    nfrLinkEClass = createEClass(NFR_LINK);

    nfrSoftgoalEClass = createEClass(NFR_SOFTGOAL);
    createEAttribute(nfrSoftgoalEClass, NFR_SOFTGOAL__NFR_SOFTGOAL_PRIORITY);

    nfrOperationalizationEClass = createEClass(NFR_OPERATIONALIZATION);

    nfrSoftgoalContributionEClass = createEClass(NFR_SOFTGOAL_CONTRIBUTION);
    createEReference(nfrSoftgoalContributionEClass, NFR_SOFTGOAL_CONTRIBUTION__SOURCE);
    createEReference(nfrSoftgoalContributionEClass, NFR_SOFTGOAL_CONTRIBUTION__TARGET);

    nfrSoftgoalContributionOperationalEClass = createEClass(NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL);
    createEReference(nfrSoftgoalContributionOperationalEClass, NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE);
    createEReference(nfrSoftgoalContributionOperationalEClass, NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET);

    breakContributionEClass = createEClass(BREAK_CONTRIBUTION);
    createEAttribute(breakContributionEClass, BREAK_CONTRIBUTION__NAME);

    makeContributionEClass = createEClass(MAKE_CONTRIBUTION);
    createEAttribute(makeContributionEClass, MAKE_CONTRIBUTION__NAME);

    orContributionEClass = createEClass(OR_CONTRIBUTION);
    createEAttribute(orContributionEClass, OR_CONTRIBUTION__NAME);

    andContributionEClass = createEClass(AND_CONTRIBUTION);
    createEAttribute(andContributionEClass, AND_CONTRIBUTION__NAME);

    equalContributionEClass = createEClass(EQUAL_CONTRIBUTION);
    createEAttribute(equalContributionEClass, EQUAL_CONTRIBUTION__NAME);

    hurtContributionEClass = createEClass(HURT_CONTRIBUTION);
    createEAttribute(hurtContributionEClass, HURT_CONTRIBUTION__NAME);

    helpContributionEClass = createEClass(HELP_CONTRIBUTION);
    createEAttribute(helpContributionEClass, HELP_CONTRIBUTION__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    nfrSoftgoalEClass.getESuperTypes().add(this.getNFRElement());
    nfrOperationalizationEClass.getESuperTypes().add(this.getNFRElement());
    nfrSoftgoalContributionEClass.getESuperTypes().add(this.getNFRLink());
    nfrSoftgoalContributionOperationalEClass.getESuperTypes().add(this.getNFRLink());
    breakContributionEClass.getESuperTypes().add(this.getNFRSoftgoalContributionOperational());
    makeContributionEClass.getESuperTypes().add(this.getNFRSoftgoalContributionOperational());
    orContributionEClass.getESuperTypes().add(this.getNFRSoftgoalContribution());
    andContributionEClass.getESuperTypes().add(this.getNFRSoftgoalContribution());
    equalContributionEClass.getESuperTypes().add(this.getNFRSoftgoalContributionOperational());
    hurtContributionEClass.getESuperTypes().add(this.getNFRSoftgoalContributionOperational());
    helpContributionEClass.getESuperTypes().add(this.getNFRSoftgoalContributionOperational());

    // Initialize classes and features; add operations and parameters
    initEClass(nfrModelEClass, NFRModel.class, "NFRModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNFRModel_Id(), ecorePackage.getEString(), "id", null, 1, 1, NFRModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNFRModel_Nfrs(), this.getNFRSoftgoal(), null, "nfrs", null, 1, -1, NFRModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNFRModel_Contributions(), this.getNFRSoftgoalContribution(), null, "contributions", null, 1, -1, NFRModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNFRModel_ContributionsOperationals(), this.getNFRSoftgoalContributionOperational(), null, "contributionsOperationals", null, 1, -1, NFRModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNFRModel_Nfroperationalizations(), this.getNFROperationalization(), null, "nfroperationalizations", null, 1, -1, NFRModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nfrElementEClass, NFRElement.class, "NFRElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNFRElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NFRElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getNFRElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, NFRElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nfrLinkEClass, NFRLink.class, "NFRLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nfrSoftgoalEClass, NFRSoftgoal.class, "NFRSoftgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNFRSoftgoal_NFRSoftgoalPriority(), ecorePackage.getEString(), "NFRSoftgoalPriority", null, 1, 1, NFRSoftgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nfrOperationalizationEClass, NFROperationalization.class, "NFROperationalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nfrSoftgoalContributionEClass, NFRSoftgoalContribution.class, "NFRSoftgoalContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNFRSoftgoalContribution_Source(), this.getNFRSoftgoal(), null, "source", null, 1, 1, NFRSoftgoalContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNFRSoftgoalContribution_Target(), this.getNFRSoftgoal(), null, "target", null, 1, 1, NFRSoftgoalContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(nfrSoftgoalContributionOperationalEClass, NFRSoftgoalContributionOperational.class, "NFRSoftgoalContributionOperational", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNFRSoftgoalContributionOperational_Source(), this.getNFROperationalization(), null, "source", null, 1, 1, NFRSoftgoalContributionOperational.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNFRSoftgoalContributionOperational_Target(), this.getNFRSoftgoal(), null, "target", null, 1, 1, NFRSoftgoalContributionOperational.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(breakContributionEClass, BreakContribution.class, "BreakContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBreakContribution_Name(), ecorePackage.getEString(), "name", "--", 0, 1, BreakContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(makeContributionEClass, MakeContribution.class, "MakeContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMakeContribution_Name(), ecorePackage.getEString(), "name", "++", 0, 1, MakeContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orContributionEClass, OrContribution.class, "OrContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrContribution_Name(), ecorePackage.getEString(), "name", "OR", 0, 1, OrContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andContributionEClass, AndContribution.class, "AndContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAndContribution_Name(), ecorePackage.getEString(), "name", "AND", 0, 1, AndContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalContributionEClass, EqualContribution.class, "EqualContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEqualContribution_Name(), ecorePackage.getEString(), "name", "=", 0, 1, EqualContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hurtContributionEClass, HurtContribution.class, "HurtContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHurtContribution_Name(), ecorePackage.getEString(), "name", "-", 0, 1, HurtContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(helpContributionEClass, HelpContribution.class, "HelpContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHelpContribution_Name(), ecorePackage.getEString(), "name", "+", 0, 1, HelpContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.link
    createGmf_3Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       });										
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (nfrModelEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });									
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (nfrSoftgoalEClass, 
       source, 
       new String[] 
       {
       "label.placement", "internal",
       "label.icon", "false",
       "label", "name",
       "size", "100,30",
       "border.color", "0,0,0",
       "border.style", "dash"
       });		
    addAnnotation
      (nfrOperationalizationEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "label.placement", "internal",
       "label.icon", "false",
       "label", "name",
       "size", "100,30",
       "border.color", "0,0,0"
       });							
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.link";						
    addAnnotation
      (breakContributionEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "source", "source",
       "target", "target",
       "color", "0,0,0"
       });		
    addAnnotation
      (makeContributionEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "source", "source",
       "target", "target",
       "color", "0,0,0"
       });		
    addAnnotation
      (orContributionEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "source", "source",
       "target", "target",
       "color", "0,0,0"
       });		
    addAnnotation
      (andContributionEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "source", "source",
       "target", "target",
       "color", "0,0,0"
       });		
    addAnnotation
      (equalContributionEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "source", "source",
       "target", "target",
       "color", "0,0,0"
       });		
    addAnnotation
      (hurtContributionEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "source", "source",
       "target", "target",
       "color", "0,0,0"
       });		
    addAnnotation
      (helpContributionEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "source", "source",
       "target", "target",
       "color", "0,0,0"
       });
  }

} //BvcconPackageImpl
