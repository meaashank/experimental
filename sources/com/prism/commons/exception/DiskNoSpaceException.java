package com.prism.commons.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class DiskNoSpaceException extends IOException {
    public DiskNoSpaceException() {
    }

    public DiskNoSpaceException(Throwable th) {
        super(th);
    }

    public DiskNoSpaceException(String str) {
        super(str);
    }

    public DiskNoSpaceException(String str, Throwable th) {
        super(str, th);
    }
}
