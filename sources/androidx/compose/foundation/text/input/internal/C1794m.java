package androidx.compose.foundation.text.input.internal;

import androidx.activity.C1477d;
import androidx.compose.foundation.text.input.j;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nChangeTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1208#2:197\n1187#2,2:198\n1208#2:200\n1187#2,2:201\n460#3,7:203\n728#3,2:210\n467#3,4:212\n523#3:216\n728#3,2:217\n523#3:219\n523#3:221\n476#3,11:222\n728#3,2:233\n1#4:220\n*S KotlinDebug\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n*L\n34#1:197\n34#1:198,2\n35#1:200\n35#1:201,2\n38#1:203,7\n39#1:210,2\n38#1:212,4\n81#1:216\n110#1:217,2\n132#1:219\n135#1:221\n139#1:222,11\n186#1:233,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1794m implements j.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94107c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public androidx.compose.runtime.collection.c<a> f94108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public androidx.compose.runtime.collection.c<a> f94109b;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f94111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f94112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f94113d;

        public a(int i10, int i11, int i12, int i13) {
            this.f94110a = i10;
            this.f94111b = i11;
            this.f94112c = i12;
            this.f94113d = i13;
        }

        public static a f(a aVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = aVar.f94110a;
            }
            if ((i14 & 2) != 0) {
                i11 = aVar.f94111b;
            }
            if ((i14 & 4) != 0) {
                i12 = aVar.f94112c;
            }
            if ((i14 & 8) != 0) {
                i13 = aVar.f94113d;
            }
            aVar.getClass();
            return new a(i10, i11, i12, i13);
        }

        public final int a() {
            return this.f94110a;
        }

        public final int b() {
            return this.f94111b;
        }

        public final int c() {
            return this.f94112c;
        }

        public final int d() {
            return this.f94113d;
        }

        @NotNull
        public final a e(int i10, int i11, int i12, int i13) {
            return new a(i10, i11, i12, i13);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f94110a == aVar.f94110a && this.f94111b == aVar.f94111b && this.f94112c == aVar.f94112c && this.f94113d == aVar.f94113d;
        }

        public final int g() {
            return this.f94113d;
        }

        public final int h() {
            return this.f94112c;
        }

        public int hashCode() {
            return (((((this.f94110a * 31) + this.f94111b) * 31) + this.f94112c) * 31) + this.f94113d;
        }

        public final int i() {
            return this.f94111b;
        }

        public final int j() {
            return this.f94110a;
        }

        public final void k(int i10) {
            this.f94113d = i10;
        }

        public final void l(int i10) {
            this.f94112c = i10;
        }

        public final void m(int i10) {
            this.f94111b = i10;
        }

        public final void n(int i10) {
            this.f94110a = i10;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Change(preStart=");
            sb2.append(this.f94110a);
            sb2.append(", preEnd=");
            sb2.append(this.f94111b);
            sb2.append(", originalStart=");
            sb2.append(this.f94112c);
            sb2.append(", originalEnd=");
            return C1477d.a(sb2, this.f94113d, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1794m() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.foundation.text.input.j.a
    public int a() {
        return this.f94108a.f99566c;
    }

    @Override // androidx.compose.foundation.text.input.j.a
    public long b(int i10) {
        a aVar = this.f94108a.f99564a[i10];
        return androidx.compose.ui.text.a0.b(aVar.f94112c, aVar.f94113d);
    }

    @Override // androidx.compose.foundation.text.input.j.a
    public long c(int i10) {
        a aVar = this.f94108a.f99564a[i10];
        return androidx.compose.ui.text.a0.b(aVar.f94110a, aVar.f94111b);
    }

    public final void d(a aVar, int i10, int i11, int i12) {
        int i13;
        if (this.f94109b.U()) {
            i13 = 0;
        } else {
            a aVarW = this.f94109b.W();
            i13 = aVarW.f94111b - aVarW.f94113d;
        }
        if (aVar == null) {
            int i14 = i10 - i13;
            aVar = new a(i10, i11 + i12, i14, (i11 - i10) + i14);
        } else {
            if (aVar.f94110a > i10) {
                aVar.f94110a = i10;
                aVar.f94112c = i10;
            }
            int i15 = aVar.f94111b;
            if (i11 > i15) {
                int i16 = i15 - aVar.f94113d;
                aVar.f94111b = i11;
                aVar.f94113d = i11 - i16;
            }
            aVar.f94111b += i12;
        }
        this.f94109b.b(aVar);
    }

    public final void e() {
        this.f94108a.q();
    }

    public final void f(int i10, int i11, int i12) {
        int i13;
        if (i10 == i11 && i12 == 0) {
            return;
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int i14 = i12 - (iMax - iMin);
        int i15 = 0;
        a aVar = null;
        boolean z10 = false;
        while (true) {
            androidx.compose.runtime.collection.c<a> cVar = this.f94108a;
            if (i15 >= cVar.f99566c) {
                break;
            }
            a aVar2 = cVar.f99564a[i15];
            int i16 = aVar2.f94110a;
            if ((iMin > i16 || i16 > iMax) && (iMin > (i13 = aVar2.f94111b) || i13 > iMax)) {
                if (i16 > iMax && !z10) {
                    d(aVar, iMin, iMax, i14);
                    z10 = true;
                }
                if (z10) {
                    aVar2.f94110a += i14;
                    aVar2.f94111b += i14;
                }
                this.f94109b.b(aVar2);
            } else if (aVar == null) {
                aVar = aVar2;
            } else {
                aVar.f94111b = aVar2.f94111b;
                aVar.f94113d = aVar2.f94113d;
            }
            i15++;
        }
        if (!z10) {
            d(aVar, iMin, iMax, i14);
        }
        androidx.compose.runtime.collection.c<a> cVar2 = this.f94108a;
        this.f94108a = this.f94109b;
        this.f94109b = cVar2;
        cVar2.q();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeList(changes=[");
        androidx.compose.runtime.collection.c<a> cVar = this.f94108a;
        int i10 = cVar.f99566c;
        if (i10 > 0) {
            a[] aVarArr = cVar.f99564a;
            int i11 = 0;
            do {
                a aVar = aVarArr[i11];
                sb2.append("(" + aVar.f94112c + ',' + aVar.f94113d + ")->(" + aVar.f94110a + ',' + aVar.f94111b + ')');
                if (i11 < this.f94108a.f99566c - 1) {
                    sb2.append(U6.j.f68738d);
                }
                i11++;
            } while (i11 < i10);
        }
        sb2.append("])");
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public C1794m(@Nullable C1794m c1794m) {
        androidx.compose.runtime.collection.c<a> cVar;
        int i10;
        int i11 = 0;
        this.f94108a = new androidx.compose.runtime.collection.c<>(new a[16], 0);
        this.f94109b = new androidx.compose.runtime.collection.c<>(new a[16], 0);
        if (c1794m == null || (cVar = c1794m.f94108a) == null || (i10 = cVar.f99566c) <= 0) {
            return;
        }
        a[] aVarArr = cVar.f99564a;
        do {
            a aVar = aVarArr[i11];
            this.f94108a.b(new a(aVar.f94110a, aVar.f94111b, aVar.f94112c, aVar.f94113d));
            i11++;
        } while (i11 < i10);
    }

    public /* synthetic */ C1794m(C1794m c1794m, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : c1794m);
    }
}
