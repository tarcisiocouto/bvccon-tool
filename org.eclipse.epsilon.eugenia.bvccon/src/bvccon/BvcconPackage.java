/**
 */
package bvccon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bvccon.BvcconFactory
 * @model kind="package"
 * @generated
 */
public interface BvcconPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bvccon";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "bvccon";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bvccon";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BvcconPackage eINSTANCE = bvccon.impl.BvcconPackageImpl.init();

  /**
   * The meta object id for the '{@link bvccon.impl.NFRModelImpl <em>NFR Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.NFRModelImpl
   * @see bvccon.impl.BvcconPackageImpl#getNFRModel()
   * @generated
   */
  int NFR_MODEL = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_MODEL__ID = 0;

  /**
   * The feature id for the '<em><b>Nfrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_MODEL__NFRS = 1;

  /**
   * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_MODEL__CONTRIBUTIONS = 2;

  /**
   * The feature id for the '<em><b>Contributions Operationals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_MODEL__CONTRIBUTIONS_OPERATIONALS = 3;

  /**
   * The feature id for the '<em><b>Nfroperationalizations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_MODEL__NFROPERATIONALIZATIONS = 4;

  /**
   * The number of structural features of the '<em>NFR Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link bvccon.impl.NFRElementImpl <em>NFR Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.NFRElementImpl
   * @see bvccon.impl.BvcconPackageImpl#getNFRElement()
   * @generated
   */
  int NFR_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_ELEMENT__ID = 1;

  /**
   * The number of structural features of the '<em>NFR Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link bvccon.impl.NFRLinkImpl <em>NFR Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.NFRLinkImpl
   * @see bvccon.impl.BvcconPackageImpl#getNFRLink()
   * @generated
   */
  int NFR_LINK = 2;

  /**
   * The number of structural features of the '<em>NFR Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_LINK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link bvccon.impl.NFRSoftgoalImpl <em>NFR Softgoal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.NFRSoftgoalImpl
   * @see bvccon.impl.BvcconPackageImpl#getNFRSoftgoal()
   * @generated
   */
  int NFR_SOFTGOAL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_SOFTGOAL__NAME = NFR_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_SOFTGOAL__ID = NFR_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>NFR Softgoal Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_SOFTGOAL__NFR_SOFTGOAL_PRIORITY = NFR_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>NFR Softgoal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_SOFTGOAL_FEATURE_COUNT = NFR_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link bvccon.impl.NFROperationalizationImpl <em>NFR Operationalization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.NFROperationalizationImpl
   * @see bvccon.impl.BvcconPackageImpl#getNFROperationalization()
   * @generated
   */
  int NFR_OPERATIONALIZATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_OPERATIONALIZATION__NAME = NFR_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_OPERATIONALIZATION__ID = NFR_ELEMENT__ID;

  /**
   * The number of structural features of the '<em>NFR Operationalization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_OPERATIONALIZATION_FEATURE_COUNT = NFR_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link bvccon.impl.NFRSoftgoalContributionImpl <em>NFR Softgoal Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.NFRSoftgoalContributionImpl
   * @see bvccon.impl.BvcconPackageImpl#getNFRSoftgoalContribution()
   * @generated
   */
  int NFR_SOFTGOAL_CONTRIBUTION = 5;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_SOFTGOAL_CONTRIBUTION__SOURCE = NFR_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_SOFTGOAL_CONTRIBUTION__TARGET = NFR_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>NFR Softgoal Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_SOFTGOAL_CONTRIBUTION_FEATURE_COUNT = NFR_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link bvccon.impl.NFRSoftgoalContributionOperationalImpl <em>NFR Softgoal Contribution Operational</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.NFRSoftgoalContributionOperationalImpl
   * @see bvccon.impl.BvcconPackageImpl#getNFRSoftgoalContributionOperational()
   * @generated
   */
  int NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL = 6;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE = NFR_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET = NFR_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>NFR Softgoal Contribution Operational</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT = NFR_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link bvccon.impl.BreakContributionImpl <em>Break Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.BreakContributionImpl
   * @see bvccon.impl.BvcconPackageImpl#getBreakContribution()
   * @generated
   */
  int BREAK_CONTRIBUTION = 7;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_CONTRIBUTION__SOURCE = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_CONTRIBUTION__TARGET = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_CONTRIBUTION__NAME = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Break Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_CONTRIBUTION_FEATURE_COUNT = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link bvccon.impl.MakeContributionImpl <em>Make Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.MakeContributionImpl
   * @see bvccon.impl.BvcconPackageImpl#getMakeContribution()
   * @generated
   */
  int MAKE_CONTRIBUTION = 8;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_CONTRIBUTION__SOURCE = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_CONTRIBUTION__TARGET = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_CONTRIBUTION__NAME = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Make Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_CONTRIBUTION_FEATURE_COUNT = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link bvccon.impl.OrContributionImpl <em>Or Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.OrContributionImpl
   * @see bvccon.impl.BvcconPackageImpl#getOrContribution()
   * @generated
   */
  int OR_CONTRIBUTION = 9;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONTRIBUTION__SOURCE = NFR_SOFTGOAL_CONTRIBUTION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONTRIBUTION__TARGET = NFR_SOFTGOAL_CONTRIBUTION__TARGET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONTRIBUTION__NAME = NFR_SOFTGOAL_CONTRIBUTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Or Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONTRIBUTION_FEATURE_COUNT = NFR_SOFTGOAL_CONTRIBUTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link bvccon.impl.AndContributionImpl <em>And Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.AndContributionImpl
   * @see bvccon.impl.BvcconPackageImpl#getAndContribution()
   * @generated
   */
  int AND_CONTRIBUTION = 10;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONTRIBUTION__SOURCE = NFR_SOFTGOAL_CONTRIBUTION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONTRIBUTION__TARGET = NFR_SOFTGOAL_CONTRIBUTION__TARGET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONTRIBUTION__NAME = NFR_SOFTGOAL_CONTRIBUTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>And Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONTRIBUTION_FEATURE_COUNT = NFR_SOFTGOAL_CONTRIBUTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link bvccon.impl.EqualContributionImpl <em>Equal Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.EqualContributionImpl
   * @see bvccon.impl.BvcconPackageImpl#getEqualContribution()
   * @generated
   */
  int EQUAL_CONTRIBUTION = 11;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_CONTRIBUTION__SOURCE = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_CONTRIBUTION__TARGET = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_CONTRIBUTION__NAME = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Equal Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_CONTRIBUTION_FEATURE_COUNT = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link bvccon.impl.HurtContributionImpl <em>Hurt Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.HurtContributionImpl
   * @see bvccon.impl.BvcconPackageImpl#getHurtContribution()
   * @generated
   */
  int HURT_CONTRIBUTION = 12;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HURT_CONTRIBUTION__SOURCE = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HURT_CONTRIBUTION__TARGET = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HURT_CONTRIBUTION__NAME = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hurt Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HURT_CONTRIBUTION_FEATURE_COUNT = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link bvccon.impl.HelpContributionImpl <em>Help Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bvccon.impl.HelpContributionImpl
   * @see bvccon.impl.BvcconPackageImpl#getHelpContribution()
   * @generated
   */
  int HELP_CONTRIBUTION = 13;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELP_CONTRIBUTION__SOURCE = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELP_CONTRIBUTION__TARGET = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELP_CONTRIBUTION__NAME = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Help Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELP_CONTRIBUTION_FEATURE_COUNT = NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link bvccon.NFRModel <em>NFR Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFR Model</em>'.
   * @see bvccon.NFRModel
   * @generated
   */
  EClass getNFRModel();

  /**
   * Returns the meta object for the attribute '{@link bvccon.NFRModel#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see bvccon.NFRModel#getId()
   * @see #getNFRModel()
   * @generated
   */
  EAttribute getNFRModel_Id();

  /**
   * Returns the meta object for the containment reference list '{@link bvccon.NFRModel#getNfrs <em>Nfrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nfrs</em>'.
   * @see bvccon.NFRModel#getNfrs()
   * @see #getNFRModel()
   * @generated
   */
  EReference getNFRModel_Nfrs();

  /**
   * Returns the meta object for the containment reference list '{@link bvccon.NFRModel#getContributions <em>Contributions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contributions</em>'.
   * @see bvccon.NFRModel#getContributions()
   * @see #getNFRModel()
   * @generated
   */
  EReference getNFRModel_Contributions();

  /**
   * Returns the meta object for the containment reference list '{@link bvccon.NFRModel#getContributionsOperationals <em>Contributions Operationals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contributions Operationals</em>'.
   * @see bvccon.NFRModel#getContributionsOperationals()
   * @see #getNFRModel()
   * @generated
   */
  EReference getNFRModel_ContributionsOperationals();

  /**
   * Returns the meta object for the containment reference list '{@link bvccon.NFRModel#getNfroperationalizations <em>Nfroperationalizations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nfroperationalizations</em>'.
   * @see bvccon.NFRModel#getNfroperationalizations()
   * @see #getNFRModel()
   * @generated
   */
  EReference getNFRModel_Nfroperationalizations();

  /**
   * Returns the meta object for class '{@link bvccon.NFRElement <em>NFR Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFR Element</em>'.
   * @see bvccon.NFRElement
   * @generated
   */
  EClass getNFRElement();

  /**
   * Returns the meta object for the attribute '{@link bvccon.NFRElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bvccon.NFRElement#getName()
   * @see #getNFRElement()
   * @generated
   */
  EAttribute getNFRElement_Name();

  /**
   * Returns the meta object for the attribute '{@link bvccon.NFRElement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see bvccon.NFRElement#getId()
   * @see #getNFRElement()
   * @generated
   */
  EAttribute getNFRElement_Id();

  /**
   * Returns the meta object for class '{@link bvccon.NFRLink <em>NFR Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFR Link</em>'.
   * @see bvccon.NFRLink
   * @generated
   */
  EClass getNFRLink();

  /**
   * Returns the meta object for class '{@link bvccon.NFRSoftgoal <em>NFR Softgoal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFR Softgoal</em>'.
   * @see bvccon.NFRSoftgoal
   * @generated
   */
  EClass getNFRSoftgoal();

  /**
   * Returns the meta object for the attribute '{@link bvccon.NFRSoftgoal#getNFRSoftgoalPriority <em>NFR Softgoal Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>NFR Softgoal Priority</em>'.
   * @see bvccon.NFRSoftgoal#getNFRSoftgoalPriority()
   * @see #getNFRSoftgoal()
   * @generated
   */
  EAttribute getNFRSoftgoal_NFRSoftgoalPriority();

  /**
   * Returns the meta object for class '{@link bvccon.NFROperationalization <em>NFR Operationalization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFR Operationalization</em>'.
   * @see bvccon.NFROperationalization
   * @generated
   */
  EClass getNFROperationalization();

  /**
   * Returns the meta object for class '{@link bvccon.NFRSoftgoalContribution <em>NFR Softgoal Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFR Softgoal Contribution</em>'.
   * @see bvccon.NFRSoftgoalContribution
   * @generated
   */
  EClass getNFRSoftgoalContribution();

  /**
   * Returns the meta object for the reference '{@link bvccon.NFRSoftgoalContribution#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see bvccon.NFRSoftgoalContribution#getSource()
   * @see #getNFRSoftgoalContribution()
   * @generated
   */
  EReference getNFRSoftgoalContribution_Source();

  /**
   * Returns the meta object for the reference '{@link bvccon.NFRSoftgoalContribution#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see bvccon.NFRSoftgoalContribution#getTarget()
   * @see #getNFRSoftgoalContribution()
   * @generated
   */
  EReference getNFRSoftgoalContribution_Target();

  /**
   * Returns the meta object for class '{@link bvccon.NFRSoftgoalContributionOperational <em>NFR Softgoal Contribution Operational</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFR Softgoal Contribution Operational</em>'.
   * @see bvccon.NFRSoftgoalContributionOperational
   * @generated
   */
  EClass getNFRSoftgoalContributionOperational();

  /**
   * Returns the meta object for the reference '{@link bvccon.NFRSoftgoalContributionOperational#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see bvccon.NFRSoftgoalContributionOperational#getSource()
   * @see #getNFRSoftgoalContributionOperational()
   * @generated
   */
  EReference getNFRSoftgoalContributionOperational_Source();

  /**
   * Returns the meta object for the reference '{@link bvccon.NFRSoftgoalContributionOperational#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see bvccon.NFRSoftgoalContributionOperational#getTarget()
   * @see #getNFRSoftgoalContributionOperational()
   * @generated
   */
  EReference getNFRSoftgoalContributionOperational_Target();

  /**
   * Returns the meta object for class '{@link bvccon.BreakContribution <em>Break Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break Contribution</em>'.
   * @see bvccon.BreakContribution
   * @generated
   */
  EClass getBreakContribution();

  /**
   * Returns the meta object for the attribute '{@link bvccon.BreakContribution#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bvccon.BreakContribution#getName()
   * @see #getBreakContribution()
   * @generated
   */
  EAttribute getBreakContribution_Name();

  /**
   * Returns the meta object for class '{@link bvccon.MakeContribution <em>Make Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Make Contribution</em>'.
   * @see bvccon.MakeContribution
   * @generated
   */
  EClass getMakeContribution();

  /**
   * Returns the meta object for the attribute '{@link bvccon.MakeContribution#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bvccon.MakeContribution#getName()
   * @see #getMakeContribution()
   * @generated
   */
  EAttribute getMakeContribution_Name();

  /**
   * Returns the meta object for class '{@link bvccon.OrContribution <em>Or Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Contribution</em>'.
   * @see bvccon.OrContribution
   * @generated
   */
  EClass getOrContribution();

  /**
   * Returns the meta object for the attribute '{@link bvccon.OrContribution#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bvccon.OrContribution#getName()
   * @see #getOrContribution()
   * @generated
   */
  EAttribute getOrContribution_Name();

  /**
   * Returns the meta object for class '{@link bvccon.AndContribution <em>And Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Contribution</em>'.
   * @see bvccon.AndContribution
   * @generated
   */
  EClass getAndContribution();

  /**
   * Returns the meta object for the attribute '{@link bvccon.AndContribution#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bvccon.AndContribution#getName()
   * @see #getAndContribution()
   * @generated
   */
  EAttribute getAndContribution_Name();

  /**
   * Returns the meta object for class '{@link bvccon.EqualContribution <em>Equal Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equal Contribution</em>'.
   * @see bvccon.EqualContribution
   * @generated
   */
  EClass getEqualContribution();

  /**
   * Returns the meta object for the attribute '{@link bvccon.EqualContribution#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bvccon.EqualContribution#getName()
   * @see #getEqualContribution()
   * @generated
   */
  EAttribute getEqualContribution_Name();

  /**
   * Returns the meta object for class '{@link bvccon.HurtContribution <em>Hurt Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hurt Contribution</em>'.
   * @see bvccon.HurtContribution
   * @generated
   */
  EClass getHurtContribution();

  /**
   * Returns the meta object for the attribute '{@link bvccon.HurtContribution#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bvccon.HurtContribution#getName()
   * @see #getHurtContribution()
   * @generated
   */
  EAttribute getHurtContribution_Name();

  /**
   * Returns the meta object for class '{@link bvccon.HelpContribution <em>Help Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Help Contribution</em>'.
   * @see bvccon.HelpContribution
   * @generated
   */
  EClass getHelpContribution();

  /**
   * Returns the meta object for the attribute '{@link bvccon.HelpContribution#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bvccon.HelpContribution#getName()
   * @see #getHelpContribution()
   * @generated
   */
  EAttribute getHelpContribution_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BvcconFactory getBvcconFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link bvccon.impl.NFRModelImpl <em>NFR Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.NFRModelImpl
     * @see bvccon.impl.BvcconPackageImpl#getNFRModel()
     * @generated
     */
    EClass NFR_MODEL = eINSTANCE.getNFRModel();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR_MODEL__ID = eINSTANCE.getNFRModel_Id();

    /**
     * The meta object literal for the '<em><b>Nfrs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR_MODEL__NFRS = eINSTANCE.getNFRModel_Nfrs();

    /**
     * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR_MODEL__CONTRIBUTIONS = eINSTANCE.getNFRModel_Contributions();

    /**
     * The meta object literal for the '<em><b>Contributions Operationals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR_MODEL__CONTRIBUTIONS_OPERATIONALS = eINSTANCE.getNFRModel_ContributionsOperationals();

    /**
     * The meta object literal for the '<em><b>Nfroperationalizations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR_MODEL__NFROPERATIONALIZATIONS = eINSTANCE.getNFRModel_Nfroperationalizations();

    /**
     * The meta object literal for the '{@link bvccon.impl.NFRElementImpl <em>NFR Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.NFRElementImpl
     * @see bvccon.impl.BvcconPackageImpl#getNFRElement()
     * @generated
     */
    EClass NFR_ELEMENT = eINSTANCE.getNFRElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR_ELEMENT__NAME = eINSTANCE.getNFRElement_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR_ELEMENT__ID = eINSTANCE.getNFRElement_Id();

    /**
     * The meta object literal for the '{@link bvccon.impl.NFRLinkImpl <em>NFR Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.NFRLinkImpl
     * @see bvccon.impl.BvcconPackageImpl#getNFRLink()
     * @generated
     */
    EClass NFR_LINK = eINSTANCE.getNFRLink();

    /**
     * The meta object literal for the '{@link bvccon.impl.NFRSoftgoalImpl <em>NFR Softgoal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.NFRSoftgoalImpl
     * @see bvccon.impl.BvcconPackageImpl#getNFRSoftgoal()
     * @generated
     */
    EClass NFR_SOFTGOAL = eINSTANCE.getNFRSoftgoal();

    /**
     * The meta object literal for the '<em><b>NFR Softgoal Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFR_SOFTGOAL__NFR_SOFTGOAL_PRIORITY = eINSTANCE.getNFRSoftgoal_NFRSoftgoalPriority();

    /**
     * The meta object literal for the '{@link bvccon.impl.NFROperationalizationImpl <em>NFR Operationalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.NFROperationalizationImpl
     * @see bvccon.impl.BvcconPackageImpl#getNFROperationalization()
     * @generated
     */
    EClass NFR_OPERATIONALIZATION = eINSTANCE.getNFROperationalization();

    /**
     * The meta object literal for the '{@link bvccon.impl.NFRSoftgoalContributionImpl <em>NFR Softgoal Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.NFRSoftgoalContributionImpl
     * @see bvccon.impl.BvcconPackageImpl#getNFRSoftgoalContribution()
     * @generated
     */
    EClass NFR_SOFTGOAL_CONTRIBUTION = eINSTANCE.getNFRSoftgoalContribution();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR_SOFTGOAL_CONTRIBUTION__SOURCE = eINSTANCE.getNFRSoftgoalContribution_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR_SOFTGOAL_CONTRIBUTION__TARGET = eINSTANCE.getNFRSoftgoalContribution_Target();

    /**
     * The meta object literal for the '{@link bvccon.impl.NFRSoftgoalContributionOperationalImpl <em>NFR Softgoal Contribution Operational</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.NFRSoftgoalContributionOperationalImpl
     * @see bvccon.impl.BvcconPackageImpl#getNFRSoftgoalContributionOperational()
     * @generated
     */
    EClass NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL = eINSTANCE.getNFRSoftgoalContributionOperational();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE = eINSTANCE.getNFRSoftgoalContributionOperational_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET = eINSTANCE.getNFRSoftgoalContributionOperational_Target();

    /**
     * The meta object literal for the '{@link bvccon.impl.BreakContributionImpl <em>Break Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.BreakContributionImpl
     * @see bvccon.impl.BvcconPackageImpl#getBreakContribution()
     * @generated
     */
    EClass BREAK_CONTRIBUTION = eINSTANCE.getBreakContribution();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BREAK_CONTRIBUTION__NAME = eINSTANCE.getBreakContribution_Name();

    /**
     * The meta object literal for the '{@link bvccon.impl.MakeContributionImpl <em>Make Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.MakeContributionImpl
     * @see bvccon.impl.BvcconPackageImpl#getMakeContribution()
     * @generated
     */
    EClass MAKE_CONTRIBUTION = eINSTANCE.getMakeContribution();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAKE_CONTRIBUTION__NAME = eINSTANCE.getMakeContribution_Name();

    /**
     * The meta object literal for the '{@link bvccon.impl.OrContributionImpl <em>Or Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.OrContributionImpl
     * @see bvccon.impl.BvcconPackageImpl#getOrContribution()
     * @generated
     */
    EClass OR_CONTRIBUTION = eINSTANCE.getOrContribution();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OR_CONTRIBUTION__NAME = eINSTANCE.getOrContribution_Name();

    /**
     * The meta object literal for the '{@link bvccon.impl.AndContributionImpl <em>And Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.AndContributionImpl
     * @see bvccon.impl.BvcconPackageImpl#getAndContribution()
     * @generated
     */
    EClass AND_CONTRIBUTION = eINSTANCE.getAndContribution();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND_CONTRIBUTION__NAME = eINSTANCE.getAndContribution_Name();

    /**
     * The meta object literal for the '{@link bvccon.impl.EqualContributionImpl <em>Equal Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.EqualContributionImpl
     * @see bvccon.impl.BvcconPackageImpl#getEqualContribution()
     * @generated
     */
    EClass EQUAL_CONTRIBUTION = eINSTANCE.getEqualContribution();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUAL_CONTRIBUTION__NAME = eINSTANCE.getEqualContribution_Name();

    /**
     * The meta object literal for the '{@link bvccon.impl.HurtContributionImpl <em>Hurt Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.HurtContributionImpl
     * @see bvccon.impl.BvcconPackageImpl#getHurtContribution()
     * @generated
     */
    EClass HURT_CONTRIBUTION = eINSTANCE.getHurtContribution();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HURT_CONTRIBUTION__NAME = eINSTANCE.getHurtContribution_Name();

    /**
     * The meta object literal for the '{@link bvccon.impl.HelpContributionImpl <em>Help Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bvccon.impl.HelpContributionImpl
     * @see bvccon.impl.BvcconPackageImpl#getHelpContribution()
     * @generated
     */
    EClass HELP_CONTRIBUTION = eINSTANCE.getHelpContribution();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELP_CONTRIBUTION__NAME = eINSTANCE.getHelpContribution_Name();

  }

} //BvcconPackage
