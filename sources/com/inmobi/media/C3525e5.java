package com.inmobi.media;

import java.util.UUID;

/* JADX INFO: renamed from: com.inmobi.media.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3525e5 extends G1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f152843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3525e5(String eventId, String componentType, String eventType, String str) {
        super(eventType, str);
        kotlin.jvm.internal.G.p(eventId, "eventId");
        kotlin.jvm.internal.G.p(componentType, "componentType");
        kotlin.jvm.internal.G.p(eventType, "eventType");
        this.f152842e = eventId;
        this.f152843f = componentType;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f151967a);
        sb2.append('@');
        return androidx.compose.runtime.R0.a(sb2, this.f152843f, ' ');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3525e5(String str, String str2, String str3) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        this(string, str, str2, str3);
    }
}
