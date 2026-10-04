package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface L {

    public static class a implements L {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<v> f116356a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116357b = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.L$a$a, reason: collision with other inner class name */
        public class C0320a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public SparseIntArray f116358a = new SparseIntArray(1);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public SparseIntArray f116359b = new SparseIntArray(1);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final v f116360c;

            public C0320a(v vVar) {
                this.f116360c = vVar;
            }

            @Override // androidx.recyclerview.widget.L.c
            public int a(int i10) {
                int iIndexOfKey = this.f116358a.indexOfKey(i10);
                if (iIndexOfKey > -1) {
                    return this.f116358a.valueAt(iIndexOfKey);
                }
                int iC = a.this.c(this.f116360c);
                this.f116358a.put(i10, iC);
                this.f116359b.put(iC, i10);
                return iC;
            }

            @Override // androidx.recyclerview.widget.L.c
            public int b(int i10) {
                int iIndexOfKey = this.f116359b.indexOfKey(i10);
                if (iIndexOfKey >= 0) {
                    return this.f116359b.valueAt(iIndexOfKey);
                }
                StringBuilder sbA = android.support.v4.media.a.a("requested global type ", i10, " does not belong to the adapter:");
                sbA.append(this.f116360c.f116931c);
                throw new IllegalStateException(sbA.toString());
            }

            @Override // androidx.recyclerview.widget.L.c
            public void dispose() {
                a.this.d(this.f116360c);
            }
        }

        @Override // androidx.recyclerview.widget.L
        @NonNull
        public v a(int i10) {
            v vVar = this.f116356a.get(i10);
            if (vVar != null) {
                return vVar;
            }
            throw new IllegalArgumentException(android.support.v4.media.c.a("Cannot find the wrapper for global view type ", i10));
        }

        @Override // androidx.recyclerview.widget.L
        @NonNull
        public c b(@NonNull v vVar) {
            return new C0320a(vVar);
        }

        public int c(v vVar) {
            int i10 = this.f116357b;
            this.f116357b = i10 + 1;
            this.f116356a.put(i10, vVar);
            return i10;
        }

        public void d(@NonNull v vVar) {
            for (int size = this.f116356a.size() - 1; size >= 0; size--) {
                if (this.f116356a.valueAt(size) == vVar) {
                    this.f116356a.removeAt(size);
                }
            }
        }
    }

    public static class b implements L {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<List<v>> f116362a = new SparseArray<>();

        public class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f116363a;

            public a(v vVar) {
                this.f116363a = vVar;
            }

            @Override // androidx.recyclerview.widget.L.c
            public int a(int i10) {
                List<v> arrayList = b.this.f116362a.get(i10);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    b.this.f116362a.put(i10, arrayList);
                }
                if (!arrayList.contains(this.f116363a)) {
                    arrayList.add(this.f116363a);
                }
                return i10;
            }

            @Override // androidx.recyclerview.widget.L.c
            public int b(int i10) {
                return i10;
            }

            @Override // androidx.recyclerview.widget.L.c
            public void dispose() {
                b.this.c(this.f116363a);
            }
        }

        @Override // androidx.recyclerview.widget.L
        @NonNull
        public v a(int i10) {
            List<v> list = this.f116362a.get(i10);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("Cannot find the wrapper for global view type ", i10));
            }
            return list.get(0);
        }

        @Override // androidx.recyclerview.widget.L
        @NonNull
        public c b(@NonNull v vVar) {
            return new a(vVar);
        }

        public void c(@NonNull v vVar) {
            for (int size = this.f116362a.size() - 1; size >= 0; size--) {
                List<v> listValueAt = this.f116362a.valueAt(size);
                if (listValueAt.remove(vVar) && listValueAt.isEmpty()) {
                    this.f116362a.removeAt(size);
                }
            }
        }
    }

    public interface c {
        int a(int i10);

        int b(int i10);

        void dispose();
    }

    @NonNull
    v a(int i10);

    @NonNull
    c b(@NonNull v vVar);
}
