/*package FunctionLayer;

import DBAccess.UserMapper;
import DBAccess.ConstructionMaterialMapper;


public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static carportMaterial getMaterialBySize(int size) {
        carportMaterial carportMaterial = new carportMaterial(size);

    }
    public static carportMaterial getUnitByName(String name) {

    }
    public static carportMaterial getWidthById(int id) {

    }
    public static carportMaterial getThicknessByID(int id, String name) {

    }




}
*/