package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class Tb extends G1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tb(String eventType, String str, String eventSource) {
        super(eventType, str);
        kotlin.jvm.internal.G.p(eventType, "eventType");
        kotlin.jvm.internal.G.p(eventSource, "eventSource");
        this.f152464e = eventSource;
    }

    public final String toString() {
        return androidx.compose.runtime.R0.a(new StringBuilder(), this.f151967a, ' ');
    }
}
