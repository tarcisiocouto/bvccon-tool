/**
 */
package bvccon.util;

import bvccon.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bvccon.BvcconPackage
 * @generated
 */
public class BvcconSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BvcconPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BvcconSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BvcconPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BvcconPackage.NFR_MODEL:
      {
        NFRModel nfrModel = (NFRModel)theEObject;
        T result = caseNFRModel(nfrModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.NFR_ELEMENT:
      {
        NFRElement nfrElement = (NFRElement)theEObject;
        T result = caseNFRElement(nfrElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.NFR_LINK:
      {
        NFRLink nfrLink = (NFRLink)theEObject;
        T result = caseNFRLink(nfrLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.NFR_SOFTGOAL:
      {
        NFRSoftgoal nfrSoftgoal = (NFRSoftgoal)theEObject;
        T result = caseNFRSoftgoal(nfrSoftgoal);
        if (result == null) result = caseNFRElement(nfrSoftgoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.NFR_OPERATIONALIZATION:
      {
        NFROperationalization nfrOperationalization = (NFROperationalization)theEObject;
        T result = caseNFROperationalization(nfrOperationalization);
        if (result == null) result = caseNFRElement(nfrOperationalization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION:
      {
        NFRSoftgoalContribution nfrSoftgoalContribution = (NFRSoftgoalContribution)theEObject;
        T result = caseNFRSoftgoalContribution(nfrSoftgoalContribution);
        if (result == null) result = caseNFRLink(nfrSoftgoalContribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL:
      {
        NFRSoftgoalContributionOperational nfrSoftgoalContributionOperational = (NFRSoftgoalContributionOperational)theEObject;
        T result = caseNFRSoftgoalContributionOperational(nfrSoftgoalContributionOperational);
        if (result == null) result = caseNFRLink(nfrSoftgoalContributionOperational);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.BREAK_CONTRIBUTION:
      {
        BreakContribution breakContribution = (BreakContribution)theEObject;
        T result = caseBreakContribution(breakContribution);
        if (result == null) result = caseNFRSoftgoalContributionOperational(breakContribution);
        if (result == null) result = caseNFRLink(breakContribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.MAKE_CONTRIBUTION:
      {
        MakeContribution makeContribution = (MakeContribution)theEObject;
        T result = caseMakeContribution(makeContribution);
        if (result == null) result = caseNFRSoftgoalContributionOperational(makeContribution);
        if (result == null) result = caseNFRLink(makeContribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.OR_CONTRIBUTION:
      {
        OrContribution orContribution = (OrContribution)theEObject;
        T result = caseOrContribution(orContribution);
        if (result == null) result = caseNFRSoftgoalContribution(orContribution);
        if (result == null) result = caseNFRLink(orContribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.AND_CONTRIBUTION:
      {
        AndContribution andContribution = (AndContribution)theEObject;
        T result = caseAndContribution(andContribution);
        if (result == null) result = caseNFRSoftgoalContribution(andContribution);
        if (result == null) result = caseNFRLink(andContribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.EQUAL_CONTRIBUTION:
      {
        EqualContribution equalContribution = (EqualContribution)theEObject;
        T result = caseEqualContribution(equalContribution);
        if (result == null) result = caseNFRSoftgoalContributionOperational(equalContribution);
        if (result == null) result = caseNFRLink(equalContribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.HURT_CONTRIBUTION:
      {
        HurtContribution hurtContribution = (HurtContribution)theEObject;
        T result = caseHurtContribution(hurtContribution);
        if (result == null) result = caseNFRSoftgoalContributionOperational(hurtContribution);
        if (result == null) result = caseNFRLink(hurtContribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BvcconPackage.HELP_CONTRIBUTION:
      {
        HelpContribution helpContribution = (HelpContribution)theEObject;
        T result = caseHelpContribution(helpContribution);
        if (result == null) result = caseNFRSoftgoalContributionOperational(helpContribution);
        if (result == null) result = caseNFRLink(helpContribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NFR Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NFR Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNFRModel(NFRModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NFR Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NFR Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNFRElement(NFRElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NFR Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NFR Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNFRLink(NFRLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NFR Softgoal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NFR Softgoal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNFRSoftgoal(NFRSoftgoal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NFR Operationalization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NFR Operationalization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNFROperationalization(NFROperationalization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NFR Softgoal Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NFR Softgoal Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNFRSoftgoalContribution(NFRSoftgoalContribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NFR Softgoal Contribution Operational</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NFR Softgoal Contribution Operational</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNFRSoftgoalContributionOperational(NFRSoftgoalContributionOperational object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Break Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Break Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreakContribution(BreakContribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Make Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Make Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMakeContribution(MakeContribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrContribution(OrContribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndContribution(AndContribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equal Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equal Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualContribution(EqualContribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hurt Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hurt Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHurtContribution(HurtContribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Help Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Help Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHelpContribution(HelpContribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BvcconSwitch
