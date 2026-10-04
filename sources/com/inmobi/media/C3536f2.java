package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3536f2 extends Lambda implements ed.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3536f2 f152907a = new C3536f2();

    public C3536f2() {
        super(1);
    }

    @Override // ed.l
    public final Object invoke(Object obj) {
        P1 it = (P1) obj;
        kotlin.jvm.internal.G.p(it, "it");
        int i10 = it.f152367a;
        if (i10 == 1 || i10 == 2) {
            kotlin.jvm.internal.G.o(C3564h2.f(), "access$getTAG$p(...)");
            C3564h2.f152964h.set(false);
        } else if (i10 != 10) {
            if (i10 != 11) {
                kotlin.jvm.internal.G.o(C3564h2.f(), "access$getTAG$p(...)");
            } else if (!Boolean.parseBoolean(it.f152368b)) {
                C3564h2.f152957a.h();
            }
        } else if ("available".equals(it.f152368b)) {
            C3564h2.f152957a.h();
        }
        return kotlin.L0.f217464a;
    }
}
