package LessonsJava.patternsProgramming.Proxy;

public class ProxyReapet {
    public static void main(String[] args) {
        ServicePr serve = new ProxyService();
        serve.serveTable();
    }
}

class ProxyService implements ServicePr{
    ServicePr servicePr = new Table();
    @Override
    public void serveTable() {
        System.out.println("Proxy code");
        servicePr.serveTable();
    }
}

interface ServicePr{
    void serveTable();
}

class Table implements ServicePr{
    @Override
    public void serveTable() {
        System.out.println("Table is serve");
    }
}