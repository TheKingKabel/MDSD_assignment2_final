/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import dk.sdu.mmmi.mdsd.math.MathExp

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MathScopeProvider extends AbstractMathScopeProvider {
	
	override getScope(EObject context, EReference ref){
		switch(context){
			Comparison: {
				var e = EcoreUtil2.getContainerOfType(context, MathExp)
				return Scopes.scopeFor(e.members.filter(),base.getBase());
			}
		}
	}
	
	def IScope getBase(MathExp math){
		var base = math.base
		if(base === null){
			return IScope.NULLSCOPE
		}
		return Scopes.scopeFor(base.members.filter(MathExp),base.getBase())
	}
}