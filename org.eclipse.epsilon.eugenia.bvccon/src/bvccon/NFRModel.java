/**
 */
package bvccon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFR Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bvccon.NFRModel#getId <em>Id</em>}</li>
 *   <li>{@link bvccon.NFRModel#getNfrs <em>Nfrs</em>}</li>
 *   <li>{@link bvccon.NFRModel#getContributions <em>Contributions</em>}</li>
 *   <li>{@link bvccon.NFRModel#getContributionsOperationals <em>Contributions Operationals</em>}</li>
 *   <li>{@link bvccon.NFRModel#getNfroperationalizations <em>Nfroperationalizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see bvccon.BvcconPackage#getNFRModel()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface NFRModel extends EObject
{
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
   * @see bvccon.BvcconPackage#getNFRModel_Id()
   * @model id="true" required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link bvccon.NFRModel#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Nfrs</b></em>' containment reference list.
   * The list contents are of type {@link bvccon.NFRSoftgoal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nfrs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nfrs</em>' containment reference list.
   * @see bvccon.BvcconPackage#getNFRModel_Nfrs()
   * @model containment="true" required="true"
   * @generated
   */
  EList<NFRSoftgoal> getNfrs();

  /**
   * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
   * The list contents are of type {@link bvccon.NFRSoftgoalContribution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contributions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contributions</em>' containment reference list.
   * @see bvccon.BvcconPackage#getNFRModel_Contributions()
   * @model containment="true" required="true"
   * @generated
   */
  EList<NFRSoftgoalContribution> getContributions();

  /**
   * Returns the value of the '<em><b>Contributions Operationals</b></em>' containment reference list.
   * The list contents are of type {@link bvccon.NFRSoftgoalContributionOperational}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contributions Operationals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contributions Operationals</em>' containment reference list.
   * @see bvccon.BvcconPackage#getNFRModel_ContributionsOperationals()
   * @model containment="true" required="true"
   * @generated
   */
  EList<NFRSoftgoalContributionOperational> getContributionsOperationals();

  /**
   * Returns the value of the '<em><b>Nfroperationalizations</b></em>' containment reference list.
   * The list contents are of type {@link bvccon.NFROperationalization}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nfroperationalizations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nfroperationalizations</em>' containment reference list.
   * @see bvccon.BvcconPackage#getNFRModel_Nfroperationalizations()
   * @model containment="true" required="true"
   * @generated
   */
  EList<NFROperationalization> getNfroperationalizations();

} // NFRModel
