package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.InterfaceC2188x;
import java.util.List;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,352:1\n101#2,2:353\n33#2,6:355\n103#2:361\n86#2,2:362\n33#2,6:364\n88#2:370\n101#2,2:371\n33#2,6:373\n103#2:379\n33#2,6:380\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:353,2\n223#1:355,6\n223#1:361\n238#1:362,2\n238#1:364,6\n238#1:370\n280#1:371,2\n280#1:373,6\n280#1:379\n314#1:380,6\n*E\n"})
public final class PointerInteropFilter$pointerInputFilter$1 extends G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public PointerInteropFilter.DispatchToViewState f102218d = PointerInteropFilter.DispatchToViewState.Unknown;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PointerInteropFilter f102219e;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.f102219e = pointerInteropFilter;
    }

    @Override // androidx.compose.ui.input.pointer.G
    public void g() {
        if (this.f102218d == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.f102219e;
            M.a(jUptimeMillis, new ed.l<MotionEvent, L0>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                public final void e(@NotNull MotionEvent motionEvent) {
                    pointerInteropFilter.b().invoke(motionEvent);
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(MotionEvent motionEvent) {
                    e(motionEvent);
                    return L0.f217464a;
                }
            });
            m();
        }
    }

    @Override // androidx.compose.ui.input.pointer.G
    public void h(@NotNull C2150q c2150q, @NotNull PointerEventPass pointerEventPass, long j10) {
        boolean z10;
        List<A> list = c2150q.f102318a;
        if (this.f102219e.f102216c) {
            z10 = true;
            break;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            A a10 = list.get(i10);
            if (r.c(a10) || r.e(a10)) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        if (this.f102218d != PointerInteropFilter.DispatchToViewState.NotDispatching) {
            if (pointerEventPass == PointerEventPass.Initial && z10) {
                l(c2150q);
            }
            if (pointerEventPass == PointerEventPass.Final && !z10) {
                l(c2150q);
            }
        }
        if (pointerEventPass == PointerEventPass.Final) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (!r.e(list.get(i11))) {
                    return;
                }
            }
            m();
        }
    }

    public final void l(C2150q c2150q) {
        List<A> list = c2150q.f102318a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).D()) {
                if (this.f102218d == PointerInteropFilter.DispatchToViewState.Dispatching) {
                    InterfaceC2188x interfaceC2188x = this.f102189a;
                    if (interfaceC2188x == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    P.g.f65503b.getClass();
                    long jD0 = interfaceC2188x.d0(P.g.f65504c);
                    final PointerInteropFilter pointerInteropFilter = this.f102219e;
                    M.e(c2150q, jD0, new ed.l<MotionEvent, L0>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                        {
                            super(1);
                        }

                        public final void e(@NotNull MotionEvent motionEvent) {
                            pointerInteropFilter.b().invoke(motionEvent);
                        }

                        @Override // ed.l
                        public /* bridge */ /* synthetic */ L0 invoke(MotionEvent motionEvent) {
                            e(motionEvent);
                            return L0.f217464a;
                        }
                    }, true);
                }
                this.f102218d = PointerInteropFilter.DispatchToViewState.NotDispatching;
                return;
            }
        }
        InterfaceC2188x interfaceC2188x2 = this.f102189a;
        if (interfaceC2188x2 == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        P.g.f65503b.getClass();
        long jD02 = interfaceC2188x2.d0(P.g.f65504c);
        final PointerInteropFilter pointerInteropFilter2 = this.f102219e;
        M.e(c2150q, jD02, new ed.l<MotionEvent, L0>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    pointerInteropFilter2.b().invoke(motionEvent);
                } else {
                    this.f102221d.f102218d = pointerInteropFilter2.b().invoke(motionEvent).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                }
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(MotionEvent motionEvent) {
                e(motionEvent);
                return L0.f217464a;
            }
        }, false);
        if (this.f102218d == PointerInteropFilter.DispatchToViewState.Dispatching) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                list.get(i11).a();
            }
            C2142i c2142i = c2150q.f102319b;
            if (c2142i == null) {
                return;
            }
            c2142i.f102296c = !this.f102219e.f102216c;
        }
    }

    public final void m() {
        this.f102218d = PointerInteropFilter.DispatchToViewState.Unknown;
        this.f102219e.f102216c = false;
    }
}
