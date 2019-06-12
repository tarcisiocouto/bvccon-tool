/**
 */
package bvccon.impl;

import bvccon.BvcconPackage;
import bvccon.NFRSoftgoal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFR Softgoal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bvccon.impl.NFRSoftgoalImpl#getNFRSoftgoalPriority <em>NFR Softgoal Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NFRSoftgoalImpl extends NFRElementImpl implements NFRSoftgoal
{
  /**
   * The default value of the '{@link #getNFRSoftgoalPriority() <em>NFR Softgoal Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNFRSoftgoalPriority()
   * @generated
   * @ordered
   */
  protected static final String NFR_SOFTGOAL_PRIORITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNFRSoftgoalPriority() <em>NFR Softgoal Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNFRSoftgoalPriority()
   * @generated
   * @ordered
   */
  protected String nfrSoftgoalPriority = NFR_SOFTGOAL_PRIORITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NFRSoftgoalImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BvcconPackage.Literals.NFR_SOFTGOAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNFRSoftgoalPriority()
  {
    return nfrSoftgoalPriority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNFRSoftgoalPriority(String newNFRSoftgoalPriority)
  {
    String oldNFRSoftgoalPriority = nfrSoftgoalPriority;
    nfrSoftgoalPriority = newNFRSoftgoalPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BvcconPackage.NFR_SOFTGOAL__NFR_SOFTGOAL_PRIORITY, oldNFRSoftgoalPriority, nfrSoftgoalPriority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BvcconPackage.NFR_SOFTGOAL__NFR_SOFTGOAL_PRIORITY:
        return getNFRSoftgoalPriority();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BvcconPackage.NFR_SOFTGOAL__NFR_SOFTGOAL_PRIORITY:
        setNFRSoftgoalPriority((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BvcconPackage.NFR_SOFTGOAL__NFR_SOFTGOAL_PRIORITY:
        setNFRSoftgoalPriority(NFR_SOFTGOAL_PRIORITY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BvcconPackage.NFR_SOFTGOAL__NFR_SOFTGOAL_PRIORITY:
        return NFR_SOFTGOAL_PRIORITY_EDEFAULT == null ? nfrSoftgoalPriority != null : !NFR_SOFTGOAL_PRIORITY_EDEFAULT.equals(nfrSoftgoalPriority);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (NFRSoftgoalPriority: ");
    result.append(nfrSoftgoalPriority);
    result.append(')');
    return result.toString();
  }

} //NFRSoftgoalImpl
