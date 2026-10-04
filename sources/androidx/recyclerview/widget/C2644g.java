package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C1545m0;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2644g implements v.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcatAdapter f116622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f116623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<WeakReference<RecyclerView>> f116624c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityHashMap<RecyclerView.C, v> f116625d = new IdentityHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<v> f116626e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f116627f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConcatAdapter.Config.StableIdMode f116628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G f116629h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v f116630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f116632c;
    }

    public C2644g(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.f116622a = concatAdapter;
        if (config.f116275a) {
            this.f116623b = new L.a();
        } else {
            this.f116623b = new L.b();
        }
        ConcatAdapter.Config.StableIdMode stableIdMode = config.f116276b;
        this.f116628g = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.f116629h = new G.b();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.f116629h = new G.a();
        } else {
            if (stableIdMode != ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.f116629h = new G.c();
        }
    }

    public void A(RecyclerView.C c10, int i10) {
        a aVarN = n(i10);
        this.f116625d.put(c10, aVarN.f116630a);
        aVarN.f116630a.e(c10, aVarN.f116631b);
        H(aVarN);
    }

    public RecyclerView.C B(ViewGroup viewGroup, int i10) {
        return this.f116623b.a(i10).f(viewGroup, i10);
    }

    public void C(RecyclerView recyclerView) {
        int size = this.f116624c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.f116624c.get(size);
            if (weakReference.get() == null) {
                this.f116624c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f116624c.remove(size);
                break;
            }
            size--;
        }
        Iterator<v> it = this.f116626e.iterator();
        while (it.hasNext()) {
            it.next().f116931c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public boolean D(RecyclerView.C c10) {
        v vVar = this.f116625d.get(c10);
        if (vVar != null) {
            boolean zOnFailedToRecycleView = vVar.f116931c.onFailedToRecycleView(c10);
            this.f116625d.remove(c10);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + c10 + ", seems like it is not bound by this adapter: " + this);
    }

    public void E(RecyclerView.C c10) {
        v(c10).f116931c.onViewAttachedToWindow(c10);
    }

    public void F(RecyclerView.C c10) {
        v(c10).f116931c.onViewDetachedFromWindow(c10);
    }

    public void G(RecyclerView.C c10) {
        v vVar = this.f116625d.get(c10);
        if (vVar != null) {
            vVar.f116931c.onViewRecycled(c10);
            this.f116625d.remove(c10);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + c10 + ", seems like it is not bound by this adapter: " + this);
        }
    }

    public final void H(a aVar) {
        aVar.f116632c = false;
        aVar.f116630a = null;
        aVar.f116631b = -1;
        this.f116627f = aVar;
    }

    public boolean I(RecyclerView.Adapter<RecyclerView.C> adapter) {
        int iX = x(adapter);
        if (iX == -1) {
            return false;
        }
        v vVar = this.f116626e.get(iX);
        int iM = m(vVar);
        this.f116626e.remove(iX);
        this.f116622a.notifyItemRangeRemoved(iM, vVar.b());
        Iterator<WeakReference<RecyclerView>> it = this.f116624c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }
        vVar.a();
        j();
        return true;
    }

    @Override // androidx.recyclerview.widget.v.b
    public void a(@NonNull v vVar, int i10, int i11, @Nullable Object obj) {
        this.f116622a.notifyItemRangeChanged(i10 + m(vVar), i11, obj);
    }

    @Override // androidx.recyclerview.widget.v.b
    public void b(@NonNull v vVar, int i10, int i11) {
        int iM = m(vVar);
        this.f116622a.notifyItemMoved(i10 + iM, i11 + iM);
    }

    @Override // androidx.recyclerview.widget.v.b
    public void c(v vVar) {
        j();
    }

    @Override // androidx.recyclerview.widget.v.b
    public void d(@NonNull v vVar, int i10, int i11) {
        this.f116622a.notifyItemRangeChanged(i10 + m(vVar), i11);
    }

    @Override // androidx.recyclerview.widget.v.b
    public void e(@NonNull v vVar, int i10, int i11) {
        this.f116622a.notifyItemRangeRemoved(i10 + m(vVar), i11);
    }

    @Override // androidx.recyclerview.widget.v.b
    public void f(@NonNull v vVar, int i10, int i11) {
        this.f116622a.notifyItemRangeInserted(i10 + m(vVar), i11);
    }

    @Override // androidx.recyclerview.widget.v.b
    public void g(@NonNull v vVar) {
        this.f116622a.notifyDataSetChanged();
        j();
    }

    public boolean h(int i10, RecyclerView.Adapter<RecyclerView.C> adapter) {
        if (i10 < 0 || i10 > this.f116626e.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f116626e.size() + ". Given:" + i10);
        }
        if (w()) {
            androidx.core.util.t.b(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (adapter.hasStableIds()) {
            Log.w(ConcatAdapter.f116272e, "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        if (o(adapter) != null) {
            return false;
        }
        v vVar = new v(adapter, this, this.f116623b, this.f116629h.a());
        this.f116626e.add(i10, vVar);
        Iterator<WeakReference<RecyclerView>> it = this.f116624c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (vVar.f116933e > 0) {
            this.f116622a.notifyItemRangeInserted(m(vVar), vVar.f116933e);
        }
        j();
        return true;
    }

    public boolean i(RecyclerView.Adapter<RecyclerView.C> adapter) {
        return h(this.f116626e.size(), adapter);
    }

    public final void j() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicyL = l();
        if (stateRestorationPolicyL != this.f116622a.getStateRestorationPolicy()) {
            this.f116622a.k(stateRestorationPolicyL);
        }
    }

    public boolean k() {
        Iterator<v> it = this.f116626e.iterator();
        while (it.hasNext()) {
            if (!it.next().f116931c.canRestoreState()) {
                return false;
            }
        }
        return true;
    }

    public final RecyclerView.Adapter.StateRestorationPolicy l() {
        for (v vVar : this.f116626e) {
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = vVar.f116931c.getStateRestorationPolicy();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy == stateRestorationPolicy2 || (stateRestorationPolicy == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && vVar.b() == 0)) {
                return stateRestorationPolicy2;
            }
        }
        return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    public final int m(v vVar) {
        v next;
        Iterator<v> it = this.f116626e.iterator();
        int iB = 0;
        while (it.hasNext() && (next = it.next()) != vVar) {
            iB += next.b();
        }
        return iB;
    }

    @NonNull
    public final a n(int i10) {
        a aVar = this.f116627f;
        if (aVar.f116632c) {
            aVar = new a();
        } else {
            aVar.f116632c = true;
        }
        Iterator<v> it = this.f116626e.iterator();
        int iB = i10;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            v next = it.next();
            if (next.b() > iB) {
                aVar.f116630a = next;
                aVar.f116631b = iB;
                break;
            }
            iB -= next.b();
        }
        if (aVar.f116630a != null) {
            return aVar;
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("Cannot find wrapper for ", i10));
    }

    @Nullable
    public final v o(RecyclerView.Adapter<RecyclerView.C> adapter) {
        int iX = x(adapter);
        if (iX == -1) {
            return null;
        }
        return this.f116626e.get(iX);
    }

    @Nullable
    public RecyclerView.Adapter<? extends RecyclerView.C> p(RecyclerView.C c10) {
        v vVar = this.f116625d.get(c10);
        if (vVar == null) {
            return null;
        }
        return vVar.f116931c;
    }

    public List<RecyclerView.Adapter<? extends RecyclerView.C>> q() {
        if (this.f116626e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.f116626e.size());
        Iterator<v> it = this.f116626e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f116931c);
        }
        return arrayList;
    }

    public long r(int i10) {
        a aVarN = n(i10);
        long jC = aVarN.f116630a.c(aVarN.f116631b);
        H(aVarN);
        return jC;
    }

    public int s(int i10) {
        a aVarN = n(i10);
        int iD = aVarN.f116630a.d(aVarN.f116631b);
        H(aVarN);
        return iD;
    }

    public int t(RecyclerView.Adapter<? extends RecyclerView.C> adapter, RecyclerView.C c10, int i10) {
        v vVar = this.f116625d.get(c10);
        if (vVar == null) {
            return -1;
        }
        int iM = i10 - m(vVar);
        int itemCount = vVar.f116931c.getItemCount();
        if (iM >= 0 && iM < itemCount) {
            return vVar.f116931c.findRelativeAdapterPositionIn(adapter, c10, iM);
        }
        StringBuilder sbA = C1545m0.a("Detected inconsistent adapter updates. The local position of the view holder maps to ", iM, " which is out of bounds for the adapter with size ", itemCount, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbA.append(c10);
        sbA.append("adapter:");
        sbA.append(adapter);
        throw new IllegalStateException(sbA.toString());
    }

    public int u() {
        Iterator<v> it = this.f116626e.iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += it.next().b();
        }
        return iB;
    }

    @NonNull
    public final v v(RecyclerView.C c10) {
        v vVar = this.f116625d.get(c10);
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + c10 + ", seems like it is not bound by this adapter: " + this);
    }

    public boolean w() {
        return this.f116628g != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS;
    }

    public final int x(RecyclerView.Adapter<RecyclerView.C> adapter) {
        int size = this.f116626e.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f116626e.get(i10).f116931c == adapter) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean y(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.f116624c.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void z(RecyclerView recyclerView) {
        if (y(recyclerView)) {
            return;
        }
        this.f116624c.add(new WeakReference<>(recyclerView));
        Iterator<v> it = this.f116626e.iterator();
        while (it.hasNext()) {
            it.next().f116931c.onAttachedToRecyclerView(recyclerView);
        }
    }
}
