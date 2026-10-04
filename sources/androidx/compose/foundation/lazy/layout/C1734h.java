package androidx.compose.foundation.lazy.layout;

import androidx.activity.C1477d;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1208#2:127\n1187#2,2:128\n460#3,11:130\n460#3,11:142\n1#4:141\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:142,11\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1734h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91822b = androidx.compose.runtime.collection.c.f99563d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<a> f91823a = new androidx.compose.runtime.collection.c<>(new a[16], 0);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.h$a */
    @V({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f91824c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f91826b;

        public a(int i10, int i11) {
            this.f91825a = i10;
            this.f91826b = i11;
            if (i10 < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public static a d(a aVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = aVar.f91825a;
            }
            if ((i12 & 2) != 0) {
                i11 = aVar.f91826b;
            }
            aVar.getClass();
            return new a(i10, i11);
        }

        public final int a() {
            return this.f91825a;
        }

        public final int b() {
            return this.f91826b;
        }

        @NotNull
        public final a c(int i10, int i11) {
            return new a(i10, i11);
        }

        public final int e() {
            return this.f91826b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f91825a == aVar.f91825a && this.f91826b == aVar.f91826b;
        }

        public final int f() {
            return this.f91825a;
        }

        public int hashCode() {
            return (this.f91825a * 31) + this.f91826b;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Interval(start=");
            sb2.append(this.f91825a);
            sb2.append(", end=");
            return C1477d.a(sb2, this.f91826b, ')');
        }
    }

    @NotNull
    public final a a(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.f91823a.b(aVar);
        return aVar;
    }

    public final int b() {
        int i10 = this.f91823a.z().f91826b;
        androidx.compose.runtime.collection.c<a> cVar = this.f91823a;
        int i11 = cVar.f99566c;
        if (i11 > 0) {
            a[] aVarArr = cVar.f99564a;
            int i12 = 0;
            do {
                int i13 = aVarArr[i12].f91826b;
                if (i13 > i10) {
                    i10 = i13;
                }
                i12++;
            } while (i12 < i11);
        }
        return i10;
    }

    public final int c() {
        int i10 = this.f91823a.z().f91825a;
        androidx.compose.runtime.collection.c<a> cVar = this.f91823a;
        int i11 = cVar.f99566c;
        if (i11 > 0) {
            a[] aVarArr = cVar.f99564a;
            int i12 = 0;
            do {
                int i13 = aVarArr[i12].f91825a;
                if (i13 < i10) {
                    i10 = i13;
                }
                i12++;
            } while (i12 < i11);
        }
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.f91823a.V();
    }

    public final void e(@NotNull a aVar) {
        this.f91823a.h0(aVar);
    }
}
