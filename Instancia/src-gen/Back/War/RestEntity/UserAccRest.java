
package mdd.casino.rest.entity;

public class UserAccRes  extends AbstractRest<UserAcc> {
	    @Context
	    private UriInfo context;
	    
	    UserAccFacade facade = BeanUtil.lookupFacadeBean(UserAccFacade.class);
	    
	       public  UserAccRest() {
	            super( UserAcc.class);
	        }
	    
	        @Override
	        public  UserAccFacade getFacade() {
	            return facade;
	        }
}

