/**
 */
package bvccon.impl;

import bvccon.BvcconPackage;
import bvccon.NFROperationalization;
import bvccon.NFRSoftgoal;
import bvccon.NFRSoftgoalContributionOperational;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFR Softgoal Contribution Operational</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bvccon.impl.NFRSoftgoalContributionOperationalImpl#getSource <em>Source</em>}</li>
 *   <li>{@link bvccon.impl.NFRSoftgoalContributionOperationalImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NFRSoftgoalContributionOperationalImpl extends NFRLinkImpl implements NFRSoftgoalContributionOperational
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected NFROperationalization source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected NFRSoftgoal target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NFRSoftgoalContributionOperationalImpl()
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
    return BvcconPackage.Literals.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFROperationalization getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (NFROperationalization)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFROperationalization basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(NFROperationalization newSource)
  {
    NFROperationalization oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFRSoftgoal getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (NFRSoftgoal)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFRSoftgoal basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(NFRSoftgoal newTarget)
  {
    NFRSoftgoal oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET, oldTarget, target));
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
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE:
        setSource((NFROperationalization)newValue);
        return;
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET:
        setTarget((NFRSoftgoal)newValue);
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
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE:
        setSource((NFROperationalization)null);
        return;
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET:
        setTarget((NFRSoftgoal)null);
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
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__SOURCE:
        return source != null;
      case BvcconPackage.NFR_SOFTGOAL_CONTRIBUTION_OPERATIONAL__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //NFRSoftgoalContributionOperationalImpl
