/*
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl1.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl1.myDsl.LayerSegment
import org.xtext.example.mydsl1.myDsl.EntityName
import org.eclipse.xtext.naming.IQualifiedNameProvider
import javax.inject.Inject
import org.xtext.example.mydsl1.myDsl.GeneralEntity
import org.xtext.example.mydsl1.myDsl.Property
import java.util.ArrayList
import org.xtext.example.mydsl1.myDsl.Module
import org.apache.log4j.chainsaw.Main
import org.xtext.example.mydsl1.myDsl.SpecialEntity
import org.xtext.example.mydsl1.myDsl.Json
import org.xtext.example.mydsl1.myDsl.Visualizer
import java.lang.invoke.MethodHandles.Lookup
import org.xtext.example.mydsl1.myDsl.ServiceFront
import org.xtext.example.mydsl1.generator.FrontGenerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		var frontGen = new FrontGenerator;

		frontGen.doGenerate(resource, fsa, context);

		for (layerS : resource.allContents.toIterable.filter(LayerSegment)) {

			if (layerS.fullyQualifiedName.toString().equals("Back.Ejb.Facade")) {

				for (en : resource.allContents.toIterable.filter(EntityName)) {
					fsa.generateFile(layerS.fullyQualifiedName.toString("/") + "/" + en.name + "Facade.java",
						en.compile)
				}
			}

			if (layerS.fullyQualifiedName.toString().equals("Back.Ejb.Dto")) {
				for (en : resource.allContents.toIterable.filter(EntityName)) {
					fsa.generateFile(layerS.fullyQualifiedName.toString("/") + "/" + en.name + "Dto.java",
						en.compileDto)
				}
			}

			if (layerS.fullyQualifiedName.toString().equals("Back.War.RestEntity")) {
				for (en : resource.allContents.toIterable.filter(EntityName)) {
					fsa.generateFile(layerS.fullyQualifiedName.toString("/") + "/" + en.name + "Rest.java",
						en.compileRest)
				}
			}

			if (layerS.fullyQualifiedName.toString().equals("Back.Ejb.Pojo")) {
				for (en : resource.allContents.toIterable.filter(GeneralEntity)) {
					fsa.generateFile(layerS.fullyQualifiedName.toString("/") + "/" + en.name.name + ".java",
						en.compilePojo)
				}
			}

		}

	}

   def typeJava(String type){
		if(type.equals("Num")){
			return "Integer";
		}
		return type;
	}

	def compilePojo(GeneralEntity e) ''' 
		
		package mdd.casino.jpa.entity.pojo;
		
		public class �e.name.name�{
		
				�FOR p : e.properties�
					�typeJava(p.type.name)� �p.name�;
				�ENDFOR�
				
				//Get Set
				�FOR p : e.properties�
					public void set�p.name.toFirstUpper()�(�typeJava(p.type.name)� �p.name�){
						this.�p.name�=�p.name�;
				    }
			    public �typeJava(p.type.name)� get�p.name.toFirstUpper()�(){
			    	return this.�p.name�;
			    }
				�ENDFOR�
				
		}
		
	'''

	def compileDto(EntityName e) ''' 
		
		package mdd.casino.jpa.entity.dto;
		
		public class �e.name�Dto {
			
		}
		
	'''

	def compileRest(EntityName e) ''' 
		
		package mdd.casino.rest.entity;
		
		public class �e.name�Res  extends AbstractRest<�e.name�> {
			    @Context
			    private UriInfo context;
			    
			    �e.name�Facade facade = BeanUtil.lookupFacadeBean(�e.name�Facade.class);
			    
			       public  �e.name�Rest() {
			            super( �e.name�.class);
			        }
			    
			        @Override
			        public  �e.name�Facade getFacade() {
			            return facade;
			        }
		}
		
	'''

	def compile(EntityName e) ''' 
		
		package mdd.casino.jpa.entity.facade;
		
		import javax.ejb.Stateless;
		import javax.persistence.EntityManager;
		import javax.persistence.EntityManagerFactory;
		import javax.persistence.PersistenceUnit;
		import mdd.casino.jpa.entity.pojo.�e.name�;
		
		@Stateless
		public class �e.name�Facade extends AbtractFacade{
		
		
			    @PersistenceUnit
			    private EntityManagerFactory emf;
		
			    @Override
			    protected EntityManager getEntityManager() {
			        return emf.createEntityManager();
			    }
		
			    public �e.name�Facade() {
			        super(�e.name�.class);
			    }
			    
		
		}	
	'''

}
