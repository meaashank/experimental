package com.prism.lib.pfs.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class PfsIOException extends IOException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188856a;

    public PfsIOException(int i10) {
        this.f188856a = i10;
    }

    public PfsIOException(int i10, Throwable th) {
        super(th);
        this.f188856a = i10;
    }

    public PfsIOException(int i10, String str) {
        super(str);
        this.f188856a = i10;
    }

    public PfsIOException(int i10, String str, Throwable th) {
        super(str, th);
        this.f188856a = i10;
    }
}
