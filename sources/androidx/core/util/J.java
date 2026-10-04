package androidx.core.util;

import android.util.SparseLongArray;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.collections.AbstractC4864f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n76#1,4:102\n1#2:101\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n72#1:102,4\n*E\n"})
public final class J {

    public static final class a extends AbstractC4864f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SparseLongArray f111387b;

        public a(SparseLongArray sparseLongArray) {
            this.f111387b = sparseLongArray;
        }

        public final int b() {
            return this.f111386a;
        }

        public final void d(int i10) {
            this.f111386a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f111386a < this.f111387b.size();
        }

        @Override // kotlin.collections.AbstractC4864f0
        public int nextInt() {
            SparseLongArray sparseLongArray = this.f111387b;
            int i10 = this.f111386a;
            this.f111386a = i10 + 1;
            return sparseLongArray.keyAt(i10);
        }
    }

    public static final class b extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SparseLongArray f111389b;

        public b(SparseLongArray sparseLongArray) {
            this.f111389b = sparseLongArray;
        }

        public final int b() {
            return this.f111388a;
        }

        public final void d(int i10) {
            this.f111388a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f111388a < this.f111389b.size();
        }

        @Override // kotlin.collections.g0
        public long nextLong() {
            SparseLongArray sparseLongArray = this.f111389b;
            int i10 = this.f111388a;
            this.f111388a = i10 + 1;
            return sparseLongArray.valueAt(i10);
        }
    }

    public static final boolean a(@NotNull SparseLongArray sparseLongArray, int i10) {
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@NotNull SparseLongArray sparseLongArray, int i10) {
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@NotNull SparseLongArray sparseLongArray, long j10) {
        return sparseLongArray.indexOfValue(j10) >= 0;
    }

    public static final void d(@NotNull SparseLongArray sparseLongArray, @NotNull ed.p<? super Integer, ? super Long, L0> pVar) {
        int size = sparseLongArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i10)), Long.valueOf(sparseLongArray.valueAt(i10)));
        }
    }

    public static final long e(@NotNull SparseLongArray sparseLongArray, int i10, long j10) {
        return sparseLongArray.get(i10, j10);
    }

    public static final long f(@NotNull SparseLongArray sparseLongArray, int i10, @NotNull InterfaceC4376a<Long> interfaceC4376a) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseLongArray.valueAt(iIndexOfKey) : interfaceC4376a.invoke().longValue();
    }

    public static final int g(@NotNull SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean h(@NotNull SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    public static final boolean i(@NotNull SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    @NotNull
    public static final AbstractC4864f0 j(@NotNull SparseLongArray sparseLongArray) {
        return new a(sparseLongArray);
    }

    @NotNull
    public static final SparseLongArray k(@NotNull SparseLongArray sparseLongArray, @NotNull SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray2.size() + sparseLongArray.size());
        l(sparseLongArray3, sparseLongArray);
        l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void l(@NotNull SparseLongArray sparseLongArray, @NotNull SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i10), sparseLongArray2.valueAt(i10));
        }
    }

    public static final boolean m(@NotNull SparseLongArray sparseLongArray, int i10, long j10) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || j10 != sparseLongArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void n(@NotNull SparseLongArray sparseLongArray, int i10, long j10) {
        sparseLongArray.put(i10, j10);
    }

    @NotNull
    public static final g0 o(@NotNull SparseLongArray sparseLongArray) {
        return new b(sparseLongArray);
    }
}
