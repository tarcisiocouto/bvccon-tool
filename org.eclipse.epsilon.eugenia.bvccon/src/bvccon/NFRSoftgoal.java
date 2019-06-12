/**
 */
package bvccon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFR Softgoal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bvccon.NFRSoftgoal#getNFRSoftgoalPriority <em>NFR Softgoal Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see bvccon.BvcconPackage#getNFRSoftgoal()
 * @model annotation="gmf.node label.placement='internal' label.icon='false' label='name' size='100,30' border.color='0,0,0' border.style='dash'"
 * @generated
 */
public interface NFRSoftgoal extends NFRElement
{
  /**
   * Returns the value of the '<em><b>NFR Softgoal Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>NFR Softgoal Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>NFR Softgoal Priority</em>' attribute.
   * @see #setNFRSoftgoalPriority(String)
   * @see bvccon.BvcconPackage#getNFRSoftgoal_NFRSoftgoalPriority()
   * @model required="true"
   * @generated
   */
  String getNFRSoftgoalPriority();

  /**
   * Sets the value of the '{@link bvccon.NFRSoftgoal#getNFRSoftgoalPriority <em>NFR Softgoal Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NFR Softgoal Priority</em>' attribute.
   * @see #getNFRSoftgoalPriority()
   * @generated
   */
  void setNFRSoftgoalPriority(String value);

} // NFRSoftgoal
