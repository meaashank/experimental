package androidx.compose.ui.text.input;

import kotlin.collections.C4875q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
public final class C2345n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public char[] f104816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104818d;

    public C2345n(@NotNull char[] cArr, int i10, int i11) {
        this.f104815a = cArr.length;
        this.f104816b = cArr;
        this.f104817c = i10;
        this.f104818d = i11;
    }

    public final void a(@NotNull StringBuilder sb2) {
        sb2.append(this.f104816b, 0, this.f104817c);
        char[] cArr = this.f104816b;
        int i10 = this.f104818d;
        sb2.append(cArr, i10, this.f104815a - i10);
    }

    public final void b(int i10, int i11) {
        int i12 = this.f104817c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f104816b;
            C4875q.w0(cArr, cArr, this.f104818d - i13, i11, i12);
            this.f104817c = i10;
            this.f104818d -= i13;
            return;
        }
        if (i10 < i12 && i11 >= i12) {
            this.f104818d = c() + i11;
            this.f104817c = i10;
            return;
        }
        int iC = c() + i10;
        int iC2 = c() + i11;
        int i14 = this.f104818d;
        char[] cArr2 = this.f104816b;
        C4875q.w0(cArr2, cArr2, this.f104817c, i14, iC);
        this.f104817c += iC - i14;
        this.f104818d = iC2;
    }

    public final int c() {
        return this.f104818d - this.f104817c;
    }

    public final char d(int i10) {
        int i11 = this.f104817c;
        return i10 < i11 ? this.f104816b[i10] : this.f104816b[(i10 - i11) + this.f104818d];
    }

    public final int e() {
        return this.f104815a - c();
    }

    public final void f(int i10) {
        if (i10 <= c()) {
            return;
        }
        int iC = i10 - c();
        int i11 = this.f104815a;
        do {
            i11 *= 2;
        } while (i11 - this.f104815a < iC);
        char[] cArr = new char[i11];
        C4875q.w0(this.f104816b, cArr, 0, 0, this.f104817c);
        int i12 = this.f104815a;
        int i13 = this.f104818d;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        C4875q.w0(this.f104816b, cArr, i15, i13, i14 + i13);
        this.f104816b = cArr;
        this.f104815a = i11;
        this.f104818d = i15;
    }

    public final void g(int i10, int i11, @NotNull String str) {
        f(str.length() - (i11 - i10));
        b(i10, i11);
        C2346o.b(str, this.f104816b, this.f104817c);
        this.f104817c = str.length() + this.f104817c;
    }

    @NotNull
    public String toString() {
        return "";
    }
}
