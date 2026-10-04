package N0;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.InterfaceC4348w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: N0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1213a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f58982a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f58983b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f58984c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f58985d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f58986e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f58987f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f58988g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f58989h = 7;

    /* JADX INFO: renamed from: N0.a$b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    @NonNull
    @e.T(24)
    public static AbstractC1213a n(@NonNull GnssStatus gnssStatus) {
        return new C1226n(gnssStatus);
    }

    @NonNull
    @SuppressLint({"ReferencesDeprecated"})
    public static AbstractC1213a o(@NonNull GpsStatus gpsStatus) {
        return new C1227o(gpsStatus);
    }

    @InterfaceC4348w(from = 0.0d, to = 360.0d)
    public abstract float a(@e.D(from = 0) int i10);

    @InterfaceC4348w(from = 0.0d, to = 63.0d)
    public abstract float b(@e.D(from = 0) int i10);

    @InterfaceC4348w(from = 0.0d)
    public abstract float c(@e.D(from = 0) int i10);

    @InterfaceC4348w(from = 0.0d, to = 63.0d)
    public abstract float d(@e.D(from = 0) int i10);

    public abstract int e(@e.D(from = 0) int i10);

    @InterfaceC4348w(from = -90.0d, to = 90.0d)
    public abstract float f(@e.D(from = 0) int i10);

    @e.D(from = 0)
    public abstract int g();

    @e.D(from = 1, to = 200)
    public abstract int h(@e.D(from = 0) int i10);

    public abstract boolean i(@e.D(from = 0) int i10);

    public abstract boolean j(@e.D(from = 0) int i10);

    public abstract boolean k(@e.D(from = 0) int i10);

    public abstract boolean l(@e.D(from = 0) int i10);

    public abstract boolean m(@e.D(from = 0) int i10);

    /* JADX INFO: renamed from: N0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0080a {
        public void c() {
        }

        public void d() {
        }

        public void a(@e.D(from = 0) int i10) {
        }

        public void b(@NonNull AbstractC1213a abstractC1213a) {
        }
    }
}
