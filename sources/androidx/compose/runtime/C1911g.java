package androidx.compose.runtime;

import androidx.collection.C1526d;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4179:1\n1#2:4180\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1911g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99679d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f99680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f99681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public long[] f99682c;

    public final boolean a(int i10) {
        int i11;
        if (i10 < 0 || i10 >= b()) {
            throw new IllegalStateException(("Index " + i10 + " out of bound").toString());
        }
        if (i10 < 64) {
            return ((1 << i10) & this.f99680a) != 0;
        }
        if (i10 < 128) {
            return ((1 << (i10 - 64)) & this.f99681b) != 0;
        }
        long[] jArr = this.f99682c;
        if (jArr != null && (i10 / 64) - 2 < jArr.length) {
            return ((1 << (i10 % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    public final int b() {
        long[] jArr = this.f99682c;
        if (jArr != null) {
            return (jArr.length + 2) * 64;
        }
        return 128;
    }

    public final int c(int i10) {
        int iB = b();
        while (i10 < iB) {
            if (!a(i10)) {
                return i10;
            }
            i10++;
        }
        return Integer.MAX_VALUE;
    }

    public final int d(int i10) {
        int iB = b();
        while (i10 < iB) {
            if (a(i10)) {
                return i10;
            }
            i10++;
        }
        return Integer.MAX_VALUE;
    }

    public final void e(int i10, boolean z10) {
        if (i10 < 64) {
            long j10 = 1 << i10;
            this.f99680a = z10 ? this.f99680a | j10 : this.f99680a & (~j10);
            return;
        }
        if (i10 < 128) {
            long j11 = 1 << (i10 - 64);
            this.f99681b = z10 ? this.f99681b | j11 : this.f99681b & (~j11);
            return;
        }
        int i11 = i10 / 64;
        int i12 = i11 - 2;
        long j12 = 1 << (i10 % 64);
        long[] jArrCopyOf = this.f99682c;
        if (jArrCopyOf == null) {
            jArrCopyOf = new long[i11 - 1];
            this.f99682c = jArrCopyOf;
        }
        if (i12 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11 - 1);
            kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(this, newSize)");
            this.f99682c = jArrCopyOf;
        }
        long j13 = jArrCopyOf[i12];
        jArrCopyOf[i12] = z10 ? j12 | j13 : (~j12) & j13;
    }

    public final void f(int i10, int i11) {
        while (i10 < i11) {
            e(i10, true);
            i10++;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BitVector [");
        int iB = b();
        boolean z10 = true;
        for (int i10 = 0; i10 < iB; i10++) {
            if (a(i10)) {
                if (!z10) {
                    sb2.append(U6.j.f68738d);
                }
                sb2.append(i10);
                z10 = false;
            }
        }
        return C1526d.a(sb2, ']', "StringBuilder().apply(builderAction).toString()");
    }
}
