/**
 * generated by Xtext 2.18.0.M3
 */
package quasylab.sibilla.lang.pm.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import quasylab.sibilla.lang.pm.model.ModelPackage;
import quasylab.sibilla.lang.pm.model.Population;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quasylab.sibilla.lang.pm.model.impl.SystemImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ElementImpl implements quasylab.sibilla.lang.pm.model.System
{
  /**
   * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopulation()
   * @generated
   * @ordered
   */
  protected Population population;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
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
    return ModelPackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Population getPopulation()
  {
    return population;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPopulation(Population newPopulation, NotificationChain msgs)
  {
    Population oldPopulation = population;
    population = newPopulation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM__POPULATION, oldPopulation, newPopulation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopulation(Population newPopulation)
  {
    if (newPopulation != population)
    {
      NotificationChain msgs = null;
      if (population != null)
        msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SYSTEM__POPULATION, null, msgs);
      if (newPopulation != null)
        msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SYSTEM__POPULATION, null, msgs);
      msgs = basicSetPopulation(newPopulation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM__POPULATION, newPopulation, newPopulation));
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
      case ModelPackage.SYSTEM__POPULATION:
        return basicSetPopulation(null, msgs);
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
      case ModelPackage.SYSTEM__POPULATION:
        return getPopulation();
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
      case ModelPackage.SYSTEM__POPULATION:
        setPopulation((Population)newValue);
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
      case ModelPackage.SYSTEM__POPULATION:
        setPopulation((Population)null);
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
      case ModelPackage.SYSTEM__POPULATION:
        return population != null;
    }
    return super.eIsSet(featureID);
  }

} //SystemImpl