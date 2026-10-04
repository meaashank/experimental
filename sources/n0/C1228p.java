package N0;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4348w;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: N0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1228p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f59007a = "mockLocation";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f59008b = "verticalAccuracy";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f59009c = "speedAccuracy";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f59010d = "bearingAccuracy";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f59011e = "androidx.core.location.extra.MSL_ALTITUDE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f59012f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static Method f59013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static Field f59014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static Integer f59015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static Integer f59016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static Integer f59017k;

    /* JADX INFO: renamed from: N0.p$a */
    @e.T(26)
    public static class a {
        public static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        public static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        public static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        public static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        public static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        public static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        public static void g(Location location) {
            try {
                C1228p.e().setByte(location, (byte) (C1228p.e().getByte(location) & (~C1228p.f())));
            } catch (IllegalAccessException e10) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e10);
                throw illegalAccessError;
            } catch (NoSuchFieldException e11) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e11);
                throw noSuchFieldError;
            }
        }

        public static void h(Location location) {
            try {
                C1228p.e().setByte(location, (byte) (C1228p.e().getByte(location) & (~C1228p.g())));
            } catch (IllegalAccessException e10) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e10);
                throw illegalAccessError;
            } catch (NoSuchFieldException e11) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e11);
                throw noSuchFieldError;
            }
        }

        public static void i(Location location) {
            try {
                C1228p.e().setByte(location, (byte) (C1228p.e().getByte(location) & (~C1228p.h())));
            } catch (IllegalAccessException | NoSuchFieldException e10) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e10);
                throw illegalAccessError;
            }
        }

        public static void j(Location location, float f10) {
            location.setBearingAccuracyDegrees(f10);
        }

        public static void k(Location location, float f10) {
            location.setSpeedAccuracyMetersPerSecond(f10);
        }

        public static void l(Location location, float f10) {
            location.setVerticalAccuracyMeters(f10);
        }
    }

    /* JADX INFO: renamed from: N0.p$b */
    @e.T(28)
    public static class b {
        public static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        public static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        public static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    /* JADX INFO: renamed from: N0.p$c */
    @e.T(29)
    public static class c {
        public static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.a(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        public static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.b(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        public static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.c(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    /* JADX INFO: renamed from: N0.p$d */
    @e.T(31)
    public static class d {
        public static boolean a(Location location) {
            return location.isMock();
        }
    }

    /* JADX INFO: renamed from: N0.p$e */
    @e.T(33)
    public static class e {
        public static void a(Location location) {
            location.removeBearingAccuracy();
        }

        public static void b(Location location) {
            location.removeSpeedAccuracy();
        }

        public static void c(Location location) {
            location.removeVerticalAccuracy();
        }
    }

    /* JADX INFO: renamed from: N0.p$f */
    @e.T(34)
    public static class f {
        public static float a(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        public static double b(Location location) {
            return location.getMslAltitudeMeters();
        }

        public static boolean c(Location location) {
            return location.hasMslAltitude();
        }

        public static boolean d(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        public static void e(Location location) {
            location.removeMslAltitude();
        }

        public static void f(Location location) {
            location.removeMslAltitudeAccuracy();
        }

        public static void g(Location location, float f10) {
            location.setMslAltitudeAccuracyMeters(f10);
        }

        public static void h(Location location, double d10) {
            location.setMslAltitudeMeters(d10);
        }
    }

    public static void A(@NonNull Location location, float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.j(location, f10);
        } else {
            k(location).putFloat(f59010d, f10);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void B(@NonNull Location location, boolean z10) {
        try {
            l().invoke(location, Boolean.valueOf(z10));
        } catch (IllegalAccessException e10) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e10);
            throw illegalAccessError;
        } catch (NoSuchMethodException e11) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e11);
            throw noSuchMethodError;
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static void C(@NonNull Location location, @InterfaceC4348w(from = 0.0d) float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.g(location, f10);
        } else {
            k(location).putFloat(f59012f, f10);
        }
    }

    public static void D(@NonNull Location location, double d10) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.h(location, d10);
        } else {
            k(location).putDouble(f59011e, d10);
        }
    }

    public static void E(@NonNull Location location, float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.k(location, f10);
        } else {
            k(location).putFloat(f59009c, f10);
        }
    }

    public static void F(@NonNull Location location, float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.l(location, f10);
        } else {
            k(location).putFloat("verticalAccuracy", f10);
        }
    }

    public static boolean a(@NonNull Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    public static float b(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f59010d, 0.0f);
    }

    public static long c(@NonNull Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    @e.S(expression = "location.getElapsedRealtimeNanos()")
    @Deprecated
    public static long d(@NonNull Location location) {
        return location.getElapsedRealtimeNanos();
    }

    @SuppressLint({"BlockedPrivateApi"})
    public static Field e() throws NoSuchFieldException {
        if (f59014h == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            f59014h = declaredField;
            declaredField.setAccessible(true);
        }
        return f59014h;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int f() throws IllegalAccessException, NoSuchFieldException {
        if (f59016j == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f59016j = Integer.valueOf(declaredField.getInt(null));
        }
        return f59016j.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int g() throws IllegalAccessException, NoSuchFieldException {
        if (f59015i == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f59015i = Integer.valueOf(declaredField.getInt(null));
        }
        return f59015i.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int h() throws IllegalAccessException, NoSuchFieldException {
        if (f59017k == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f59017k = Integer.valueOf(declaredField.getInt(null));
        }
        return f59017k.intValue();
    }

    @InterfaceC4348w(from = 0.0d)
    public static float i(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.a(location) : k(location).getFloat(f59012f);
    }

    public static double j(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.b(location) : k(location).getDouble(f59011e);
    }

    public static Bundle k(@NonNull Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    public static Method l() throws NoSuchMethodException {
        if (f59013g == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f59013g = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f59013g;
    }

    public static float m(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f59009c, 0.0f);
    }

    public static float n(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static boolean o(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.d(location) : a(location, f59010d);
    }

    public static boolean p(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.c(location) : a(location, f59011e);
    }

    public static boolean q(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.d(location) : a(location, f59012f);
    }

    public static boolean r(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.e(location) : a(location, f59009c);
    }

    public static boolean s(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.f(location) : a(location, "verticalAccuracy");
    }

    public static boolean t(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 31 ? d.a(location) : location.isFromMockProvider();
    }

    public static void u(@NonNull Location location) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            e.a(location);
            return;
        }
        if (i10 >= 29) {
            c.a(location);
            return;
        }
        if (i10 >= 28) {
            b.a(location);
        } else if (i10 >= 26) {
            a.g(location);
        } else {
            v(location, f59010d);
        }
    }

    public static void v(@NonNull Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static void w(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.e(location);
        } else {
            v(location, f59011e);
        }
    }

    public static void x(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.f(location);
        } else {
            v(location, f59012f);
        }
    }

    public static void y(@NonNull Location location) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            e.b(location);
            return;
        }
        if (i10 >= 29) {
            c.b(location);
            return;
        }
        if (i10 >= 28) {
            b.b(location);
        } else if (i10 >= 26) {
            a.h(location);
        } else {
            v(location, f59009c);
        }
    }

    public static void z(@NonNull Location location) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            e.c(location);
            return;
        }
        if (i10 >= 29) {
            c.c(location);
            return;
        }
        if (i10 >= 28) {
            b.c(location);
        } else if (i10 >= 26) {
            a.i(location);
        } else {
            v(location, "verticalAccuracy");
        }
    }
}
