package com.prism.commons.exception;

/* JADX INFO: loaded from: classes5.dex */
public class UnknownException extends Exception {
    private static final long serialVersionUID = 1;

    public UnknownException() {
    }

    public UnknownException(Throwable th) {
        super(th);
    }

    public UnknownException(String str) {
        super(str);
    }

    public UnknownException(String str, Throwable th) {
        super(str, th);
    }
}
