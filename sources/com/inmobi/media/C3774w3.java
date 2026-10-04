package com.inmobi.media;

import androidx.compose.animation.C1571b;

/* JADX INFO: renamed from: com.inmobi.media.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3774w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f153497c;

    public C3774w3(int i10, float f10, int i11) {
        this.f153495a = i10;
        this.f153496b = i11;
        this.f153497c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3774w3)) {
            return false;
        }
        C3774w3 c3774w3 = (C3774w3) obj;
        return this.f153495a == c3774w3.f153495a && this.f153496b == c3774w3.f153496b && Float.compare(this.f153497c, c3774w3.f153497c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f153497c) + ((this.f153496b + (this.f153495a * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayProperties(width=");
        sb2.append(this.f153495a);
        sb2.append(", height=");
        sb2.append(this.f153496b);
        sb2.append(", density=");
        return C1571b.a(sb2, this.f153497c, ')');
    }
}
