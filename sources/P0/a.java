package P0;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.S;
import e.T;
import e.W;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f65531a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65532b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f65533c = 3;

    /* JADX INFO: renamed from: P0.a$a, reason: collision with other inner class name */
    @T(24)
    public static class C0094a {
        public static int a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    @Nullable
    @SuppressLint({"ReferencesDeprecated"})
    @W(s3.e.f238487b)
    public static NetworkInfo a(@NonNull ConnectivityManager connectivityManager, @NonNull Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(@NonNull ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0094a.a(connectivityManager);
        }
        return 3;
    }

    @S(expression = "cm.isActiveNetworkMetered()")
    @W(s3.e.f238487b)
    @Deprecated
    public static boolean c(@NonNull ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
