package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpException extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f139378b = -1;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f139379a;

    public HttpException(int i10) {
        this("Http request failed", i10, null);
    }

    public int d() {
        return this.f139379a;
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1, null);
    }

    public HttpException(String str, int i10) {
        this(str, i10, null);
    }

    public HttpException(String str, int i10, @Nullable Throwable th) {
        super(str + ", status code: " + i10, th);
        this.f139379a = i10;
    }
}
