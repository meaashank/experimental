package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f160058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.tracker.network.g> f160059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f160060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f160061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f160062e;

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list) {
        this(i10, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f160061d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f160062e != null) {
            return new ByteArrayInputStream(this.f160062e);
        }
        return null;
    }

    public final int b() {
        return this.f160060c;
    }

    public final List<com.mbridge.msdk.tracker.network.g> c() {
        return Collections.unmodifiableList(this.f160059b);
    }

    public final int d() {
        return this.f160058a;
    }

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list, int i11, InputStream inputStream) {
        this.f160058a = i10;
        this.f160059b = list;
        this.f160060c = i11;
        this.f160061d = inputStream;
        this.f160062e = null;
    }
}
