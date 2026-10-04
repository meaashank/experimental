package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3501c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f152799a;

    public C3501c9(Map requestParams) {
        kotlin.jvm.internal.G.p(requestParams, "requestParams");
        this.f152799a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3501c9) && kotlin.jvm.internal.G.g(this.f152799a, ((C3501c9) obj).f152799a);
    }

    public final int hashCode() {
        return this.f152799a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.f152799a + ')';
    }
}
