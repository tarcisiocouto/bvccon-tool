/**
 */
package bvccon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Break Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bvccon.BreakContribution#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bvccon.BvcconPackage#getBreakContribution()
 * @model annotation="gmf.link target.decoration='none' source.decoration='none' source='source' target='target' color='0,0,0'"
 * @generated
 */
public interface BreakContribution extends NFRSoftgoalContributionOperational
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"--"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see bvccon.BvcconPackage#getBreakContribution_Name()
   * @model default="--"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link bvccon.BreakContribution#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // BreakContribution
