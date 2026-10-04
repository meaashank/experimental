package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4335i;
import java.util.Iterator;
import java.util.Map;
import o.C5287b;

/* JADX INFO: loaded from: classes2.dex */
public class N<T> extends P<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C5287b<K<?>, a<?>> f114059m;

    public static class a<V> implements Q<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K<V> f114060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Q<? super V> f114061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f114062c = -1;

        public a(K<V> k10, Q<? super V> q10) {
            this.f114060a = k10;
            this.f114061b = q10;
        }

        @Override // androidx.lifecycle.Q
        public void a(@Nullable V v10) {
            if (this.f114062c != this.f114060a.g()) {
                this.f114062c = this.f114060a.g();
                this.f114061b.a(v10);
            }
        }

        public void b() {
            this.f114060a.l(this);
        }

        public void c() {
            this.f114060a.p(this);
        }
    }

    public N(T t10) {
        super(t10);
        this.f114059m = new C5287b<>();
    }

    @Override // androidx.lifecycle.K
    @InterfaceC4335i
    public void m() {
        Iterator<Map.Entry<K<?>, a<?>>> it = this.f114059m.iterator();
        while (true) {
            C5287b.e eVar = (C5287b.e) it;
            if (!eVar.hasNext()) {
                return;
            } else {
                ((a) eVar.next().getValue()).b();
            }
        }
    }

    @Override // androidx.lifecycle.K
    @InterfaceC4335i
    public void n() {
        Iterator<Map.Entry<K<?>, a<?>>> it = this.f114059m.iterator();
        while (true) {
            C5287b.e eVar = (C5287b.e) it;
            if (!eVar.hasNext()) {
                return;
            } else {
                ((a) eVar.next().getValue()).c();
            }
        }
    }

    @e.I
    public <S> void s(@NonNull K<S> k10, @NonNull Q<? super S> q10) {
        if (k10 == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(k10, q10);
        a<?> aVarJ = this.f114059m.j(k10, aVar);
        if (aVarJ != null && aVarJ.f114061b != q10) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarJ == null && h()) {
            aVar.b();
        }
    }

    @e.I
    public <S> void t(@NonNull K<S> k10) {
        a<?> aVarK = this.f114059m.k(k10);
        if (aVarK != null) {
            aVarK.c();
        }
    }

    public N() {
        this.f114059m = new C5287b<>();
    }
}
