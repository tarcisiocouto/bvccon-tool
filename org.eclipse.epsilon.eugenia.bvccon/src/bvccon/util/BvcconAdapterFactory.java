/**
 */
package bvccon.util;

import bvccon.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bvccon.BvcconPackage
 * @generated
 */
public class BvcconAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BvcconPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BvcconAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BvcconPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BvcconSwitch<Adapter> modelSwitch =
    new BvcconSwitch<Adapter>()
    {
      @Override
      public Adapter caseNFRModel(NFRModel object)
      {
        return createNFRModelAdapter();
      }
      @Override
      public Adapter caseNFRElement(NFRElement object)
      {
        return createNFRElementAdapter();
      }
      @Override
      public Adapter caseNFRLink(NFRLink object)
      {
        return createNFRLinkAdapter();
      }
      @Override
      public Adapter caseNFRSoftgoal(NFRSoftgoal object)
      {
        return createNFRSoftgoalAdapter();
      }
      @Override
      public Adapter caseNFROperationalization(NFROperationalization object)
      {
        return createNFROperationalizationAdapter();
      }
      @Override
      public Adapter caseNFRSoftgoalContribution(NFRSoftgoalContribution object)
      {
        return createNFRSoftgoalContributionAdapter();
      }
      @Override
      public Adapter caseNFRSoftgoalContributionOperational(NFRSoftgoalContributionOperational object)
      {
        return createNFRSoftgoalContributionOperationalAdapter();
      }
      @Override
      public Adapter caseBreakContribution(BreakContribution object)
      {
        return createBreakContributionAdapter();
      }
      @Override
      public Adapter caseMakeContribution(MakeContribution object)
      {
        return createMakeContributionAdapter();
      }
      @Override
      public Adapter caseOrContribution(OrContribution object)
      {
        return createOrContributionAdapter();
      }
      @Override
      public Adapter caseAndContribution(AndContribution object)
      {
        return createAndContributionAdapter();
      }
      @Override
      public Adapter caseEqualContribution(EqualContribution object)
      {
        return createEqualContributionAdapter();
      }
      @Override
      public Adapter caseHurtContribution(HurtContribution object)
      {
        return createHurtContributionAdapter();
      }
      @Override
      public Adapter caseHelpContribution(HelpContribution object)
      {
        return createHelpContributionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link bvccon.NFRModel <em>NFR Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.NFRModel
   * @generated
   */
  public Adapter createNFRModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.NFRElement <em>NFR Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.NFRElement
   * @generated
   */
  public Adapter createNFRElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.NFRLink <em>NFR Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.NFRLink
   * @generated
   */
  public Adapter createNFRLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.NFRSoftgoal <em>NFR Softgoal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.NFRSoftgoal
   * @generated
   */
  public Adapter createNFRSoftgoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.NFROperationalization <em>NFR Operationalization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.NFROperationalization
   * @generated
   */
  public Adapter createNFROperationalizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.NFRSoftgoalContribution <em>NFR Softgoal Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.NFRSoftgoalContribution
   * @generated
   */
  public Adapter createNFRSoftgoalContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.NFRSoftgoalContributionOperational <em>NFR Softgoal Contribution Operational</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.NFRSoftgoalContributionOperational
   * @generated
   */
  public Adapter createNFRSoftgoalContributionOperationalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.BreakContribution <em>Break Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.BreakContribution
   * @generated
   */
  public Adapter createBreakContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.MakeContribution <em>Make Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.MakeContribution
   * @generated
   */
  public Adapter createMakeContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.OrContribution <em>Or Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.OrContribution
   * @generated
   */
  public Adapter createOrContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.AndContribution <em>And Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.AndContribution
   * @generated
   */
  public Adapter createAndContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.EqualContribution <em>Equal Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.EqualContribution
   * @generated
   */
  public Adapter createEqualContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.HurtContribution <em>Hurt Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.HurtContribution
   * @generated
   */
  public Adapter createHurtContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bvccon.HelpContribution <em>Help Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bvccon.HelpContribution
   * @generated
   */
  public Adapter createHelpContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BvcconAdapterFactory
