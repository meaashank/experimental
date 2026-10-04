package o8;

import com.prism.gaia.client.natives.NativeMirror;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: o8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5335a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f223354a = "ContainerVpn";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f223355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<Integer> f223356c = Collections.synchronizedSet(new HashSet());

    public static boolean a() {
        if (!Z6.b.a()) {
            return false;
        }
        Boolean bool = f223355b;
        if (bool == null) {
            Z6.k.b(f223354a);
            bool = true;
            f223355b = bool;
        }
        return bool.booleanValue();
    }

    public static boolean b(int i10) {
        return f223356c.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        com.prism.gaia.client.natives.NativeMirror.vpnSetLocalIp(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c() {
        /*
            boolean r0 = a()
            if (r0 != 0) goto L7
            goto Ld
        L7:
            int r0 = o8.C5339e.l()
            if (r0 > 0) goto Le
        Ld:
            return
        Le:
            int r1 = o8.j.i()
            v8.z r2 = v8.C5716z.a()     // Catch: java.lang.Throwable -> L3e
            android.os.Bundle r2 = r2.b()     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L1e
            r2 = 0
            goto L24
        L1e:
            java.lang.String r3 = "addresses"
            java.util.ArrayList r2 = r2.getStringArrayList(r3)     // Catch: java.lang.Throwable -> L3e
        L24:
            if (r2 == 0) goto L3e
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L3e
            r4 = 0
        L2b:
            if (r4 >= r3) goto L3e
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L3e
            int r4 = r4 + 1
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3e
            int r5 = e(r5)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L2b
            com.prism.gaia.client.natives.NativeMirror.vpnSetLocalIp(r5)     // Catch: java.lang.Throwable -> L3e
        L3e:
            r2 = 1
            com.prism.gaia.client.natives.NativeMirror.vpnSetIntercept(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.C5335a.c():void");
    }

    public static void d() {
        NativeMirror.vpnSetIntercept(false, 0, 0);
    }

    public static int e(String str) {
        if (str == null) {
            return 0;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = str.trim().split("\\.");
        if (strArrSplit.length != 4) {
            return 0;
        }
        try {
            int i10 = 0;
            for (String str2 : strArrSplit) {
                int i11 = Integer.parseInt(str2);
                if (i11 < 0 || i11 > 255) {
                    return 0;
                }
                i10 = (i10 << 8) | i11;
            }
            return i10;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static void f(int i10) {
        if (i10 >= 0) {
            f223356c.add(Integer.valueOf(i10));
        }
    }

    public static int g() {
        return C5339e.h();
    }
}
