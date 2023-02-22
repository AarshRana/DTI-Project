package TestServ;

public class MyServProxy implements TestServ.MyServ {
  private String _endpoint = null;
  private TestServ.MyServ myServ = null;
  
  public MyServProxy() {
    _initMyServProxy();
  }
  
  public MyServProxy(String endpoint) {
    _endpoint = endpoint;
    _initMyServProxy();
  }
  
  private void _initMyServProxy() {
    try {
      myServ = (new TestServ.MyServServiceLocator()).getMyServPort();
      if (myServ != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)myServ)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)myServ)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (myServ != null)
      ((javax.xml.rpc.Stub)myServ)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public TestServ.MyServ getMyServ() {
    if (myServ == null)
      _initMyServProxy();
    return myServ;
  }
  
  public java.lang.String sayHello(java.lang.String arg0) throws java.rmi.RemoteException{
    if (myServ == null)
      _initMyServProxy();
    return myServ.sayHello(arg0);
  }
  
  
}