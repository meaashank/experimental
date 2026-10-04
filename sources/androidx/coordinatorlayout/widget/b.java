package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.U0;
import androidx.core.util.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.a<ArrayList<T>> f110614a = new s.b(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U0<T, ArrayList<T>> f110615b = new U0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<T> f110616c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet<T> f110617d = new HashSet<>();

    public void a(@NonNull T t10, @NonNull T t11) {
        if (!this.f110615b.containsKey(t10) || !this.f110615b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f110615b.get(t10);
        if (arrayListF == null) {
            arrayListF = f();
            this.f110615b.put(t10, arrayListF);
        }
        arrayListF.add(t11);
    }

    public void b(@NonNull T t10) {
        if (this.f110615b.containsKey(t10)) {
            return;
        }
        this.f110615b.put(t10, null);
    }

    public void c() {
        int size = this.f110615b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListO = this.f110615b.o(i10);
            if (arrayListO != null) {
                arrayListO.clear();
                this.f110614a.b(arrayListO);
            }
        }
        this.f110615b.clear();
    }

    public boolean d(@NonNull T t10) {
        return this.f110615b.containsKey(t10);
    }

    public final void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (hashSet.contains(t10)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t10);
        ArrayList<T> arrayList2 = this.f110615b.get(t10);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t10);
        arrayList.add(t10);
    }

    @NonNull
    public final ArrayList<T> f() {
        ArrayList<T> arrayListA = this.f110614a.a();
        return arrayListA == null ? new ArrayList<>() : arrayListA;
    }

    @Nullable
    public List g(@NonNull T t10) {
        return this.f110615b.get(t10);
    }

    @Nullable
    public List<T> h(@NonNull T t10) {
        int size = this.f110615b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListO = this.f110615b.o(i10);
            if (arrayListO != null && arrayListO.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f110615b.i(i10));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> i() {
        this.f110616c.clear();
        this.f110617d.clear();
        int size = this.f110615b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f110615b.i(i10), this.f110616c, this.f110617d);
        }
        return this.f110616c;
    }

    public boolean j(@NonNull T t10) {
        int size = this.f110615b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListO = this.f110615b.o(i10);
            if (arrayListO != null && arrayListO.contains(t10)) {
                return true;
            }
        }
        return false;
    }

    public final void k(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.f110614a.b(arrayList);
    }

    public int l() {
        return this.f110615b.size();
    }
}
