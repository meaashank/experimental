package u6;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.prism.commons.utils.C3860y;

/* JADX INFO: renamed from: u6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5647a {
    public static String a(PackageManager packageManager, String str) {
        try {
            Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                return C3860y.l(signatureArr[0].toByteArray());
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
