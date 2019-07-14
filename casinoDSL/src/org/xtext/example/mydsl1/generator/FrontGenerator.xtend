package org.xtext.example.mydsl1.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.ArrayList
import org.xtext.example.mydsl1.myDsl.EntityName
import org.xtext.example.mydsl1.myDsl.Json

public class FrontGenerator extends AbstractGenerator {

	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		var reactDir = "casino-front/";
		var reactSrcDirectory = reactDir + "src/";
		var entities = new ArrayList<EntityName>();

		var jsonFile = resource.allContents.filter(Json).toIterable().get(0);
		fsa.generateFile(reactDir + jsonFile.name + ".json", jsonFile.compileJsonFile);

		for (e : resource.allContents.toIterable.filter(EntityName))
			entities.add(e);

		fsa.generateFile(reactSrcDirectory + "/Store/Constants.js", compileConstants(entities));

		for (uiComp : resource.allContents.toIterable.filter(EntityName)) {
			fsa.generateFile(reactSrcDirectory + "UI/" + uiComp.name + "/" + uiComp.name + ".js",
				uiComp.compileUiComponent);
			fsa.generateFile(
				reactSrcDirectory + "Store/Actions/" + uiComp.name + "Actions.js",
				uiComp.compileActionComponent
			);
			fsa.generateFile(
				reactSrcDirectory + "Store/Reducers/" + uiComp.name + "Reducer.js",
				uiComp.compileReducers
			);
			fsa.generateFile(
				reactSrcDirectory + "Services/" + uiComp.name + "Services.js",
				uiComp.compileService
			);
			fsa.generateFile(
				reactSrcDirectory + "Containers/" + uiComp.name + "Container.js",
				uiComp.compileContainer
			);
		}

	}

	def compileUiComponent(EntityName e) '''
		import {} from ''
			  	
				class «e.name» extends Component{
					constructor(props){
						
					}
					
					render(){
						return();
					}
				}
				
				return default «e.name»
	'''

	def compileActionComponent(EntityName e) '''
		import {«e.name»ReducerConstants as C} from ''
		
		const set«e.name»s = («e.name»s) => {
			return {
				type: SET_C.«e.name»S_LIST,
				«e.name»s
			}
		}
		
		export const fetch«e.name»s = () => {
			return dispatch => {
				«e.name»Services.get«e.name»List()
				.then(response => {
					dispach( set«e.name»s(response.data));
				})
				.catch(err => {
					
				})
			}
		}
		
		export const create«e.name» = («e.name.toLowerCase()»Info) => {
			return dispatch
		}
		 	
	'''

	def compileReducers(EntityName e) '''
		import {«e.name»ReducerConstants as C} from ''
		
		const initialState = {
		 		«e.name.toLowerCase()»s: [],
		 	};
		
		export default function «e.name»Reducer(state = initialState, action){
			switch(action.type){
				case C.SET_«e.name.toUpperCase()»_LIST:
				return {
				...state,
							«e.name.toLowerCase()»s: action.«e.name.toLowerCase»s
				}
				default:
					return state;
					}
				}
		
	'''

	def compileService(EntityName e) '''
		import request from './RequestWrapper';
		
		function create«e.name»(«e.name»Info){
			
		}
		
		function get«e.name»List(){
			
		}
		export default{
			
		};
	'''

	def compileContainer(EntityName e) '''
		import {} from ''
		
		const mapStateToProps = (state) => {
			return {
				
			};
		}
		
		const mapDispatchToProps = (dispatch) => {
			return{
				
			};
		}
		
		export default connect(mapStateToProps, mapDispatchToProps)();
	'''

	def compileConstants(ArrayList<EntityName> entities) '''
		«FOR e : entities»
			export const «e.name»ReducerConstants={
				
			};
		«ENDFOR»
		
	'''

	def compileJsonFile(Json file) '''
		{
			"name": "casino-front",
			"version": "0.1.0",
			"private": true,
			"dependencies": {},
			"scripts": {},
			"eslintConfig": {},
			"browserslist": {}
		}
	'''
}
