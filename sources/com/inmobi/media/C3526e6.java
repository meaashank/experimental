package com.inmobi.media;

import F5.C1036a1;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import java.util.HashMap;
import kotlin.jvm.internal.C4967t;

/* JADX INFO: renamed from: com.inmobi.media.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3526e6 implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3526e6 f152844a = new C3526e6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LocationManager f152845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HandlerThread f152846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static GoogleApiClient f152847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f152848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f152849f;

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        f152846c = handlerThread;
        f152848e = "e6";
        W3.a(handlerThread, "LThread");
        Context contextD = C3657nb.d();
        if (contextD != null) {
            Object systemService = contextD.getSystemService("location");
            f152845b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static boolean c() {
        try {
            if (AbstractC3822z9.a(C3657nb.d(), "android.permission.ACCESS_FINE_LOCATION")) {
                return true;
            }
            return AbstractC3822z9.a(C3657nb.d(), "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            String TAG = f152848e;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            return false;
        }
    }

    public static boolean e() {
        int i10;
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = f152845b;
            return locationManager != null && locationManager.isLocationEnabled();
        }
        try {
            i10 = Settings.Secure.getInt(contextD.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i10 = 0;
        }
        return i10 != 0;
    }

    public final void a() {
        LocationManager locationManager = f152845b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider == null) {
                String TAG = f152848e;
                kotlin.jvm.internal.G.o(TAG, "TAG");
            } else {
                String TAG2 = f152848e;
                kotlin.jvm.internal.G.o(TAG2, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, f152846c.getLooper());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[PHI: r1
      0x0074: PHI (r1v4 android.location.Location) = (r1v3 android.location.Location), (r1v21 android.location.Location), (r1v21 android.location.Location) binds: [B:31:0x007a, B:23:0x0060, B:25:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a A[Catch: all -> 0x001f, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x013a, B:79:0x0146, B:80:0x014b, B:82:0x0158, B:83:0x0160, B:85:0x0166, B:81:0x0150, B:11:0x0022, B:13:0x0028, B:15:0x002e, B:17:0x0032, B:22:0x005e, B:24:0x0062, B:26:0x006e, B:34:0x0086, B:36:0x0090, B:38:0x009c, B:40:0x00a3, B:41:0x00b2, B:54:0x00da, B:56:0x00ea, B:57:0x00f8, B:73:0x011c, B:75:0x012b, B:31:0x007a, B:20:0x0053), top: B:97:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150 A[Catch: all -> 0x001f, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x013a, B:79:0x0146, B:80:0x014b, B:82:0x0158, B:83:0x0160, B:85:0x0166, B:81:0x0150, B:11:0x0022, B:13:0x0028, B:15:0x002e, B:17:0x0032, B:22:0x005e, B:24:0x0062, B:26:0x006e, B:34:0x0086, B:36:0x0090, B:38:0x009c, B:40:0x00a3, B:41:0x00b2, B:54:0x00da, B:56:0x00ea, B:57:0x00f8, B:73:0x011c, B:75:0x012b, B:31:0x007a, B:20:0x0053), top: B:97:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166 A[Catch: all -> 0x001f, LOOP:0: B:83:0x0160->B:85:0x0166, LOOP_END, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x013a, B:79:0x0146, B:80:0x014b, B:82:0x0158, B:83:0x0160, B:85:0x0166, B:81:0x0150, B:11:0x0022, B:13:0x0028, B:15:0x002e, B:17:0x0032, B:22:0x005e, B:24:0x0062, B:26:0x006e, B:34:0x0086, B:36:0x0090, B:38:0x009c, B:40:0x00a3, B:41:0x00b2, B:54:0x00da, B:56:0x00ea, B:57:0x00f8, B:73:0x011c, B:75:0x012b, B:31:0x007a, B:20:0x0053), top: B:97:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.HashMap b() {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3526e6.b():java.util.HashMap");
    }

    public final synchronized void d() {
        try {
            if (c() && e()) {
                a();
                try {
                    ((C4967t) kotlin.jvm.internal.O.d(GoogleApiClient.class)).Q();
                    kotlin.jvm.internal.P p10 = kotlin.jvm.internal.O.f217893a;
                    ((C4967t) p10.d(FusedLocationProviderClient.class)).Q();
                    ((C4967t) p10.d(LocationServices.class)).Q();
                    a(C3657nb.d());
                } catch (NoClassDefFoundError unused) {
                }
            }
        } catch (Exception unused2) {
            String TAG = f152848e;
            kotlin.jvm.internal.G.o(TAG, "TAG");
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        kotlin.jvm.internal.G.p(location, "location");
        try {
            String TAG = f152848e;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!c() || (locationManager = f152845b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        kotlin.jvm.internal.G.p(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        kotlin.jvm.internal.G.p(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = f152847d;
            if (googleApiClient == null) {
                String TAG = f152848e;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                kotlin.jvm.internal.G.m(context);
                GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(context).addConnectionCallbacks(new C3512d6()).addOnConnectionFailedListener(new C1036a1()).addApi(LocationServices.API).build();
                f152847d = googleApiClientBuild;
                if (googleApiClientBuild != null) {
                    googleApiClientBuild.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (Exception unused) {
            String TAG2 = f152848e;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
        }
    }

    public static final void a(ConnectionResult it) {
        kotlin.jvm.internal.G.p(it, "it");
        f152849f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[PHI: r1
      0x0054: PHI (r1v4 android.location.Location) = 
      (r1v3 android.location.Location)
      (r1v3 android.location.Location)
      (r1v3 android.location.Location)
      (r1v5 android.location.Location)
     binds: [B:31:0x0054, B:17:0x0044, B:19:0x004a, B:22:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.location.Location a(int r5, int r6) {
        /*
            android.location.Criteria r0 = new android.location.Criteria
            r0.<init>()
            r0.setAccuracy(r5)
            r0.setPowerRequirement(r6)
            r6 = 0
            r0.setCostAllowed(r6)
            android.location.LocationManager r6 = com.inmobi.media.C3526e6.f152845b
            r1 = 0
            if (r6 == 0) goto L5a
            r2 = 1
            java.lang.String r0 = r6.getBestProvider(r0, r2)
            if (r0 == 0) goto L5a
            android.location.Location r6 = r6.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L20
            goto L21
        L20:
            r6 = r1
        L21:
            if (r6 != 0) goto L59
            if (r5 == r2) goto L59
            android.location.LocationManager r5 = com.inmobi.media.C3526e6.f152845b
            if (r5 == 0) goto L5a
            java.util.List r5 = r5.getProviders(r2)
            java.lang.String r6 = "getProviders(...)"
            kotlin.jvm.internal.G.o(r5, r6)
            int r6 = r5.size()
            int r6 = r6 + (-1)
            if (r6 < 0) goto L5a
        L3a:
            int r0 = r6 + (-1)
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            android.location.LocationManager r3 = com.inmobi.media.C3526e6.f152845b     // Catch: java.lang.Exception -> L54
            if (r3 == 0) goto L54
            boolean r4 = r3.isProviderEnabled(r6)     // Catch: java.lang.Exception -> L54
            if (r4 != r2) goto L54
            android.location.Location r6 = r3.getLastKnownLocation(r6)     // Catch: java.lang.SecurityException -> L51 java.lang.Exception -> L54
            r1 = r6
        L51:
            if (r1 == 0) goto L54
            goto L5a
        L54:
            if (r0 >= 0) goto L57
            goto L5a
        L57:
            r6 = r0
            goto L3a
        L59:
            r1 = r6
        L5a:
            java.lang.String r5 = com.inmobi.media.C3526e6.f152848e
            java.lang.String r6 = "TAG"
            kotlin.jvm.internal.G.o(r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3526e6.a(int, int):android.location.Location");
    }

    public static HashMap a(Location location, boolean z10, Location location2) {
        HashMap map = new HashMap();
        Context contextD = C3657nb.d();
        if (contextD != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    map.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(location.getLatitude());
                sb2.append(',');
                sb2.append(location.getLongitude());
                sb2.append(',');
                sb2.append((int) location.getAccuracy());
                map.put("u-latlong-accu", sb2.toString());
                map.put("sdk-collected", Integer.valueOf(z10 ? 1 : 0));
            }
            String strH = C3657nb.f153207a.h();
            if (strH == null || C3740tb.a(strH).isLocationEnabled()) {
                map.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(location2.getLatitude());
                sb3.append(',');
                sb3.append(location2.getLongitude());
                sb3.append(',');
                sb3.append((int) location2.getAccuracy());
                map.put("u-latlong-accu-fine", sb3.toString());
                map.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (e() && c()) {
                if (AbstractC3822z9.a(contextD, "android.permission.ACCESS_COARSE_LOCATION")) {
                    map.put("loc-granularity", "coarse");
                }
            } else {
                map.put("loc-granularity", "none");
                return map;
            }
        }
        return map;
    }
}
