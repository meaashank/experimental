package androidx.compose.foundation.text.input.internal;

import kotlin.collections.C4875q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public char[] f94042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94044d;

    public W(@NotNull char[] cArr, int i10, int i11) {
        this.f94041a = cArr.length;
        this.f94042b = cArr;
        this.f94043c = i10;
        this.f94044d = i11;
    }

    public static /* synthetic */ void h(W w10, int i10, int i11, CharSequence charSequence, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        int i15 = i12;
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        w10.g(i10, i11, charSequence, i15, i13);
    }

    public final void a(@NotNull StringBuilder sb2) {
        sb2.append(this.f94042b, 0, this.f94043c);
        char[] cArr = this.f94042b;
        int i10 = this.f94044d;
        sb2.append(cArr, i10, this.f94041a - i10);
    }

    public final void b(int i10, int i11) {
        int i12 = this.f94043c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f94042b;
            C4875q.w0(cArr, cArr, this.f94044d - i13, i11, i12);
            this.f94043c = i10;
            this.f94044d -= i13;
            return;
        }
        if (i10 < i12 && i11 >= i12) {
            this.f94044d = c() + i11;
            this.f94043c = i10;
            return;
        }
        int iC = c() + i10;
        int iC2 = c() + i11;
        int i14 = this.f94044d;
        char[] cArr2 = this.f94042b;
        C4875q.w0(cArr2, cArr2, this.f94043c, i14, iC);
        this.f94043c += iC - i14;
        this.f94044d = iC2;
    }

    public final int c() {
        return this.f94044d - this.f94043c;
    }

    public final char d(int i10) {
        int i11 = this.f94043c;
        return i10 < i11 ? this.f94042b[i10] : this.f94042b[(i10 - i11) + this.f94044d];
    }

    public final int e() {
        return this.f94041a - c();
    }

    public final void f(int i10) {
        if (i10 <= c()) {
            return;
        }
        int iC = i10 - c();
        int i11 = this.f94041a;
        do {
            i11 *= 2;
        } while (i11 - this.f94041a < iC);
        char[] cArr = new char[i11];
        C4875q.w0(this.f94042b, cArr, 0, 0, this.f94043c);
        int i12 = this.f94041a;
        int i13 = this.f94044d;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        C4875q.w0(this.f94042b, cArr, i15, i13, i14 + i13);
        this.f94042b = cArr;
        this.f94041a = i11;
        this.f94044d = i15;
    }

    public final void g(int i10, int i11, @NotNull CharSequence charSequence, int i12, int i13) {
        int i14 = i13 - i12;
        f(i14 - (i11 - i10));
        b(i10, i11);
        e1.a(charSequence, this.f94042b, this.f94043c, i12, i13);
        this.f94043c += i14;
    }

    @NotNull
    public String toString() {
        return "";
    }
}
