package androidx.collection;

import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.collection.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/MutableFloatSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 FloatSet.kt\nandroidx/collection/FloatSet\n+ 6 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,925:1\n46#2,5:926\n1804#3,6:931\n1956#3:950\n1820#3:954\n1728#3:971\n1724#3:974\n1925#3,3:978\n1939#3,3:982\n1865#3:986\n1853#3:988\n1847#3:989\n1860#3:994\n1948#3:996\n1728#3:1010\n1724#3:1013\n1925#3,3:1017\n1939#3,3:1021\n1865#3:1025\n1853#3:1027\n1847#3:1028\n1860#3:1033\n1948#3:1035\n1956#3:1057\n1820#3:1061\n1780#3:1073\n1804#3,6:1074\n1792#3:1080\n1791#3,4:1081\n1804#3,6:1085\n1724#3:1094\n1728#3:1095\n1925#3,3:1096\n1939#3,3:1099\n1865#3:1102\n1853#3:1103\n1847#3:1104\n1860#3:1105\n1948#3:1106\n1814#3:1107\n1770#3:1108\n1812#3:1109\n1770#3:1110\n1780#3:1111\n1804#3,6:1112\n1792#3:1118\n1791#3,4:1119\n1925#3,3:1123\n1956#3:1126\n1847#3:1127\n1770#3:1128\n1724#3:1132\n1728#3:1133\n1804#3,6:1134\n1770#3:1140\n1728#3:1141\n1804#3,6:1142\n1804#3,6:1148\n1728#3:1154\n1804#3,6:1155\n1817#3:1161\n1770#3:1162\n1724#3:1166\n1728#3:1167\n1780#3:1168\n1804#3,6:1169\n1792#3:1175\n1791#3,4:1176\n1804#3,6:1180\n1804#3,6:1186\n13614#4,2:937\n13614#4,2:1044\n262#5,4:939\n232#5,7:943\n243#5,3:951\n246#5,2:955\n266#5,2:957\n249#5,6:959\n268#5:965\n439#5:966\n440#5:970\n442#5,2:972\n444#5,3:975\n447#5:981\n448#5:985\n449#5:987\n450#5,4:990\n456#5:995\n457#5,8:997\n439#5:1005\n440#5:1009\n442#5,2:1011\n444#5,3:1014\n447#5:1020\n448#5:1024\n449#5:1026\n450#5,4:1029\n456#5:1034\n457#5,8:1036\n262#5,4:1046\n232#5,7:1050\n243#5,3:1058\n246#5,2:1062\n266#5,2:1064\n249#5,6:1066\n268#5:1072\n921#6,3:967\n921#6,3:1006\n921#6,3:1091\n921#6,3:1129\n921#6,3:1163\n*S KotlinDebug\n*F\n+ 1 FloatSet.kt\nandroidx/collection/MutableFloatSet\n*L\n496#1:926,5\n523#1:931,6\n592#1:950\n592#1:954\n604#1:971\n604#1:974\n604#1:978,3\n604#1:982,3\n604#1:986\n604#1:988\n604#1:989\n604#1:994\n604#1:996\n617#1:1010\n617#1:1013\n617#1:1017,3\n617#1:1021,3\n617#1:1025\n617#1:1027\n617#1:1028\n617#1:1033\n617#1:1035\n660#1:1057\n660#1:1061\n670#1:1073\n670#1:1074,6\n670#1:1080\n670#1:1081,4\n680#1:1085,6\n694#1:1094\n695#1:1095\n702#1:1096,3\n703#1:1099,3\n704#1:1102\n705#1:1103\n705#1:1104\n709#1:1105\n712#1:1106\n721#1:1107\n721#1:1108\n727#1:1109\n727#1:1110\n728#1:1111\n728#1:1112,6\n728#1:1118\n728#1:1119,4\n742#1:1123,3\n743#1:1126\n745#1:1127\n798#1:1128\n814#1:1132\n825#1:1133\n826#1:1134,6\n836#1:1140\n839#1:1141\n840#1:1142,6\n841#1:1148,6\n850#1:1154\n851#1:1155,6\n887#1:1161\n887#1:1162\n890#1:1166\n892#1:1167\n892#1:1168\n892#1:1169,6\n892#1:1175\n892#1:1176,4\n905#1:1180,6\n911#1:1186,6\n570#1:937,2\n639#1:1044,2\n592#1:939,4\n592#1:943,7\n592#1:951,3\n592#1:955,2\n592#1:957,2\n592#1:959,6\n592#1:965\n604#1:966\n604#1:970\n604#1:972,2\n604#1:975,3\n604#1:981\n604#1:985\n604#1:987\n604#1:990,4\n604#1:995\n604#1:997,8\n617#1:1005\n617#1:1009\n617#1:1011,2\n617#1:1014,3\n617#1:1020\n617#1:1024\n617#1:1026\n617#1:1029,4\n617#1:1034\n617#1:1036,8\n660#1:1046,4\n660#1:1050,7\n660#1:1058,3\n660#1:1062,2\n660#1:1064,2\n660#1:1066,6\n660#1:1072\n604#1:967,3\n617#1:1006,3\n693#1:1091,3\n813#1:1129,3\n889#1:1163,3\n*E\n"})
public final class C1553q0 extends A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86987e;

    public C1553q0() {
        this(0, 1, null);
    }

    public final boolean G(float f10) {
        int i10 = this.f86673d;
        this.f86671b[M(f10)] = f10;
        return this.f86673d != i10;
    }

    public final boolean H(@NotNull A elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86673d;
        V(elements);
        return i10 != this.f86673d;
    }

    public final boolean I(@NotNull float[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86673d;
        W(elements);
        return i10 != this.f86673d;
    }

    public final void J() {
        int i10 = this.f86672c;
        if (i10 <= 8 || Long.compare((((long) this.f86673d) * 32) ^ Long.MIN_VALUE, (((long) i10) * 25) ^ Long.MIN_VALUE) > 0) {
            b0(S0.y(this.f86672c));
        } else {
            L();
        }
    }

    public final void K() {
        this.f86673d = 0;
        long[] jArr = this.f86670a;
        if (jArr != S0.f86829e) {
            C4875q.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f86670a;
            int i10 = this.f86672c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        O();
    }

    public final void L() {
        long[] jArr = this.f86670a;
        int i10 = this.f86672c;
        float[] fArr = this.f86671b;
        S0.a(jArr, i10);
        int iC = -1;
        int i11 = 0;
        while (i11 != i10) {
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j10 = (jArr[i12] >> i13) & 255;
            if (j10 == 128) {
                iC = i11;
                i11++;
            } else {
                if (j10 == 254) {
                    int iFloatToIntBits = Float.floatToIntBits(fArr[i11]) * S0.f86834j;
                    int i14 = iFloatToIntBits ^ (iFloatToIntBits << 16);
                    int i15 = i14 >>> 7;
                    int iN = N(i15);
                    int i16 = i15 & i10;
                    if (((iN - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i17 = iN >> 3;
                        long j11 = jArr[i17];
                        int i18 = (iN & 7) << 3;
                        if (((j11 >> i18) & 255) == 128) {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j11 & (~(255 << i18)));
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            fArr[iN] = fArr[i11];
                            fArr[i11] = 0.0f;
                            iC = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j11 & (~(255 << i18)));
                            if (iC == -1) {
                                iC = S0.c(jArr, i11 + 1, i10);
                            }
                            fArr[iC] = fArr[iN];
                            fArr[iN] = fArr[i11];
                            fArr[i11] = fArr[iC];
                            i11--;
                        }
                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i11++;
            }
        }
        O();
    }

    public final int M(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10) * S0.f86834j;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f86672c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f86670a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * S0.f86835k);
            for (long j13 = (~j12) & (j12 - S0.f86835k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f86671b[iNumberOfTrailingZeros] == f10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iN = N(i11);
                if (this.f86987e == 0 && ((this.f86670a[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    J();
                    iN = N(i11);
                }
                this.f86673d++;
                int i19 = this.f86987e;
                long[] jArr2 = this.f86670a;
                int i20 = iN >> 3;
                long j14 = jArr2[i20];
                int i21 = (iN & 7) << 3;
                this.f86987e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f86672c;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iN - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iN;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int N(int i10) {
        int i11 = this.f86672c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f86670a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void O() {
        this.f86987e = S0.q(this.f86672c) - this.f86673d;
    }

    public final void P(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S0.f86829e;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            C4875q.U1(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f86670a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        O();
    }

    public final void Q(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S0.z(i10)) : 0;
        this.f86672c = iMax;
        P(iMax);
        this.f86671b = new float[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(float r14) {
        /*
            r13 = this;
            int r0 = java.lang.Float.floatToIntBits(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f86672c
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f86670a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            float[] r11 = r13.f86671b
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6c
            r10 = -1
        L66:
            if (r10 < 0) goto L6b
            r13.a0(r10)
        L6b:
            return
        L6c:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1553q0.R(float):void");
    }

    public final void S(@NotNull A elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        float[] fArr = elements.f86671b;
        long[] jArr = elements.f86670a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        R(fArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void T(@NotNull float[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        for (float f10 : elements) {
            R(f10);
        }
    }

    public final void U(float f10) {
        this.f86671b[M(f10)] = f10;
    }

    public final void V(@NotNull A elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        float[] fArr = elements.f86671b;
        long[] jArr = elements.f86670a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        U(fArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void W(@NotNull float[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        for (float f10 : elements) {
            U(f10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean X(float r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Float.floatToIntBits(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f86672c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f86670a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            float[] r14 = r0.f86671b
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L72
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            r4 = r11
        L6c:
            if (r4 == 0) goto L71
            r0.a0(r10)
        L71:
            return r4
        L72:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1553q0.X(float):boolean");
    }

    public final boolean Y(@NotNull A elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86673d;
        S(elements);
        return i10 != this.f86673d;
    }

    public final boolean Z(@NotNull float[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86673d;
        T(elements);
        return i10 != this.f86673d;
    }

    public final void a0(int i10) {
        this.f86673d--;
        long[] jArr = this.f86670a;
        int i11 = this.f86672c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final void b0(int i10) {
        long[] jArr = this.f86670a;
        float[] fArr = this.f86671b;
        int i11 = this.f86672c;
        Q(i10);
        long[] jArr2 = this.f86670a;
        float[] fArr2 = this.f86671b;
        int i12 = this.f86672c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                float f10 = fArr[i13];
                int iFloatToIntBits = Float.floatToIntBits(f10) * S0.f86834j;
                int i14 = iFloatToIntBits ^ (iFloatToIntBits << 16);
                int iN = N(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iN >> 3;
                int i16 = (iN & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((iN - 7) & i12) + (i12 & 7)) >> 3] = j11;
                fArr2[iN] = f10;
            }
        }
    }

    @e.D(from = 0)
    public final int c0() {
        int i10 = this.f86672c;
        int iZ = S0.z(S0.B(this.f86673d));
        if (iZ >= i10) {
            return 0;
        }
        b0(iZ);
        return i10 - this.f86672c;
    }

    public final void d0(int i10, long j10) {
        long[] jArr = this.f86670a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f86672c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public C1553q0(int i10) {
        if (i10 >= 0) {
            Q(S0.B(i10));
        } else {
            A.f.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ C1553q0(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
