package androidx.compose.ui.node;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Z {
    public static final void b(C2216u c2216u, InterfaceC2208l interfaceC2208l) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < c2216u.f103098b) {
            int[] iArr = c2216u.f103097a;
            int i13 = iArr[i10];
            int i14 = iArr[i10 + 2];
            int i15 = i13 - i14;
            int i16 = iArr[i10 + 1] - i14;
            i10 += 3;
            while (i11 < i15) {
                interfaceC2208l.a(i12, i11);
                i11++;
            }
            while (i12 < i16) {
                interfaceC2208l.c(i12);
                i12++;
            }
            while (true) {
                int i17 = i14 - 1;
                if (i14 > 0) {
                    interfaceC2208l.d(i11, i12);
                    i11++;
                    i12++;
                    i14 = i17;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(int r17, int r18, int r19, int r20, androidx.compose.ui.node.InterfaceC2208l r21, int[] r22, int[] r23, int r24, int[] r25) {
        /*
            r0 = r17
            r1 = r19
            r2 = r23
            r3 = r24
            int r4 = r18 - r0
            int r5 = r20 - r1
            int r4 = r4 - r5
            int r5 = r4 % 2
            r7 = 1
            if (r5 != 0) goto L14
            r5 = r7
            goto L15
        L14:
            r5 = 0
        L15:
            int r8 = -r3
            r9 = r8
        L17:
            if (r9 > r3) goto L90
            if (r9 == r8) goto L37
            if (r9 == r3) goto L2e
            int r10 = r9 + 1
            int r10 = androidx.compose.ui.node.C2195c.e(r2, r10)
            int r11 = r9 + (-1)
            int r12 = r2.length
            int r12 = r12 / 2
            int r12 = r12 + r11
            r11 = r2[r12]
            if (r10 >= r11) goto L2e
            goto L37
        L2e:
            int r10 = r9 + (-1)
            int r10 = androidx.compose.ui.node.C2195c.e(r2, r10)
            int r11 = r10 + (-1)
            goto L3e
        L37:
            int r10 = r9 + 1
            int r10 = androidx.compose.ui.node.C2195c.e(r2, r10)
            r11 = r10
        L3e:
            int r12 = r18 - r11
            int r12 = r12 - r9
            int r12 = r20 - r12
            if (r3 == 0) goto L4b
            if (r11 == r10) goto L48
            goto L4b
        L48:
            int r13 = r12 + 1
            goto L4c
        L4b:
            r13 = r12
        L4c:
            if (r11 <= r0) goto L63
            if (r12 <= r1) goto L63
            int r14 = r11 + (-1)
            int r15 = r12 + (-1)
            r6 = r21
            r16 = 0
            boolean r14 = r6.b(r14, r15)
            if (r14 == 0) goto L67
            int r11 = r11 + (-1)
            int r12 = r12 + (-1)
            goto L4c
        L63:
            r6 = r21
            r16 = 0
        L67:
            androidx.compose.ui.node.C2195c.h(r2, r9, r11)
            if (r5 == 0) goto L8b
            int r14 = r4 - r9
            if (r14 < r8) goto L8b
            if (r14 > r3) goto L8b
            r15 = r22
            int r14 = androidx.compose.ui.node.C2195c.e(r15, r14)
            if (r14 < r11) goto L8d
            r0 = 1
            r22 = r25
            r21 = r0
            r19 = r10
            r17 = r11
            r18 = r12
            r20 = r13
            f(r17, r18, r19, r20, r21, r22)
            return r7
        L8b:
            r15 = r22
        L8d:
            int r9 = r9 + 2
            goto L17
        L90:
            r16 = 0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.Z.c(int, int, int, int, androidx.compose.ui.node.l, int[], int[], int, int[]):boolean");
    }

    public static final C2216u d(int i10, int i11, InterfaceC2208l interfaceC2208l) {
        int i12 = ((i10 + i11) + 1) / 2;
        C2216u c2216u = new C2216u(i12 * 3);
        C2216u c2216u2 = new C2216u(i12 * 4);
        c2216u2.h(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArr = new int[i13];
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[5];
        while (c2216u2.d()) {
            int iF = c2216u2.f();
            int iF2 = c2216u2.f();
            int iF3 = c2216u2.f();
            int iF4 = c2216u2.f();
            if (h(iF4, iF3, iF2, iF, interfaceC2208l, iArr, iArr2, iArr3)) {
                if (z0.g(iArr3) > 0) {
                    z0.a(iArr3, c2216u);
                }
                c2216u2.h(iF4, iArr3[0], iF2, iArr3[1]);
                c2216u2.h(iArr3[2], iF3, iArr3[3], iF);
            }
        }
        c2216u.j();
        c2216u.g(i10, i11, 0);
        return c2216u;
    }

    public static final void e(int i10, int i11, @NotNull InterfaceC2208l interfaceC2208l) {
        b(d(i10, i11, interfaceC2208l), interfaceC2208l);
    }

    public static final void f(int i10, int i11, int i12, int i13, boolean z10, @NotNull int[] iArr) {
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z10 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean g(int r17, int r18, int r19, int r20, androidx.compose.ui.node.InterfaceC2208l r21, int[] r22, int[] r23, int r24, int[] r25) {
        /*
            r0 = r18
            r1 = r20
            r2 = r22
            r3 = r24
            int r4 = r0 - r17
            int r5 = r1 - r19
            int r4 = r4 - r5
            int r5 = java.lang.Math.abs(r4)
            int r5 = r5 % 2
            r7 = 1
            if (r5 != r7) goto L18
            r5 = r7
            goto L19
        L18:
            r5 = 0
        L19:
            int r8 = -r3
            r9 = r8
        L1b:
            if (r9 > r3) goto L97
            if (r9 == r8) goto L3b
            if (r9 == r3) goto L32
            int r10 = r9 + 1
            int r10 = androidx.compose.ui.node.C2195c.e(r2, r10)
            int r11 = r9 + (-1)
            int r12 = r2.length
            int r12 = r12 / 2
            int r12 = r12 + r11
            r11 = r2[r12]
            if (r10 <= r11) goto L32
            goto L3b
        L32:
            int r10 = r9 + (-1)
            int r10 = androidx.compose.ui.node.C2195c.e(r2, r10)
            int r11 = r10 + 1
            goto L42
        L3b:
            int r10 = r9 + 1
            int r10 = androidx.compose.ui.node.C2195c.e(r2, r10)
            r11 = r10
        L42:
            int r12 = r11 - r17
            int r12 = r12 + r19
            int r12 = r12 - r9
            if (r3 == 0) goto L4f
            if (r11 == r10) goto L4c
            goto L4f
        L4c:
            int r13 = r12 + (-1)
            goto L50
        L4f:
            r13 = r12
        L50:
            if (r11 >= r0) goto L61
            if (r12 >= r1) goto L61
            r14 = r21
            boolean r15 = r14.b(r11, r12)
            if (r15 == 0) goto L63
            int r11 = r11 + 1
            int r12 = r12 + 1
            goto L50
        L61:
            r14 = r21
        L63:
            androidx.compose.ui.node.C2195c.h(r2, r9, r11)
            if (r5 == 0) goto L90
            int r15 = r4 - r9
            r16 = 0
            int r6 = r8 + 1
            if (r15 < r6) goto L8d
            int r6 = r3 + (-1)
            if (r15 > r6) goto L8d
            r6 = r23
            int r15 = androidx.compose.ui.node.C2195c.e(r6, r15)
            if (r15 > r11) goto L94
            r0 = 0
            r22 = r25
            r21 = r0
            r17 = r10
            r19 = r11
            r20 = r12
            r18 = r13
            f(r17, r18, r19, r20, r21, r22)
            return r7
        L8d:
            r6 = r23
            goto L94
        L90:
            r6 = r23
            r16 = 0
        L94:
            int r9 = r9 + 2
            goto L1b
        L97:
            r16 = 0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.Z.g(int, int, int, int, androidx.compose.ui.node.l, int[], int[], int, int[]):boolean");
    }

    public static final boolean h(int i10, int i11, int i12, int i13, InterfaceC2208l interfaceC2208l, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            int[] iArr4 = iArr;
            C2195c.h(iArr4, 1, i10);
            int[] iArr5 = iArr2;
            C2195c.h(iArr5, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                if (g(i10, i11, i12, i13, interfaceC2208l, iArr4, iArr5, i17, iArr3) || c(i10, i11, i12, i13, interfaceC2208l, iArr, iArr2, i17, iArr3)) {
                    return true;
                }
                i17++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}
