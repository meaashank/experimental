package kotlin.time;

import ed.InterfaceC4376a;
import jd.C4806d;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.V;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Duration.kt\nkotlin/time/LongParser\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 Duration.kt\nkotlin/time/FractionalParser\n*L\n1#1,1613:1\n1#2:1614\n1284#3,12:1615\n1296#3,15:1630\n1284#3,12:1674\n1296#3,15:1689\n1656#4,3:1627\n1656#4,3:1668\n1656#4,3:1671\n1656#4,3:1686\n1656#4,3:1727\n1342#5,23:1645\n1342#5,23:1704\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1100#1:1615,12\n1100#1:1630,15\n1179#1:1674,12\n1179#1:1689,15\n1100#1:1627,3\n1109#1:1668,3\n1174#1:1671,3\n1179#1:1686,3\n1191#1:1727,3\n1109#1:1645,23\n1191#1:1704,23\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f218427a = 1000000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f218428b = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f218429c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f218430d = 4611686018426999999L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f218431e = 4611686018427387903L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f218432f = 4611686018426L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f218433g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f218434h = 60000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f218435i = 3600000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f218436j = 86400000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f218437k = "Infinity";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f218438l = 15;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218439a;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f218439a = iArr;
        }
    }

    public static final long A(long j10) {
        return j10 * ((long) 1000000);
    }

    @Xc.f
    public static final int B(int i10) {
        return (i10 << 3) + (i10 << 1);
    }

    @Xc.f
    public static final long C(long j10) {
        return (j10 << 3) + (j10 << 1);
    }

    public static final long D(long j10) {
        return j10 / ((long) 1000000);
    }

    public static final C5041h E(long j10, InterfaceC4376a<C5041h> interfaceC4376a) {
        C5041h.f218418b.getClass();
        return C5041h.s(j10, C5041h.f218423g) ? interfaceC4376a.invoke() : new C5041h(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018d, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0190, code lost:
    
        if (r10 == r4) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0192, code lost:
    
        if (r10 != r1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0195, code lost:
    
        r2 = (((long) r14) * ((long) 1000000000)) + ((long) r12);
        r4 = r13;
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a0, code lost:
    
        if (r28 != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a2, code lost:
    
        kotlin.time.C5041h.f218418b.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ab, code lost:
    
        return kotlin.time.C5041h.f218423g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b1, code lost:
    
        throw new java.lang.IllegalArgumentException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b2, code lost:
    
        r22 = r2;
        r4 = -1;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b8, code lost:
    
        r10 = k(r25, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bc, code lost:
    
        if (r10 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01be, code lost:
    
        r0 = "Unknown duration unit short name: " + r25.charAt(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d0, code lost:
    
        if (r28 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d2, code lost:
    
        kotlin.time.C5041h.f218418b.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01db, code lost:
    
        return kotlin.time.C5041h.f218423g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e1, code lost:
    
        throw new java.lang.IllegalArgumentException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e2, code lost:
    
        if (r7 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e8, code lost:
    
        if (r7.compareTo(r10) > 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ea, code lost:
    
        if (r28 != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ec, code lost:
    
        kotlin.time.C5041h.f218418b.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f5, code lost:
    
        return kotlin.time.C5041h.f218423g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01fd, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected order of duration components");
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01fe, code lost:
    
        r7 = kotlin.time.j.a.f218439a[r10.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0208, code lost:
    
        if (r7 == 1) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x020b, code lost:
    
        if (r7 == 2) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x020d, code lost:
    
        r8 = j(r8, kotlin.time.m.f(r5, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0217, code lost:
    
        r14 = 1000000;
        r16 = (r5 / r14) + r8;
        r5 = (r5 % r14) + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0222, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0224, code lost:
    
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0227, code lost:
    
        r16 = (r5 / 1000) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0234, code lost:
    
        if (r16 > kotlin.time.j.f218432f) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0236, code lost:
    
        r5 = (r5 % 1000) * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0239, code lost:
    
        r5 = u(r10) + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x023e, code lost:
    
        if (r22 == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0240, code lost:
    
        if (r5 >= r1) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0242, code lost:
    
        if (r28 != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0244, code lost:
    
        kotlin.time.C5041h.f218418b.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x024d, code lost:
    
        return kotlin.time.C5041h.f218423g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0255, code lost:
    
        throw new java.lang.IllegalArgumentException("Fractional component must be last");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x025c, code lost:
    
        if (r10.compareTo(kotlin.time.DurationUnit.MINUTES) < 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0262, code lost:
    
        if ((r5 - r4) <= 15) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0264, code lost:
    
        r2 = I(r25, r4, r5 - u(r10), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x026f, code lost:
    
        r2 = q(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0273, code lost:
    
        r7 = r10;
        r4 = r18;
        r12 = false;
        r10 = r19 + r2;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x027d, code lost:
    
        r2 = r5;
        r7 = r10;
        r4 = r18;
        r10 = r19;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0286, code lost:
    
        if (r28 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0288, code lost:
    
        kotlin.time.C5041h.f218418b.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0291, code lost:
    
        return kotlin.time.C5041h.f218423g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0297, code lost:
    
        throw new java.lang.IllegalArgumentException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f1, code lost:
    
        r19 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f3, code lost:
    
        if (r13 == r2) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f5, code lost:
    
        if (r13 == r1) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fd, code lost:
    
        if (r25.charAt(r13) != '.') goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ff, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0102, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0103, code lost:
    
        if (r2 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0105, code lost:
    
        r4 = r13 + 1;
        r10 = java.lang.Math.min(r13 + 7, r25.length());
        r11 = r4;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0113, code lost:
    
        if (r11 >= r10) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0115, code lost:
    
        r12 = r25.charAt(r11);
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011d, code lost:
    
        if ('0' > r12) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
    
        if (r12 >= ':') goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0121, code lost:
    
        r14 = (r12 - '0') + ((r14 << 3) + (r14 << 1));
        r11 = r11 + 1;
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012f, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0131, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0136, code lost:
    
        if (r10 >= (6 - (r11 - r4))) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0138, code lost:
    
        r14 = (r14 << 1) + (r14 << 3);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0140, code lost:
    
        r2 = java.lang.Math.min(r11 + 9, r25.length());
        r10 = r11;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014c, code lost:
    
        if (r10 >= r2) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014e, code lost:
    
        r23 = r2;
        r2 = r25.charAt(r10);
        r24 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0158, code lost:
    
        if ('0' > r2) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015a, code lost:
    
        if (r2 >= ':') goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015c, code lost:
    
        r12 = (r2 - '0') + ((r12 << 3) + (r12 << 1));
        r10 = r24 + 1;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016a, code lost:
    
        r24 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016c, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0171, code lost:
    
        if (r10 >= (9 - (r24 - r11))) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0173, code lost:
    
        r12 = (r12 << 1) + (r12 << 3);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017b, code lost:
    
        r10 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0181, code lost:
    
        if (r10 >= r25.length()) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0183, code lost:
    
        r2 = r25.charAt(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0189, code lost:
    
        if ('0' > r2) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018b, code lost:
    
        if (r2 >= ':') goto L200;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long F(java.lang.String r25, int r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.j.F(java.lang.String, int, boolean, boolean):long");
    }

    public static final long G(String str, boolean z10, boolean z11) {
        int i10;
        int i11;
        long jF;
        if (str.length() == 0) {
            if (z11) {
                throw new IllegalArgumentException("The string is empty");
            }
            C5041h.f218418b.getClass();
            return C5041h.f218423g;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '+') {
            i10 = cCharAt != '-' ? 0 : 1;
            i11 = i10;
        } else {
            i10 = 0;
            i11 = 1;
        }
        boolean z12 = i11 > 0;
        if (str.length() <= i11) {
            if (z11) {
                throw new IllegalArgumentException("No components");
            }
            C5041h.f218418b.getClass();
            return C5041h.f218423g;
        }
        if (str.charAt(i11) == 'P') {
            jF = J(str, i11 + 1, z11);
        } else {
            if (z10) {
                if (z11) {
                    throw new IllegalArgumentException("");
                }
                C5041h.f218418b.getClass();
                return C5041h.f218423g;
            }
            if (kotlin.text.F.u2(str, i11, f218437k, 0, Math.max(str.length() - i11, 8), true)) {
                C5041h.f218418b.getClass();
                jF = C5041h.f218420d;
            } else {
                jF = F(str, i11, z12, z11);
            }
        }
        if (i10 == 0) {
            return jF;
        }
        C5041h.f218418b.getClass();
        return !C5041h.s(jF, C5041h.f218423g) ? C5041h.l0(jF) : jF;
    }

    public static /* synthetic */ long H(String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return G(str, z10, z11);
    }

    public static final long I(String str, int i10, int i11, DurationUnit durationUnit) {
        kotlin.jvm.internal.G.n(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return C4806d.M0(Double.parseDouble(strSubstring) * r(durationUnit));
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0137  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:42:0x0092
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long J(java.lang.String r20, int r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.j.J(java.lang.String, int, boolean):long");
    }

    @Xc.f
    public static final boolean K(long j10, long j11) {
        return (j10 ^ j11) >= 0;
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final long L(double d10, long j10) {
        return C5041h.X(j10, d10);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final long M(int i10, long j10) {
        return C5041h.Y(j10, i10);
    }

    @InterfaceC4887e0(version = "1.6")
    public static final long N(double d10, @NotNull DurationUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        double dA = l.a(d10, unit, DurationUnit.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jM0 = C4806d.M0(dA);
        return (-4611686018426999999L > jM0 || jM0 >= 4611686018427000000L) ? n(C4806d.M0(l.a(d10, unit, DurationUnit.MILLISECONDS))) : o(jM0);
    }

    @InterfaceC4887e0(version = "1.6")
    public static final long O(int i10, @NotNull DurationUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? o(l.c(i10, unit, DurationUnit.NANOSECONDS)) : P(i10, unit);
    }

    @InterfaceC4887e0(version = "1.6")
    public static final long P(long j10, @NotNull DurationUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jC = l.c(f218430d, durationUnit, unit);
        if ((-jC) <= j10 && j10 <= jC) {
            return o(l.c(j10, unit, durationUnit));
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (unit.compareTo(durationUnit2) < 0) {
            return m(md.u.M(l.b(j10, unit, durationUnit2), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j10);
        if (j10 < -9223372036854775807L) {
            j10 = -9223372036854775807L;
        }
        return m(m.f(Math.abs(j10), unit) * jSignum);
    }

    public static final long g(long j10) {
        return j10 * ((long) 1000000);
    }

    public static final long h(long j10) {
        return j10 / ((long) 1000000);
    }

    public static final long j(long j10, long j11) {
        return (j10 == 4611686018427387903L || j10 == -4611686018427387903L) ? ((-4611686018427387903L >= j11 || j11 >= 4611686018427387903L) && (j11 ^ j10) < 0) ? C5041h.f218422f : j10 : (j11 == 4611686018427387903L || j11 == -4611686018427387903L) ? j11 : md.u.M(j10 + j11, -4611686018427387903L, 4611686018427387903L);
    }

    public static final DurationUnit k(String str, int i10) {
        char cCharAt = str.charAt(i10);
        char cCharAt2 = i10 < M.C3(str) ? str.charAt(i10 + 1) : (char) 0;
        if (cCharAt == 'd') {
            return DurationUnit.DAYS;
        }
        if (cCharAt == 'h') {
            return DurationUnit.HOURS;
        }
        if (cCharAt == 's') {
            return DurationUnit.SECONDS;
        }
        if (cCharAt == 'u') {
            if (cCharAt2 == 's') {
                return DurationUnit.MICROSECONDS;
            }
            return null;
        }
        if (cCharAt == 'm') {
            return cCharAt2 == 's' ? DurationUnit.MILLISECONDS : DurationUnit.MINUTES;
        }
        if (cCharAt == 'n' && cCharAt2 == 's') {
            return DurationUnit.NANOSECONDS;
        }
        return null;
    }

    public static final long l(long j10, int i10) {
        long j11 = (j10 << 1) + ((long) i10);
        C5041h.f218418b.b(j11);
        return j11;
    }

    public static final long m(long j10) {
        long j11 = (j10 << 1) + 1;
        C5041h.f218418b.b(j11);
        return j11;
    }

    public static final long n(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? m(md.u.M(j10, -4611686018427387903L, 4611686018427387903L)) : o(j10 * ((long) 1000000));
    }

    public static final long o(long j10) {
        long j11 = j10 << 1;
        C5041h.f218418b.b(j11);
        return j11;
    }

    public static final long p(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? m(j10 / ((long) 1000000)) : o(j10);
    }

    public static final long q(long j10, DurationUnit durationUnit) {
        return C4806d.M0(s(durationUnit) * j10);
    }

    public static final long r(DurationUnit durationUnit) {
        int i10 = a.f218439a[durationUnit.ordinal()];
        if (i10 == 5) {
            return 60000000000L;
        }
        if (i10 == 6) {
            return 3600000000000L;
        }
        if (i10 == 7) {
            return 86400000000000L;
        }
        throw new IllegalStateException(("Invalid unit: " + durationUnit + " for fallback fraction multiplier").toString());
    }

    public static final double s(DurationUnit durationUnit) {
        switch (a.f218439a[durationUnit.ordinal()]) {
            case 1:
                return 1.0E-12d;
            case 2:
                return 1.0E-15d;
            case 3:
                return 1.0E-9d;
            case 4:
                return 1.0E-6d;
            case 5:
                return 6.0E-5d;
            case 6:
                return 0.0036d;
            case 7:
                return 0.0864d;
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }

    public static /* synthetic */ void t(DurationUnit durationUnit) {
    }

    public static final int u(DurationUnit durationUnit) {
        int i10 = a.f218439a[durationUnit.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? 2 : 1;
    }

    @Xc.f
    public static final long v(boolean z10, String str) {
        if (z10) {
            throw new IllegalArgumentException(str);
        }
        C5041h.f218418b.getClass();
        return C5041h.f218423g;
    }

    public static long w(boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        if (z10) {
            throw new IllegalArgumentException(str);
        }
        C5041h.f218418b.getClass();
        return C5041h.f218423g;
    }

    @Xc.f
    public static final boolean x(long j10) {
        return -4611686018427387903L < j10 && j10 < 4611686018427387903L;
    }

    @Xc.f
    public static final boolean y(long j10) {
        return j10 == 4611686018427387903L || j10 == -4611686018427387903L;
    }

    public static final DurationUnit z(String str, int i10) {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'D') {
            return DurationUnit.DAYS;
        }
        if (cCharAt == 'H') {
            return DurationUnit.HOURS;
        }
        if (cCharAt == 'M') {
            return DurationUnit.MINUTES;
        }
        if (cCharAt != 'S') {
            return null;
        }
        return DurationUnit.SECONDS;
    }
}
