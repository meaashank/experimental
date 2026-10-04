package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.annotation.Nullable;
import androidx.core.os.T;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2649l implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<RunnableC2649l> f116776e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Comparator<c> f116777f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f116779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f116780c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<RecyclerView> f116778a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<c> f116781d = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.l$a */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f116789d;
            if ((recyclerView == null) != (cVar2.f116789d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f116786a;
            if (z10 != cVar2.f116786a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f116787b - cVar.f116787b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f116788c - cVar2.f116788c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.l$b */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.LayoutManager.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f116784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116785d;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f116785d;
            int i13 = i12 * 2;
            int[] iArr = this.f116784c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f116784c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f116784c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f116784c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f116785d++;
        }

        public void b() {
            int[] iArr = this.f116784c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f116785d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z10) {
            this.f116785d = 0;
            int[] iArr = this.f116784c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z10) {
                if (!recyclerView.mAdapterHelper.q()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.f116782a, this.f116783b, recyclerView.mState, this);
            }
            int i10 = this.f116785d;
            if (i10 > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = i10;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z10;
                recyclerView.mRecycler.L();
            }
        }

        public boolean d(int i10) {
            if (this.f116784c != null) {
                int i11 = this.f116785d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f116784c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i10, int i11) {
            this.f116782a = i10;
            this.f116783b = i11;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.l$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f116786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f116789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f116790e;

        public void a() {
            this.f116786a = false;
            this.f116787b = 0;
            this.f116788c = 0;
            this.f116789d = null;
            this.f116790e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.mChildHelper.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.C childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.f116778a.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f116778a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f116778a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i10 += recyclerView.mPrefetchRegistry.f116785d;
            }
        }
        this.f116781d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f116778a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.f116783b) + Math.abs(bVar.f116782a);
                for (int i14 = 0; i14 < bVar.f116785d * 2; i14 += 2) {
                    if (i12 >= this.f116781d.size()) {
                        cVar = new c();
                        this.f116781d.add(cVar);
                    } else {
                        cVar = this.f116781d.get(i12);
                    }
                    int[] iArr = bVar.f116784c;
                    int i15 = iArr[i14 + 1];
                    cVar.f116786a = i15 <= iAbs;
                    cVar.f116787b = iAbs;
                    cVar.f116788c = i15;
                    cVar.f116789d = recyclerView2;
                    cVar.f116790e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f116781d, f116777f);
    }

    public final void c(c cVar, long j10) {
        RecyclerView.C cI = i(cVar.f116789d, cVar.f116790e, cVar.f116786a ? Long.MAX_VALUE : j10);
        if (cI == null || cI.mNestedRecyclerView == null || !cI.isBound() || cI.isInvalid()) {
            return;
        }
        h(cI.mNestedRecyclerView.get(), j10);
    }

    public final void d(long j10) {
        for (int i10 = 0; i10 < this.f116781d.size(); i10++) {
            c cVar = this.f116781d.get(i10);
            if (cVar.f116789d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f116779b == 0) {
            this.f116779b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i10, i11);
    }

    public void g(long j10) {
        b();
        d(j10);
    }

    public final void h(@Nullable RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f116785d != 0) {
            try {
                T.b("RV Nested Prefetch");
                recyclerView.mState.k(recyclerView.mAdapter);
                for (int i10 = 0; i10 < bVar.f116785d * 2; i10 += 2) {
                    i(recyclerView, bVar.f116784c[i10], j10);
                }
                Trace.endSection();
            } catch (Throwable th) {
                T.d();
                throw th;
            }
        }
    }

    public final RecyclerView.C i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.C cJ = uVar.J(i10, false, j10);
            if (cJ != null) {
                if (!cJ.isBound() || cJ.isInvalid()) {
                    uVar.a(cJ, false);
                } else {
                    uVar.C(cJ.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return cJ;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public void j(RecyclerView recyclerView) {
        this.f116778a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            T.b("RV Prefetch");
            if (!this.f116778a.isEmpty()) {
                int size = this.f116778a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f116778a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f116780c);
                }
            }
            this.f116779b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f116779b = 0L;
            T.d();
            throw th;
        }
    }
}
