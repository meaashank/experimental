package com.prism.gaia.server;

import com.prism.commons.utils.r0;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.server.W;
import java.util.Objects;
import p6.InterfaceC5394a;
import p6.d;

/* JADX INFO: loaded from: classes6.dex */
public class L extends W.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f166116g = "setting_mgr";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J f166117h = new J();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L f166118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p6.d f166119j;

    static {
        final L l10 = new L();
        f166118i = l10;
        Objects.requireNonNull(l10);
        f166119j = new p6.d("setting_mgr", l10, new d.a() { // from class: com.prism.gaia.server.K
            @Override // p6.d.a
            public final void a() {
                this.f166115a.U5();
            }
        });
    }

    public static InterfaceC5394a T5() {
        return f166119j;
    }

    public static void V5() {
        f166119j.d();
    }

    public static L v5() {
        return f166118i;
    }

    @Override // com.prism.gaia.server.W
    public int B3() {
        V5();
        return f166117h.f166112b;
    }

    @Override // com.prism.gaia.server.W
    public void Q(int i10) {
        V5();
        J j10 = f166117h;
        j10.f166112b = i10;
        j10.b();
        K9.g.f6().q6(j10.f166112b);
    }

    public final void U5() {
        f166117h.a();
    }

    @Override // com.prism.gaia.server.W
    public int f3() {
        V5();
        return f166117h.f166113c;
    }

    @Override // com.prism.gaia.server.W
    public void q0(boolean z10) {
        V5();
        J j10 = f166117h;
        j10.f166114d = z10;
        j10.b();
        if (z10) {
            return;
        }
        U6.c.f68713k.b().b(GaiaContext.j().z());
    }

    @Override // com.prism.gaia.server.W
    public boolean q2() {
        V5();
        return f166117h.f166114d;
    }

    @Override // com.prism.gaia.server.W
    public void r3(int i10) {
        V5();
        J j10 = f166117h;
        j10.f166113c = i10;
        j10.b();
        r0.e(GaiaContext.j().n(), i10 == 1);
    }
}
