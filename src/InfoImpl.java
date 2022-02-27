import java.io.Serializable;
import java.rmi.RemoteException;

public class InfoImpl implements Info_itf, Accounting_itf, Serializable {
    private String clientName;
    int nbCall;

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
        System.out.println(this.clientName+" a appelé "+number+" fois sayHello");
    }

    public void newCall() {
        System.out.println("Salut" + this.nbCall);
        this.nbCall = this.nbCall + 1;
        if(true){
            try {
                numberOfCalls(this.nbCall);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
