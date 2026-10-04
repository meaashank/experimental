package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C1758e;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/PartialGapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class S0 implements CharSequence {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f93807e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f93808f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f93809g = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f93810h = 64;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f93811i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public CharSequence f93812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public W f93813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f93814c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93815d = -1;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public S0(@NotNull CharSequence charSequence) {
        this.f93812a = charSequence;
    }

    public static /* synthetic */ void e(S0 s02, int i10, int i11, CharSequence charSequence, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        int i15 = i12;
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        s02.d(i10, i11, charSequence, i15, i13);
    }

    public final boolean a(@NotNull CharSequence charSequence) {
        return kotlin.jvm.internal.G.g(toString(), charSequence.toString());
    }

    public char b(int i10) {
        W w10 = this.f93813b;
        if (w10 == null) {
            return this.f93812a.charAt(i10);
        }
        if (i10 < this.f93814c) {
            return this.f93812a.charAt(i10);
        }
        int iE = w10.e();
        int i11 = this.f93814c;
        return i10 < iE + i11 ? w10.d(i10 - i11) : this.f93812a.charAt(i10 - ((iE - this.f93815d) + i11));
    }

    public int c() {
        W w10 = this.f93813b;
        if (w10 == null) {
            return this.f93812a.length();
        }
        return w10.e() + (this.f93812a.length() - (this.f93815d - this.f93814c));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return b(i10);
    }

    public final void d(int i10, int i11, @NotNull CharSequence charSequence, int i12, int i13) {
        if (i10 > i11) {
            throw new IllegalArgumentException(C1758e.a("start=", i10, " > end=", i11).toString());
        }
        if (i12 > i13) {
            throw new IllegalArgumentException(C1758e.a("textStart=", i12, " > textEnd=", i13).toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("start must be non-negative, but was ", i10).toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("textStart must be non-negative, but was ", i12).toString());
        }
        W w10 = this.f93813b;
        int i14 = i13 - i12;
        if (w10 != null) {
            int i15 = this.f93814c;
            int i16 = i10 - i15;
            int i17 = i11 - i15;
            if (i16 >= 0 && i17 <= w10.e()) {
                w10.g(i16, i17, charSequence, i12, i13);
                return;
            }
            this.f93812a = toString();
            this.f93813b = null;
            this.f93814c = -1;
            this.f93815d = -1;
            d(i10, i11, charSequence, i12, i13);
            return;
        }
        int iMax = Math.max(255, i14 + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.f93812a.length() - i11, 64);
        int i18 = i10 - iMin;
        e1.a(this.f93812a, cArr, 0, i18, i10);
        int i19 = iMax - iMin2;
        int i20 = iMin2 + i11;
        e1.a(this.f93812a, cArr, i19, i11, i20);
        e1.a(charSequence, cArr, iMin, i12, i13);
        this.f93813b = new W(cArr, iMin + i14, i19);
        this.f93814c = i18;
        this.f93815d = i20;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int i10, int i11) {
        return toString().subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        W w10 = this.f93813b;
        if (w10 == null) {
            return this.f93812a.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f93812a, 0, this.f93814c);
        w10.a(sb2);
        CharSequence charSequence = this.f93812a;
        sb2.append(charSequence, this.f93815d, charSequence.length());
        return sb2.toString();
    }
}
