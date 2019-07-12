/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl1.myDsl.LayerSegmentRelation;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Segment Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.LayerSegmentRelationImpl#getLayerSegment <em>Layer Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerSegmentRelationImpl extends MinimalEObjectImpl.Container implements LayerSegmentRelation
{
  /**
   * The default value of the '{@link #getLayerSegment() <em>Layer Segment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayerSegment()
   * @generated
   * @ordered
   */
  protected static final String LAYER_SEGMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLayerSegment() <em>Layer Segment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayerSegment()
   * @generated
   * @ordered
   */
  protected String layerSegment = LAYER_SEGMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayerSegmentRelationImpl()
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
    return MyDslPackage.Literals.LAYER_SEGMENT_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLayerSegment()
  {
    return layerSegment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLayerSegment(String newLayerSegment)
  {
    String oldLayerSegment = layerSegment;
    layerSegment = newLayerSegment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LAYER_SEGMENT_RELATION__LAYER_SEGMENT, oldLayerSegment, layerSegment));
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
      case MyDslPackage.LAYER_SEGMENT_RELATION__LAYER_SEGMENT:
        return getLayerSegment();
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
      case MyDslPackage.LAYER_SEGMENT_RELATION__LAYER_SEGMENT:
        setLayerSegment((String)newValue);
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
      case MyDslPackage.LAYER_SEGMENT_RELATION__LAYER_SEGMENT:
        setLayerSegment(LAYER_SEGMENT_EDEFAULT);
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
      case MyDslPackage.LAYER_SEGMENT_RELATION__LAYER_SEGMENT:
        return LAYER_SEGMENT_EDEFAULT == null ? layerSegment != null : !LAYER_SEGMENT_EDEFAULT.equals(layerSegment);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (layerSegment: ");
    result.append(layerSegment);
    result.append(')');
    return result.toString();
  }

} //LayerSegmentRelationImpl
