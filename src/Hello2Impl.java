import java.rmi.RemoteException;

public class Hello2Impl implements Hello2{
    private String message;
    private RegistryImpl registry;

    public Hello2Impl(String s, RegistryImpl r){
        message = s;
        registry = r;
    }

    @Override
    public String sayHello(Accounting_itf a) throws RemoteException {
        String name = ((InfoImpl)a).getName();
        if(registry.ListClient.contains(name)){
            ((InfoImpl) a).newCall();
            return ((InfoImpl) a).getName()+": "+message;
        }else{
            System.out.println("Ce client n'est pas enregistré !");
            return null;
        }
    }
}
