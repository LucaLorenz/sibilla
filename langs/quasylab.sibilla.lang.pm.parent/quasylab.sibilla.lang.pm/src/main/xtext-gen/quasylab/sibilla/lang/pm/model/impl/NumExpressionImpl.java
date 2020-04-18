/**
 * generated by Xtext 2.18.0.M3
 */
package quasylab.sibilla.lang.pm.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import quasylab.sibilla.lang.pm.model.ModelPackage;
import quasylab.sibilla.lang.pm.model.NumExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quasylab.sibilla.lang.pm.model.impl.NumExpressionImpl#getIntPart <em>Int Part</em>}</li>
 *   <li>{@link quasylab.sibilla.lang.pm.model.impl.NumExpressionImpl#isIsReal <em>Is Real</em>}</li>
 *   <li>{@link quasylab.sibilla.lang.pm.model.impl.NumExpressionImpl#getDecimalPart <em>Decimal Part</em>}</li>
 *   <li>{@link quasylab.sibilla.lang.pm.model.impl.NumExpressionImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumExpressionImpl extends ExpressionImpl implements NumExpression
{
  /**
   * The default value of the '{@link #getIntPart() <em>Int Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntPart()
   * @generated
   * @ordered
   */
  protected static final int INT_PART_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntPart() <em>Int Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntPart()
   * @generated
   * @ordered
   */
  protected int intPart = INT_PART_EDEFAULT;

  /**
   * The default value of the '{@link #isIsReal() <em>Is Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsReal()
   * @generated
   * @ordered
   */
  protected static final boolean IS_REAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsReal() <em>Is Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsReal()
   * @generated
   * @ordered
   */
  protected boolean isReal = IS_REAL_EDEFAULT;

  /**
   * The default value of the '{@link #getDecimalPart() <em>Decimal Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalPart()
   * @generated
   * @ordered
   */
  protected static final int DECIMAL_PART_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDecimalPart() <em>Decimal Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalPart()
   * @generated
   * @ordered
   */
  protected int decimalPart = DECIMAL_PART_EDEFAULT;

  /**
   * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExponent()
   * @generated
   * @ordered
   */
  protected static final int EXPONENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExponent()
   * @generated
   * @ordered
   */
  protected int exponent = EXPONENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumExpressionImpl()
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
    return ModelPackage.Literals.NUM_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntPart()
  {
    return intPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntPart(int newIntPart)
  {
    int oldIntPart = intPart;
    intPart = newIntPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NUM_EXPRESSION__INT_PART, oldIntPart, intPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsReal()
  {
    return isReal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsReal(boolean newIsReal)
  {
    boolean oldIsReal = isReal;
    isReal = newIsReal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NUM_EXPRESSION__IS_REAL, oldIsReal, isReal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDecimalPart()
  {
    return decimalPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecimalPart(int newDecimalPart)
  {
    int oldDecimalPart = decimalPart;
    decimalPart = newDecimalPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NUM_EXPRESSION__DECIMAL_PART, oldDecimalPart, decimalPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getExponent()
  {
    return exponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExponent(int newExponent)
  {
    int oldExponent = exponent;
    exponent = newExponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NUM_EXPRESSION__EXPONENT, oldExponent, exponent));
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
      case ModelPackage.NUM_EXPRESSION__INT_PART:
        return getIntPart();
      case ModelPackage.NUM_EXPRESSION__IS_REAL:
        return isIsReal();
      case ModelPackage.NUM_EXPRESSION__DECIMAL_PART:
        return getDecimalPart();
      case ModelPackage.NUM_EXPRESSION__EXPONENT:
        return getExponent();
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
      case ModelPackage.NUM_EXPRESSION__INT_PART:
        setIntPart((Integer)newValue);
        return;
      case ModelPackage.NUM_EXPRESSION__IS_REAL:
        setIsReal((Boolean)newValue);
        return;
      case ModelPackage.NUM_EXPRESSION__DECIMAL_PART:
        setDecimalPart((Integer)newValue);
        return;
      case ModelPackage.NUM_EXPRESSION__EXPONENT:
        setExponent((Integer)newValue);
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
      case ModelPackage.NUM_EXPRESSION__INT_PART:
        setIntPart(INT_PART_EDEFAULT);
        return;
      case ModelPackage.NUM_EXPRESSION__IS_REAL:
        setIsReal(IS_REAL_EDEFAULT);
        return;
      case ModelPackage.NUM_EXPRESSION__DECIMAL_PART:
        setDecimalPart(DECIMAL_PART_EDEFAULT);
        return;
      case ModelPackage.NUM_EXPRESSION__EXPONENT:
        setExponent(EXPONENT_EDEFAULT);
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
      case ModelPackage.NUM_EXPRESSION__INT_PART:
        return intPart != INT_PART_EDEFAULT;
      case ModelPackage.NUM_EXPRESSION__IS_REAL:
        return isReal != IS_REAL_EDEFAULT;
      case ModelPackage.NUM_EXPRESSION__DECIMAL_PART:
        return decimalPart != DECIMAL_PART_EDEFAULT;
      case ModelPackage.NUM_EXPRESSION__EXPONENT:
        return exponent != EXPONENT_EDEFAULT;
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
    result.append(" (intPart: ");
    result.append(intPart);
    result.append(", isReal: ");
    result.append(isReal);
    result.append(", decimalPart: ");
    result.append(decimalPart);
    result.append(", exponent: ");
    result.append(exponent);
    result.append(')');
    return result.toString();
  }

} //NumExpressionImpl
