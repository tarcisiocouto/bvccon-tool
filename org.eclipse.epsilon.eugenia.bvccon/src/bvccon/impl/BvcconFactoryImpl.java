/**
 */
package bvccon.impl;

import bvccon.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BvcconFactoryImpl extends EFactoryImpl implements BvcconFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BvcconFactory init()
  {
    try
    {
      BvcconFactory theBvcconFactory = (BvcconFactory)EPackage.Registry.INSTANCE.getEFactory("bvccon"); 
      if (theBvcconFactory != null)
      {
        return theBvcconFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BvcconFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BvcconFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BvcconPackage.NFR_MODEL: return createNFRModel();
      case BvcconPackage.NFR_ELEMENT: return createNFRElement();
      case BvcconPackage.NFR_LINK: return createNFRLink();
      case BvcconPackage.NFR_SOFTGOAL: return createNFRSoftgoal();
      case BvcconPackage.NFR_OPERATIONALIZATION: return createNFROperationalization();
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION: return createNFRSoftgoalContribution();
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL: return createNFRSoftgoalContributionOperational();
      case BvcconPackage.BREAK_CONTRIBUTION: return createBreakContribution();
      case BvcconPackage.MAKE_CONTRIBUTION: return createMakeContribution();
      case BvcconPackage.OR_CONTRIBUTION: return createOrContribution();
      case BvcconPackage.AND_CONTRIBUTION: return createAndContribution();
      case BvcconPackage.EQUAL_CONTRIBUTION: return createEqualContribution();
      case BvcconPackage.HURT_CONTRIBUTION: return createHurtContribution();
      case BvcconPackage.HELP_CONTRIBUTION: return createHelpContribution();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFRModel createNFRModel()
  {
    NFRModelImpl nfrModel = new NFRModelImpl();
    return nfrModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFRElement createNFRElement()
  {
    NFRElementImpl nfrElement = new NFRElementImpl();
    return nfrElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFRLink createNFRLink()
  {
    NFRLinkImpl nfrLink = new NFRLinkImpl();
    return nfrLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFRSoftgoal createNFRSoftgoal()
  {
    NFRSoftgoalImpl nfrSoftgoal = new NFRSoftgoalImpl();
    return nfrSoftgoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFROperationalization createNFROperationalization()
  {
    NFROperationalizationImpl nfrOperationalization = new NFROperationalizationImpl();
    return nfrOperationalization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFRSoftgoalContribution createNFRSoftgoalContribution()
  {
    NFRSoftgoalContributionImpl nfrSoftgoalContribution = new NFRSoftgoalContributionImpl();
    return nfrSoftgoalContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFRSoftgoalContributionOperational createNFRSoftgoalContributionOperational()
  {
    NFRSoftgoalContributionOperationalImpl nfrSoftgoalContributionOperational = new NFRSoftgoalContributionOperationalImpl();
    return nfrSoftgoalContributionOperational;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakContribution createBreakContribution()
  {
    BreakContributionImpl breakContribution = new BreakContributionImpl();
    return breakContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MakeContribution createMakeContribution()
  {
    MakeContributionImpl makeContribution = new MakeContributionImpl();
    return makeContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrContribution createOrContribution()
  {
    OrContributionImpl orContribution = new OrContributionImpl();
    return orContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndContribution createAndContribution()
  {
    AndContributionImpl andContribution = new AndContributionImpl();
    return andContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualContribution createEqualContribution()
  {
    EqualContributionImpl equalContribution = new EqualContributionImpl();
    return equalContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HurtContribution createHurtContribution()
  {
    HurtContributionImpl hurtContribution = new HurtContributionImpl();
    return hurtContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelpContribution createHelpContribution()
  {
    HelpContributionImpl helpContribution = new HelpContributionImpl();
    return helpContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BvcconPackage getBvcconPackage()
  {
    return (BvcconPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BvcconPackage getPackage()
  {
    return BvcconPackage.eINSTANCE;
  }

} //BvcconFactoryImpl
