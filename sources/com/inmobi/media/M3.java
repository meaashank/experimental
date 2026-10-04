package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class M3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152220b;

    public M3(ArrayList eventIDs, String payload) {
        kotlin.jvm.internal.G.p(eventIDs, "eventIDs");
        kotlin.jvm.internal.G.p(payload, "payload");
        this.f152219a = eventIDs;
        this.f152220b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M3)) {
            return false;
        }
        M3 m32 = (M3) obj;
        return kotlin.jvm.internal.G.g(this.f152219a, m32.f152219a) && kotlin.jvm.internal.G.g(this.f152220b, m32.f152220b);
    }

    public final int hashCode() {
        return androidx.compose.foundation.text.modifiers.l.a(this.f152220b, this.f152219a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventPayload(eventIDs=");
        sb2.append(this.f152219a);
        sb2.append(", payload=");
        return android.support.v4.media.e.a(sb2, this.f152220b, ", shouldFlushOnFailure=false)");
    }
}
