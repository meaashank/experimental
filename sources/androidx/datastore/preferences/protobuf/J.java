package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2530j;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends I<GeneratedMessageLite.f> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112636a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f112636a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112636a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112636a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112636a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112636a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112636a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112636a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f112636a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f112636a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f112636a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f112636a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f112636a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f112636a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f112636a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f112636a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f112636a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f112636a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f112636a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.f) entry.getKey()).f112611b;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public Object b(H h10, MessageLite messageLite, int i10) {
        return h10.c(messageLite, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public FieldSet<GeneratedMessageLite.f> c(Object obj) {
        return ((GeneratedMessageLite.d) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public FieldSet<GeneratedMessageLite.f> d(Object obj) {
        return ((GeneratedMessageLite.d) obj).y0();
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.d;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public void f(Object obj) {
        ((GeneratedMessageLite.d) obj).extensions.I();
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public <UT, UB> UB g(F0 f02, Object obj, H h10, FieldSet<GeneratedMessageLite.f> fieldSet, UB ub2, W0<UT, UB> w02) throws IOException {
        Object objValueOf;
        Object objU;
        ArrayList arrayList;
        GeneratedMessageLite.g gVar = (GeneratedMessageLite.g) obj;
        int iD = gVar.d();
        GeneratedMessageLite.f fVar = gVar.f112618d;
        if (fVar.f112613d && fVar.f112614e) {
            switch (a.f112636a[gVar.b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    f02.v(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    f02.r(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    f02.C(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    f02.B(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    f02.n(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    f02.H(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    f02.o(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    f02.f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    f02.I(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    f02.z(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    f02.m(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    f02.i(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    f02.a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    f02.D(arrayList);
                    ub2 = (UB) I0.B(iD, arrayList, gVar.f112618d.f112610a, ub2, w02);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + gVar.f112618d.f112612c);
            }
            fieldSet.O(gVar.f112618d, arrayList);
            return ub2;
        }
        if (gVar.b() != WireFormat.FieldType.ENUM) {
            switch (a.f112636a[gVar.b().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(f02.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(f02.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(f02.w());
                    break;
                case 4:
                    objValueOf = Long.valueOf(f02.j());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(f02.F());
                    break;
                case 6:
                    objValueOf = Long.valueOf(f02.y());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(f02.J());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(f02.A());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(f02.c());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(f02.Q());
                    break;
                case 11:
                    objValueOf = Long.valueOf(f02.b());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(f02.e());
                    break;
                case 13:
                    objValueOf = Long.valueOf(f02.N());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = f02.g();
                    break;
                case 16:
                    objValueOf = f02.O();
                    break;
                case 17:
                    objValueOf = f02.K(gVar.c().getClass(), h10);
                    break;
                case 18:
                    objValueOf = f02.k(gVar.c().getClass(), h10);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iF = f02.F();
            if (gVar.f112618d.f112610a.a(iF) == null) {
                return (UB) I0.Q(iD, iF, ub2, w02);
            }
            objValueOf = Integer.valueOf(iF);
        }
        if (gVar.f()) {
            fieldSet.h(gVar.f112618d, objValueOf);
            return ub2;
        }
        int i10 = a.f112636a[gVar.b().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objU = fieldSet.u(gVar.f112618d)) != null) {
            objValueOf = V.v(objU, objValueOf);
        }
        fieldSet.O(gVar.f112618d, objValueOf);
        return ub2;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public void h(F0 f02, Object obj, H h10, FieldSet<GeneratedMessageLite.f> fieldSet) throws IOException {
        GeneratedMessageLite.g gVar = (GeneratedMessageLite.g) obj;
        fieldSet.O(gVar.f112618d, f02.k(gVar.c().getClass(), h10));
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public void i(ByteString byteString, Object obj, H h10, FieldSet<GeneratedMessageLite.f> fieldSet) throws IOException {
        GeneratedMessageLite.g gVar = (GeneratedMessageLite.g) obj;
        MessageLite messageLiteBuildPartial = gVar.c().i().buildPartial();
        AbstractC2530j abstractC2530jT = AbstractC2530j.T(ByteBuffer.wrap(byteString.Z()), true);
        A0.a().f(messageLiteBuildPartial, abstractC2530jT, h10);
        fieldSet.O(gVar.f112618d, messageLiteBuildPartial);
        if (((AbstractC2530j.b) abstractC2530jT).p() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public void j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.f fVar = (GeneratedMessageLite.f) entry.getKey();
        if (!fVar.f112613d) {
            switch (a.f112636a[fVar.f112612c.ordinal()]) {
                case 1:
                    writer.G(fVar.f112611b, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.P(fVar.f112611b, ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.L(fVar.f112611b, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.f(fVar.f112611b, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.h(fVar.f112611b, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.q(fVar.f112611b, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.c(fVar.f112611b, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.s(fVar.f112611b, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.o(fVar.f112611b, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.t(fVar.f112611b, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.C(fVar.f112611b, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.S(fVar.f112611b, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.m(fVar.f112611b, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.h(fVar.f112611b, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.i(fVar.f112611b, (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.e(fVar.f112611b, (String) entry.getValue());
                    break;
                case 17:
                    writer.F(fVar.f112611b, entry.getValue(), A0.a().i(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.k(fVar.f112611b, entry.getValue(), A0.a().i(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f112636a[fVar.f112612c.ordinal()]) {
            case 1:
                I0.Y(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 2:
                I0.g0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 3:
                I0.m0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 4:
                I0.F0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 5:
                I0.k0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 6:
                I0.e0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 7:
                I0.c0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 8:
                I0.U(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 9:
                I0.D0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 10:
                I0.s0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 11:
                I0.u0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 12:
                I0.w0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 13:
                I0.y0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 14:
                I0.k0(fVar.f112611b, (List) entry.getValue(), writer, fVar.f112614e);
                break;
            case 15:
                I0.W(fVar.f112611b, (List) entry.getValue(), writer);
                break;
            case 16:
                I0.B0(fVar.f112611b, (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    I0.i0(fVar.f112611b, (List) entry.getValue(), writer, A0.a().i(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    I0.q0(fVar.f112611b, (List) entry.getValue(), writer, A0.a().i(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public void k(Object obj, FieldSet<GeneratedMessageLite.f> fieldSet) {
        ((GeneratedMessageLite.d) obj).extensions = fieldSet;
    }
}
