/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Segment Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.LayerSegmentRelation#getLayerSegment <em>Layer Segment</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getLayerSegmentRelation()
 * @model
 * @generated
 */
public interface LayerSegmentRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>Layer Segment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layer Segment</em>' attribute.
   * @see #setLayerSegment(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getLayerSegmentRelation_LayerSegment()
   * @model
   * @generated
   */
  String getLayerSegment();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.LayerSegmentRelation#getLayerSegment <em>Layer Segment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layer Segment</em>' attribute.
   * @see #getLayerSegment()
   * @generated
   */
  void setLayerSegment(String value);

} // LayerSegmentRelation