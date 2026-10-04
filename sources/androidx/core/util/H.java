package androidx.core.util;

import android.util.SparseBooleanArray;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.collections.AbstractC4864f0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n78#1,4:104\n1#2:103\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n74#1:104,4\n*E\n"})
public final class H {

    public static final class a extends AbstractC4864f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SparseBooleanArray f111379b;

        public a(SparseBooleanArray sparseBooleanArray) {
            this.f111379b = sparseBooleanArray;
        }

        public final int b() {
            return this.f111378a;
        }

        public final void d(int i10) {
            this.f111378a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f111378a < this.f111379b.size();
        }

        @Override // kotlin.collections.AbstractC4864f0
        public int nextInt() {
            SparseBooleanArray sparseBooleanArray = this.f111379b;
            int i10 = this.f111378a;
            this.f111378a = i10 + 1;
            return sparseBooleanArray.keyAt(i10);
        }
    }

    public static final class b extends kotlin.collections.D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SparseBooleanArray f111381b;

        public b(SparseBooleanArray sparseBooleanArray) {
            this.f111381b = sparseBooleanArray;
        }

        @Override // kotlin.collections.D
        public boolean d() {
            SparseBooleanArray sparseBooleanArray = this.f111381b;
            int i10 = this.f111380a;
            this.f111380a = i10 + 1;
            return sparseBooleanArray.valueAt(i10);
        }

        public final int e() {
            return this.f111380a;
        }

        public final void f(int i10) {
            this.f111380a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f111380a < this.f111381b.size();
        }
    }

    public static final boolean a(@NotNull SparseBooleanArray sparseBooleanArray, int i10) {
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@NotNull SparseBooleanArray sparseBooleanArray, int i10) {
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@NotNull SparseBooleanArray sparseBooleanArray, boolean z10) {
        return sparseBooleanArray.indexOfValue(z10) >= 0;
    }

    public static final void d(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull ed.p<? super Integer, ? super Boolean, L0> pVar) {
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i10)), Boolean.valueOf(sparseBooleanArray.valueAt(i10)));
        }
    }

    public static final boolean e(@NotNull SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        return sparseBooleanArray.get(i10, z10);
    }

    public static final boolean f(@NotNull SparseBooleanArray sparseBooleanArray, int i10, @NotNull InterfaceC4376a<Boolean> interfaceC4376a) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseBooleanArray.valueAt(iIndexOfKey) : interfaceC4376a.invoke().booleanValue();
    }

    public static final int g(@NotNull SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean h(@NotNull SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean i(@NotNull SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    @NotNull
    public static final AbstractC4864f0 j(@NotNull SparseBooleanArray sparseBooleanArray) {
        return new a(sparseBooleanArray);
    }

    @NotNull
    public static final SparseBooleanArray k(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray2.size() + sparseBooleanArray.size());
        l(sparseBooleanArray3, sparseBooleanArray);
        l(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void l(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i10), sparseBooleanArray2.valueAt(i10));
        }
    }

    public static final boolean m(@NotNull SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || z10 != sparseBooleanArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i10);
        return true;
    }

    public static final void n(@NotNull SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        sparseBooleanArray.put(i10, z10);
    }

    @NotNull
    public static final kotlin.collections.D o(@NotNull SparseBooleanArray sparseBooleanArray) {
        return new b(sparseBooleanArray);
    }
}
