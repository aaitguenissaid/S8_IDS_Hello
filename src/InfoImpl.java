import java.io.Serializable;
import java.rmi.RemoteException;

public class InfoImpl implements Info_itf, Accounting_itf, Serializable {
    private String clientName;
    private int nbCall;

    public InfoImpl(String n){
        clientName = n;
        nbCall = 0;
    }

    @Override
    public String getName() throws RemoteException {
        return this.clientName;
    }

    @Override
    public void numberOfCalls(int number) throws RemoteException {
        System.out.println(this.clientName+" a appelé "+this.nbCall+" fois sayHello");
    }

    public void newCall() {
        this.nbCall++;
        if((nbCall%10) == 0){
            try {
                numberOfCalls(nbCall);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
