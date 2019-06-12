/**
 */
package bvccon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFR Softgoal Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bvccon.NFRSoftgoalContribution#getSource <em>Source</em>}</li>
 *   <li>{@link bvccon.NFRSoftgoalContribution#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see bvccon.BvcconPackage#getNFRSoftgoalContribution()
 * @model
 * @generated
 */
public interface NFRSoftgoalContribution extends NFRLink
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(NFRSoftgoal)
   * @see bvccon.BvcconPackage#getNFRSoftgoalContribution_Source()
   * @model required="true" ordered="false"
   * @generated
   */
  NFRSoftgoal getSource();

  /**
   * Sets the value of the '{@link bvccon.NFRSoftgoalContribution#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(NFRSoftgoal value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(NFRSoftgoal)
   * @see bvccon.BvcconPackage#getNFRSoftgoalContribution_Target()
   * @model required="true" ordered="false"
   * @generated
   */
  NFRSoftgoal getTarget();

  /**
   * Sets the value of the '{@link bvccon.NFRSoftgoalContribution#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(NFRSoftgoal value);

} // NFRSoftgoalContribution
