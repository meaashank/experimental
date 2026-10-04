package com.pgl.ssdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.mbridge.msdk.MBridgeConstans;
import java.net.Inet6Address;
import java.net.InetAddress;
import org.json.JSONArray;
import p8.C5397a;
import t7.C5617a;

/* JADX INFO: loaded from: classes5.dex */
public class f0 {
    private static void a(LinkProperties linkProperties, JSONArray jSONArray) {
        for (InetAddress inetAddress : linkProperties.getDnsServers()) {
            if (inetAddress != null) {
                jSONArray.put(inetAddress.getHostAddress());
            }
        }
    }

    private static void b(LinkProperties linkProperties, JSONArray jSONArray) {
        InetAddress gateway;
        for (RouteInfo routeInfo : linkProperties.getRoutes()) {
            if (routeInfo != null && routeInfo.isDefaultRoute() && (gateway = routeInfo.getGateway()) != null && (!(gateway instanceof Inet6Address) || !"::".equals(gateway.getHostAddress()))) {
                jSONArray.put(gateway.getHostAddress());
            }
        }
    }

    private static void c(LinkProperties linkProperties, JSONArray jSONArray) {
        for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
            if (linkAddress != null && linkAddress.getAddress() != null && !linkAddress.getAddress().isLoopbackAddress()) {
                jSONArray.put(linkAddress.getAddress().getHostAddress());
            }
        }
    }

    public static String[] a(Context context) {
        Network[] allNetworks;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        int type;
        String[] strArr = new String[5];
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(C5617a.f239212e);
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            JSONArray jSONArray5 = new JSONArray();
            for (Network network : allNetworks) {
                if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getState() == NetworkInfo.State.CONNECTED && (linkProperties = connectivityManager.getLinkProperties(network)) != null && ((type = networkInfo.getType()) == 0 || type == 1)) {
                    a(linkProperties, jSONArray5);
                    if (type == 0) {
                        c(linkProperties, jSONArray);
                        b(linkProperties, jSONArray2);
                    } else {
                        c(linkProperties, jSONArray3);
                        b(linkProperties, jSONArray4);
                    }
                }
            }
            strArr[0] = jSONArray3.toString();
            strArr[1] = jSONArray4.toString();
            strArr[2] = jSONArray.toString();
            strArr[3] = jSONArray2.toString();
            strArr[4] = jSONArray5.toString();
        }
        return strArr;
    }

    public static String b(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(C5397a.f226370e);
        String str = (wifiManager == null || !wifiManager.isWifiEnabled()) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1";
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(str);
            sbA.append(telephonyManager.getSimState() != 5 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
            return sbA.toString();
        }
        return androidx.compose.runtime.changelist.j.a(str, MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }
}
