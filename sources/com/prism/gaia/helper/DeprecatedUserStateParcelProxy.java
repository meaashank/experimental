package com.prism.gaia.helper;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.prism.gaia.helper.interfaces.ParcelableG;
import com.prism.gaia.server.pm.PackageUserStateG;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class DeprecatedUserStateParcelProxy {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f164907A = 22;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f164908B = 23;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f164909C = 24;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f164910D = 25;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f164911E = 26;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f164912F = 27;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f164913G = 28;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap<String, String> f164914c = new HashMap<String, String>() { // from class: com.prism.gaia.helper.DeprecatedUserStateParcelProxy.1
        {
            put("com.reflect.server.pm.PackageUserState", "com.prism.gaia.server.pm.PackageUserStateG");
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f164915d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f164916e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f164917f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f164918g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f164919h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f164920i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f164921j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f164922k = 6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f164923l = 7;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f164924m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f164925n = 9;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f164926o = 10;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f164927p = 11;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f164928q = 12;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f164929r = 13;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f164930s = 14;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f164931t = 15;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f164932u = 16;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f164933v = 17;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f164934w = 18;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f164935x = 19;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f164936y = 20;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f164937z = 21;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcel f164938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164939b;

    public DeprecatedUserStateParcelProxy(Parcel parcel) {
        this.f164939b = -1;
        this.f164938a = parcel;
    }

    public final Field a(String str) {
        try {
            Field declaredField = Parcel.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception unused) {
            return null;
        }
    }

    public Byte b() {
        return Byte.valueOf(this.f164938a.readByte());
    }

    public int c() {
        return this.f164938a.readInt();
    }

    public final <T extends Parcelable> T d(ClassLoader classLoader) {
        Parcelable.Creator<?> creatorE = e(classLoader);
        if (creatorE == null) {
            return null;
        }
        int i10 = this.f164939b;
        return i10 >= 0 ? creatorE instanceof ParcelableG.a ? (T) ((ParcelableG.a) creatorE).a(this.f164938a, classLoader, i10) : (T) ((ParcelableG.b) creatorE).b(this.f164938a, i10) : creatorE instanceof Parcelable.ClassLoaderCreator ? (T) ((Parcelable.ClassLoaderCreator) creatorE).createFromParcel(this.f164938a, classLoader) : (T) creatorE.createFromParcel(this.f164938a);
    }

    public final Parcelable.Creator<?> e(ClassLoader classLoader) {
        this.f164938a.readString();
        return PackageUserStateG.CREATOR;
    }

    public <T> SparseArray<T> f(ClassLoader classLoader) {
        int i10 = this.f164938a.readInt();
        if (i10 < 0) {
            return null;
        }
        SparseArray<T> sparseArray = new SparseArray<>(i10);
        g(sparseArray, i10, classLoader);
        return sparseArray;
    }

    public final void g(SparseArray sparseArray, int i10, ClassLoader classLoader) {
        while (i10 > 0) {
            sparseArray.append(this.f164938a.readInt(), i(classLoader));
            i10--;
        }
    }

    public String h() {
        return this.f164938a.readString();
    }

    public final Object i(ClassLoader classLoader) {
        int iC = c();
        if (iC == 4) {
            return d(classLoader);
        }
        throw new RuntimeException("Parcel " + this + ": Unmarshalling unknown type code " + iC + " at offset " + (this.f164938a.dataPosition() - 4));
    }

    public DeprecatedUserStateParcelProxy(Parcel parcel, int i10) {
        this(parcel);
        this.f164939b = i10;
    }
}
