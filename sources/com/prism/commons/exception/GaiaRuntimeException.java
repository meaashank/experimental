package com.prism.commons.exception;

/* JADX INFO: loaded from: classes5.dex */
public class GaiaRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public GaiaRuntimeException() {
    }

    public GaiaRuntimeException(Throwable th) {
        super(th);
    }

    public GaiaRuntimeException(String str) {
        super(str);
    }

    public GaiaRuntimeException(String str, Throwable th) {
        super(str, th);
    }
}
