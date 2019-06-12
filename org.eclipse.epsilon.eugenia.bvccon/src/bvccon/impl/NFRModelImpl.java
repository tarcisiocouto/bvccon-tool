/**
 */
package bvccon.impl;

import bvccon.BvcconPackage;
import bvccon.NFRModel;
import bvccon.NFROperationalization;
import bvccon.NFRSoftgoal;
import bvccon.NFRSoftgoalContribution;
import bvccon.NFRSoftgoalContributionOperational;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFR Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bvccon.impl.NFRModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link bvccon.impl.NFRModelImpl#getNfrs <em>Nfrs</em>}</li>
 *   <li>{@link bvccon.impl.NFRModelImpl#getContributions <em>Contributions</em>}</li>
 *   <li>{@link bvccon.impl.NFRModelImpl#getContributionsOperationals <em>Contributions Operationals</em>}</li>
 *   <li>{@link bvccon.impl.NFRModelImpl#getNfroperationalizations <em>Nfroperationalizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NFRModelImpl extends EObjectImpl implements NFRModel
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getNfrs() <em>Nfrs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNfrs()
   * @generated
   * @ordered
   */
  protected EList<NFRSoftgoal> nfrs;

  /**
   * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributions()
   * @generated
   * @ordered
   */
  protected EList<NFRSoftgoalContribution> contributions;

  /**
   * The cached value of the '{@link #getContributionsOperationals() <em>Contributions Operationals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributionsOperationals()
   * @generated
   * @ordered
   */
  protected EList<NFRSoftgoalContributionOperational> contributionsOperationals;

  /**
   * The cached value of the '{@link #getNfroperationalizations() <em>Nfroperationalizations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNfroperationalizations()
   * @generated
   * @ordered
   */
  protected EList<NFROperationalization> nfroperationalizations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NFRModelImpl()
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
    return BvcconPackage.Literals.NFR_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BvcconPackage.NFR_MODEL__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NFRSoftgoal> getNfrs()
  {
    if (nfrs == null)
    {
      nfrs = new EObjectContainmentEList<NFRSoftgoal>(NFRSoftgoal.class, this, BvcconPackage.NFR_MODEL__NFRS);
    }
    return nfrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NFRSoftgoalContribution> getContributions()
  {
    if (contributions == null)
    {
      contributions = new EObjectContainmentEList<NFRSoftgoalContribution>(NFRSoftgoalContribution.class, this, BvcconPackage.NFR_MODEL__CONTRIBUTIONS);
    }
    return contributions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NFRSoftgoalContributionOperational> getContributionsOperationals()
  {
    if (contributionsOperationals == null)
    {
      contributionsOperationals = new EObjectContainmentEList<NFRSoftgoalContributionOperational>(NFRSoftgoalContributionOperational.class, this, BvcconPackage.NFR_MODEL__CONTRIBUTIONS_OPERATIONALS);
    }
    return contributionsOperationals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NFROperationalization> getNfroperationalizations()
  {
    if (nfroperationalizations == null)
    {
      nfroperationalizations = new EObjectContainmentEList<NFROperationalization>(NFROperationalization.class, this, BvcconPackage.NFR_MODEL__NFROPERATIONALIZATIONS);
    }
    return nfroperationalizations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BvcconPackage.NFR_MODEL__NFRS:
        return ((InternalEList<?>)getNfrs()).basicRemove(otherEnd, msgs);
      case BvcconPackage.NFR_MODEL__CONTRIBUTIONS:
        return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
      case BvcconPackage.NFR_MODEL__CONTRIBUTIONS_OPERATIONALS:
        return ((InternalEList<?>)getContributionsOperationals()).basicRemove(otherEnd, msgs);
      case BvcconPackage.NFR_MODEL__NFROPERATIONALIZATIONS:
        return ((InternalEList<?>)getNfroperationalizations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case BvcconPackage.NFR_MODEL__ID:
        return getId();
      case BvcconPackage.NFR_MODEL__NFRS:
        return getNfrs();
      case BvcconPackage.NFR_MODEL__CONTRIBUTIONS:
        return getContributions();
      case BvcconPackage.NFR_MODEL__CONTRIBUTIONS_OPERATIONALS:
        return getContributionsOperationals();
      case BvcconPackage.NFR_MODEL__NFROPERATIONALIZATIONS:
        return getNfroperationalizations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BvcconPackage.NFR_MODEL__ID:
        setId((String)newValue);
        return;
      case BvcconPackage.NFR_MODEL__NFRS:
        getNfrs().clear();
        getNfrs().addAll((Collection<? extends NFRSoftgoal>)newValue);
        return;
      case BvcconPackage.NFR_MODEL__CONTRIBUTIONS:
        getContributions().clear();
        getContributions().addAll((Collection<? extends NFRSoftgoalContribution>)newValue);
        return;
      case BvcconPackage.NFR_MODEL__CONTRIBUTIONS_OPERATIONALS:
        getContributionsOperationals().clear();
        getContributionsOperationals().addAll((Collection<? extends NFRSoftgoalContributionOperational>)newValue);
        return;
      case BvcconPackage.NFR_MODEL__NFROPERATIONALIZATIONS:
        getNfroperationalizations().clear();
        getNfroperationalizations().addAll((Collection<? extends NFROperationalization>)newValue);
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
      case BvcconPackage.NFR_MODEL__ID:
        setId(ID_EDEFAULT);
        return;
      case BvcconPackage.NFR_MODEL__NFRS:
        getNfrs().clear();
        return;
      case BvcconPackage.NFR_MODEL__CONTRIBUTIONS:
        getContributions().clear();
        return;
      case BvcconPackage.NFR_MODEL__CONTRIBUTIONS_OPERATIONALS:
        getContributionsOperationals().clear();
        return;
      case BvcconPackage.NFR_MODEL__NFROPERATIONALIZATIONS:
        getNfroperationalizations().clear();
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
      case BvcconPackage.NFR_MODEL__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case BvcconPackage.NFR_MODEL__NFRS:
        return nfrs != null && !nfrs.isEmpty();
      case BvcconPackage.NFR_MODEL__CONTRIBUTIONS:
        return contributions != null && !contributions.isEmpty();
      case BvcconPackage.NFR_MODEL__CONTRIBUTIONS_OPERATIONALS:
        return contributionsOperationals != null && !contributionsOperationals.isEmpty();
      case BvcconPackage.NFR_MODEL__NFROPERATIONALIZATIONS:
        return nfroperationalizations != null && !nfroperationalizations.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //NFRModelImpl
