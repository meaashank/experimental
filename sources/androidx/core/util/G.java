package androidx.core.util;

import android.util.SparseArray;
import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.L0;
import kotlin.collections.AbstractC4864f0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,101:1\n77#1,4:102\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n73#1:102,4\n*E\n"})
public final class G {

    public static final class a extends AbstractC4864f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SparseArray<T> f111375b;

        public a(SparseArray<T> sparseArray) {
            this.f111375b = sparseArray;
        }

        public final int b() {
            return this.f111374a;
        }

        public final void d(int i10) {
            this.f111374a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f111374a < this.f111375b.size();
        }

        @Override // kotlin.collections.AbstractC4864f0
        public int nextInt() {
            SparseArray<T> sparseArray = this.f111375b;
            int i10 = this.f111374a;
            this.f111374a = i10 + 1;
            return sparseArray.keyAt(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SparseArray<T> f111377b;

        public b(SparseArray<T> sparseArray) {
            this.f111377b = sparseArray;
        }

        public final int b() {
            return this.f111376a;
        }

        public final void d(int i10) {
            this.f111376a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f111376a < this.f111377b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f111377b;
            int i10 = this.f111376a;
            this.f111376a = i10 + 1;
            return sparseArray.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@NotNull SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean b(@NotNull SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean c(@NotNull SparseArray<T> sparseArray, T t10) {
        return sparseArray.indexOfValue(t10) >= 0;
    }

    public static final <T> void d(@NotNull SparseArray<T> sparseArray, @NotNull ed.p<? super Integer, ? super T, L0> pVar) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(sparseArray.keyAt(i10)), sparseArray.valueAt(i10));
        }
    }

    public static final <T> T e(@NotNull SparseArray<T> sparseArray, int i10, T t10) {
        T t11 = sparseArray.get(i10);
        return t11 == null ? t10 : t11;
    }

    public static final <T> T f(@NotNull SparseArray<T> sparseArray, int i10, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        T t10 = sparseArray.get(i10);
        return t10 == null ? interfaceC4376a.invoke() : t10;
    }

    public static final <T> int g(@NotNull SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean h(@NotNull SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean i(@NotNull SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    @NotNull
    public static final <T> AbstractC4864f0 j(@NotNull SparseArray<T> sparseArray) {
        return new a(sparseArray);
    }

    @NotNull
    public static final <T> SparseArray<T> k(@NotNull SparseArray<T> sparseArray, @NotNull SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray2.size() + sparseArray.size());
        l(sparseArray3, sparseArray);
        l(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void l(@NotNull SparseArray<T> sparseArray, @NotNull SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), sparseArray2.valueAt(i10));
        }
    }

    public static final <T> boolean m(@NotNull SparseArray<T> sparseArray, int i10, T t10) {
        int iIndexOfKey = sparseArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.G.g(t10, sparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void n(@NotNull SparseArray<T> sparseArray, int i10, T t10) {
        sparseArray.put(i10, t10);
    }

    @NotNull
    public static final <T> Iterator<T> o(@NotNull SparseArray<T> sparseArray) {
        return new b(sparseArray);
    }
}
