/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.mdsd.math.MathFactory
 * @model kind="package"
 * @generated
 */
public interface MathPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "math";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/mdsd/Math";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "math";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MathPackage eINSTANCE = dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MathExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MathExpImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMathExp()
   * @generated
   */
  int MATH_EXP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP__NAME = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP__EXP = 1;

  /**
   * The feature id for the '<em><b>Next Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP__NEXT_EXP = 2;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl <em>Let Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLetBinding()
   * @generated
   */
  int LET_BINDING = 2;

  /**
   * The number of structural features of the '<em>Let Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_BINDING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.NumberImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl <em>Variable Use</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVariableUse()
   * @generated
   */
  int VARIABLE_USE = 4;

  /**
   * The number of structural features of the '<em>Variable Use</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_USE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.PlusImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MinusImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MultiplicationImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.DivisionImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 8;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.LetImpl <em>Let</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.LetImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLet()
   * @generated
   */
  int LET = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET__NAME = LET_BINDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET__FIRST = LET_BINDING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET__SECOND = LET_BINDING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Let</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_FEATURE_COUNT = LET_BINDING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.VarImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVar()
   * @generated
   */
  int VAR = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__ID = VARIABLE_USE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = VARIABLE_USE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.MathExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp
   * @generated
   */
  EClass getMathExp();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.MathExp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp#getName()
   * @see #getMathExp()
   * @generated
   */
  EAttribute getMathExp_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.MathExp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp#getExp()
   * @see #getMathExp()
   * @generated
   */
  EReference getMathExp_Exp();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.MathExp#getNextExp <em>Next Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp#getNextExp()
   * @see #getMathExp()
   * @generated
   */
  EReference getMathExp_NextExp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.LetBinding <em>Let Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let Binding</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetBinding
   * @generated
   */
  EClass getLetBinding();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.Number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Number#getValue()
   * @see #getNumber()
   * @generated
   */
  EAttribute getNumber_Value();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.VariableUse <em>Variable Use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Use</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VariableUse
   * @generated
   */
  EClass getVariableUse();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Multiplication#getLeft()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Multiplication#getRight()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Let <em>Let</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Let
   * @generated
   */
  EClass getLet();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.Let#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Let#getName()
   * @see #getLet()
   * @generated
   */
  EAttribute getLet_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Let#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Let#getFirst()
   * @see #getLet()
   * @generated
   */
  EReference getLet_First();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Let#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Let#getSecond()
   * @see #getLet()
   * @generated
   */
  EReference getLet_Second();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.Var#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Var#getId()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Id();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MathFactory getMathFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MathExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MathExpImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMathExp()
     * @generated
     */
    EClass MATH_EXP = eINSTANCE.getMathExp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATH_EXP__NAME = eINSTANCE.getMathExp_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_EXP__EXP = eINSTANCE.getMathExp_Exp();

    /**
     * The meta object literal for the '<em><b>Next Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_EXP__NEXT_EXP = eINSTANCE.getMathExp_NextExp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl <em>Let Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLetBinding()
     * @generated
     */
    EClass LET_BINDING = eINSTANCE.getLetBinding();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.NumberImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl <em>Variable Use</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVariableUse()
     * @generated
     */
    EClass VARIABLE_USE = eINSTANCE.getVariableUse();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.PlusImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MinusImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MultiplicationImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT = eINSTANCE.getMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT = eINSTANCE.getMultiplication_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.DivisionImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.LetImpl <em>Let</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.LetImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLet()
     * @generated
     */
    EClass LET = eINSTANCE.getLet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LET__NAME = eINSTANCE.getLet_Name();

    /**
     * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET__FIRST = eINSTANCE.getLet_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET__SECOND = eINSTANCE.getLet_Second();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.VarImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__ID = eINSTANCE.getVar_Id();

  }

} //MathPackage