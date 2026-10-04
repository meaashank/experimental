package com.prism.commons.exception;

/* JADX INFO: loaded from: classes5.dex */
public class BadStrEncodeException extends GaiaException {
    public BadStrEncodeException() {
    }

    public BadStrEncodeException(Throwable th) {
        super(th);
    }

    public BadStrEncodeException(String str) {
        super(str);
    }

    public BadStrEncodeException(String str, Throwable th) {
        super(str, th);
    }
}
