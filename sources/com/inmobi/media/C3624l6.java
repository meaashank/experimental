package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3624l6 extends Lambda implements ed.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3638m6 f153103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f153104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3624l6(C3638m6 c3638m6, Context context) {
        super(1);
        this.f153103a = c3638m6;
        this.f153104b = context;
    }

    @Override // ed.l
    public final Object invoke(Object obj) {
        C3540f6 it = (C3540f6) obj;
        kotlin.jvm.internal.G.p(it, "it");
        C3638m6 c3638m6 = this.f153103a;
        c3638m6.a(this.f153104b, c3638m6.f153137a, it);
        return kotlin.L0.f217464a;
    }
}
