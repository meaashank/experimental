package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import e.f0;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2143j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f102297g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f102298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SparseLongArray f102299b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SparseBooleanArray f102300c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<D> f102301d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102302e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f102303f = -1;

    @f0
    public static /* synthetic */ void h() {
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f102299b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f102299b;
                long j10 = this.f102298a;
                this.f102298a = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f102299b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f102299b;
            long j11 = this.f102298a;
            this.f102298a = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f102300c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f102302e && source == this.f102303f) {
            return;
        }
        this.f102302e = toolType;
        this.f102303f = source;
        this.f102300c.clear();
        this.f102299b.clear();
    }

    @Nullable
    public final C c(@NotNull MotionEvent motionEvent, @NotNull P p10) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f102299b.clear();
            this.f102300c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.f102300c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.f102301d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.f102301d.add(d(p10, motionEvent, i10, (z10 || i10 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        j(motionEvent);
        return new C(motionEvent.getEventTime(), this.f102301d, motionEvent);
    }

    public final D d(P p10, MotionEvent motionEvent, int i10, boolean z10) {
        long jK;
        int i11;
        long jA;
        long jF = f(motionEvent.getPointerId(i10));
        float pressure = motionEvent.getPressure(i10);
        long jA2 = P.h.a(motionEvent.getX(i10), motionEvent.getY(i10));
        long jI = P.g.i(jA2, 0.0f, 0.0f, 3, null);
        if (i10 == 0) {
            jK = P.h.a(motionEvent.getRawX(), motionEvent.getRawY());
            jA2 = p10.D(jK);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jK = C2146m.f102304a.a(motionEvent, i10);
            jA2 = p10.D(jK);
        } else {
            jK = p10.K(jA2);
        }
        long j10 = jK;
        long j11 = jA2;
        int toolType = motionEvent.getToolType(i10);
        if (toolType == 0) {
            O.f102192b.getClass();
            i11 = O.f102193c;
        } else if (toolType == 1) {
            O.f102192b.getClass();
            i11 = O.f102194d;
        } else if (toolType == 2) {
            O.f102192b.getClass();
            i11 = O.f102196f;
        } else if (toolType == 3) {
            O.f102192b.getClass();
            i11 = O.f102195e;
        } else if (toolType != 4) {
            O.f102192b.getClass();
            i11 = O.f102193c;
        } else {
            O.f102192b.getClass();
            i11 = O.f102197g;
        }
        int i12 = i11;
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        for (int i13 = 0; i13 < historySize; i13++) {
            float historicalX = motionEvent.getHistoricalX(i10, i13);
            float historicalY = motionEvent.getHistoricalY(i10, i13);
            if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                long jA3 = P.h.a(historicalX, historicalY);
                arrayList.add(new C2140g(motionEvent.getHistoricalEventTime(i13), jA3, jA3));
            }
        }
        if (motionEvent.getActionMasked() == 8) {
            jA = P.h.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
        } else {
            P.g.f65503b.getClass();
            jA = P.g.f65504c;
        }
        return new D(jF, motionEvent.getEventTime(), j10, j11, z10, pressure, i12, this.f102300c.get(motionEvent.getPointerId(i10), false), arrayList, jA, jI);
    }

    public final void e(int i10) {
        this.f102300c.delete(i10);
        this.f102299b.delete(i10);
    }

    public final long f(int i10) {
        int iIndexOfKey = this.f102299b.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            return this.f102299b.valueAt(iIndexOfKey);
        }
        long j10 = this.f102298a;
        this.f102298a = 1 + j10;
        this.f102299b.put(i10, j10);
        return j10;
    }

    @NotNull
    public final SparseLongArray g() {
        return this.f102299b;
    }

    public final boolean i(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f102300c.get(pointerId, false)) {
                this.f102299b.delete(pointerId);
                this.f102300c.delete(pointerId);
            }
        }
        if (this.f102299b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f102299b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f102299b.keyAt(size);
                if (!i(motionEvent, iKeyAt)) {
                    this.f102299b.removeAt(size);
                    this.f102300c.delete(iKeyAt);
                }
            }
        }
    }
}
