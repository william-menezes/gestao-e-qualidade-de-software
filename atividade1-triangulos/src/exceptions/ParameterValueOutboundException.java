package exceptions;

public class ParameterValueOutboundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ParameterValueOutboundException() {
        super();
    }

    public ParameterValueOutboundException(String msg) {
        super(msg);
    }
}
