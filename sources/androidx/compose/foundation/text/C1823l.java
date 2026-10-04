package androidx.compose.foundation.text;

import androidx.compose.ui.focus.C1989d;
import androidx.compose.ui.focus.InterfaceC1999n;
import androidx.compose.ui.platform.InterfaceC2285u1;
import androidx.compose.ui.text.input.C2348q;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1823l implements InterfaceC1824m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94401d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final InterfaceC2285u1 f94402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1825n f94403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1999n f94404c;

    public C1823l(@Nullable InterfaceC2285u1 interfaceC2285u1) {
        this.f94402a = interfaceC2285u1;
    }

    @Override // androidx.compose.foundation.text.InterfaceC1824m
    public void a(int i10) {
        C2348q.a aVar = C2348q.f104819b;
        aVar.getClass();
        if (i10 == C2348q.f104827j) {
            InterfaceC1999n interfaceC1999nB = b();
            C1989d.f100651b.getClass();
            interfaceC1999nB.j(C1989d.f100652c);
            return;
        }
        aVar.getClass();
        if (i10 == C2348q.f104826i) {
            InterfaceC1999n interfaceC1999nB2 = b();
            C1989d.f100651b.getClass();
            interfaceC1999nB2.j(C1989d.f100653d);
            return;
        }
        aVar.getClass();
        if (i10 == C2348q.f104828k) {
            InterfaceC2285u1 interfaceC2285u1 = this.f94402a;
            if (interfaceC2285u1 != null) {
                interfaceC2285u1.hide();
                return;
            }
            return;
        }
        aVar.getClass();
        if (i10 == C2348q.f104823f) {
            return;
        }
        aVar.getClass();
        if (i10 == C2348q.f104824g) {
            return;
        }
        aVar.getClass();
        if (i10 == C2348q.f104825h) {
            return;
        }
        aVar.getClass();
        if (i10 == C2348q.f104821d) {
            return;
        }
        aVar.getClass();
    }

    @NotNull
    public final InterfaceC1999n b() {
        InterfaceC1999n interfaceC1999n = this.f94404c;
        if (interfaceC1999n != null) {
            return interfaceC1999n;
        }
        kotlin.jvm.internal.G.S("focusManager");
        throw null;
    }

    @NotNull
    public final C1825n c() {
        C1825n c1825n = this.f94403b;
        if (c1825n != null) {
            return c1825n;
        }
        kotlin.jvm.internal.G.S("keyboardActions");
        throw null;
    }

    public final void d(int i10) {
        ed.l<InterfaceC1824m, L0> lVar;
        C2348q.a aVar = C2348q.f104819b;
        aVar.getClass();
        L0 l02 = null;
        if (i10 == C2348q.f104828k) {
            lVar = c().f94575a;
        } else {
            aVar.getClass();
            if (i10 == C2348q.f104823f) {
                lVar = c().f94576b;
            } else {
                aVar.getClass();
                if (i10 == C2348q.f104827j) {
                    lVar = c().f94577c;
                } else {
                    aVar.getClass();
                    if (i10 == C2348q.f104826i) {
                        lVar = c().f94578d;
                    } else {
                        aVar.getClass();
                        if (i10 == C2348q.f104824g) {
                            lVar = c().f94579e;
                        } else {
                            aVar.getClass();
                            if (i10 == C2348q.f104825h) {
                                lVar = c().f94580f;
                            } else {
                                aVar.getClass();
                                if (i10 != C2348q.f104821d) {
                                    aVar.getClass();
                                    if (i10 != C2348q.f104822e) {
                                        throw new IllegalStateException("invalid ImeAction");
                                    }
                                }
                                lVar = null;
                            }
                        }
                    }
                }
            }
        }
        if (lVar != null) {
            lVar.invoke(this);
            l02 = L0.f217464a;
        }
        if (l02 == null) {
            a(i10);
        }
    }

    public final void e(@NotNull InterfaceC1999n interfaceC1999n) {
        this.f94404c = interfaceC1999n;
    }

    public final void f(@NotNull C1825n c1825n) {
        this.f94403b = c1825n;
    }
}
