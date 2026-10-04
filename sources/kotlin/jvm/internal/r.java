package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends N<char[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final char[] f217968d;

    public r(int i10) {
        super(i10);
        this.f217968d = new char[i10];
    }

    public final void h(char c10) {
        char[] cArr = this.f217968d;
        int i10 = this.f217891b;
        this.f217891b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // kotlin.jvm.internal.N
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull char[] cArr) {
        G.p(cArr, "<this>");
        return cArr.length;
    }

    @NotNull
    public final char[] j() {
        char[] cArr = this.f217968d;
        char[] cArr2 = new char[f()];
        g(cArr, cArr2);
        return cArr2;
    }
}
