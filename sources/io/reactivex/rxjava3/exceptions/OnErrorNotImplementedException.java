package io.reactivex.rxjava3.exceptions;

import yc.e;

/* JADX INFO: loaded from: classes7.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(String message, @e Throwable e10) {
        super(message, e10 == null ? new NullPointerException() : e10);
    }

    public OnErrorNotImplementedException(@e Throwable e10) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + e10, e10);
    }
}
