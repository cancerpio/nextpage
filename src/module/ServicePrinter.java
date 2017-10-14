package module;

public class ServicePrinter {

    ServiceMessage msg;

    public ServicePrinter(ServiceMessage inputMsg) {
	msg = inputMsg;
    }

    public void printMsg() {
	System.out.println(this.msg.getMessage());
    }
    
    public String getMsg() {
	return this.msg.getMessage();
    }

}
