package androidx.core.location;

import N0.V;
import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCacheKt;
import androidx.core.util.L;
import androidx.core.util.t;
import e.D;
import e.InterfaceC4348w;
import e.T;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationRequestCompat {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f111223h = Long.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f111224i = 100;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f111225j = 102;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f111226k = 104;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f111227l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f111229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f111230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f111231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f111232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f111233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f111234g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Class<?> f111235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f111236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f111237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static Method f111238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Method f111239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static Method f111240f;

        @SuppressLint({"BanUncheckedReflection"})
        public static Object a(LocationRequestCompat locationRequestCompat, String str) {
            try {
                if (f111235a == null) {
                    f111235a = Class.forName("android.location.LocationRequest");
                }
                Method method = f111236b;
                Class<?> cls = Long.TYPE;
                if (method == null) {
                    Method declaredMethod = f111235a.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls, Float.TYPE, Boolean.TYPE);
                    f111236b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object objInvoke = f111236b.invoke(null, str, Long.valueOf(locationRequestCompat.f111229b), Float.valueOf(locationRequestCompat.f111233f), Boolean.FALSE);
                if (objInvoke == null) {
                    return null;
                }
                Method method2 = f111237c;
                Class<?> cls2 = Integer.TYPE;
                if (method2 == null) {
                    Method declaredMethod2 = f111235a.getDeclaredMethod("setQuality", cls2);
                    f111237c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f111237c.invoke(objInvoke, Integer.valueOf(locationRequestCompat.f111228a));
                if (f111238d == null) {
                    Method declaredMethod3 = f111235a.getDeclaredMethod("setFastestInterval", cls);
                    f111238d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f111238d.invoke(objInvoke, Long.valueOf(locationRequestCompat.f()));
                if (locationRequestCompat.f111232e < Integer.MAX_VALUE) {
                    if (f111239e == null) {
                        Method declaredMethod4 = f111235a.getDeclaredMethod("setNumUpdates", cls2);
                        f111239e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f111239e.invoke(objInvoke, Integer.valueOf(locationRequestCompat.f111232e));
                }
                if (locationRequestCompat.f111231d < Long.MAX_VALUE) {
                    if (f111240f == null) {
                        Method declaredMethod5 = f111235a.getDeclaredMethod("setExpireIn", cls);
                        f111240f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f111240f.invoke(objInvoke, Long.valueOf(locationRequestCompat.f111231d));
                }
                return objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    @T(31)
    public static class b {
        public static LocationRequest a(LocationRequestCompat locationRequestCompat) {
            return new LocationRequest.Builder(locationRequestCompat.f111229b).setQuality(locationRequestCompat.f111228a).setMinUpdateIntervalMillis(locationRequestCompat.f()).setDurationMillis(locationRequestCompat.f111231d).setMaxUpdates(locationRequestCompat.f111232e).setMinUpdateDistanceMeters(locationRequestCompat.f111233f).setMaxUpdateDelayMillis(locationRequestCompat.f111234g).build();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface c {
    }

    public LocationRequestCompat(long j10, int i10, long j11, int i11, long j12, float f10, long j13) {
        this.f111229b = j10;
        this.f111228a = i10;
        this.f111230c = j12;
        this.f111231d = j11;
        this.f111232e = i11;
        this.f111233f = f10;
        this.f111234g = j13;
    }

    @D(from = 1)
    public long a() {
        return this.f111231d;
    }

    @D(from = 0)
    public long b() {
        return this.f111229b;
    }

    @D(from = 0)
    public long c() {
        return this.f111234g;
    }

    @D(from = 1, to = LruCacheKt.f86729a)
    public int d() {
        return this.f111232e;
    }

    @InterfaceC4348w(from = 0.0d, to = 3.4028234663852886E38d)
    public float e() {
        return this.f111233f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        return this.f111228a == locationRequestCompat.f111228a && this.f111229b == locationRequestCompat.f111229b && this.f111230c == locationRequestCompat.f111230c && this.f111231d == locationRequestCompat.f111231d && this.f111232e == locationRequestCompat.f111232e && Float.compare(locationRequestCompat.f111233f, this.f111233f) == 0 && this.f111234g == locationRequestCompat.f111234g;
    }

    @D(from = 0)
    public long f() {
        long j10 = this.f111230c;
        return j10 == -1 ? this.f111229b : j10;
    }

    public int g() {
        return this.f111228a;
    }

    @NonNull
    @T(31)
    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        int i10 = this.f111228a * 31;
        long j10 = this.f111229b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f111230c;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    @Nullable
    @SuppressLint({"NewApi"})
    public LocationRequest i(@NonNull String str) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(this) : V.a(a.a(this, str));
    }

    @NonNull
    public String toString() {
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a("Request[");
        if (this.f111229b != Long.MAX_VALUE) {
            sbA.append("@");
            L.e(this.f111229b, sbA);
            int i10 = this.f111228a;
            if (i10 == 100) {
                sbA.append(" HIGH_ACCURACY");
            } else if (i10 == 102) {
                sbA.append(" BALANCED");
            } else if (i10 == 104) {
                sbA.append(" LOW_POWER");
            }
        } else {
            sbA.append("PASSIVE");
        }
        if (this.f111231d != Long.MAX_VALUE) {
            sbA.append(", duration=");
            L.e(this.f111231d, sbA);
        }
        if (this.f111232e != Integer.MAX_VALUE) {
            sbA.append(", maxUpdates=");
            sbA.append(this.f111232e);
        }
        long j10 = this.f111230c;
        if (j10 != -1 && j10 < this.f111229b) {
            sbA.append(", minUpdateInterval=");
            L.e(this.f111230c, sbA);
        }
        if (this.f111233f > 0.0d) {
            sbA.append(", minUpdateDistance=");
            sbA.append(this.f111233f);
        }
        if (this.f111234g / 2 > this.f111229b) {
            sbA.append(", maxUpdateDelay=");
            L.e(this.f111234g, sbA);
        }
        sbA.append(']');
        return sbA.toString();
    }

    public static final class Builder {
        private long mDurationMillis;
        private long mIntervalMillis;
        private long mMaxUpdateDelayMillis;
        private int mMaxUpdates;
        private float mMinUpdateDistanceMeters;
        private long mMinUpdateIntervalMillis;
        private int mQuality;

        public Builder(long j10) {
            setIntervalMillis(j10);
            this.mQuality = 102;
            this.mDurationMillis = Long.MAX_VALUE;
            this.mMaxUpdates = Integer.MAX_VALUE;
            this.mMinUpdateIntervalMillis = -1L;
            this.mMinUpdateDistanceMeters = 0.0f;
            this.mMaxUpdateDelayMillis = 0L;
        }

        @NonNull
        public LocationRequestCompat build() {
            t.o((this.mIntervalMillis == Long.MAX_VALUE && this.mMinUpdateIntervalMillis == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j10 = this.mIntervalMillis;
            return new LocationRequestCompat(j10, this.mQuality, this.mDurationMillis, this.mMaxUpdates, Math.min(this.mMinUpdateIntervalMillis, j10), this.mMinUpdateDistanceMeters, this.mMaxUpdateDelayMillis);
        }

        @NonNull
        public Builder clearMinUpdateIntervalMillis() {
            this.mMinUpdateIntervalMillis = -1L;
            return this;
        }

        @NonNull
        public Builder setDurationMillis(@D(from = 1) long j10) {
            t.h(j10, 1L, Long.MAX_VALUE, "durationMillis");
            this.mDurationMillis = j10;
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(@D(from = 0) long j10) {
            t.h(j10, 0L, Long.MAX_VALUE, "intervalMillis");
            this.mIntervalMillis = j10;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(@D(from = 0) long j10) {
            this.mMaxUpdateDelayMillis = j10;
            t.h(j10, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            this.mMaxUpdateDelayMillis = j10;
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(@D(from = 1, to = LruCacheKt.f86729a) int i10) {
            t.g(i10, 1, Integer.MAX_VALUE, "maxUpdates");
            this.mMaxUpdates = i10;
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(@InterfaceC4348w(from = 0.0d, to = 3.4028234663852886E38d) float f10) {
            this.mMinUpdateDistanceMeters = f10;
            t.f(f10, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            this.mMinUpdateDistanceMeters = f10;
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(@D(from = 0) long j10) {
            t.h(j10, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            this.mMinUpdateIntervalMillis = j10;
            return this;
        }

        @NonNull
        public Builder setQuality(int i10) {
            t.c(i10 == 104 || i10 == 102 || i10 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i10));
            this.mQuality = i10;
            return this;
        }

        public Builder(@NonNull LocationRequestCompat locationRequestCompat) {
            this.mIntervalMillis = locationRequestCompat.f111229b;
            this.mQuality = locationRequestCompat.f111228a;
            this.mDurationMillis = locationRequestCompat.f111231d;
            this.mMaxUpdates = locationRequestCompat.f111232e;
            this.mMinUpdateIntervalMillis = locationRequestCompat.f111230c;
            this.mMinUpdateDistanceMeters = locationRequestCompat.f111233f;
            this.mMaxUpdateDelayMillis = locationRequestCompat.f111234g;
        }
    }
}
