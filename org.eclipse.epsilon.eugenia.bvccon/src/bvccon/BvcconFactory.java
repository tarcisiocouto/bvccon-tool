/**
 */
package bvccon;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bvccon.BvcconPackage
 * @generated
 */
public interface BvcconFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BvcconFactory eINSTANCE = bvccon.impl.BvcconFactoryImpl.init();

  /**
   * Returns a new object of class '<em>NFR Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NFR Model</em>'.
   * @generated
   */
  NFRModel createNFRModel();

  /**
   * Returns a new object of class '<em>NFR Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NFR Element</em>'.
   * @generated
   */
  NFRElement createNFRElement();

  /**
   * Returns a new object of class '<em>NFR Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NFR Link</em>'.
   * @generated
   */
  NFRLink createNFRLink();

  /**
   * Returns a new object of class '<em>NFR Softgoal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NFR Softgoal</em>'.
   * @generated
   */
  NFRSoftgoal createNFRSoftgoal();

  /**
   * Returns a new object of class '<em>NFR Operationalization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NFR Operationalization</em>'.
   * @generated
   */
  NFROperationalization createNFROperationalization();

  /**
   * Returns a new object of class '<em>NFR Softgoal Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NFR Softgoal Contribution</em>'.
   * @generated
   */
  NFRSoftgoalContribution createNFRSoftgoalContribution();

  /**
   * Returns a new object of class '<em>NFR Softgoal Contribution Operational</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NFR Softgoal Contribution Operational</em>'.
   * @generated
   */
  NFRSoftgoalContributionOperational createNFRSoftgoalContributionOperational();

  /**
   * Returns a new object of class '<em>Break Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Break Contribution</em>'.
   * @generated
   */
  BreakContribution createBreakContribution();

  /**
   * Returns a new object of class '<em>Make Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Make Contribution</em>'.
   * @generated
   */
  MakeContribution createMakeContribution();

  /**
   * Returns a new object of class '<em>Or Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Contribution</em>'.
   * @generated
   */
  OrContribution createOrContribution();

  /**
   * Returns a new object of class '<em>And Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Contribution</em>'.
   * @generated
   */
  AndContribution createAndContribution();

  /**
   * Returns a new object of class '<em>Equal Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equal Contribution</em>'.
   * @generated
   */
  EqualContribution createEqualContribution();

  /**
   * Returns a new object of class '<em>Hurt Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hurt Contribution</em>'.
   * @generated
   */
  HurtContribution createHurtContribution();

  /**
   * Returns a new object of class '<em>Help Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Help Contribution</em>'.
   * @generated
   */
  HelpContribution createHelpContribution();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BvcconPackage getBvcconPackage();

} //BvcconFactory
