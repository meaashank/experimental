package b0;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2731I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final r0 f120571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f120572b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f120573c;

    public C2731I(@NotNull r0 r0Var) {
        this.f120571a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L1f
            b0.r0 r2 = r5.f120571a
            android.text.Layout r2 = r2.f120692g
            int r2 = b0.C2735M.a(r2, r6, r7)
            b0.r0 r3 = r5.f120571a
            android.text.Layout r3 = r3.f120692g
            int r3 = r3.getLineStart(r2)
            b0.r0 r4 = r5.f120571a
            int r2 = r4.v(r2)
            if (r6 == r3) goto L21
            if (r6 != r2) goto L1f
            goto L21
        L1f:
            r2 = r1
            goto L22
        L21:
            r2 = r0
        L22:
            int r3 = r6 * 4
            if (r9 == 0) goto L2a
            if (r2 == 0) goto L2f
            r0 = r1
            goto L2f
        L2a:
            if (r2 == 0) goto L2e
            r0 = 2
            goto L2f
        L2e:
            r0 = 3
        L2f:
            int r3 = r3 + r0
            int r0 = r5.f120572b
            if (r0 != r3) goto L37
            float r6 = r5.f120573c
            return r6
        L37:
            if (r9 == 0) goto L40
            b0.r0 r9 = r5.f120571a
            float r6 = r9.J(r6, r7)
            goto L46
        L40:
            b0.r0 r9 = r5.f120571a
            float r6 = r9.M(r6, r7)
        L46:
            if (r8 == 0) goto L4c
            r5.f120572b = r3
            r5.f120573c = r6
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C2731I.a(int, boolean, boolean, boolean):float");
    }

    @NotNull
    public final r0 b() {
        return this.f120571a;
    }

    public final float c(int i10) {
        return a(i10, false, false, true);
    }

    public final float d(int i10) {
        return a(i10, true, true, true);
    }

    public final float e(int i10) {
        return a(i10, false, false, false);
    }

    public final float f(int i10) {
        return a(i10, true, true, false);
    }
}
