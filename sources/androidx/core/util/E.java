package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f111372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f111373b;

    @T(21)
    public static final class a {
        @NonNull
        public static SizeF a(@NonNull E e10) {
            e10.getClass();
            return new SizeF(e10.f111372a, e10.f111373b);
        }

        @NonNull
        public static E b(@NonNull SizeF sizeF) {
            sizeF.getClass();
            return new E(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public E(float f10, float f11) {
        t.d(f10, InMobiNetworkValues.WIDTH);
        this.f111372a = f10;
        t.d(f11, InMobiNetworkValues.HEIGHT);
        this.f111373b = f11;
    }

    @NonNull
    @T(21)
    public static E d(@NonNull SizeF sizeF) {
        return a.b(sizeF);
    }

    public float a() {
        return this.f111373b;
    }

    public float b() {
        return this.f111372a;
    }

    @NonNull
    @T(21)
    public SizeF c() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return e10.f111372a == this.f111372a && e10.f111373b == this.f111373b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f111372a) ^ Float.floatToIntBits(this.f111373b);
    }

    @NonNull
    public String toString() {
        return this.f111372a + "x" + this.f111373b;
    }
}
