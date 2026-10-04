package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C2523f0;
import androidx.datastore.preferences.protobuf.C2528i;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import androidx.datastore.preferences.protobuf.a1;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2541o0<T> implements G0<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f112904r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f112905s = 20;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f112906t = 1048575;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f112907u = 267386880;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f112908v = 268435456;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f112909w = 536870912;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f112911y = 51;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f112913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f112914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f112915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f112917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f112918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f112919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f112920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f112921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f112922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f112923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f112924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC2550t0 f112925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AbstractC2515b0 f112926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final W0<?, ?> f112927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I<?> f112928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC2525g0 f112929q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f112910x = new int[0];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Unsafe f112912z = a1.R();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112930a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f112930a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112930a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112930a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112930a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112930a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112930a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112930a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f112930a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f112930a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f112930a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f112930a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f112930a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f112930a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f112930a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f112930a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f112930a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f112930a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C2541o0(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, boolean z10, boolean z11, int[] iArr2, int i12, int i13, InterfaceC2550t0 interfaceC2550t0, AbstractC2515b0 abstractC2515b0, W0<?, ?> w02, I<?> i14, InterfaceC2525g0 interfaceC2525g0) {
        this.f112913a = iArr;
        this.f112914b = objArr;
        this.f112915c = i10;
        this.f112916d = i11;
        this.f112919g = messageLite instanceof GeneratedMessageLite;
        this.f112920h = z10;
        this.f112918f = i14 != null && i14.e(messageLite);
        this.f112921i = z11;
        this.f112922j = iArr2;
        this.f112923k = i12;
        this.f112924l = i13;
        this.f112925m = interfaceC2550t0;
        this.f112926n = abstractC2515b0;
        this.f112927o = w02;
        this.f112928p = i14;
        this.f112917e = messageLite;
        this.f112929q = interfaceC2525g0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean C(Object obj, int i10, G0 g02) {
        return g02.b(a1.O(obj, i10 & f112906t));
    }

    public static boolean H(int i10) {
        return (i10 & 268435456) != 0;
    }

    public static List<?> I(Object obj, long j10) {
        return (List) a1.O(obj, j10);
    }

    public static <T> long J(T t10, long j10) {
        return a1.L(t10, j10);
    }

    public static <T> C2541o0<T> P(Class<T> cls, InterfaceC2531j0 interfaceC2531j0, InterfaceC2550t0 interfaceC2550t0, AbstractC2515b0 abstractC2515b0, W0<?, ?> w02, I<?> i10, InterfaceC2525g0 interfaceC2525g0) {
        return interfaceC2531j0 instanceof E0 ? R((E0) interfaceC2531j0, interfaceC2550t0, abstractC2515b0, w02, i10, interfaceC2525g0) : Q((StructuralMessageInfo) interfaceC2531j0, interfaceC2550t0, abstractC2515b0, w02, i10, interfaceC2525g0);
    }

    public static <T> C2541o0<T> Q(StructuralMessageInfo structuralMessageInfo, InterfaceC2550t0 interfaceC2550t0, AbstractC2515b0 abstractC2515b0, W0<?, ?> w02, I<?> i10, InterfaceC2525g0 interfaceC2525g0) {
        int i11;
        int i12;
        boolean z10 = structuralMessageInfo.f112699a == ProtoSyntax.PROTO3;
        FieldInfo[] fieldInfoArr = structuralMessageInfo.f112702d;
        if (fieldInfoArr.length == 0) {
            i11 = 0;
            i12 = 0;
        } else {
            i11 = fieldInfoArr[0].f112576d;
            i12 = fieldInfoArr[fieldInfoArr.length - 1].f112576d;
        }
        int length = fieldInfoArr.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i13 = 0;
        int i14 = 0;
        for (FieldInfo fieldInfo : fieldInfoArr) {
            FieldType fieldType = fieldInfo.f112574b;
            if (fieldType == FieldType.MAP) {
                i13++;
            } else if (fieldType.id() >= 18 && fieldInfo.f112574b.id() <= 49) {
                i14++;
            }
        }
        int[] iArr2 = i13 > 0 ? new int[i13] : null;
        int[] iArr3 = i14 > 0 ? new int[i14] : null;
        int[] iArr4 = structuralMessageInfo.f112701c;
        if (iArr4 == null) {
            iArr4 = f112910x;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i15 < fieldInfoArr.length) {
            FieldInfo fieldInfo2 = fieldInfoArr[i15];
            int i20 = fieldInfo2.f112576d;
            p0(fieldInfo2, iArr, i16, z10, objArr);
            FieldInfo[] fieldInfoArr2 = fieldInfoArr;
            if (i17 < iArr4.length && iArr4[i17] == i20) {
                iArr4[i17] = i16;
                i17++;
            }
            FieldType fieldType2 = fieldInfo2.f112574b;
            if (fieldType2 == FieldType.MAP) {
                iArr2[i18] = i16;
                i18++;
            } else if (fieldType2.id() >= 18 && fieldInfo2.f112574b.id() <= 49) {
                iArr3[i19] = (int) a1.f112800f.p(fieldInfo2.f112573a);
                i19++;
            }
            i15++;
            i16 += 3;
            fieldInfoArr = fieldInfoArr2;
        }
        if (iArr2 == null) {
            iArr2 = f112910x;
        }
        if (iArr3 == null) {
            iArr3 = f112910x;
        }
        int[] iArr5 = new int[iArr4.length + iArr2.length + iArr3.length];
        System.arraycopy(iArr4, 0, iArr5, 0, iArr4.length);
        System.arraycopy(iArr2, 0, iArr5, iArr4.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr5, iArr4.length + iArr2.length, iArr3.length);
        return new C2541o0<>(iArr, objArr, i11, i12, structuralMessageInfo.f112703e, z10, true, iArr5, iArr4.length, iArr4.length + iArr2.length, interfaceC2550t0, abstractC2515b0, w02, i10, interfaceC2525g0);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> androidx.datastore.preferences.protobuf.C2541o0<T> R(androidx.datastore.preferences.protobuf.E0 r35, androidx.datastore.preferences.protobuf.InterfaceC2550t0 r36, androidx.datastore.preferences.protobuf.AbstractC2515b0 r37, androidx.datastore.preferences.protobuf.W0<?, ?> r38, androidx.datastore.preferences.protobuf.I<?> r39, androidx.datastore.preferences.protobuf.InterfaceC2525g0 r40) {
        /*
            Method dump skipped, instruction units count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2541o0.R(androidx.datastore.preferences.protobuf.E0, androidx.datastore.preferences.protobuf.t0, androidx.datastore.preferences.protobuf.b0, androidx.datastore.preferences.protobuf.W0, androidx.datastore.preferences.protobuf.I, androidx.datastore.preferences.protobuf.g0):androidx.datastore.preferences.protobuf.o0");
    }

    public static long T(int i10) {
        return i10 & f112906t;
    }

    public static <T> boolean U(T t10, long j10) {
        return ((Boolean) a1.O(t10, j10)).booleanValue();
    }

    public static <T> double V(T t10, long j10) {
        return ((Double) a1.O(t10, j10)).doubleValue();
    }

    public static <T> float W(T t10, long j10) {
        return ((Float) a1.O(t10, j10)).floatValue();
    }

    public static <T> int X(T t10, long j10) {
        return ((Integer) a1.O(t10, j10)).intValue();
    }

    public static <T> long Y(T t10, long j10) {
        return ((Long) a1.O(t10, j10)).longValue();
    }

    public static <T> boolean i(T t10, long j10) {
        return a1.u(t10, j10);
    }

    public static <T> double l(T t10, long j10) {
        return a1.D(t10, j10);
    }

    public static java.lang.reflect.Field l0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbA = androidx.activity.result.i.a("Field ", str, " for ");
            sbA.append(cls.getName());
            sbA.append(" not found. Known fields are ");
            sbA.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbA.toString());
        }
    }

    public static <T> float p(T t10, long j10) {
        return a1.F(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p0(androidx.datastore.preferences.protobuf.FieldInfo r8, int[] r9, int r10, boolean r11, java.lang.Object[] r12) {
        /*
            androidx.datastore.preferences.protobuf.w0 r0 = r8.f112581i
            r1 = 0
            if (r0 == 0) goto L21
            androidx.datastore.preferences.protobuf.FieldType r11 = r8.f112574b
            int r11 = r11.id()
            int r11 = r11 + 51
            java.lang.reflect.Field r2 = r0.f113014c
            long r2 = androidx.datastore.preferences.protobuf.a1.W(r2)
            int r2 = (int) r2
            java.lang.reflect.Field r0 = r0.f113013b
            androidx.datastore.preferences.protobuf.a1$e r3 = androidx.datastore.preferences.protobuf.a1.f112800f
            long r3 = r3.p(r0)
            int r0 = (int) r3
        L1d:
            r3 = r2
            r2 = r0
            r0 = r1
            goto L63
        L21:
            androidx.datastore.preferences.protobuf.FieldType r0 = r8.f112574b
            java.lang.reflect.Field r2 = r8.f112573a
            long r2 = androidx.datastore.preferences.protobuf.a1.W(r2)
            int r2 = (int) r2
            int r3 = r0.id()
            if (r11 != 0) goto L51
            boolean r11 = r0.isList()
            if (r11 != 0) goto L51
            boolean r11 = r0.isMap()
            if (r11 != 0) goto L51
            java.lang.reflect.Field r11 = r8.f112577e
            androidx.datastore.preferences.protobuf.a1$e r0 = androidx.datastore.preferences.protobuf.a1.f112800f
            long r4 = r0.p(r11)
            int r0 = (int) r4
            int r11 = r8.f112578f
            int r11 = java.lang.Integer.numberOfTrailingZeros(r11)
            r7 = r0
            r0 = r11
            r11 = r3
            r3 = r2
            r2 = r7
            goto L63
        L51:
            java.lang.reflect.Field r11 = r8.f112582j
            if (r11 != 0) goto L5a
            r0 = r1
            r11 = r3
            r3 = r2
            r2 = r0
            goto L63
        L5a:
            androidx.datastore.preferences.protobuf.a1$e r0 = androidx.datastore.preferences.protobuf.a1.f112800f
            long r4 = r0.p(r11)
            int r0 = (int) r4
            r11 = r3
            goto L1d
        L63:
            int r4 = r8.f112576d
            r9[r10] = r4
            int r4 = r10 + 1
            boolean r5 = r8.f112580h
            if (r5 == 0) goto L70
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L71
        L70:
            r5 = r1
        L71:
            boolean r6 = r8.f112579g
            if (r6 == 0) goto L77
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L77:
            r1 = r1 | r5
            int r11 = r11 << 20
            r11 = r11 | r1
            r11 = r11 | r3
            r9[r4] = r11
            int r11 = r10 + 2
            int r0 = r0 << 20
            r0 = r0 | r2
            r9[r11] = r0
            java.lang.Class r9 = r8.t()
            java.lang.Object r11 = r8.f112584l
            if (r11 == 0) goto La3
            int r10 = r10 / 3
            int r10 = r10 * 2
            r12[r10] = r11
            if (r9 == 0) goto L9a
            int r10 = r10 + 1
            r12[r10] = r9
            return
        L9a:
            androidx.datastore.preferences.protobuf.V$e r8 = r8.f112585m
            if (r8 == 0) goto Lba
            int r10 = r10 + 1
            r12[r10] = r8
            return
        La3:
            if (r9 == 0) goto Lae
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r12[r10] = r9
            return
        Lae:
            androidx.datastore.preferences.protobuf.V$e r8 = r8.f112585m
            if (r8 == 0) goto Lba
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r12[r10] = r8
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2541o0.p0(androidx.datastore.preferences.protobuf.FieldInfo, int[], int, boolean, java.lang.Object[]):void");
    }

    public static int q0(int i10) {
        return (i10 & f112907u) >>> 20;
    }

    public static X0 t(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        X0 x02 = generatedMessageLite.unknownFields;
        if (x02 != X0.f112772g) {
            return x02;
        }
        X0 x03 = new X0();
        generatedMessageLite.unknownFields = x03;
        return x03;
    }

    public static <T> int y(T t10, long j10) {
        return a1.I(t10, j10);
    }

    public static boolean z(int i10) {
        return (i10 & 536870912) != 0;
    }

    public final boolean A(T t10, int i10) {
        if (!this.f112920h) {
            int iG0 = g0(i10);
            return (a1.f112800f.k(t10, (long) (iG0 & f112906t)) & (1 << (iG0 >>> 20))) != 0;
        }
        int iR0 = r0(i10);
        long j10 = iR0 & f112906t;
        switch (q0(iR0)) {
            case 0:
                return a1.f112800f.h(t10, j10) != 0.0d;
            case 1:
                return a1.f112800f.i(t10, j10) != 0.0f;
            case 2:
                return a1.f112800f.m(t10, j10) != 0;
            case 3:
                return a1.f112800f.m(t10, j10) != 0;
            case 4:
                return a1.f112800f.k(t10, j10) != 0;
            case 5:
                return a1.f112800f.m(t10, j10) != 0;
            case 6:
                return a1.f112800f.k(t10, j10) != 0;
            case 7:
                return a1.f112800f.e(t10, j10);
            case 8:
                Object objN = a1.f112800f.n(t10, j10);
                if (objN instanceof String) {
                    return !((String) objN).isEmpty();
                }
                if (objN instanceof ByteString) {
                    return !ByteString.f112510e.equals(objN);
                }
                throw new IllegalArgumentException();
            case 9:
                return a1.f112800f.n(t10, j10) != null;
            case 10:
                return !ByteString.f112510e.equals(a1.f112800f.n(t10, j10));
            case 11:
                return a1.f112800f.k(t10, j10) != 0;
            case 12:
                return a1.f112800f.k(t10, j10) != 0;
            case 13:
                return a1.f112800f.k(t10, j10) != 0;
            case 14:
                return a1.f112800f.m(t10, j10) != 0;
            case 15:
                return a1.f112800f.k(t10, j10) != 0;
            case 16:
                return a1.f112800f.m(t10, j10) != 0;
            case 17:
                return a1.f112800f.n(t10, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean B(T t10, int i10, int i11, int i12) {
        return this.f112920h ? A(t10, i10) : (i11 & i12) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean D(Object obj, int i10, int i11) {
        List list = (List) a1.O(obj, i10 & f112906t);
        if (list.isEmpty()) {
            return true;
        }
        G0 g0S = s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!g0S.b(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.datastore.preferences.protobuf.G0] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean E(T t10, int i10, int i11) {
        HashMap map = (HashMap) this.f112929q.g(a1.f112800f.n(t10, i10 & f112906t));
        if (map.isEmpty()) {
            return true;
        }
        if (this.f112929q.b(r(i11)).f112849c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? I10 = 0;
        for (Object obj : ((LinkedHashMap) map).values()) {
            I10 = I10;
            if (I10 == 0) {
                I10 = A0.a().i(obj.getClass());
            }
            if (!I10.b(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean F(T t10, T t11, int i10) {
        long jG0 = g0(i10) & f112906t;
        return a1.I(t10, jG0) == a1.f112800f.k(t11, jG0);
    }

    public final boolean G(T t10, int i10, int i11) {
        return a1.I(t10, (long) (g0(i11) & f112906t)) == i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05e0 A[Catch: all -> 0x004e, TryCatch #10 {all -> 0x004e, blocks: (B:19:0x0042, B:35:0x006e, B:53:0x00a2, B:170:0x05db, B:172:0x05e0, B:173:0x05e5), top: B:206:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0607 A[LOOP:2: B:183:0x0603->B:185:0x0607, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.datastore.preferences.protobuf.W0, androidx.datastore.preferences.protobuf.W0<UT, UB>, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.b<ET>> void K(androidx.datastore.preferences.protobuf.W0<UT, UB> r15, androidx.datastore.preferences.protobuf.I<ET> r16, T r17, androidx.datastore.preferences.protobuf.F0 r18, androidx.datastore.preferences.protobuf.H r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2541o0.K(androidx.datastore.preferences.protobuf.W0, androidx.datastore.preferences.protobuf.I, java.lang.Object, androidx.datastore.preferences.protobuf.F0, androidx.datastore.preferences.protobuf.H):void");
    }

    public final <K, V> void L(Object obj, int i10, Object obj2, H h10, F0 f02) throws IOException {
        long jR0 = r0(i10) & f112906t;
        Object objN = a1.f112800f.n(obj, jR0);
        if (objN == null) {
            objN = this.f112929q.f(obj2);
            a1.q0(obj, jR0, objN);
        } else if (this.f112929q.h(objN)) {
            Object objF = this.f112929q.f(obj2);
            this.f112929q.a(objF, objN);
            a1.q0(obj, jR0, objF);
            objN = objF;
        }
        f02.M(this.f112929q.e(objN), this.f112929q.b(obj2), h10);
    }

    public final void M(T t10, T t11, int i10) {
        long jR0 = r0(i10) & f112906t;
        if (A(t11, i10)) {
            a1.e eVar = a1.f112800f;
            Object objN = eVar.n(t10, jR0);
            Object objN2 = eVar.n(t11, jR0);
            if (objN != null && objN2 != null) {
                a1.q0(t10, jR0, V.v(objN, objN2));
                m0(t10, i10);
            } else if (objN2 != null) {
                a1.q0(t10, jR0, objN2);
                m0(t10, i10);
            }
        }
    }

    public final void N(T t10, T t11, int i10) {
        int iR0 = r0(i10);
        int i11 = this.f112913a[i10];
        long j10 = iR0 & f112906t;
        if (G(t11, i11, i10)) {
            a1.e eVar = a1.f112800f;
            Object objN = eVar.n(t10, j10);
            Object objN2 = eVar.n(t11, j10);
            if (objN != null && objN2 != null) {
                a1.q0(t10, j10, V.v(objN, objN2));
                n0(t10, i11, i10);
            } else if (objN2 != null) {
                a1.q0(t10, j10, objN2);
                n0(t10, i11, i10);
            }
        }
    }

    public final void O(T t10, T t11, int i10) {
        int iR0 = r0(i10);
        long j10 = 1048575 & iR0;
        int i11 = this.f112913a[i10];
        switch (q0(iR0)) {
            case 0:
                if (A(t11, i10)) {
                    a1.g0(t10, j10, a1.f112800f.h(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 1:
                if (A(t11, i10)) {
                    a1.i0(t10, j10, a1.f112800f.i(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 2:
                if (A(t11, i10)) {
                    a1.o0(t10, j10, a1.f112800f.m(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 3:
                if (A(t11, i10)) {
                    a1.o0(t10, j10, a1.f112800f.m(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 4:
                if (A(t11, i10)) {
                    a1.l0(t10, j10, a1.f112800f.k(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 5:
                if (A(t11, i10)) {
                    a1.o0(t10, j10, a1.f112800f.m(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 6:
                if (A(t11, i10)) {
                    a1.l0(t10, j10, a1.f112800f.k(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 7:
                if (A(t11, i10)) {
                    a1.X(t10, j10, a1.f112800f.e(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 8:
                if (A(t11, i10)) {
                    a1.q0(t10, j10, a1.f112800f.n(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 9:
                M(t10, t11, i10);
                break;
            case 10:
                if (A(t11, i10)) {
                    a1.q0(t10, j10, a1.f112800f.n(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 11:
                if (A(t11, i10)) {
                    a1.l0(t10, j10, a1.f112800f.k(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 12:
                if (A(t11, i10)) {
                    a1.l0(t10, j10, a1.f112800f.k(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 13:
                if (A(t11, i10)) {
                    a1.l0(t10, j10, a1.f112800f.k(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 14:
                if (A(t11, i10)) {
                    a1.o0(t10, j10, a1.f112800f.m(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 15:
                if (A(t11, i10)) {
                    a1.l0(t10, j10, a1.f112800f.k(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 16:
                if (A(t11, i10)) {
                    a1.o0(t10, j10, a1.f112800f.m(t11, j10));
                    m0(t10, i10);
                }
                break;
            case 17:
                M(t10, t11, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f112926n.d(t10, t11, j10);
                break;
            case 50:
                I0.I(this.f112929q, t10, t11, j10);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (G(t11, i11, i10)) {
                    a1.q0(t10, j10, a1.f112800f.n(t11, j10));
                    n0(t10, i11, i10);
                }
                break;
            case 60:
                N(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (G(t11, i11, i10)) {
                    a1.q0(t10, j10, a1.f112800f.n(t11, j10));
                    n0(t10, i11, i10);
                }
                break;
            case 68:
                N(t10, t11, i10);
                break;
        }
    }

    public final int S(int i10) {
        return this.f112913a[i10];
    }

    public final <K, V> int Z(T t10, byte[] bArr, int i10, int i11, int i12, long j10, C2528i.b bVar) throws IOException {
        Unsafe unsafe = f112912z;
        Object objR = r(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f112929q.h(object)) {
            Object objF = this.f112929q.f(objR);
            this.f112929q.a(objF, object);
            unsafe.putObject(t10, j10, objF);
            object = objF;
        }
        return j(bArr, i10, i11, this.f112929q.b(objR), this.f112929q.e(object), bVar);
    }

    @Override // androidx.datastore.preferences.protobuf.G0
    public void a(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f112913a.length; i10 += 3) {
            O(t10, t11, i10);
        }
        if (this.f112920h) {
            return;
        }
        I0.J(this.f112927o, t10, t11);
        if (this.f112918f) {
            I0.H(this.f112928p, t10, t11);
        }
    }

    public final int a0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C2528i.b bVar) throws IOException {
        Object object;
        Unsafe unsafe = f112912z;
        long j11 = this.f112913a[i17 + 2] & f112906t;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Double.valueOf(C2528i.d(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Float.valueOf(C2528i.l(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iL = C2528i.L(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(bVar.f112853b));
                unsafe.putInt(t10, j11, i13);
                return iL;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int I10 = C2528i.I(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(bVar.f112852a));
                unsafe.putInt(t10, j11, i13);
                return I10;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Long.valueOf(C2528i.j(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(C2528i.h(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iL2 = C2528i.L(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Boolean.valueOf(bVar.f112853b != 0));
                unsafe.putInt(t10, j11, i13);
                return iL2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int I11 = C2528i.I(bArr, i10, bVar);
                int i22 = bVar.f112852a;
                if (i22 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !Utf8.u(bArr, I11, I11 + i22)) {
                        throw InvalidProtocolBufferException.i();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, I11, i22, V.f112719a));
                    I11 += i22;
                }
                unsafe.putInt(t10, j11, i13);
                return I11;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iP = C2528i.p(s(i17), bArr, i10, i11, bVar);
                object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                if (object == null) {
                    unsafe.putObject(t10, j10, bVar.f112854c);
                } else {
                    unsafe.putObject(t10, j10, V.v(object, bVar.f112854c));
                }
                unsafe.putInt(t10, j11, i13);
                return iP;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iB = C2528i.b(bArr, i10, bVar);
                unsafe.putObject(t10, j10, bVar.f112854c);
                unsafe.putInt(t10, j11, i13);
                return iB;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int I12 = C2528i.I(bArr, i10, bVar);
                int i23 = bVar.f112852a;
                V.e eVarQ = q(i17);
                if (eVarQ != null && !eVarQ.a(i23)) {
                    t(t10).r(i12, Long.valueOf(i23));
                    return I12;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(i23));
                unsafe.putInt(t10, j11, i13);
                return I12;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int I13 = C2528i.I(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(AbstractC2549t.b(bVar.f112852a)));
                unsafe.putInt(t10, j11, i13);
                return I13;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iL3 = C2528i.L(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(AbstractC2549t.c(bVar.f112853b)));
                unsafe.putInt(t10, j11, i13);
                return iL3;
            case 68:
                if (i14 == 3) {
                    int iN = C2528i.n(s(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object == null) {
                        unsafe.putObject(t10, j10, bVar.f112854c);
                    } else {
                        unsafe.putObject(t10, j10, V.v(object, bVar.f112854c));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return iN;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    @Override // androidx.datastore.preferences.protobuf.G0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(T r13) {
        /*
            r12 = this;
            r0 = -1
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r12.f112923k
            r5 = 1
            if (r2 >= r4) goto L94
            int[] r4 = r12.f112922j
            r4 = r4[r2]
            int[] r6 = r12.f112913a
            r6 = r6[r4]
            int r7 = r12.r0(r4)
            boolean r8 = r12.f112920h
            if (r8 != 0) goto L31
            int[] r8 = r12.f112913a
            int r9 = r4 + 2
            r8 = r8[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r8
            int r8 = r8 >>> 20
            int r5 = r5 << r8
            if (r9 == r0) goto L32
            sun.misc.Unsafe r0 = androidx.datastore.preferences.protobuf.C2541o0.f112912z
            long r10 = (long) r9
            int r3 = r0.getInt(r13, r10)
            r0 = r9
            goto L32
        L31:
            r5 = r1
        L32:
            boolean r8 = H(r7)
            if (r8 == 0) goto L3f
            boolean r8 = r12.B(r13, r4, r3, r5)
            if (r8 != 0) goto L3f
            return r1
        L3f:
            int r8 = q0(r7)
            r9 = 9
            if (r8 == r9) goto L7f
            r9 = 17
            if (r8 == r9) goto L7f
            r5 = 27
            if (r8 == r5) goto L78
            r5 = 60
            if (r8 == r5) goto L67
            r5 = 68
            if (r8 == r5) goto L67
            r5 = 49
            if (r8 == r5) goto L78
            r5 = 50
            if (r8 == r5) goto L60
            goto L90
        L60:
            boolean r4 = r12.E(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L67:
            boolean r5 = r12.G(r13, r6, r4)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.G0 r4 = r12.s(r4)
            boolean r4 = C(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L78:
            boolean r4 = r12.D(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L7f:
            boolean r5 = r12.B(r13, r4, r3, r5)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.G0 r4 = r12.s(r4)
            boolean r4 = C(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L90:
            int r2 = r2 + 1
            goto L4
        L94:
            boolean r0 = r12.f112918f
            if (r0 == 0) goto La5
            androidx.datastore.preferences.protobuf.I<?> r0 = r12.f112928p
            androidx.datastore.preferences.protobuf.FieldSet r13 = r0.c(r13)
            boolean r13 = r13.E()
            if (r13 != 0) goto La5
            return r1
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2541o0.b(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0089. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0453  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b0(T r25, byte[] r26, int r27, int r28, int r29, androidx.datastore.preferences.protobuf.C2528i.b r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2541o0.b0(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.i$b):int");
    }

    @Override // androidx.datastore.preferences.protobuf.G0
    public void c(T t10, Writer writer) throws IOException {
        if (writer.I() == Writer.FieldOrder.DESCENDING) {
            u0(t10, writer);
        } else if (this.f112920h) {
            t0(t10, writer);
        } else {
            s0(t10, writer);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0057. Please report as an issue. */
    public final int c0(T t10, byte[] bArr, int i10, int i11, C2528i.b bVar) throws IOException {
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        boolean z10;
        Unsafe unsafe2;
        boolean z11;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z12;
        boolean z13;
        int iL;
        T t11;
        C2541o0<T> c2541o0 = this;
        byte[] bArr2 = bArr;
        int i19 = i11;
        C2528i.b bVar2 = bVar;
        Unsafe unsafe3 = f112912z;
        int i20 = -1;
        int iG = i10;
        int i21 = -1;
        int i22 = 0;
        while (iG < i19) {
            int iH = iG + 1;
            int i23 = bArr2[iG];
            if (i23 < 0) {
                iH = C2528i.H(i23, bArr2, iH, bVar2);
                i23 = bVar2.f112852a;
            }
            int i24 = iH;
            int i25 = i23;
            int i26 = (i25 == true ? 1 : 0) >>> 3;
            int i27 = (i25 == true ? 1 : 0) & 7;
            int iF0 = i26 > i21 ? c2541o0.f0(i26, i22 / 3) : c2541o0.e0(i26);
            if (iF0 == i20) {
                unsafe = unsafe3;
                i12 = i24;
                i13 = i26;
                i14 = 0;
                z10 = i25 == true ? 1 : 0;
            } else {
                int i28 = c2541o0.f112913a[iF0 + 1];
                int iQ0 = q0(i28);
                long j10 = 1048575 & i28;
                if (iQ0 <= 17) {
                    switch (iQ0) {
                        case 0:
                            unsafe2 = unsafe3;
                            if (i27 != 1) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                a1.g0(t10, j10, Double.longBitsToDouble(C2528i.j(bArr2, i24)));
                                iG = i24 + 8;
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 1:
                            unsafe2 = unsafe3;
                            if (i27 != 5) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                a1.i0(t10, j10, Float.intBitsToFloat(C2528i.h(bArr2, i24)));
                                iG = i24 + 4;
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            unsafe2 = unsafe3;
                            if (i27 != 0) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                iL = C2528i.L(bArr2, i24, bVar2);
                                t11 = t10;
                                unsafe3 = unsafe2;
                                unsafe3.putLong(t11, j10, bVar2.f112853b);
                                unsafe3 = unsafe3;
                                iG = iL;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i27 != 0) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                iG = C2528i.I(bArr2, i24, bVar2);
                                unsafe2.putInt(t10, j10, bVar2.f112852a);
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            unsafe2 = unsafe3;
                            if (i27 != 1) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                unsafe2.putLong(t10, j10, C2528i.j(bArr2, i24));
                                unsafe2 = unsafe2;
                                iG = i24 + 8;
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            unsafe2 = unsafe3;
                            if (i27 != 5) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                unsafe2.putInt(t10, j10, C2528i.h(bArr2, i24));
                                iG = i24 + 4;
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 7:
                            unsafe2 = unsafe3;
                            if (i27 != 0) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                int iL2 = C2528i.L(bArr2, i24, bVar2);
                                a1.X(t10, j10, bVar2.f112853b != 0);
                                iG = iL2;
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 8:
                            unsafe2 = unsafe3;
                            if (i27 != 2) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                iG = (536870912 & i28) == 0 ? C2528i.C(bArr2, i24, bVar2) : C2528i.F(bArr2, i24, bVar2);
                                unsafe2.putObject(t10, j10, bVar2.f112854c);
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 9:
                            unsafe2 = unsafe3;
                            if (i27 != 2) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                iG = C2528i.p(c2541o0.s(iF0), bArr2, i24, i19, bVar2);
                                Object object = unsafe2.getObject(t10, j10);
                                if (object == null) {
                                    unsafe2.putObject(t10, j10, bVar2.f112854c);
                                } else {
                                    unsafe2.putObject(t10, j10, V.v(object, bVar2.f112854c));
                                }
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 10:
                            unsafe2 = unsafe3;
                            if (i27 != 2) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                iG = C2528i.b(bArr2, i24, bVar2);
                                unsafe2.putObject(t10, j10, bVar2.f112854c);
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 12:
                            unsafe2 = unsafe3;
                            if (i27 != 0) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                iG = C2528i.I(bArr2, i24, bVar2);
                                unsafe2.putInt(t10, j10, bVar2.f112852a);
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 15:
                            unsafe2 = unsafe3;
                            if (i27 != 0) {
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                iG = C2528i.I(bArr2, i24, bVar2);
                                unsafe2.putInt(t10, j10, AbstractC2549t.b(bVar2.f112852a));
                                unsafe3 = unsafe2;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        case 16:
                            if (i27 != 0) {
                                unsafe2 = unsafe3;
                                unsafe = unsafe2;
                                i18 = i24;
                                i17 = i26;
                                i16 = iF0;
                                z13 = i25 == true ? 1 : 0;
                            } else {
                                iL = C2528i.L(bArr2, i24, bVar2);
                                t11 = t10;
                                unsafe3.putLong(t11, j10, AbstractC2549t.c(bVar2.f112853b));
                                unsafe3 = unsafe3;
                                iG = iL;
                                i21 = i26;
                                i22 = iF0;
                                i20 = -1;
                            }
                            break;
                        default:
                            unsafe = unsafe3;
                            i18 = i24;
                            i17 = i26;
                            i16 = iF0;
                            z13 = i25 == true ? 1 : 0;
                            break;
                    }
                } else {
                    unsafe2 = unsafe3;
                    if (iQ0 != 27) {
                        unsafe = unsafe2;
                        if (iQ0 <= 49) {
                            int iD0 = c2541o0.d0(t10, bArr, i24, i11, i25 == true ? 1 : 0, i26, i27, iF0, i28, iQ0, j10, bVar);
                            z11 = i25 == true ? 1 : 0;
                            i15 = iF0;
                            if (iD0 != i24) {
                                c2541o0 = this;
                                i19 = i11;
                                bVar2 = bVar;
                                i22 = i15;
                                iG = iD0;
                                i21 = i26;
                            } else {
                                i12 = iD0;
                                i13 = i26;
                                i14 = i15;
                                z10 = z11;
                            }
                        } else {
                            i16 = iF0;
                            i17 = i26;
                            boolean z14 = i25 == true ? 1 : 0;
                            if (iQ0 != 50) {
                                i13 = i17;
                                int iA0 = a0(t10, bArr, i24, i11, z14 ? 1 : 0, i13, i27, i28, iQ0, j10, i16, bVar);
                                z11 = z14 ? 1 : 0;
                                i15 = i16;
                                if (iA0 != i24) {
                                    c2541o0 = this;
                                    i19 = i11;
                                    bVar2 = bVar;
                                    i22 = i15;
                                    i21 = i13;
                                    iG = iA0;
                                } else {
                                    i12 = iA0;
                                    i14 = i15;
                                    z10 = z11;
                                }
                            } else if (i27 == 2) {
                                int iZ = Z(t10, bArr, i24, i11, i16, j10, bVar);
                                if (iZ != i24) {
                                    c2541o0 = this;
                                    bArr2 = bArr;
                                    i19 = i11;
                                    bVar2 = bVar;
                                    i22 = i16;
                                    iG = iZ;
                                    i21 = i17;
                                } else {
                                    i14 = i16;
                                    i12 = iZ;
                                    z12 = z14;
                                    i13 = i17;
                                    z10 = z12;
                                }
                            } else {
                                i18 = i24;
                                z13 = z14;
                            }
                        }
                        unsafe3 = unsafe;
                        i20 = -1;
                        bArr2 = bArr;
                    } else if (i27 == 2) {
                        V.k kVarD2 = (V.k) unsafe2.getObject(t10, j10);
                        if (!kVarD2.k3()) {
                            int size = kVarD2.size();
                            kVarD2 = kVarD2.d2(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(t10, j10, kVarD2);
                        }
                        unsafe = unsafe2;
                        iG = C2528i.q(c2541o0.s(iF0), i25 == true ? 1 : 0, bArr2, i24, i19, kVarD2, bVar2);
                        bArr2 = bArr;
                        i19 = i11;
                        bVar2 = bVar;
                        i21 = i26;
                        i22 = iF0;
                    } else {
                        unsafe = unsafe2;
                        i18 = i24;
                        i17 = i26;
                        i16 = iF0;
                        z13 = i25 == true ? 1 : 0;
                    }
                    unsafe3 = unsafe;
                    i20 = -1;
                }
                i12 = i18;
                i14 = i16;
                z12 = z13;
                i13 = i17;
                z10 = z12;
            }
            iG = C2528i.G(z10 ? 1 : 0, bArr, i12, i11, t(t10), bVar);
            c2541o0 = this;
            bVar2 = bVar;
            i19 = i11;
            i21 = i13;
            i22 = i14;
            unsafe3 = unsafe;
            i20 = -1;
            bArr2 = bArr;
        }
        if (iG == i19) {
            return iG;
        }
        throw InvalidProtocolBufferException.m();
    }

    @Override // androidx.datastore.preferences.protobuf.G0
    public void d(T t10, F0 f02, H h10) throws Throwable {
        h10.getClass();
        K(this.f112927o, this.f112928p, t10, f02, h10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public final int d0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C2528i.b bVar) throws IOException {
        int iJ;
        Unsafe unsafe = f112912z;
        V.k kVarD2 = (V.k) unsafe.getObject(t10, j11);
        if (!kVarD2.k3()) {
            int size = kVarD2.size();
            kVarD2 = kVarD2.d2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, kVarD2);
        }
        V.k kVar = kVarD2;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return C2528i.s(bArr, i10, kVar, bVar);
                }
                if (i14 == 1) {
                    return C2528i.e(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return C2528i.v(bArr, i10, kVar, bVar);
                }
                if (i14 == 5) {
                    return C2528i.m(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return C2528i.z(bArr, i10, kVar, bVar);
                }
                if (i14 == 0) {
                    return C2528i.M(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return C2528i.y(bArr, i10, kVar, bVar);
                }
                if (i14 == 0) {
                    return C2528i.J(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return C2528i.u(bArr, i10, kVar, bVar);
                }
                if (i14 == 1) {
                    return C2528i.k(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return C2528i.t(bArr, i10, kVar, bVar);
                }
                if (i14 == 5) {
                    return C2528i.i(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return C2528i.r(bArr, i10, kVar, bVar);
                }
                if (i14 == 0) {
                    return C2528i.a(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? C2528i.D(i12, bArr, i10, i11, kVar, bVar) : C2528i.E(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return C2528i.q(s(i15), i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return C2528i.c(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iJ = C2528i.J(i12, bArr, i10, i11, kVar, bVar);
                    }
                    return i10;
                }
                iJ = C2528i.y(bArr, i10, kVar, bVar);
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
                X0 x02 = generatedMessageLite.unknownFields;
                if (x02 == X0.f112772g) {
                    x02 = null;
                }
                X0 x03 = (X0) I0.C(i13, kVar, q(i15), x02, this.f112927o);
                if (x03 != null) {
                    generatedMessageLite.unknownFields = x03;
                }
                return iJ;
            case 33:
            case 47:
                if (i14 == 2) {
                    return C2528i.w(bArr, i10, kVar, bVar);
                }
                if (i14 == 0) {
                    return C2528i.A(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return C2528i.x(bArr, i10, kVar, bVar);
                }
                if (i14 == 0) {
                    return C2528i.B(i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return C2528i.o(s(i15), i12, bArr, i10, i11, kVar, bVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.G0
    public void e(T t10) {
        int i10;
        int i11 = this.f112923k;
        while (true) {
            i10 = this.f112924l;
            if (i11 >= i10) {
                break;
            }
            long jR0 = r0(this.f112922j[i11]) & f112906t;
            Object objN = a1.f112800f.n(t10, jR0);
            if (objN != null) {
                a1.q0(t10, jR0, this.f112929q.c(objN));
            }
            i11++;
        }
        int length = this.f112922j.length;
        while (i10 < length) {
            this.f112926n.c(t10, this.f112922j[i10]);
            i10++;
        }
        this.f112927o.j(t10);
        if (this.f112918f) {
            this.f112928p.f(t10);
        }
    }

    public final int e0(int i10) {
        if (i10 < this.f112915c || i10 > this.f112916d) {
            return -1;
        }
        return o0(i10, 0);
    }

    @Override // androidx.datastore.preferences.protobuf.G0
    public boolean equals(T t10, T t11) {
        int length = this.f112913a.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (!m(t10, t11, i10)) {
                    break;
                }
                i10 += 3;
            } else if (this.f112927o.g(t10).equals(this.f112927o.g(t11))) {
                if (this.f112918f) {
                    return this.f112928p.c(t10).equals(this.f112928p.c(t11));
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.G0
    public int f(T t10) {
        return this.f112920h ? w(t10) : v(t10);
    }

    public final int f0(int i10, int i11) {
        if (i10 < this.f112915c || i10 > this.f112916d) {
            return -1;
        }
        return o0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.G0
    public void g(T t10, byte[] bArr, int i10, int i11, C2528i.b bVar) throws IOException {
        if (this.f112920h) {
            c0(t10, bArr, i10, i11, bVar);
        } else {
            b0(t10, bArr, i10, i11, 0, bVar);
        }
    }

    public final int g0(int i10) {
        return this.f112913a[i10 + 2];
    }

    public final boolean h(T t10, T t11, int i10) {
        return A(t10, i10) == A(t11, i10);
    }

    public final <E> void h0(Object obj, long j10, F0 f02, G0<E> g02, H h10) throws IOException {
        f02.P(this.f112926n.e(obj, j10), g02, h10);
    }

    @Override // androidx.datastore.preferences.protobuf.G0
    public int hashCode(T t10) {
        int i10;
        int iS;
        int length = this.f112913a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iR0 = r0(i12);
            int i13 = this.f112913a[i12];
            long j10 = 1048575 & iR0;
            int iHashCode = 37;
            switch (q0(iR0)) {
                case 0:
                    i10 = i11 * 53;
                    iS = V.s(Double.doubleToLongBits(a1.f112800f.h(t10, j10)));
                    i11 = iS + i10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iS = Float.floatToIntBits(a1.f112800f.i(t10, j10));
                    i11 = iS + i10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iS = V.s(a1.f112800f.m(t10, j10));
                    i11 = iS + i10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iS = V.s(a1.f112800f.m(t10, j10));
                    i11 = iS + i10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iS = a1.f112800f.k(t10, j10);
                    i11 = iS + i10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iS = V.s(a1.f112800f.m(t10, j10));
                    i11 = iS + i10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iS = a1.f112800f.k(t10, j10);
                    i11 = iS + i10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iS = V.k(a1.f112800f.e(t10, j10));
                    i11 = iS + i10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iS = ((String) a1.f112800f.n(t10, j10)).hashCode();
                    i11 = iS + i10;
                    break;
                case 9:
                    Object objN = a1.f112800f.n(t10, j10);
                    if (objN != null) {
                        iHashCode = objN.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iS = a1.f112800f.n(t10, j10).hashCode();
                    i11 = iS + i10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iS = a1.f112800f.k(t10, j10);
                    i11 = iS + i10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iS = a1.f112800f.k(t10, j10);
                    i11 = iS + i10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iS = a1.f112800f.k(t10, j10);
                    i11 = iS + i10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iS = V.s(a1.f112800f.m(t10, j10));
                    i11 = iS + i10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iS = a1.f112800f.k(t10, j10);
                    i11 = iS + i10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iS = V.s(a1.f112800f.m(t10, j10));
                    i11 = iS + i10;
                    break;
                case 17:
                    Object objN2 = a1.f112800f.n(t10, j10);
                    if (objN2 != null) {
                        iHashCode = objN2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iS = a1.f112800f.n(t10, j10).hashCode();
                    i11 = iS + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iS = a1.f112800f.n(t10, j10).hashCode();
                    i11 = iS + i10;
                    break;
                case 51:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = V.s(Double.doubleToLongBits(V(t10, j10)));
                        i11 = iS + i10;
                    }
                    break;
                case 52:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = Float.floatToIntBits(W(t10, j10));
                        i11 = iS + i10;
                    }
                    break;
                case 53:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = V.s(Y(t10, j10));
                        i11 = iS + i10;
                    }
                    break;
                case 54:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = V.s(Y(t10, j10));
                        i11 = iS + i10;
                    }
                    break;
                case 55:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = X(t10, j10);
                        i11 = iS + i10;
                    }
                    break;
                case 56:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = V.s(Y(t10, j10));
                        i11 = iS + i10;
                    }
                    break;
                case 57:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = X(t10, j10);
                        i11 = iS + i10;
                    }
                    break;
                case 58:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = V.k(U(t10, j10));
                        i11 = iS + i10;
                    }
                    break;
                case 59:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = ((String) a1.f112800f.n(t10, j10)).hashCode();
                        i11 = iS + i10;
                    }
                    break;
                case 60:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = a1.f112800f.n(t10, j10).hashCode();
                        i11 = iS + i10;
                    }
                    break;
                case 61:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = a1.f112800f.n(t10, j10).hashCode();
                        i11 = iS + i10;
                    }
                    break;
                case 62:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = X(t10, j10);
                        i11 = iS + i10;
                    }
                    break;
                case 63:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = X(t10, j10);
                        i11 = iS + i10;
                    }
                    break;
                case 64:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = X(t10, j10);
                        i11 = iS + i10;
                    }
                    break;
                case 65:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = V.s(Y(t10, j10));
                        i11 = iS + i10;
                    }
                    break;
                case 66:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = X(t10, j10);
                        i11 = iS + i10;
                    }
                    break;
                case 67:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = V.s(Y(t10, j10));
                        i11 = iS + i10;
                    }
                    break;
                case 68:
                    if (G(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iS = a1.f112800f.n(t10, j10).hashCode();
                        i11 = iS + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f112927o.g(t10).hashCode() + (i11 * 53);
        if (!this.f112918f) {
            return iHashCode2;
        }
        return this.f112928p.c(t10).f112590a.hashCode() + (iHashCode2 * 53);
    }

    public final <E> void i0(Object obj, int i10, F0 f02, G0<E> g02, H h10) throws IOException {
        f02.G(this.f112926n.e(obj, i10 & f112906t), g02, h10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int j(byte[] bArr, int i10, int i11, C2523f0.b<K, V> bVar, Map<K, V> map, C2528i.b bVar2) throws IOException {
        int I10 = C2528i.I(bArr, i10, bVar2);
        int i12 = bVar2.f112852a;
        if (i12 < 0 || i12 > i11 - I10) {
            throw InvalidProtocolBufferException.q();
        }
        int i13 = I10 + i12;
        Object obj = bVar.f112848b;
        Object obj2 = bVar.f112850d;
        while (I10 < i13) {
            int iH = I10 + 1;
            int i14 = bArr[I10];
            if (i14 < 0) {
                iH = C2528i.H(i14, bArr, iH, bVar2);
                i14 = bVar2.f112852a;
            }
            int i15 = iH;
            int i16 = i14 >>> 3;
            int i17 = i14 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == bVar.f112849c.getWireType()) {
                    I10 = k(bArr, i15, i11, bVar.f112849c, bVar.f112850d.getClass(), bVar2);
                    obj2 = bVar2.f112854c;
                } else {
                    I10 = C2528i.N(i14, bArr, i15, i11, bVar2);
                }
            } else if (i17 == bVar.f112847a.getWireType()) {
                I10 = k(bArr, i15, i11, bVar.f112847a, null, bVar2);
                obj = bVar2.f112854c;
            } else {
                I10 = C2528i.N(i14, bArr, i15, i11, bVar2);
            }
        }
        if (I10 != i13) {
            throw InvalidProtocolBufferException.m();
        }
        map.put(obj, obj2);
        return i13;
    }

    public final void j0(Object obj, int i10, F0 f02) throws IOException {
        if (z(i10)) {
            a1.q0(obj, i10 & f112906t, f02.R());
        } else if (this.f112919g) {
            a1.q0(obj, i10 & f112906t, f02.O());
        } else {
            a1.q0(obj, i10 & f112906t, f02.g());
        }
    }

    public final int k(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, C2528i.b bVar) throws IOException {
        switch (a.f112930a[fieldType.ordinal()]) {
            case 1:
                int iL = C2528i.L(bArr, i10, bVar);
                bVar.f112854c = Boolean.valueOf(bVar.f112853b != 0);
                return iL;
            case 2:
                return C2528i.b(bArr, i10, bVar);
            case 3:
                bVar.f112854c = Double.valueOf(C2528i.d(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                bVar.f112854c = Integer.valueOf(C2528i.h(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                bVar.f112854c = Long.valueOf(C2528i.j(bArr, i10));
                return i10 + 8;
            case 8:
                bVar.f112854c = Float.valueOf(C2528i.l(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int I10 = C2528i.I(bArr, i10, bVar);
                bVar.f112854c = Integer.valueOf(bVar.f112852a);
                return I10;
            case 12:
            case 13:
                int iL2 = C2528i.L(bArr, i10, bVar);
                bVar.f112854c = Long.valueOf(bVar.f112853b);
                return iL2;
            case 14:
                return C2528i.p(A0.a().i(cls), bArr, i10, i11, bVar);
            case 15:
                int I11 = C2528i.I(bArr, i10, bVar);
                bVar.f112854c = Integer.valueOf(AbstractC2549t.b(bVar.f112852a));
                return I11;
            case 16:
                int iL3 = C2528i.L(bArr, i10, bVar);
                bVar.f112854c = Long.valueOf(AbstractC2549t.c(bVar.f112853b));
                return iL3;
            case 17:
                return C2528i.F(bArr, i10, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final void k0(Object obj, int i10, F0 f02) throws IOException {
        if (z(i10)) {
            f02.E(this.f112926n.e(obj, i10 & f112906t));
        } else {
            f02.q(this.f112926n.e(obj, i10 & f112906t));
        }
    }

    public final boolean m(T t10, T t11, int i10) {
        int iR0 = r0(i10);
        long j10 = 1048575 & iR0;
        switch (q0(iR0)) {
            case 0:
                if (h(t10, t11, i10)) {
                    a1.e eVar = a1.f112800f;
                    if (Double.doubleToLongBits(eVar.h(t10, j10)) == Double.doubleToLongBits(eVar.h(t11, j10))) {
                    }
                }
                break;
            case 1:
                if (h(t10, t11, i10)) {
                    a1.e eVar2 = a1.f112800f;
                    if (Float.floatToIntBits(eVar2.i(t10, j10)) == Float.floatToIntBits(eVar2.i(t11, j10))) {
                    }
                }
                break;
            case 2:
                if (h(t10, t11, i10)) {
                    a1.e eVar3 = a1.f112800f;
                    if (eVar3.m(t10, j10) == eVar3.m(t11, j10)) {
                    }
                }
                break;
            case 3:
                if (h(t10, t11, i10)) {
                    a1.e eVar4 = a1.f112800f;
                    if (eVar4.m(t10, j10) == eVar4.m(t11, j10)) {
                    }
                }
                break;
            case 4:
                if (h(t10, t11, i10)) {
                    a1.e eVar5 = a1.f112800f;
                    if (eVar5.k(t10, j10) == eVar5.k(t11, j10)) {
                    }
                }
                break;
            case 5:
                if (h(t10, t11, i10)) {
                    a1.e eVar6 = a1.f112800f;
                    if (eVar6.m(t10, j10) == eVar6.m(t11, j10)) {
                    }
                }
                break;
            case 6:
                if (h(t10, t11, i10)) {
                    a1.e eVar7 = a1.f112800f;
                    if (eVar7.k(t10, j10) == eVar7.k(t11, j10)) {
                    }
                }
                break;
            case 7:
                if (h(t10, t11, i10)) {
                    a1.e eVar8 = a1.f112800f;
                    if (eVar8.e(t10, j10) == eVar8.e(t11, j10)) {
                    }
                }
                break;
            case 8:
                if (h(t10, t11, i10)) {
                    a1.e eVar9 = a1.f112800f;
                    if (I0.N(eVar9.n(t10, j10), eVar9.n(t11, j10))) {
                    }
                }
                break;
            case 9:
                if (h(t10, t11, i10)) {
                    a1.e eVar10 = a1.f112800f;
                    if (I0.N(eVar10.n(t10, j10), eVar10.n(t11, j10))) {
                    }
                }
                break;
            case 10:
                if (h(t10, t11, i10)) {
                    a1.e eVar11 = a1.f112800f;
                    if (I0.N(eVar11.n(t10, j10), eVar11.n(t11, j10))) {
                    }
                }
                break;
            case 11:
                if (h(t10, t11, i10)) {
                    a1.e eVar12 = a1.f112800f;
                    if (eVar12.k(t10, j10) == eVar12.k(t11, j10)) {
                    }
                }
                break;
            case 12:
                if (h(t10, t11, i10)) {
                    a1.e eVar13 = a1.f112800f;
                    if (eVar13.k(t10, j10) == eVar13.k(t11, j10)) {
                    }
                }
                break;
            case 13:
                if (h(t10, t11, i10)) {
                    a1.e eVar14 = a1.f112800f;
                    if (eVar14.k(t10, j10) == eVar14.k(t11, j10)) {
                    }
                }
                break;
            case 14:
                if (h(t10, t11, i10)) {
                    a1.e eVar15 = a1.f112800f;
                    if (eVar15.m(t10, j10) == eVar15.m(t11, j10)) {
                    }
                }
                break;
            case 15:
                if (h(t10, t11, i10)) {
                    a1.e eVar16 = a1.f112800f;
                    if (eVar16.k(t10, j10) == eVar16.k(t11, j10)) {
                    }
                }
                break;
            case 16:
                if (h(t10, t11, i10)) {
                    a1.e eVar17 = a1.f112800f;
                    if (eVar17.m(t10, j10) == eVar17.m(t11, j10)) {
                    }
                }
                break;
            case 17:
                if (h(t10, t11, i10)) {
                    a1.e eVar18 = a1.f112800f;
                    if (I0.N(eVar18.n(t10, j10), eVar18.n(t11, j10))) {
                    }
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                a1.e eVar19 = a1.f112800f;
                break;
            case 50:
                a1.e eVar20 = a1.f112800f;
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (F(t10, t11, i10)) {
                    a1.e eVar21 = a1.f112800f;
                    if (I0.N(eVar21.n(t10, j10), eVar21.n(t11, j10))) {
                    }
                }
                break;
        }
        return true;
    }

    public final void m0(T t10, int i10) {
        if (this.f112920h) {
            return;
        }
        int iG0 = g0(i10);
        long j10 = iG0 & f112906t;
        a1.l0(t10, j10, a1.I(t10, j10) | (1 << (iG0 >>> 20)));
    }

    public final <UT, UB> UB n(Object obj, int i10, UB ub2, W0<UT, UB> w02) {
        V.e eVarQ;
        int i11 = this.f112913a[i10];
        Object objN = a1.f112800f.n(obj, r0(i10) & f112906t);
        return (objN == null || (eVarQ = q(i10)) == null) ? ub2 : (UB) o(i10, i11, this.f112929q.e(objN), eVarQ, ub2, w02);
    }

    public final void n0(T t10, int i10, int i11) {
        a1.l0(t10, g0(i11) & f112906t, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.G0
    public T newInstance() {
        return (T) this.f112925m.newInstance(this.f112917e);
    }

    public final <K, V, UT, UB> UB o(int i10, int i11, Map<K, V> map, V.e eVar, UB ub2, W0<UT, UB> w02) {
        C2523f0.b<?, ?> bVarB = this.f112929q.b(r(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = w02.n();
                }
                ByteString.g gVar = new ByteString.g(C2523f0.b(bVarB, next.getKey(), next.getValue()));
                try {
                    C2523f0.l(gVar.f112521a, bVarB, next.getKey(), next.getValue());
                    w02.d(ub2, i11, gVar.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    public final int o0(int i10, int i11) {
        int length = (this.f112913a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f112913a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final V.e q(int i10) {
        return (V.e) this.f112914b[((i10 / 3) * 2) + 1];
    }

    public final Object r(int i10) {
        return this.f112914b[(i10 / 3) * 2];
    }

    public final int r0(int i10) {
        return this.f112913a[i10 + 1];
    }

    public final G0 s(int i10) {
        int i11 = (i10 / 3) * 2;
        G0 g02 = (G0) this.f112914b[i11];
        if (g02 != null) {
            return g02;
        }
        G0<T> g0I = A0.a().i((Class) this.f112914b[i11 + 1]);
        this.f112914b[i11] = g0I;
        return g0I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0(T r21, androidx.datastore.preferences.protobuf.Writer r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2541o0.s0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t0(T r13, androidx.datastore.preferences.protobuf.Writer r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2541o0.t0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    public int u() {
        return this.f112913a.length * 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(T r11, androidx.datastore.preferences.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2541o0.u0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int v(T t10) {
        int i10;
        int i11;
        int i12;
        int iI0;
        int iA0;
        int iG0;
        boolean z10;
        int iF;
        Unsafe unsafe = f112912z;
        int i13 = -1;
        int i14 = 0;
        int iA = 0;
        int i15 = 0;
        while (i14 < this.f112913a.length) {
            int iR0 = r0(i14);
            int i16 = this.f112913a[i14];
            int iQ0 = q0(iR0);
            if (iQ0 <= 17) {
                i11 = this.f112913a[i14 + 2];
                int i17 = i11 & f112906t;
                i12 = 1 << (i11 >>> 20);
                i10 = 1048575;
                if (i17 != i13) {
                    i15 = unsafe.getInt(t10, i17);
                    i13 = i17;
                }
            } else {
                i10 = 1048575;
                i11 = (!this.f112921i || iQ0 < FieldType.DOUBLE_LIST_PACKED.id() || iQ0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f112913a[i14 + 2] & f112906t;
                i12 = 0;
            }
            long j10 = iR0 & i10;
            int i18 = i13;
            switch (iQ0) {
                case 0:
                    if ((i15 & i12) != 0) {
                        iI0 = CodedOutputStream.i0(i16, 0.0d);
                        iA += iI0;
                    }
                    break;
                case 1:
                    if ((i15 & i12) != 0) {
                        iI0 = CodedOutputStream.q0(i16, 0.0f);
                        iA += iI0;
                    }
                    break;
                case 2:
                    if ((i15 & i12) != 0) {
                        iI0 = CodedOutputStream.y0(i16, unsafe.getLong(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 3:
                    if ((i15 & i12) != 0) {
                        iI0 = CodedOutputStream.a1(i16, unsafe.getLong(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 4:
                    if ((i15 & i12) != 0) {
                        iI0 = CodedOutputStream.w0(i16, unsafe.getInt(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 5:
                    if ((i15 & i12) != 0) {
                        iI0 = CodedOutputStream.o0(i16, 0L);
                        iA += iI0;
                    }
                    break;
                case 6:
                    if ((i15 & i12) != 0) {
                        iI0 = CodedOutputStream.m0(i16, 0);
                        iA += iI0;
                    }
                    break;
                case 7:
                    if ((i15 & i12) != 0) {
                        iA0 = CodedOutputStream.a0(i16, true);
                        iA += iA0;
                    }
                    break;
                case 8:
                    if ((i15 & i12) != 0) {
                        Object object = unsafe.getObject(t10, j10);
                        iG0 = object instanceof ByteString ? CodedOutputStream.g0(i16, (ByteString) object) : CodedOutputStream.V0(i16, (String) object);
                        iA = iG0 + iA;
                    }
                    break;
                case 9:
                    if ((i15 & i12) != 0) {
                        iA0 = I0.p(i16, unsafe.getObject(t10, j10), s(i14));
                        iA += iA0;
                    }
                    break;
                case 10:
                    if ((i15 & i12) != 0) {
                        iA0 = CodedOutputStream.g0(i16, (ByteString) unsafe.getObject(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 11:
                    if ((i15 & i12) != 0) {
                        iA0 = CodedOutputStream.Y0(i16, unsafe.getInt(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 12:
                    if ((i15 & i12) != 0) {
                        iA0 = CodedOutputStream.k0(i16, unsafe.getInt(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 13:
                    if ((i15 & i12) != 0) {
                        iA0 = CodedOutputStream.N0(i16, 0);
                        iA += iA0;
                    }
                    break;
                case 14:
                    if ((i15 & i12) != 0) {
                        iA0 = CodedOutputStream.P0(i16, 0L);
                        iA += iA0;
                    }
                    break;
                case 15:
                    if ((i15 & i12) != 0) {
                        iA0 = CodedOutputStream.R0(i16, unsafe.getInt(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 16:
                    if ((i15 & i12) != 0) {
                        iA0 = CodedOutputStream.T0(i16, unsafe.getLong(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 17:
                    if ((i15 & i12) != 0) {
                        iA0 = CodedOutputStream.t0(i16, (MessageLite) unsafe.getObject(t10, j10), s(i14));
                        iA += iA0;
                    }
                    break;
                case 18:
                    iA0 = I0.h(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iA0;
                    break;
                case 19:
                    z10 = false;
                    iF = I0.f(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 20:
                    z10 = false;
                    iF = I0.n(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 21:
                    z10 = false;
                    iF = I0.z(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 22:
                    z10 = false;
                    iF = I0.l(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 23:
                    z10 = false;
                    iF = I0.h(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 24:
                    z10 = false;
                    iF = I0.f(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 25:
                    z10 = false;
                    iF = I0.a(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 26:
                    iA0 = I0.w(i16, (List) unsafe.getObject(t10, j10));
                    iA += iA0;
                    break;
                case 27:
                    iA0 = I0.r(i16, (List) unsafe.getObject(t10, j10), s(i14));
                    iA += iA0;
                    break;
                case 28:
                    iA0 = I0.c(i16, (List) unsafe.getObject(t10, j10));
                    iA += iA0;
                    break;
                case 29:
                    iA0 = I0.x(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iA0;
                    break;
                case 30:
                    z10 = false;
                    iF = I0.d(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 31:
                    z10 = false;
                    iF = I0.f(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 32:
                    z10 = false;
                    iF = I0.h(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 33:
                    z10 = false;
                    iF = I0.s(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 34:
                    z10 = false;
                    iF = I0.u(i16, (List) unsafe.getObject(t10, j10), false);
                    iA += iF;
                    break;
                case 35:
                    int i19 = I0.i((List) unsafe.getObject(t10, j10));
                    if (i19 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, i19);
                        }
                        iA = C2539n0.a(i19, CodedOutputStream.X0(i16), i19, iA);
                    }
                    break;
                case 36:
                    int iG = I0.g((List) unsafe.getObject(t10, j10));
                    if (iG > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iG);
                        }
                        iA = C2539n0.a(iG, CodedOutputStream.X0(i16), iG, iA);
                    }
                    break;
                case 37:
                    int iO = I0.o((List) unsafe.getObject(t10, j10));
                    if (iO > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iO);
                        }
                        iA = C2539n0.a(iO, CodedOutputStream.X0(i16), iO, iA);
                    }
                    break;
                case 38:
                    int iA2 = I0.A((List) unsafe.getObject(t10, j10));
                    if (iA2 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iA2);
                        }
                        iA = C2539n0.a(iA2, CodedOutputStream.X0(i16), iA2, iA);
                    }
                    break;
                case 39:
                    int iM = I0.m((List) unsafe.getObject(t10, j10));
                    if (iM > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iM);
                        }
                        iA = C2539n0.a(iM, CodedOutputStream.X0(i16), iM, iA);
                    }
                    break;
                case 40:
                    int i20 = I0.i((List) unsafe.getObject(t10, j10));
                    if (i20 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, i20);
                        }
                        iA = C2539n0.a(i20, CodedOutputStream.X0(i16), i20, iA);
                    }
                    break;
                case 41:
                    int iG2 = I0.g((List) unsafe.getObject(t10, j10));
                    if (iG2 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iG2);
                        }
                        iA = C2539n0.a(iG2, CodedOutputStream.X0(i16), iG2, iA);
                    }
                    break;
                case 42:
                    int iB = I0.b((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iB);
                        }
                        iA = C2539n0.a(iB, CodedOutputStream.X0(i16), iB, iA);
                    }
                    break;
                case 43:
                    int iY = I0.y((List) unsafe.getObject(t10, j10));
                    if (iY > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iY);
                        }
                        iA = C2539n0.a(iY, CodedOutputStream.X0(i16), iY, iA);
                    }
                    break;
                case 44:
                    int iE = I0.e((List) unsafe.getObject(t10, j10));
                    if (iE > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iE);
                        }
                        iA = C2539n0.a(iE, CodedOutputStream.X0(i16), iE, iA);
                    }
                    break;
                case 45:
                    int iG3 = I0.g((List) unsafe.getObject(t10, j10));
                    if (iG3 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iG3);
                        }
                        iA = C2539n0.a(iG3, CodedOutputStream.X0(i16), iG3, iA);
                    }
                    break;
                case 46:
                    int i21 = I0.i((List) unsafe.getObject(t10, j10));
                    if (i21 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, i21);
                        }
                        iA = C2539n0.a(i21, CodedOutputStream.X0(i16), i21, iA);
                    }
                    break;
                case 47:
                    int iT = I0.t((List) unsafe.getObject(t10, j10));
                    if (iT > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iT);
                        }
                        iA = C2539n0.a(iT, CodedOutputStream.X0(i16), iT, iA);
                    }
                    break;
                case 48:
                    int iV = I0.v((List) unsafe.getObject(t10, j10));
                    if (iV > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i11, iV);
                        }
                        iA = C2539n0.a(iV, CodedOutputStream.X0(i16), iV, iA);
                    }
                    break;
                case 49:
                    iA0 = I0.k(i16, (List) unsafe.getObject(t10, j10), s(i14));
                    iA += iA0;
                    break;
                case 50:
                    iA0 = this.f112929q.d(i16, unsafe.getObject(t10, j10), r(i14));
                    iA += iA0;
                    break;
                case 51:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.i0(i16, 0.0d);
                        iA += iA0;
                    }
                    break;
                case 52:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.q0(i16, 0.0f);
                        iA += iA0;
                    }
                    break;
                case 53:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.y0(i16, Y(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 54:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.a1(i16, Y(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 55:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.w0(i16, X(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 56:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.o0(i16, 0L);
                        iA += iA0;
                    }
                    break;
                case 57:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.m0(i16, 0);
                        iA += iA0;
                    }
                    break;
                case 58:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.a0(i16, true);
                        iA += iA0;
                    }
                    break;
                case 59:
                    if (G(t10, i16, i14)) {
                        Object object2 = unsafe.getObject(t10, j10);
                        iG0 = object2 instanceof ByteString ? CodedOutputStream.g0(i16, (ByteString) object2) : CodedOutputStream.V0(i16, (String) object2);
                        iA = iG0 + iA;
                    }
                    break;
                case 60:
                    if (G(t10, i16, i14)) {
                        iA0 = I0.p(i16, unsafe.getObject(t10, j10), s(i14));
                        iA += iA0;
                    }
                    break;
                case 61:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.g0(i16, (ByteString) unsafe.getObject(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 62:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.Y0(i16, X(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 63:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.k0(i16, X(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 64:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.N0(i16, 0);
                        iA += iA0;
                    }
                    break;
                case 65:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.P0(i16, 0L);
                        iA += iA0;
                    }
                    break;
                case 66:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.R0(i16, X(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 67:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.T0(i16, Y(t10, j10));
                        iA += iA0;
                    }
                    break;
                case 68:
                    if (G(t10, i16, i14)) {
                        iA0 = CodedOutputStream.t0(i16, (MessageLite) unsafe.getObject(t10, j10), s(i14));
                        iA += iA0;
                    }
                    break;
            }
            i14 += 3;
            i13 = i18;
        }
        int iX = x(this.f112927o, t10) + iA;
        return this.f112918f ? this.f112928p.c(t10).z() + iX : iX;
    }

    public final <K, V> void v0(Writer writer, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            writer.n(i10, this.f112929q.b(r(i11)), this.f112929q.g(obj));
        }
    }

    public final int w(T t10) {
        int iI0;
        int iG0;
        Unsafe unsafe = f112912z;
        int iA = 0;
        for (int i10 = 0; i10 < this.f112913a.length; i10 += 3) {
            int iR0 = r0(i10);
            int iQ0 = q0(iR0);
            int i11 = this.f112913a[i10];
            long j10 = iR0 & f112906t;
            int i12 = (iQ0 < FieldType.DOUBLE_LIST_PACKED.id() || iQ0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f112913a[i10 + 2] & f112906t;
            switch (iQ0) {
                case 0:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.i0(i11, 0.0d);
                        iA += iI0;
                    }
                    break;
                case 1:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.q0(i11, 0.0f);
                        iA += iI0;
                    }
                    break;
                case 2:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.y0(i11, a1.f112800f.m(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 3:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.a1(i11, a1.f112800f.m(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 4:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.w0(i11, a1.f112800f.k(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 5:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.o0(i11, 0L);
                        iA += iI0;
                    }
                    break;
                case 6:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.m0(i11, 0);
                        iA += iI0;
                    }
                    break;
                case 7:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.a0(i11, true);
                        iA += iI0;
                    }
                    break;
                case 8:
                    if (A(t10, i10)) {
                        Object objN = a1.f112800f.n(t10, j10);
                        iG0 = objN instanceof ByteString ? CodedOutputStream.g0(i11, (ByteString) objN) : CodedOutputStream.V0(i11, (String) objN);
                        iA = iG0 + iA;
                    }
                    break;
                case 9:
                    if (A(t10, i10)) {
                        iI0 = I0.p(i11, a1.f112800f.n(t10, j10), s(i10));
                        iA += iI0;
                    }
                    break;
                case 10:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.g0(i11, (ByteString) a1.f112800f.n(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 11:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.Y0(i11, a1.f112800f.k(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 12:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.k0(i11, a1.f112800f.k(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 13:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.N0(i11, 0);
                        iA += iI0;
                    }
                    break;
                case 14:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.P0(i11, 0L);
                        iA += iI0;
                    }
                    break;
                case 15:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.R0(i11, a1.f112800f.k(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 16:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.T0(i11, a1.f112800f.m(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 17:
                    if (A(t10, i10)) {
                        iI0 = CodedOutputStream.t0(i11, (MessageLite) a1.f112800f.n(t10, j10), s(i10));
                        iA += iI0;
                    }
                    break;
                case 18:
                    iI0 = I0.h(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 19:
                    iI0 = I0.f(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 20:
                    iI0 = I0.n(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 21:
                    iI0 = I0.z(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 22:
                    iI0 = I0.l(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 23:
                    iI0 = I0.h(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 24:
                    iI0 = I0.f(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 25:
                    iI0 = I0.a(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 26:
                    iI0 = I0.w(i11, (List) a1.O(t10, j10));
                    iA += iI0;
                    break;
                case 27:
                    iI0 = I0.r(i11, (List) a1.O(t10, j10), s(i10));
                    iA += iI0;
                    break;
                case 28:
                    iI0 = I0.c(i11, (List) a1.O(t10, j10));
                    iA += iI0;
                    break;
                case 29:
                    iI0 = I0.x(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 30:
                    iI0 = I0.d(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 31:
                    iI0 = I0.f(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 32:
                    iI0 = I0.h(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 33:
                    iI0 = I0.s(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 34:
                    iI0 = I0.u(i11, (List) a1.O(t10, j10), false);
                    iA += iI0;
                    break;
                case 35:
                    int i13 = I0.i((List) unsafe.getObject(t10, j10));
                    if (i13 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, i13);
                        }
                        iA = C2539n0.a(i13, CodedOutputStream.X0(i11), i13, iA);
                    }
                    break;
                case 36:
                    int iG = I0.g((List) unsafe.getObject(t10, j10));
                    if (iG > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iG);
                        }
                        iA = C2539n0.a(iG, CodedOutputStream.X0(i11), iG, iA);
                    }
                    break;
                case 37:
                    int iO = I0.o((List) unsafe.getObject(t10, j10));
                    if (iO > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iO);
                        }
                        iA = C2539n0.a(iO, CodedOutputStream.X0(i11), iO, iA);
                    }
                    break;
                case 38:
                    int iA2 = I0.A((List) unsafe.getObject(t10, j10));
                    if (iA2 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iA2);
                        }
                        iA = C2539n0.a(iA2, CodedOutputStream.X0(i11), iA2, iA);
                    }
                    break;
                case 39:
                    int iM = I0.m((List) unsafe.getObject(t10, j10));
                    if (iM > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iM);
                        }
                        iA = C2539n0.a(iM, CodedOutputStream.X0(i11), iM, iA);
                    }
                    break;
                case 40:
                    int i14 = I0.i((List) unsafe.getObject(t10, j10));
                    if (i14 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, i14);
                        }
                        iA = C2539n0.a(i14, CodedOutputStream.X0(i11), i14, iA);
                    }
                    break;
                case 41:
                    int iG2 = I0.g((List) unsafe.getObject(t10, j10));
                    if (iG2 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iG2);
                        }
                        iA = C2539n0.a(iG2, CodedOutputStream.X0(i11), iG2, iA);
                    }
                    break;
                case 42:
                    int iB = I0.b((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iB);
                        }
                        iA = C2539n0.a(iB, CodedOutputStream.X0(i11), iB, iA);
                    }
                    break;
                case 43:
                    int iY = I0.y((List) unsafe.getObject(t10, j10));
                    if (iY > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iY);
                        }
                        iA = C2539n0.a(iY, CodedOutputStream.X0(i11), iY, iA);
                    }
                    break;
                case 44:
                    int iE = I0.e((List) unsafe.getObject(t10, j10));
                    if (iE > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iE);
                        }
                        iA = C2539n0.a(iE, CodedOutputStream.X0(i11), iE, iA);
                    }
                    break;
                case 45:
                    int iG3 = I0.g((List) unsafe.getObject(t10, j10));
                    if (iG3 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iG3);
                        }
                        iA = C2539n0.a(iG3, CodedOutputStream.X0(i11), iG3, iA);
                    }
                    break;
                case 46:
                    int i15 = I0.i((List) unsafe.getObject(t10, j10));
                    if (i15 > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, i15);
                        }
                        iA = C2539n0.a(i15, CodedOutputStream.X0(i11), i15, iA);
                    }
                    break;
                case 47:
                    int iT = I0.t((List) unsafe.getObject(t10, j10));
                    if (iT > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iT);
                        }
                        iA = C2539n0.a(iT, CodedOutputStream.X0(i11), iT, iA);
                    }
                    break;
                case 48:
                    int iV = I0.v((List) unsafe.getObject(t10, j10));
                    if (iV > 0) {
                        if (this.f112921i) {
                            unsafe.putInt(t10, i12, iV);
                        }
                        iA = C2539n0.a(iV, CodedOutputStream.X0(i11), iV, iA);
                    }
                    break;
                case 49:
                    iI0 = I0.k(i11, (List) a1.O(t10, j10), s(i10));
                    iA += iI0;
                    break;
                case 50:
                    iI0 = this.f112929q.d(i11, a1.f112800f.n(t10, j10), r(i10));
                    iA += iI0;
                    break;
                case 51:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.i0(i11, 0.0d);
                        iA += iI0;
                    }
                    break;
                case 52:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.q0(i11, 0.0f);
                        iA += iI0;
                    }
                    break;
                case 53:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.y0(i11, Y(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 54:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.a1(i11, Y(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 55:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.w0(i11, X(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 56:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.o0(i11, 0L);
                        iA += iI0;
                    }
                    break;
                case 57:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.m0(i11, 0);
                        iA += iI0;
                    }
                    break;
                case 58:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.a0(i11, true);
                        iA += iI0;
                    }
                    break;
                case 59:
                    if (G(t10, i11, i10)) {
                        Object objN2 = a1.f112800f.n(t10, j10);
                        iG0 = objN2 instanceof ByteString ? CodedOutputStream.g0(i11, (ByteString) objN2) : CodedOutputStream.V0(i11, (String) objN2);
                        iA = iG0 + iA;
                    }
                    break;
                case 60:
                    if (G(t10, i11, i10)) {
                        iI0 = I0.p(i11, a1.f112800f.n(t10, j10), s(i10));
                        iA += iI0;
                    }
                    break;
                case 61:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.g0(i11, (ByteString) a1.f112800f.n(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 62:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.Y0(i11, X(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 63:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.k0(i11, X(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 64:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.N0(i11, 0);
                        iA += iI0;
                    }
                    break;
                case 65:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.P0(i11, 0L);
                        iA += iI0;
                    }
                    break;
                case 66:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.R0(i11, X(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 67:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.T0(i11, Y(t10, j10));
                        iA += iI0;
                    }
                    break;
                case 68:
                    if (G(t10, i11, i10)) {
                        iI0 = CodedOutputStream.t0(i11, (MessageLite) a1.f112800f.n(t10, j10), s(i10));
                        iA += iI0;
                    }
                    break;
            }
        }
        return x(this.f112927o, t10) + iA;
    }

    public final void w0(int i10, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.e(i10, (String) obj);
        } else {
            writer.i(i10, (ByteString) obj);
        }
    }

    public final <UT, UB> int x(W0<UT, UB> w02, T t10) {
        return w02.h(w02.g(t10));
    }

    public final <UT, UB> void x0(W0<UT, UB> w02, T t10, Writer writer) throws IOException {
        w02.t(w02.g(t10), writer);
    }
}
