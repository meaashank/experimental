package androidx.compose.ui.tooling.data;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@q
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f105401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f105402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<p> f105404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f105405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<h> f105406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f105407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f105408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f105409i;

    public n(@Nullable String str, @Nullable String str2, int i10, @NotNull List<p> list, int i11, @Nullable List<h> list2, boolean z10, boolean z11) {
        this.f105401a = str;
        this.f105402b = str2;
        this.f105403c = i10;
        this.f105404d = list;
        this.f105405e = i11;
        this.f105406f = list2;
        this.f105407g = z10;
        this.f105408h = z11;
    }

    @NotNull
    public final List<p> a() {
        return this.f105404d;
    }

    @Nullable
    public final String b() {
        return this.f105401a;
    }

    public final int c() {
        return this.f105403c;
    }

    @Nullable
    public final List<h> d() {
        return this.f105406f;
    }

    public final int e() {
        return this.f105405e;
    }

    @Nullable
    public final String f() {
        return this.f105402b;
    }

    public final boolean g() {
        return this.f105407g;
    }

    public final boolean h() {
        return this.f105408h;
    }

    @Nullable
    public final o i() {
        int i10;
        if (this.f105409i >= this.f105404d.size() && (i10 = this.f105405e) >= 0) {
            this.f105409i = i10;
        }
        if (this.f105409i >= this.f105404d.size()) {
            return null;
        }
        List<p> list = this.f105404d;
        int i11 = this.f105409i;
        this.f105409i = i11 + 1;
        p pVar = list.get(i11);
        Integer num = pVar.f105416a;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = pVar.f105417b;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Integer num3 = pVar.f105418c;
        return new o(iIntValue, iIntValue2, num3 != null ? num3.intValue() : -1, this.f105402b, this.f105403c);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.tooling.data.o j(int r9, @org.jetbrains.annotations.Nullable androidx.compose.ui.tooling.data.n r10) {
        /*
            r8 = this;
            java.util.List<androidx.compose.ui.tooling.data.p> r0 = r8.f105404d
            int r0 = r0.size()
            if (r9 < r0) goto L22
            int r0 = r8.f105405e
            if (r0 < 0) goto L22
            java.util.List<androidx.compose.ui.tooling.data.p> r1 = r8.f105404d
            int r1 = r1.size()
            if (r0 >= r1) goto L22
            int r0 = r8.f105405e
            int r9 = r9 - r0
            java.util.List<androidx.compose.ui.tooling.data.p> r0 = r8.f105404d
            int r0 = r0.size()
            int r1 = r8.f105405e
            int r0 = r0 - r1
            int r9 = r9 % r0
            int r9 = r9 + r1
        L22:
            java.util.List<androidx.compose.ui.tooling.data.p> r0 = r8.f105404d
            int r0 = r0.size()
            r1 = 0
            if (r9 >= r0) goto L7b
            java.util.List<androidx.compose.ui.tooling.data.p> r0 = r8.f105404d
            java.lang.Object r9 = r0.get(r9)
            androidx.compose.ui.tooling.data.p r9 = (androidx.compose.ui.tooling.data.p) r9
            androidx.compose.ui.tooling.data.o r2 = new androidx.compose.ui.tooling.data.o
            java.lang.Integer r0 = r9.f105416a
            r3 = -1
            if (r0 == 0) goto L3f
            int r0 = r0.intValue()
            goto L40
        L3f:
            r0 = r3
        L40:
            java.lang.Integer r4 = r9.f105417b
            if (r4 == 0) goto L49
            int r4 = r4.intValue()
            goto L4a
        L49:
            r4 = r3
        L4a:
            java.lang.Integer r9 = r9.f105418c
            if (r9 == 0) goto L54
            int r9 = r9.intValue()
            r5 = r9
            goto L55
        L54:
            r5 = r3
        L55:
            java.lang.String r9 = r8.f105402b
            if (r9 != 0) goto L60
            if (r10 == 0) goto L5e
            java.lang.String r6 = r10.f105402b
            goto L61
        L5e:
            r6 = r1
            goto L61
        L60:
            r6 = r9
        L61:
            if (r9 != 0) goto L6c
            if (r10 == 0) goto L6f
            int r9 = r10.f105403c
        L67:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L6f
        L6c:
            int r9 = r8.f105403c
            goto L67
        L6f:
            if (r1 == 0) goto L75
            int r3 = r1.intValue()
        L75:
            r7 = r3
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.data.n.j(int, androidx.compose.ui.tooling.data.n):androidx.compose.ui.tooling.data.o");
    }
}
