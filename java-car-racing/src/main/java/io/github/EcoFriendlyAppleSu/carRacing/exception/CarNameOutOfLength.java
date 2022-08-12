package io.github.EcoFriendlyAppleSu.carRacing.exception;

/*
 * Throwable : checked Exception ( 반드시 예외 처리를 해줘야 하며, 컴파일 시점에 확인된 Exception )
 * 따라서, Add exception to method signature, Surround with try/catch
 * */
public class CarNameOutOfLength extends StringIndexOutOfBoundsException {
    public CarNameOutOfLength() {
    }

    public CarNameOutOfLength(String message) {
        super(message);
    }
}
