package com.prism.commons.exception;

/* JADX INFO: loaded from: classes5.dex */
public class GaiaException extends Exception {
    private static final long serialVersionUID = 1;

    public GaiaException() {
    }

    public GaiaException(Throwable th) {
        super(th);
    }

    public GaiaException(String str) {
        super(str);
    }

    public GaiaException(String str, Throwable th) {
        super(str, th);
    }
}
