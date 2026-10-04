package p8;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import c7.AbstractC2950b;
import c7.C;
import c7.m;
import c7.n;
import c7.x;
import com.prism.commons.utils.C3838b;
import com.prism.commons.utils.C3853q;
import com.prism.gaia.helper.utils.y;
import com.prism.gaia.naked.compat.android.net.wifi.WifiInfoCompat2;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: p8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5398b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: p8.b$a */
    public final class a extends m {
        @Override // c7.m
        public String A() {
            return "getConnectionInfo";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            WifiInfo wifiInfo = (WifiInfo) method.invoke(obj, objArr);
            if (wifiInfo != null) {
                WifiInfoCompat2.Util.setMacAddress(wifiInfo, C3853q.f162131e);
            }
            return wifiInfo;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: p8.b$b, reason: collision with other inner class name */
    public final class C0861b extends C {
        public C0861b() {
            super("getScanResults");
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: p8.b$c */
    public static class c extends m {
        public c() {
        }

        @Override // c7.m
        public String A() {
            return "getWifiApConfiguration";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            WifiConfiguration wifiConfiguration = new WifiConfiguration();
            wifiConfiguration.SSID = "SSID_FUCK_GMS_NULL_POINTER";
            wifiConfiguration.BSSID = "BSSID_FUCK_GMS_NULL_POINTER";
            return wifiConfiguration;
        }

        public c(p8.c cVar) {
        }
    }

    /* JADX INFO: renamed from: p8.b$d */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public NetworkInterface f226373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InetAddress f226374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f226375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f226376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f226377e;
    }

    /* JADX INFO: renamed from: p8.b$e */
    public class e extends n {
        public e(String str) {
            super(str);
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            int iJ = C3838b.j(objArr, WorkSource.class);
            if (iJ >= 0) {
                objArr[iJ] = null;
            }
            return method.invoke(obj, objArr);
        }
    }

    public C5398b(IInterface iInterface) {
        super(iInterface);
    }

    public static int s(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 |= (address[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public static ScanResult t(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ScanResult scanResult = (ScanResult) new y(parcelable).k("CREATOR").f("createFromParcel", parcelObtain).f165228a;
        parcelObtain.recycle();
        return scanResult;
    }

    public static d u() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = list.get(i10);
                i10++;
                NetworkInterface networkInterface = (NetworkInterface) obj;
                ArrayList list2 = Collections.list(networkInterface.getInetAddresses());
                int size2 = list2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = list2.get(i11);
                    i11++;
                    InetAddress inetAddress = (InetAddress) obj2;
                    if (!inetAddress.isLoopbackAddress()) {
                        String upperCase = inetAddress.getHostAddress().toUpperCase();
                        if (v(upperCase)) {
                            d dVar = new d();
                            dVar.f226374b = inetAddress;
                            dVar.f226373a = networkInterface;
                            dVar.f226375c = upperCase;
                            dVar.f226376d = s(inetAddress);
                            dVar.f226377e = w(networkInterface.getInterfaceAddresses().get(0).getNetworkPrefixLength());
                            return dVar;
                        }
                    }
                }
            }
            return null;
        } catch (SocketException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static boolean v(String str) {
        return Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$").matcher(str).matches();
    }

    public static int w(int i10) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < i10) {
            i12 |= i13;
            i11++;
            i13 <<= 1;
        }
        return i12;
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new c());
        f(new a());
        g(new x());
    }
}
