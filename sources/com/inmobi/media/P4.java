package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class P4 extends Lambda implements ed.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f152371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P4(ArrayList arrayList) {
        super(1);
        this.f152371a = arrayList;
    }

    @Override // ed.l
    public final Object invoke(Object obj) {
        C3595j5 it = (C3595j5) obj;
        kotlin.jvm.internal.G.p(it, "it");
        this.f152371a.add(new C3651n5(it));
        return kotlin.L0.f217464a;
    }
}
