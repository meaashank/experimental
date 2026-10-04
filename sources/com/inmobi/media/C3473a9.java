package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;
import t7.C5617a;

/* JADX INFO: renamed from: com.inmobi.media.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3473a9 implements InterfaceC3759v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f152704a;

    static {
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        f152704a = ((AdConfig) D4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getSkipNetworkValidationFeatureEnabled();
    }

    @Override // com.inmobi.media.InterfaceC3759v2
    public final void a(Config config) {
        kotlin.jvm.internal.G.p(config, "config");
        if (config instanceof AdConfig) {
            f152704a = ((AdConfig) config).getSkipNetworkValidationFeatureEnabled();
        }
    }

    public static J3 a(ConnectivityManager connectivityManager, boolean z10) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            networkCapabilities.toString();
            if (!networkCapabilities.hasCapability(12)) {
                return J3.f152110p;
            }
            if ((f152704a && !z10) || networkCapabilities.hasCapability(16)) {
                return null;
            }
            AdConfig.CustomNetworkValidation customNetworkValidation = S2.f152426a;
            if (!(customNetworkValidation != null ? customNetworkValidation.getEnabled() : false)) {
                return J3.f152110p;
            }
            S2.a(activeNetwork);
            if (S2.f152428c) {
                return null;
            }
            return J3.f152114t;
        }
        return J3.f152110p;
    }

    public static J3 a(boolean z10) {
        J3 j3A;
        Context contextD = C3657nb.d();
        if (contextD != null) {
            try {
                Object systemService = contextD.getSystemService(C5617a.f239212e);
                kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                j3A = a((ConnectivityManager) systemService, z10);
            } catch (Exception unused) {
                j3A = J3.f152112r;
            }
            if (j3A != null) {
                return j3A;
            }
            Context contextD2 = C3657nb.d();
            boolean zIsDeviceIdleMode = false;
            if (contextD2 != null) {
                try {
                    Object systemService2 = contextD2.getSystemService(Y7.a.f79330e);
                    PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                    if (powerManager != null) {
                        zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                    }
                } catch (Exception unused2) {
                }
            }
            if (zIsDeviceIdleMode) {
                return J3.f152109o;
            }
            return null;
        }
        return J3.f152108n;
    }

    public static String a(String delimiter, Map map) {
        String strEncode;
        String strEncode2;
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (sb2.length() > 0) {
                    sb2.append(delimiter);
                }
                Locale locale = Locale.US;
                try {
                    strEncode = URLEncoder.encode(str, "UTF-8");
                    kotlin.jvm.internal.G.o(strEncode, "encode(...)");
                } catch (UnsupportedEncodingException unused) {
                    strEncode = "";
                }
                try {
                    strEncode2 = URLEncoder.encode(str2, "UTF-8");
                    kotlin.jvm.internal.G.o(strEncode2, "encode(...)");
                } catch (UnsupportedEncodingException unused2) {
                    strEncode2 = "";
                }
                sb2.append(String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{strEncode, strEncode2}, 2)));
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    public static void a(Map map) {
        if (map != null) {
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    String str = (String) entry.getValue();
                    int length = str.length() - 1;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 <= length) {
                        boolean z11 = kotlin.jvm.internal.G.t(str.charAt(!z10 ? i10 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z11) {
                            i10++;
                        } else {
                            z10 = true;
                        }
                    }
                    if (str.subSequence(i10, length + 1).toString().length() > 0 && entry.getKey() != null) {
                        String str2 = (String) entry.getKey();
                        int length2 = str2.length() - 1;
                        int i11 = 0;
                        boolean z12 = false;
                        while (i11 <= length2) {
                            boolean z13 = kotlin.jvm.internal.G.t(str2.charAt(!z12 ? i11 : length2), 32) <= 0;
                            if (z12) {
                                if (!z13) {
                                    break;
                                } else {
                                    length2--;
                                }
                            } else if (z13) {
                                i11++;
                            } else {
                                z12 = true;
                            }
                        }
                        if (str2.subSequence(i11, length2 + 1).toString().length() > 0) {
                            String str3 = (String) entry.getKey();
                            int length3 = str3.length() - 1;
                            int i12 = 0;
                            boolean z14 = false;
                            while (i12 <= length3) {
                                boolean z15 = kotlin.jvm.internal.G.t(str3.charAt(!z14 ? i12 : length3), 32) <= 0;
                                if (z14) {
                                    if (!z15) {
                                        break;
                                    } else {
                                        length3--;
                                    }
                                } else if (z15) {
                                    i12++;
                                } else {
                                    z14 = true;
                                }
                            }
                            String strA = R6.a(length3, 1, str3, i12);
                            String str4 = (String) entry.getValue();
                            int length4 = str4.length() - 1;
                            int i13 = 0;
                            boolean z16 = false;
                            while (i13 <= length4) {
                                boolean z17 = kotlin.jvm.internal.G.t(str4.charAt(!z16 ? i13 : length4), 32) <= 0;
                                if (z16) {
                                    if (!z17) {
                                        break;
                                    } else {
                                        length4--;
                                    }
                                } else if (z17) {
                                    i13++;
                                } else {
                                    z16 = true;
                                }
                            }
                            map2.put(strA, R6.a(length4, 1, str4, i13));
                        }
                    }
                }
            }
            map.clear();
            map.putAll(map2);
        }
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    kotlin.jvm.internal.G.m(next);
                    String string = jSONObject.getString(next);
                    kotlin.jvm.internal.G.o(string, "getString(...)");
                    map.put(next, string);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    public static String a(String url, HashMap map) {
        kotlin.jvm.internal.G.p(url, "url");
        if (map == null || map.isEmpty()) {
            return url;
        }
        String strB2 = url;
        for (Map.Entry entry : map.entrySet()) {
            strB2 = kotlin.text.F.B2(strB2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strB2;
    }

    public static byte[] a(byte[] compressedData) {
        GZIPInputStream gZIPInputStream;
        kotlin.jvm.internal.G.p(compressedData, "compressedData");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressedData);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            compressedData = a((InputStream) gZIPInputStream);
        } catch (IOException e11) {
            e = e11;
            gZIPInputStream2 = gZIPInputStream;
            AbstractC3666o6.a((byte) 2, "a9", "Failed to decompress response", e);
            gZIPInputStream = gZIPInputStream2;
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream2 = gZIPInputStream;
            a((Closeable) byteArrayInputStream);
            a((Closeable) gZIPInputStream2);
            throw th;
        }
        a((Closeable) byteArrayInputStream);
        a((Closeable) gZIPInputStream);
        return compressedData;
    }

    public static byte[] a(InputStream input) {
        kotlin.jvm.internal.G.p(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i10 = input.read(bArr);
                if (-1 != i10) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.jvm.internal.G.m(byteArray);
                    a(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (Throwable th) {
                a(byteArrayOutputStream);
                throw th;
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (httpURLConnection != null) {
            try {
                inputStream = httpURLConnection.getInputStream();
            } catch (Error | Exception unused) {
                return;
            }
        } else {
            inputStream = null;
        }
        a((Closeable) inputStream);
        a((Closeable) (httpURLConnection != null ? httpURLConnection.getErrorStream() : null));
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException | Error | Exception unused) {
            }
        }
    }
}
