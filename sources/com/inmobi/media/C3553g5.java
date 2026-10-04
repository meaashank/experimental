package com.inmobi.media;

import androidx.compose.animation.C1636p;
import kotlin.jvm.internal.C4969v;

/* JADX INFO: renamed from: com.inmobi.media.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3553g5 {
    private final boolean GPID;

    public C3553g5() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3553g5) && this.GPID == ((C3553g5) obj).GPID;
    }

    public final int hashCode() {
        boolean z10 = this.GPID;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return C1636p.a(new StringBuilder("IncludeIdParams(GPID="), this.GPID, ')');
    }

    public C3553g5(boolean z10) {
        this.GPID = z10;
    }

    public /* synthetic */ C3553g5(boolean z10, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
