package FunctionLayer;

import DBAccess.ConstructionMaterialMapper;
import DBAccess.UserMapper;


public class LogicFacade {




    public static User login(String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static CarportMaterial getMaterialBySizeAndName(int size, String name) throws LoginSampleException {
        return ConstructionMaterialMapper.getMaterialBySize(size, name);
    }
    public static CarportMaterial getPillarMaterial(String name) throws LoginSampleException {
        return ConstructionMaterialMapper.getMaterialByName(name);
    }
    public static CarportMaterial getStropMaterialByNameAndSize(String name, int size) throws LoginSampleException {
        return ConstructionMaterialMapper.getMaterialBySize(size, name);
    }




}
