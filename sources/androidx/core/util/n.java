package androidx.core.util;

import android.util.LongSparseArray;
import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.L0;
import kotlin.collections.g0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,101:1\n77#1,4:102\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n73#1:102,4\n*E\n"})
public final class n {

    public static final class a extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LongSparseArray<T> f111411b;

        public a(LongSparseArray<T> longSparseArray) {
            this.f111411b = longSparseArray;
        }

        public final int b() {
            return this.f111410a;
        }

        public final void d(int i10) {
            this.f111410a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f111410a < this.f111411b.size();
        }

        @Override // kotlin.collections.g0
        public long nextLong() {
            LongSparseArray<T> longSparseArray = this.f111411b;
            int i10 = this.f111410a;
            this.f111410a = i10 + 1;
            return longSparseArray.keyAt(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LongSparseArray<T> f111413b;

        public b(LongSparseArray<T> longSparseArray) {
            this.f111413b = longSparseArray;
        }

        public final int b() {
            return this.f111412a;
        }

        public final void d(int i10) {
            this.f111412a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f111412a < this.f111413b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.f111413b;
            int i10 = this.f111412a;
            this.f111412a = i10 + 1;
            return longSparseArray.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@NotNull LongSparseArray<T> longSparseArray, long j10) {
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    public static final <T> boolean b(@NotNull LongSparseArray<T> longSparseArray, long j10) {
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    public static final <T> boolean c(@NotNull LongSparseArray<T> longSparseArray, T t10) {
        return longSparseArray.indexOfValue(t10) >= 0;
    }

    public static final <T> void d(@NotNull LongSparseArray<T> longSparseArray, @NotNull ed.p<? super Long, ? super T, L0> pVar) {
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Long.valueOf(longSparseArray.keyAt(i10)), longSparseArray.valueAt(i10));
        }
    }

    public static final <T> T e(@NotNull LongSparseArray<T> longSparseArray, long j10, T t10) {
        T t11 = longSparseArray.get(j10);
        return t11 == null ? t10 : t11;
    }

    public static final <T> T f(@NotNull LongSparseArray<T> longSparseArray, long j10, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        T t10 = longSparseArray.get(j10);
        return t10 == null ? interfaceC4376a.invoke() : t10;
    }

    public static final <T> int g(@NotNull LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean h(@NotNull LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean i(@NotNull LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    @NotNull
    public static final <T> g0 j(@NotNull LongSparseArray<T> longSparseArray) {
        return new a(longSparseArray);
    }

    @NotNull
    public static final <T> LongSparseArray<T> k(@NotNull LongSparseArray<T> longSparseArray, @NotNull LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray2.size() + longSparseArray.size());
        l(longSparseArray3, longSparseArray);
        l(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void l(@NotNull LongSparseArray<T> longSparseArray, @NotNull LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArray.put(longSparseArray2.keyAt(i10), longSparseArray2.valueAt(i10));
        }
    }

    public static final <T> boolean m(@NotNull LongSparseArray<T> longSparseArray, long j10, T t10) {
        int iIndexOfKey = longSparseArray.indexOfKey(j10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.G.g(t10, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void n(@NotNull LongSparseArray<T> longSparseArray, long j10, T t10) {
        longSparseArray.put(j10, t10);
    }

    @NotNull
    public static final <T> Iterator<T> o(@NotNull LongSparseArray<T> longSparseArray) {
        return new b(longSparseArray);
    }
}
