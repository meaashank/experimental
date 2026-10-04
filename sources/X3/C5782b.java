package x3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.f0;
import g3.InterfaceC4444b;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: x3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5782b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f240483a = "AppVersionSignature";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap<String, InterfaceC4444b> f240484b = new ConcurrentHashMap();

    @Nullable
    public static PackageInfo a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f240483a, "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    @NonNull
    public static String b(@Nullable PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @NonNull
    public static InterfaceC4444b c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, InterfaceC4444b> concurrentMap = f240484b;
        InterfaceC4444b interfaceC4444b = concurrentMap.get(packageName);
        if (interfaceC4444b != null) {
            return interfaceC4444b;
        }
        InterfaceC4444b interfaceC4444bD = d(context);
        InterfaceC4444b interfaceC4444bPutIfAbsent = concurrentMap.putIfAbsent(packageName, interfaceC4444bD);
        return interfaceC4444bPutIfAbsent == null ? interfaceC4444bD : interfaceC4444bPutIfAbsent;
    }

    @NonNull
    public static InterfaceC4444b d(@NonNull Context context) {
        return new C5785e(b(a(context)));
    }

    @f0
    public static void e() {
        f240484b.clear();
    }
}
