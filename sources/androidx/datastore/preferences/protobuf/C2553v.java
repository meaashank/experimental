package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2523f0;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2553v implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f113005a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113006a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f113006a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f113006a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f113006a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f113006a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f113006a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f113006a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f113006a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f113006a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f113006a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f113006a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f113006a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f113006a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C2553v(CodedOutputStream codedOutputStream) {
        V.e(codedOutputStream, AgentOptions.OUTPUT);
        this.f113005a = codedOutputStream;
        codedOutputStream.f112534a = this;
    }

    public static C2553v T(CodedOutputStream codedOutputStream) {
        C2553v c2553v = codedOutputStream.f112534a;
        return c2553v != null ? c2553v : new C2553v(codedOutputStream);
    }

    private void a0(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f113005a.e(i10, (String) obj);
        } else {
            this.f113005a.i(i10, (ByteString) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void A(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (!(list instanceof InterfaceC2513a0)) {
            while (i11 < list.size()) {
                this.f113005a.e(i10, list.get(i11));
                i11++;
            }
        } else {
            InterfaceC2513a0 interfaceC2513a0 = (InterfaceC2513a0) list;
            while (i11 < list.size()) {
                a0(i10, interfaceC2513a0.U3(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void B(int i10, List<?> list, G0 g02) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            F(i10, list.get(i11), g02);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void C(int i10, long j10) throws IOException {
        this.f113005a.q(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void D(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.m(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int iU0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iU0 += CodedOutputStream.U0(list.get(i12).longValue());
        }
        this.f113005a.h2(iU0);
        while (i11 < list.size()) {
            this.f113005a.e2(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void E(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.h(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int iX0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX0 += CodedOutputStream.x0(list.get(i12).intValue());
        }
        this.f113005a.h2(iX0);
        while (i11 < list.size()) {
            this.f113005a.J1(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void F(int i10, Object obj, G0 g02) throws IOException {
        this.f113005a.G1(i10, (MessageLite) obj, g02);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void G(int i10, double d10) throws IOException {
        this.f113005a.G(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void H(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.q(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            i12 += 8;
        }
        this.f113005a.h2(i12);
        while (i11 < list.size()) {
            this.f113005a.D1(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public Writer.FieldOrder I() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void J(int i10, List<?> list, G0 g02) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            k(i10, list.get(i11), g02);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void K(int i10, Object obj) throws IOException {
        this.f113005a.L1(i10, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void L(int i10, long j10) throws IOException {
        this.f113005a.f(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void M(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.c(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            i12 += 4;
        }
        this.f113005a.h2(i12);
        while (i11 < list.size()) {
            this.f113005a.C1(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void N(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.s(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            i12++;
        }
        this.f113005a.h2(i12);
        while (i11 < list.size()) {
            this.f113005a.T(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void O(int i10, Object obj) throws IOException {
        this.f113005a.F1(i10, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void P(int i10, float f10) throws IOException {
        this.f113005a.P(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void Q(int i10, int i11) throws IOException {
        this.f113005a.h(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void R(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.f(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int iB1 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB1 += CodedOutputStream.b1(list.get(i12).longValue());
        }
        this.f113005a.h2(iB1);
        while (i11 < list.size()) {
            this.f113005a.i2(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void S(int i10, int i11) throws IOException {
        this.f113005a.S(i10, i11);
    }

    public int U() {
        return this.f113005a.f1();
    }

    public final <V> void V(int i10, boolean z10, V v10, C2523f0.b<Boolean, V> bVar) throws IOException {
        this.f113005a.g2(i10, 2);
        this.f113005a.h2(C2523f0.b(bVar, Boolean.valueOf(z10), v10));
        C2523f0.l(this.f113005a, bVar, Boolean.valueOf(z10), v10);
    }

    public final <V> void W(int i10, C2523f0.b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f113005a.g2(i10, 2);
            this.f113005a.h2(C2523f0.b(bVar, Integer.valueOf(i13), v10));
            C2523f0.l(this.f113005a, bVar, Integer.valueOf(i13), v10);
        }
    }

    public final <V> void X(int i10, C2523f0.b<Long, V> bVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f113005a.g2(i10, 2);
            this.f113005a.h2(C2523f0.b(bVar, Long.valueOf(j10), v10));
            C2523f0.l(this.f113005a, bVar, Long.valueOf(j10), v10);
        }
    }

    public final <K, V> void Y(int i10, C2523f0.b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (a.f113006a[bVar.f112847a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    V(i10, false, v10, bVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    V(i10, true, v11, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                W(i10, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                X(i10, bVar, map);
                return;
            case 12:
                Z(i10, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.f112847a);
        }
    }

    public final <V> void Z(int i10, C2523f0.b<String, V> bVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.f113005a.g2(i10, 2);
            this.f113005a.h2(C2523f0.b(bVar, str, v10));
            C2523f0.l(this.f113005a, bVar, str, v10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void a(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.P(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            i12 += 4;
        }
        this.f113005a.h2(i12);
        while (i11 < list.size()) {
            this.f113005a.E1(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void b(int i10, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f113005a.Y1(i10, (ByteString) obj);
        } else {
            this.f113005a.P1(i10, (MessageLite) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void c(int i10, int i11) throws IOException {
        this.f113005a.c(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void d(int i10, List<?> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            O(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void e(int i10, String str) throws IOException {
        this.f113005a.e(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void f(int i10, long j10) throws IOException {
        this.f113005a.f(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void g(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.h(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int iX0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX0 += CodedOutputStream.x0(list.get(i12).intValue());
        }
        this.f113005a.h2(iX0);
        while (i11 < list.size()) {
            this.f113005a.J1(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void h(int i10, int i11) throws IOException {
        this.f113005a.h(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void i(int i10, ByteString byteString) throws IOException {
        this.f113005a.i(i10, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void j(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.c(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            i12 += 4;
        }
        this.f113005a.h2(i12);
        while (i11 < list.size()) {
            this.f113005a.C1(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void k(int i10, Object obj, G0 g02) throws IOException {
        this.f113005a.M1(i10, (MessageLite) obj, g02);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void l(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.o(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int iZ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ0 += CodedOutputStream.Z0(list.get(i12).intValue());
        }
        this.f113005a.h2(iZ0);
        while (i11 < list.size()) {
            this.f113005a.h2(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void m(int i10, long j10) throws IOException {
        this.f113005a.m(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void n(int i10, C2523f0.b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.f113005a.h1()) {
            Y(i10, bVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f113005a.g2(i10, 2);
            this.f113005a.h2(C2523f0.b(bVar, entry.getKey(), entry.getValue()));
            C2523f0.l(this.f113005a, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void o(int i10, int i11) throws IOException {
        this.f113005a.o(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void p(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.f(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int iB1 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB1 += CodedOutputStream.b1(list.get(i12).longValue());
        }
        this.f113005a.h2(iB1);
        while (i11 < list.size()) {
            this.f113005a.i2(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void q(int i10, long j10) throws IOException {
        this.f113005a.q(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void r(int i10, List<?> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void s(int i10, boolean z10) throws IOException {
        this.f113005a.s(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void t(int i10, int i11) throws IOException {
        this.f113005a.c(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void u(int i10) throws IOException {
        this.f113005a.g2(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void v(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.q(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            i12 += 8;
        }
        this.f113005a.h2(i12);
        while (i11 < list.size()) {
            this.f113005a.D1(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void w(int i10) throws IOException {
        this.f113005a.g2(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void x(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.S(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int iS0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS0 += CodedOutputStream.S0(list.get(i12).intValue());
        }
        this.f113005a.h2(iS0);
        while (i11 < list.size()) {
            this.f113005a.d2(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void y(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f113005a.G(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f113005a.g2(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            i12 += 8;
        }
        this.f113005a.h2(i12);
        while (i11 < list.size()) {
            this.f113005a.A1(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void z(int i10, List<ByteString> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f113005a.i(i10, list.get(i11));
        }
    }
}
