package com.prism.gaia.server.pm;

import android.os.Parcel;
import p0.C5377a;

/* JADX INFO: loaded from: classes6.dex */
public final class D {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f167424f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f167425g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f167426h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f167427i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f167428j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f167429k = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f167430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f167432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f167433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f167434e;

    public D(int i10, boolean z10, int i11, float f10, String str) {
        this.f167430a = i10;
        this.f167431b = z10;
        this.f167432c = i11;
        this.f167433d = f10;
        this.f167434e = str;
    }

    public static boolean a(D d10, boolean z10) {
        int i10;
        if (d10 != null) {
            int i11 = d10.f167430a;
            if (i11 == 1) {
                return d10.f167431b;
            }
            if (i11 == 2 && ((i10 = d10.f167432c) == 0 || i10 == 1)) {
                return i10 != 0;
            }
            if (i11 != 4 && i11 == 6) {
                return "true".equalsIgnoreCase(d10.f167434e);
            }
        }
        return z10;
    }

    public static D b(boolean z10) {
        return new D(1, z10, 0, 0.0f, null);
    }

    public static D c(float f10) {
        return new D(3, false, 0, f10, null);
    }

    public static D d(int i10) {
        return new D(2, false, i10, 0.0f, null);
    }

    public static D e(int i10) {
        return new D(5, false, i10, 0.0f, null);
    }

    public static D f(String str) {
        return new D(4, false, 0, 0.0f, str);
    }

    public static D g(String str) {
        return new D(6, false, 0, 0.0f, str);
    }

    public static D h(Parcel parcel) {
        int i10 = parcel.readInt();
        switch (i10) {
            case 1:
                return b(parcel.readInt() != 0);
            case 2:
                return d(parcel.readInt());
            case 3:
                return c(parcel.readFloat());
            case 4:
                return f(parcel.readString());
            case 5:
                return e(parcel.readInt());
            case 6:
                return g(parcel.readString());
            default:
                throw new IllegalStateException(android.support.v4.media.c.a("unknown property value type: ", i10));
        }
    }

    public void i(Parcel parcel) {
        parcel.writeInt(this.f167430a);
        int i10 = this.f167430a;
        if (i10 == 1) {
            parcel.writeInt(this.f167431b ? 1 : 0);
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                parcel.writeFloat(this.f167433d);
                return;
            } else if (i10 != 5) {
                parcel.writeString(this.f167434e);
                return;
            }
        }
        parcel.writeInt(this.f167432c);
    }

    public String toString() {
        int i10 = this.f167430a;
        if (i10 == 1) {
            return "boolean:" + this.f167431b;
        }
        if (i10 == 2) {
            return "int:" + this.f167432c;
        }
        if (i10 == 3) {
            return "float:" + this.f167433d;
        }
        if (i10 == 4) {
            return "string:" + this.f167434e;
        }
        if (i10 == 5) {
            return C5377a.a(this.f167432c, new StringBuilder("resource:0x"));
        }
        return "coerced:" + this.f167434e;
    }
}
