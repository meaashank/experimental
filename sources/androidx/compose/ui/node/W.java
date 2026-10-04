package androidx.compose.ui.node;

import androidx.compose.ui.p;
import androidx.compose.ui.p.d;
import androidx.compose.ui.platform.B1;
import androidx.compose.ui.platform.C2278s0;
import androidx.compose.ui.platform.InterfaceC2275r0;
import kotlin.jvm.internal.C4967t;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 2)
public abstract class W<N extends p.d> implements p.c, InterfaceC2275r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103023b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public C2278s0 f103024a;

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object M(Object obj, ed.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean O(ed.l lVar) {
        return androidx.compose.ui.q.b(this, lVar);
    }

    @Override // androidx.compose.ui.p
    public /* synthetic */ androidx.compose.ui.p P0(androidx.compose.ui.p pVar) {
        return androidx.compose.ui.o.a(this, pVar);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean S(ed.l lVar) {
        return androidx.compose.ui.q.a(this, lVar);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    @Nullable
    public final Object a() {
        return e().f103928b;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    @NotNull
    public final InterfaceC5000m<B1> b() {
        return e().f103929c;
    }

    @NotNull
    public abstract N c();

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    @Nullable
    public final String d() {
        return e().f103927a;
    }

    public final C2278s0 e() {
        C2278s0 c2278s0 = this.f103024a;
        if (c2278s0 != null) {
            return c2278s0;
        }
        C2278s0 c2278s02 = new C2278s0();
        c2278s02.f103927a = ((C4967t) kotlin.jvm.internal.O.d(getClass())).Q();
        f(c2278s02);
        this.f103024a = c2278s02;
        return c2278s02;
    }

    public abstract boolean equals(@Nullable Object obj);

    public void f(@NotNull C2278s0 c2278s0) {
        androidx.compose.ui.b.c(c2278s0, this);
    }

    public abstract void h(@NotNull N n10);

    public abstract int hashCode();

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object l0(Object obj, ed.p pVar) {
        return pVar.invoke(obj, this);
    }
}
