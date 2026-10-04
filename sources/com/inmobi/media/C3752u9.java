package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3752u9 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f153421e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f153422a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f153423b = "none";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f153424c = "right";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f153425d;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrientationProperties(allowOrientationChange=");
        sb2.append(this.f153422a);
        sb2.append(", forceOrientation='");
        sb2.append(this.f153423b);
        sb2.append("', direction='");
        sb2.append(this.f153424c);
        sb2.append("', creativeSuppliedProperties=");
        return androidx.compose.runtime.R0.a(sb2, this.f153425d, ')');
    }
}
