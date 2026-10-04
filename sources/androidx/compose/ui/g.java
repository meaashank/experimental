package androidx.compose.ui;

import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.AbstractC2281t0;
import androidx.compose.ui.platform.C2278s0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class g extends AbstractC2281t0 implements p.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ed.q<p, InterfaceC1946s, Integer, p> f100671d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull ed.l<? super C2278s0, L0> lVar, @NotNull ed.q<? super p, ? super InterfaceC1946s, ? super Integer, ? extends p> qVar) {
        super(lVar);
        this.f100671d = qVar;
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object M(Object obj, ed.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean O(ed.l lVar) {
        return q.b(this, lVar);
    }

    @Override // androidx.compose.ui.p
    public /* synthetic */ p P0(p pVar) {
        return o.a(this, pVar);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean S(ed.l lVar) {
        return q.a(this, lVar);
    }

    @NotNull
    public final ed.q<p, InterfaceC1946s, Integer, p> e() {
        return this.f100671d;
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object l0(Object obj, ed.p pVar) {
        return pVar.invoke(obj, this);
    }
}
