package controller;

public class ActionFactory {

    public static Action create(String action) {
        Action actionObject = null;
        String nomeClass = "action." + action + "Action";
        Class classe = null;
        Object objeto = null;
        try{
           classe = Class.forName(nomeClass);
           objeto = classe.newInstance();
        }catch(Exception ex){
            return null;
        }
        if(!(objeto instanceof Action)){
            return null;
        }
        actionObject = (Action) objeto;
        return actionObject;
    }
    
    public static Action Delete(String action) {
        Action actionObject = null;
        String nomeClass = "action." + action + "Action";
        Class classe = null;
        Object objeto = null;
        try{
           classe = Class.forName(nomeClass);
           objeto = classe.newInstance();
        }catch(Exception ex){
            return null;
        }
        if(!(objeto instanceof Action)){
            return null;
        }
        actionObject = (Action) objeto;
        return actionObject;
    }
    
}
