package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.support.v4.media.c;
import androidx.annotation.RestrictTo;
import androidx.collection.C1520a;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a extends VersionedParcel {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Charset f119815C = Charset.forName("UTF-16");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f119816D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f119817E = 1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f119818F = 2;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f119819G = 3;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f119820H = 4;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f119821I = 5;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f119822J = 6;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f119823K = 7;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f119824L = 8;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f119825M = 9;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f119826N = 10;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f119827O = 11;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f119828P = 12;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f119829Q = 13;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f119830R = 14;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f119831A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f119832B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DataInputStream f119833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DataOutputStream f119834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DataInputStream f119835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public DataOutputStream f119836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f119837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f119838y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f119839z;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteArrayOutputStream f119841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DataOutputStream f119842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f119843c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DataOutputStream f119844d;

        public b(int i10, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f119841a = byteArrayOutputStream;
            this.f119842b = new DataOutputStream(byteArrayOutputStream);
            this.f119843c = i10;
            this.f119844d = dataOutputStream;
        }

        public void a() throws IOException {
            this.f119842b.flush();
            int size = this.f119841a.size();
            this.f119844d.writeInt((this.f119843c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f119844d.writeInt(size);
            }
            this.f119841a.writeTo(this.f119844d);
        }
    }

    public a(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new C1520a(), new C1520a(), new C1520a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C0(double d10) {
        try {
            this.f119836w.writeDouble(d10);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean F(int i10) {
        while (true) {
            try {
                int i11 = this.f119831A;
                if (i11 == i10) {
                    return true;
                }
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                    return false;
                }
                if (this.f119839z < this.f119832B) {
                    this.f119833t.skip(r2 - r1);
                }
                this.f119832B = -1;
                int i12 = this.f119833t.readInt();
                this.f119839z = 0;
                int i13 = i12 & 65535;
                if (i13 == 65535) {
                    i13 = this.f119833t.readInt();
                }
                this.f119831A = (i12 >> 16) & 65535;
                this.f119832B = i13;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float G() {
        try {
            return this.f119835v.readFloat();
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void H0(float f10) {
        try {
            this.f119836w.writeFloat(f10);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int L() {
        try {
            return this.f119835v.readInt();
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void L0(int i10) {
        try {
            this.f119836w.writeInt(i10);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        try {
            return this.f119835v.readLong();
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void Q0(long j10) {
        try {
            this.f119836w.writeLong(j10);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable) {
        if (!this.f119838y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        b bVar = this.f119837x;
        if (bVar != null) {
            try {
                if (bVar.f119841a.size() != 0) {
                    this.f119837x.a();
                }
                this.f119837x = null;
            } catch (IOException e10) {
                throw new VersionedParcel.ParcelException(e10);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel c() {
        return new a(this.f119835v, this.f119836w, this.f119811a, this.f119812b, this.f119813c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        try {
            int i10 = this.f119835v.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            this.f119835v.readFully(bArr);
            return new String(bArr, f119815C);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void e1(String str) {
        try {
            if (str == null) {
                this.f119836w.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(f119815C);
            this.f119836w.writeInt(bytes.length);
            this.f119836w.write(bytes);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder) {
        if (!this.f119838y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i0(int i10) {
        a();
        b bVar = new b(i10, this.f119834u);
        this.f119837x = bVar;
        this.f119836w = bVar.f119842b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface) {
        if (!this.f119838y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void j0(boolean z10, boolean z11) {
        if (!z10) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f119838y = z11;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        try {
            return this.f119835v.readBoolean();
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z10) {
        try {
            this.f119836w.writeBoolean(z10);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    public final void o1(int i10, String str, Bundle bundle) {
        switch (i10) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, p());
                return;
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException(c.a("Unknown type ", i10));
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < iL; i10++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    public final void p1(Object obj) {
        if (obj == null) {
            L0(0);
            return;
        }
        if (obj instanceof Bundle) {
            L0(1);
            q0((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            L0(3);
            e1((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            L0(4);
            k0((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            L0(5);
            m0(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            L0(6);
            o0((boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            L0(7);
            C0(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            L0(8);
            E0((double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            L0(9);
            L0(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            L0(10);
            N0((int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            L0(11);
            Q0(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            L0(12);
            S0((long[]) obj);
        } else if (obj instanceof Float) {
            L0(13);
            H0(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            L0(14);
            J0((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f119836w.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.f119836w.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                e1(str);
                p1(bundle.get(str));
            }
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        try {
            int i10 = this.f119835v.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            this.f119835v.readFully(bArr);
            return bArr;
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] bArr) {
        try {
            if (bArr == null) {
                this.f119836w.writeInt(-1);
            } else {
                this.f119836w.writeInt(bArr.length);
                this.f119836w.write(bArr);
            }
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence v() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] bArr, int i10, int i11) {
        try {
            if (bArr == null) {
                this.f119836w.writeInt(-1);
            } else {
                this.f119836w.writeInt(i11);
                this.f119836w.write(bArr, i10, i11);
            }
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double y() {
        try {
            return this.f119835v.readDouble();
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y0(CharSequence charSequence) {
        if (!this.f119838y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    /* JADX INFO: renamed from: androidx.versionedparcelable.a$a, reason: collision with other inner class name */
    public class C0340a extends FilterInputStream {
        public C0340a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            a aVar = a.this;
            int i10 = aVar.f119832B;
            if (i10 != -1 && aVar.f119839z >= i10) {
                throw new IOException();
            }
            int i11 = super.read();
            a.this.f119839z++;
            return i11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            a aVar = a.this;
            int i10 = aVar.f119832B;
            if (i10 != -1 && aVar.f119839z >= i10) {
                throw new IOException();
            }
            long jSkip = super.skip(j10);
            if (jSkip > 0) {
                a.this.f119839z += (int) jSkip;
            }
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            a aVar = a.this;
            int i12 = aVar.f119832B;
            if (i12 != -1 && aVar.f119839z >= i12) {
                throw new IOException();
            }
            int i13 = super.read(bArr, i10, i11);
            if (i13 > 0) {
                a.this.f119839z += i13;
            }
            return i13;
        }
    }

    public a(InputStream inputStream, OutputStream outputStream, C1520a<String, Method> c1520a, C1520a<String, Method> c1520a2, C1520a<String, Class> c1520a3) {
        super(c1520a, c1520a2, c1520a3);
        this.f119839z = 0;
        this.f119831A = -1;
        this.f119832B = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new C0340a(inputStream)) : null;
        this.f119833t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f119834u = dataOutputStream;
        this.f119835v = dataInputStream;
        this.f119836w = dataOutputStream;
    }
}
