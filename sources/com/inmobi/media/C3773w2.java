package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3773w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f153489a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlin.G f153490b = kotlin.I.a(C3731t2.f153378a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f153491c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f153492d = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f153493e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final kotlin.G f153494f = kotlin.I.a(C3717s2.f153339a);

    static {
        C3657nb.f().a(new int[]{2, 1}, C3676p2.f153257a);
        C3657nb.a(new F5.P2());
    }

    @dd.o
    @NotNull
    public static final Config a(@NotNull String str, @Nullable String str2, @Nullable InterfaceC3759v2 interfaceC3759v2) {
        return C3745u2.a(str, str2, interfaceC3759v2);
    }

    public static final /* synthetic */ String b() {
        return "ConfigBootstrapHandler";
    }

    public static final /* synthetic */ String f() {
        return "w2";
    }

    @dd.o
    @e.g0
    public static final void g() {
        C3745u2.a();
    }

    @dd.o
    @e.g0
    public static final void h() {
        if (f153491c.getAndSet(false)) {
            kotlin.jvm.internal.G.o(f(), "access$getTAG$cp(...)");
            ((HandlerC3690q2) f153490b.getValue()).sendEmptyMessage(5);
        }
    }

    public static final void a() {
        C3745u2.a();
    }
}
