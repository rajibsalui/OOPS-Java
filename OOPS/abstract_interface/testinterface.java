package OOPS.abstract_interface;

interface Callback{
    void callme(int param);
}

class Client implements Callback{
    public void callme(int p){
        System.out.println("callme called with " + p);
    }
    void nonIFaceMeth(){
        System.out.println("That is non Iface Method.");
    }
}

class AnotherClient implements Callback{
    public void callme(int p)
    {
        System.out.println("Another client version callme");
        System.out.println("p square : " + (p*p));
    }
}

class TestIface2{
    public static void main(String args[]){
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callme(10);
        c = ob;
        c.callme(5);
    }
}