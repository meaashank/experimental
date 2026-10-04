package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: renamed from: com.inmobi.media.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3718s3 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream[] f153340a;

    public C3718s3(InputStream[] inputStreamArr) {
        this.f153340a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f153340a) {
            Bc.a(inputStream);
        }
    }
}
