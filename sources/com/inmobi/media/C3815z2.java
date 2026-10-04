package com.inmobi.media;

import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3815z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f153667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153668b;

    public C3815z2(byte b10, String str) {
        this.f153667a = b10;
        this.f153668b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3815z2)) {
            return false;
        }
        C3815z2 c3815z2 = (C3815z2) obj;
        return this.f153667a == c3815z2.f153667a && kotlin.jvm.internal.G.g(this.f153668b, c3815z2.f153668b);
    }

    public final int hashCode() {
        int i10 = this.f153667a * Ascii.US;
        String str = this.f153668b;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigError(errorCode=");
        sb2.append((int) this.f153667a);
        sb2.append(", errorMessage=");
        return androidx.compose.runtime.R0.a(sb2, this.f153668b, ')');
    }
}
