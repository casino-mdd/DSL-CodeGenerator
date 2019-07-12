/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl1.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Functionality#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Functionality#getRoute <em>Route</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Functionality#getWrap <em>Wrap</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Functionality#getRender <em>Render</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Functionality#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Functionality#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Functionality#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getFunctionality()
 * @model
 * @generated
 */
public interface Functionality extends AbstractFrontElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getFunctionality_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.Functionality#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Route</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Route</em>' reference.
   * @see #setRoute(RouterComponent)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getFunctionality_Route()
   * @model
   * @generated
   */
  RouterComponent getRoute();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.Functionality#getRoute <em>Route</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Route</em>' reference.
   * @see #getRoute()
   * @generated
   */
  void setRoute(RouterComponent value);

  /**
   * Returns the value of the '<em><b>Wrap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wrap</em>' reference.
   * @see #setWrap(Container)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getFunctionality_Wrap()
   * @model
   * @generated
   */
  Container getWrap();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.Functionality#getWrap <em>Wrap</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wrap</em>' reference.
   * @see #getWrap()
   * @generated
   */
  void setWrap(Container value);

  /**
   * Returns the value of the '<em><b>Render</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Render</em>' reference.
   * @see #setRender(Visualizer)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getFunctionality_Render()
   * @model
   * @generated
   */
  Visualizer getRender();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.Functionality#getRender <em>Render</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Render</em>' reference.
   * @see #getRender()
   * @generated
   */
  void setRender(Visualizer value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getFunctionality_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.Functionality#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

  /**
   * Returns the value of the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference.
   * @see #setService(ServiceFront)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getFunctionality_Service()
   * @model
   * @generated
   */
  ServiceFront getService();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.Functionality#getService <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' reference.
   * @see #getService()
   * @generated
   */
  void setService(ServiceFront value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Directory)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getFunctionality_Type()
   * @model
   * @generated
   */
  Directory getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.Functionality#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Directory value);

} // Functionality
