package com.inmobi.media;

import ed.InterfaceC4376a;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Lc extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lc f152205a = new Lc();

    public Lc() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        Mc mc2 = Mc.f152258a;
        return Executors.newCachedThreadPool(new V4("Mc"));
    }
}
