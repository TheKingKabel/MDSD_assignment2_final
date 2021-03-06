/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator


import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.Number
import java.util.HashMap
import java.util.Map
import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.math.Expression
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Multiplication
import dk.sdu.mmmi.mdsd.math.Division
import dk.sdu.mmmi.mdsd.math.Let
import dk.sdu.mmmi.mdsd.math.Var

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {
	static Map<String, Integer> variables = new HashMap();
	//static Map<String, Expression> test = new HashMap();
    
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    	
    	//for (math : resource.allContents.toIterable.filter(MathExp)){
    	//	System.out.println(math)
    	//	test.put(math.name, math.exp)
    		
    	//}
    		
     val math = resource.allContents.filter(MathExp).next
     math.compute
     System.out.println(math)
    }
        
    //def static compute(MathExp math) { 
    //	
    //	//doGenerate()
    //	val result = math.exp.computeExp
	//	variables.put(math.name, result)
    //	//System.out.println(math)
    //	//System.out.println(result)
    //	if(math.nextExp !== null) math.nextExp.compute
	//	
    //    return variables
    //}
    
    def static Map<String, Integer> compute(MathExp math) { 
    	
    	val result = math.exp.computeExp(new HashMap<String,Integer>)
		variables.put(math.name, result)
    	if(math.nextExp !== null) math.nextExp.compute
		
        return variables
    }
    
    def static Map<String, Integer> bind(Map<String, Integer> env1, String name, int value){
		val env2 = new HashMap<String,Integer>(env1)
		env2.put(name,value)
		return env2
	}
    
    def static int computeExp(Expression exp, Map<String,Integer> env) {
        if(exp !== null){
	        switch exp {
	            Plus: exp.left.computeExp(env) + exp.right.computeExp(env)
	            Minus: exp.left.computeExp(env) - exp.right.computeExp(env)
	            Multiplication: exp.left.computeExp(env) * exp.right.computeExp(env)
	            Division: exp.left.computeExp(env) / exp.right.computeExp(env)
	            Number: exp.value
	            Var: env.get(exp.id)
	            Let: exp.second.computeExp(env.bind(exp.name,exp.first.computeExp(env)))
	            default: throw new Error("Invalid expression")
	        }
        }
    }
    

    def void displayPanel(Map<String, Integer> result) {
        var resultString = ""
        for (entry : result.entrySet()) {
             resultString += "var " + entry.getKey() + " = " + entry.getValue() + "\n"
        }
        
        JOptionPane.showMessageDialog(null, resultString ,"Math Language", JOptionPane.INFORMATION_MESSAGE)
    }

}