/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.myDsl.LayerSegment;
import org.xtext.example.mydsl1.myDsl.LayerSegmentRelation;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.SublayerSegment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.LayerSegmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.LayerSegmentImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.LayerSegmentImpl#getSublayerSegments <em>Sublayer Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerSegmentImpl extends MinimalEObjectImpl.Container implements LayerSegment
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<LayerSegmentRelation> relations;

  /**
   * The cached value of the '{@link #getSublayerSegments() <em>Sublayer Segments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSublayerSegments()
   * @generated
   * @ordered
   */
  protected EList<SublayerSegment> sublayerSegments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayerSegmentImpl()
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
    return MyDslPackage.Literals.LAYER_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LAYER_SEGMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LayerSegmentRelation> getRelations()
  {
    if (relations == null)
    {
      relations = new EObjectContainmentEList<LayerSegmentRelation>(LayerSegmentRelation.class, this, MyDslPackage.LAYER_SEGMENT__RELATIONS);
    }
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SublayerSegment> getSublayerSegments()
  {
    if (sublayerSegments == null)
    {
      sublayerSegments = new EObjectContainmentEList<SublayerSegment>(SublayerSegment.class, this, MyDslPackage.LAYER_SEGMENT__SUBLAYER_SEGMENTS);
    }
    return sublayerSegments;
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
      case MyDslPackage.LAYER_SEGMENT__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
      case MyDslPackage.LAYER_SEGMENT__SUBLAYER_SEGMENTS:
        return ((InternalEList<?>)getSublayerSegments()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.LAYER_SEGMENT__NAME:
        return getName();
      case MyDslPackage.LAYER_SEGMENT__RELATIONS:
        return getRelations();
      case MyDslPackage.LAYER_SEGMENT__SUBLAYER_SEGMENTS:
        return getSublayerSegments();
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
      case MyDslPackage.LAYER_SEGMENT__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.LAYER_SEGMENT__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends LayerSegmentRelation>)newValue);
        return;
      case MyDslPackage.LAYER_SEGMENT__SUBLAYER_SEGMENTS:
        getSublayerSegments().clear();
        getSublayerSegments().addAll((Collection<? extends SublayerSegment>)newValue);
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
      case MyDslPackage.LAYER_SEGMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.LAYER_SEGMENT__RELATIONS:
        getRelations().clear();
        return;
      case MyDslPackage.LAYER_SEGMENT__SUBLAYER_SEGMENTS:
        getSublayerSegments().clear();
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
      case MyDslPackage.LAYER_SEGMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.LAYER_SEGMENT__RELATIONS:
        return relations != null && !relations.isEmpty();
      case MyDslPackage.LAYER_SEGMENT__SUBLAYER_SEGMENTS:
        return sublayerSegments != null && !sublayerSegments.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LayerSegmentImpl
