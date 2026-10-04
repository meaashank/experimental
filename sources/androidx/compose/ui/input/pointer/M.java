package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class M {
    public static final void a(long j10, @NotNull ed.l<? super MotionEvent, L0> lVar) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        lVar.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static /* synthetic */ void b(long j10, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = SystemClock.uptimeMillis();
        }
        a(j10, lVar);
    }

    public static final void c(@NotNull C2150q c2150q, long j10, @NotNull ed.l<? super MotionEvent, L0> lVar) {
        e(c2150q, j10, lVar, true);
    }

    public static final void d(@NotNull C2150q c2150q, long j10, @NotNull ed.l<? super MotionEvent, L0> lVar) {
        e(c2150q, j10, lVar, false);
    }

    public static final void e(C2150q c2150q, long j10, ed.l<? super MotionEvent, L0> lVar, boolean z10) {
        MotionEvent motionEventH = c2150q.h();
        if (motionEventH == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventH.getAction();
        if (z10) {
            motionEventH.setAction(3);
        }
        motionEventH.offsetLocation(-P.g.p(j10), -P.g.r(j10));
        lVar.invoke(motionEventH);
        motionEventH.offsetLocation(P.g.p(j10), P.g.r(j10));
        motionEventH.setAction(action);
    }
}
