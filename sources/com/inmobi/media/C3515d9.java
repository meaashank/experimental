package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3515d9 extends Lambda implements ed.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3529e9 f152818a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3515d9(C3529e9 c3529e9) {
        super(1);
        this.f152818a = c3529e9;
    }

    @Override // ed.l
    public final Object invoke(Object obj) {
        X8 it = (X8) obj;
        kotlin.jvm.internal.G.p(it, "it");
        N4 n42 = this.f152818a.f152867b;
        if (n42 != null) {
            ((O4) n42).a("NovatiqDataHandler", "Novatiq hyper id synced");
        }
        return kotlin.L0.f217464a;
    }
}
