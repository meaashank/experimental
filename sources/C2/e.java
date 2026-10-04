package C2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.C1520a;
import androidx.versionedparcelable.VersionedParcel;
import com.bumptech.glide.load.engine.GlideException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class e extends VersionedParcel {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final boolean f17533B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f17534C = "VersionedParcelParcel";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f17535A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseIntArray f17536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Parcel f17537u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f17538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f17539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f17540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f17542z;

    public e(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1520a(), new C1520a(), new C1520a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C0(double d10) {
        this.f17537u.writeDouble(d10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean F(int i10) {
        while (this.f17542z < this.f17539w) {
            int i11 = this.f17535A;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f17537u.setDataPosition(this.f17542z);
            int i12 = this.f17537u.readInt();
            this.f17535A = this.f17537u.readInt();
            this.f17542z += i12;
        }
        return this.f17535A == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float G() {
        return this.f17537u.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void H0(float f10) {
        this.f17537u.writeFloat(f10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int L() {
        return this.f17537u.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void L0(int i10) {
        this.f17537u.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        return this.f17537u.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void Q0(long j10) {
        this.f17537u.writeLong(j10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T V() {
        return (T) this.f17537u.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable) {
        this.f17537u.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f17541y;
        if (i10 >= 0) {
            int i11 = this.f17536t.get(i10);
            int iDataPosition = this.f17537u.dataPosition();
            this.f17537u.setDataPosition(i11);
            this.f17537u.writeInt(iDataPosition - i11);
            this.f17537u.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel c() {
        Parcel parcel = this.f17537u;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f17542z;
        if (i10 == this.f17538v) {
            i10 = this.f17539w;
        }
        return new e(parcel, iDataPosition, i10, android.support.v4.media.e.a(new StringBuilder(), this.f17540x, GlideException.a.f139488d), this.f119811a, this.f119812b, this.f119813c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        return this.f17537u.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return this.f17537u.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void e1(String str) {
        this.f17537u.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder) {
        this.f17537u.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i0(int i10) {
        a();
        this.f17541y = i10;
        this.f17536t.put(i10, this.f17537u.dataPosition());
        L0(0);
        L0(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface) {
        this.f17537u.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        return this.f17537u.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z10) {
        this.f17537u.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        return this.f17537u.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle) {
        this.f17537u.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        int i10 = this.f17537u.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f17537u.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] bArr) {
        if (bArr == null) {
            this.f17537u.writeInt(-1);
        } else {
            this.f17537u.writeInt(bArr.length);
            this.f17537u.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f17537u);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            this.f17537u.writeInt(-1);
        } else {
            this.f17537u.writeInt(bArr.length);
            this.f17537u.writeByteArray(bArr, i10, i11);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double y() {
        return this.f17537u.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f17537u, 0);
    }

    public e(Parcel parcel, int i10, int i11, String str, C1520a<String, Method> c1520a, C1520a<String, Method> c1520a2, C1520a<String, Class> c1520a3) {
        super(c1520a, c1520a2, c1520a3);
        this.f17536t = new SparseIntArray();
        this.f17541y = -1;
        this.f17535A = -1;
        this.f17537u = parcel;
        this.f17538v = i10;
        this.f17539w = i11;
        this.f17542z = i10;
        this.f17540x = str;
    }
}
