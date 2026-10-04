package I2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: I2.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1204u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<AbstractC1204u0> f51034c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e.f0
    public static final String f51035d = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ boolean f51036e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51038b;

    /* JADX INFO: renamed from: I2.u0$a */
    public static class a extends AbstractC1204u0 {
        public a(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1204u0
        public final boolean e() {
            return false;
        }
    }

    /* JADX INFO: renamed from: I2.u0$b */
    public static class b extends AbstractC1204u0 {
        public b(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1204u0
        public final boolean e() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public AbstractC1204u0(@NonNull String str, @NonNull String str2) {
        this.f51037a = str;
        this.f51038b = str2;
        f51034c.add(this);
    }

    @Nullable
    public static Bundle a(@NonNull Context context) {
        PackageInfo packageInfoG = H2.t.g(context);
        if (packageInfoG == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(packageInfoG.packageName, f51035d);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            try {
                return context.getPackageManager().getServiceInfo(componentName, PackageManager.ComponentInfoFlags.of(640L)).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        try {
            return c(context, componentName, i10 >= 24 ? 640 : 128).metaData;
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    public static ServiceInfo c(@NonNull Context context, ComponentName componentName, int i10) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(componentName, i10);
    }

    @NonNull
    public static Set<AbstractC1204u0> g() {
        return Collections.unmodifiableSet(f51034c);
    }

    @NonNull
    public String b() {
        return this.f51037a;
    }

    public boolean d(@NonNull Context context) {
        return e() || f(context);
    }

    public abstract boolean e();

    public boolean f(@NonNull Context context) {
        Bundle bundleA = a(context);
        if (bundleA == null) {
            return false;
        }
        return bundleA.containsKey(this.f51038b);
    }
}
