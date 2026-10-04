package Z6;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f84346a = "asdf-".concat(b.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f84347b = "container_vpn_off";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f84348c = "container_vpn_on";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f84349d;

    public static synchronized boolean a() {
        Boolean boolF;
        Boolean bool = f84349d;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolF = f();
        } catch (Throwable unused) {
            boolF = null;
        }
        boolean zBooleanValue = boolF != null ? boolF.booleanValue() : false;
        f84349d = Boolean.valueOf(zBooleanValue);
        return zBooleanValue;
    }

    public static File b() {
        return new File(D9.d.j(), f84347b);
    }

    public static File c() {
        return new File(D9.d.j(), f84348c);
    }

    public static boolean d() {
        try {
            Boolean boolF = f();
            if (boolF != null) {
                return boolF.booleanValue();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean e(boolean z10) {
        File fileC = z10 ? c() : b();
        File fileB = z10 ? b() : c();
        try {
            if (fileB.isFile() && !fileB.delete()) {
                return false;
            }
            if (fileC.isFile()) {
                return true;
            }
            File parentFile = fileC.getParentFile();
            if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
                return false;
            }
            new FileOutputStream(fileC).close();
            return fileC.isFile();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Boolean f() {
        if (b().isFile()) {
            return Boolean.FALSE;
        }
        if (c().isFile()) {
            return Boolean.TRUE;
        }
        return null;
    }
}
