/**
 */
package bvccon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFR Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bvccon.NFRElement#getName <em>Name</em>}</li>
 *   <li>{@link bvccon.NFRElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see bvccon.BvcconPackage#getNFRElement()
 * @model
 * @generated
 */
public interface NFRElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see bvccon.BvcconPackage#getNFRElement_Name()
   * @model required="true" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link bvccon.NFRElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see bvccon.BvcconPackage#getNFRElement_Id()
   * @model id="true" required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link bvccon.NFRElement#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // NFRElement
