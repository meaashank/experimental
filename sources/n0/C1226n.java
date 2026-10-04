package N0;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: N0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(24)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C1226n extends AbstractC1213a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GnssStatus f58990i;

    /* JADX INFO: renamed from: N0.n$a */
    @e.T(26)
    public static class a {
        public static float a(GnssStatus gnssStatus, int i10) {
            return gnssStatus.getCarrierFrequencyHz(i10);
        }

        public static boolean b(GnssStatus gnssStatus, int i10) {
            return gnssStatus.hasCarrierFrequencyHz(i10);
        }
    }

    /* JADX INFO: renamed from: N0.n$b */
    @e.T(30)
    public static class b {
        public static float a(GnssStatus gnssStatus, int i10) {
            return gnssStatus.getBasebandCn0DbHz(i10);
        }

        public static boolean b(GnssStatus gnssStatus, int i10) {
            return gnssStatus.hasBasebandCn0DbHz(i10);
        }
    }

    public C1226n(Object obj) {
        GnssStatus gnssStatusA = C1217e.a(obj);
        gnssStatusA.getClass();
        this.f58990i = C1217e.a(gnssStatusA);
    }

    @Override // N0.AbstractC1213a
    public float a(int i10) {
        return this.f58990i.getAzimuthDegrees(i10);
    }

    @Override // N0.AbstractC1213a
    public float b(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.a(this.f58990i, i10);
        }
        throw new UnsupportedOperationException();
    }

    @Override // N0.AbstractC1213a
    public float c(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(this.f58990i, i10);
        }
        throw new UnsupportedOperationException();
    }

    @Override // N0.AbstractC1213a
    public float d(int i10) {
        return this.f58990i.getCn0DbHz(i10);
    }

    @Override // N0.AbstractC1213a
    public int e(int i10) {
        return this.f58990i.getConstellationType(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1226n) {
            return this.f58990i.equals(((C1226n) obj).f58990i);
        }
        return false;
    }

    @Override // N0.AbstractC1213a
    public float f(int i10) {
        return this.f58990i.getElevationDegrees(i10);
    }

    @Override // N0.AbstractC1213a
    public int g() {
        return this.f58990i.getSatelliteCount();
    }

    @Override // N0.AbstractC1213a
    public int h(int i10) {
        return this.f58990i.getSvid(i10);
    }

    public int hashCode() {
        return this.f58990i.hashCode();
    }

    @Override // N0.AbstractC1213a
    public boolean i(int i10) {
        return this.f58990i.hasAlmanacData(i10);
    }

    @Override // N0.AbstractC1213a
    public boolean j(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.b(this.f58990i, i10);
        }
        return false;
    }

    @Override // N0.AbstractC1213a
    public boolean k(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(this.f58990i, i10);
        }
        return false;
    }

    @Override // N0.AbstractC1213a
    public boolean l(int i10) {
        return this.f58990i.hasEphemerisData(i10);
    }

    @Override // N0.AbstractC1213a
    public boolean m(int i10) {
        return this.f58990i.usedInFix(i10);
    }
}
