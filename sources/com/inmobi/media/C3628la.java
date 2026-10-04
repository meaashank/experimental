package com.inmobi.media;

import android.content.Context;
import ed.InterfaceC4376a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3628la extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3628la f153109a = new C3628la();

    public C3628la() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        Context contextD = C3657nb.d();
        kotlin.jvm.internal.G.m(contextD);
        return Boolean.valueOf(J5.a(contextD, "default").f152165a.getBoolean("enableImraidLogs", false));
    }
}
