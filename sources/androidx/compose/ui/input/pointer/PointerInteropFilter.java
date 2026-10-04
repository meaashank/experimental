package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
@androidx.compose.ui.i
public final class PointerInteropFilter implements I {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102213e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ed.l<? super MotionEvent, Boolean> f102214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public S f102215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f102216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final G f102217d = new PointerInteropFilter$pointerInputFilter$1(this);

    public enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching
    }

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

    public final boolean a() {
        return this.f102216c;
    }

    @NotNull
    public final ed.l<MotionEvent, Boolean> b() {
        ed.l lVar = this.f102214a;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.G.S("onTouchEvent");
        throw null;
    }

    @Nullable
    public final S c() {
        return this.f102215b;
    }

    public final void d(boolean z10) {
        this.f102216c = z10;
    }

    public final void e(@NotNull ed.l<? super MotionEvent, Boolean> lVar) {
        this.f102214a = lVar;
    }

    public final void f(@Nullable S s10) {
        S s11 = this.f102215b;
        if (s11 != null) {
            s11.f102237a = null;
        }
        this.f102215b = s10;
        if (s10 == null) {
            return;
        }
        s10.f102237a = this;
    }

    @Override // androidx.compose.ui.input.pointer.I
    @NotNull
    public G g2() {
        return this.f102217d;
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object l0(Object obj, ed.p pVar) {
        return pVar.invoke(obj, this);
    }
}
