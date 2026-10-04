package N0;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import androidx.annotation.RestrictTo;
import e.InterfaceC4326A;
import java.util.Iterator;

/* JADX INFO: renamed from: N0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C1227o extends AbstractC1213a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f58991n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f58992o = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f58993p = 33;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f58994q = 64;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f58995r = -87;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f58996s = 64;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f58997t = 24;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f58998u = 193;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f58999v = 200;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f59000w = 200;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f59001x = 35;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GpsStatus f59002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InterfaceC4326A("mWrapped")
    public int f59003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InterfaceC4326A("mWrapped")
    public Iterator<GpsSatellite> f59004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InterfaceC4326A("mWrapped")
    public int f59005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InterfaceC4326A("mWrapped")
    public GpsSatellite f59006m;

    public C1227o(GpsStatus gpsStatus) {
        gpsStatus.getClass();
        this.f59002i = gpsStatus;
        this.f59003j = -1;
        this.f59004k = gpsStatus.getSatellites().iterator();
        this.f59005l = -1;
        this.f59006m = null;
    }

    public static int p(int i10) {
        if (i10 > 0 && i10 <= 32) {
            return 1;
        }
        if (i10 >= 33 && i10 <= 64) {
            return 2;
        }
        if (i10 > 64 && i10 <= 88) {
            return 3;
        }
        if (i10 <= 200 || i10 > 235) {
            return (i10 < 193 || i10 > 200) ? 0 : 4;
        }
        return 5;
    }

    public static int r(int i10) {
        int iP = p(i10);
        return iP != 2 ? iP != 3 ? iP != 5 ? i10 : i10 - 200 : i10 - 64 : i10 + 87;
    }

    @Override // N0.AbstractC1213a
    public float a(int i10) {
        return q(i10).getAzimuth();
    }

    @Override // N0.AbstractC1213a
    public float b(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // N0.AbstractC1213a
    public float c(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // N0.AbstractC1213a
    public float d(int i10) {
        return q(i10).getSnr();
    }

    @Override // N0.AbstractC1213a
    public int e(int i10) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return p(q(i10).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1227o) {
            return this.f59002i.equals(((C1227o) obj).f59002i);
        }
        return false;
    }

    @Override // N0.AbstractC1213a
    public float f(int i10) {
        return q(i10).getElevation();
    }

    @Override // N0.AbstractC1213a
    public int g() {
        int i10;
        synchronized (this.f59002i) {
            try {
                if (this.f59003j == -1) {
                    for (GpsSatellite gpsSatellite : this.f59002i.getSatellites()) {
                        this.f59003j++;
                    }
                    this.f59003j++;
                }
                i10 = this.f59003j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    @Override // N0.AbstractC1213a
    public int h(int i10) {
        return Build.VERSION.SDK_INT < 24 ? q(i10).getPrn() : r(q(i10).getPrn());
    }

    public int hashCode() {
        return this.f59002i.hashCode();
    }

    @Override // N0.AbstractC1213a
    public boolean i(int i10) {
        return q(i10).hasAlmanac();
    }

    @Override // N0.AbstractC1213a
    public boolean j(int i10) {
        return false;
    }

    @Override // N0.AbstractC1213a
    public boolean k(int i10) {
        return false;
    }

    @Override // N0.AbstractC1213a
    public boolean l(int i10) {
        return q(i10).hasEphemeris();
    }

    @Override // N0.AbstractC1213a
    public boolean m(int i10) {
        return q(i10).usedInFix();
    }

    public final GpsSatellite q(int i10) {
        GpsSatellite gpsSatellite;
        synchronized (this.f59002i) {
            try {
                if (i10 < this.f59005l) {
                    this.f59004k = this.f59002i.getSatellites().iterator();
                    this.f59005l = -1;
                }
                while (true) {
                    int i11 = this.f59005l;
                    if (i11 >= i10) {
                        break;
                    }
                    this.f59005l = i11 + 1;
                    if (!this.f59004k.hasNext()) {
                        this.f59006m = null;
                        break;
                    }
                    this.f59006m = this.f59004k.next();
                }
                gpsSatellite = this.f59006m;
            } catch (Throwable th) {
                throw th;
            }
        }
        gpsSatellite.getClass();
        return gpsSatellite;
    }
}
