package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k7.C4830a;

/* JADX INFO: renamed from: androidx.core.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2388k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f111050a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111051b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111052c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f111053d = 3;

    /* JADX INFO: renamed from: androidx.core.app.k$a */
    @e.T(23)
    public static class a {
        public static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        public static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        public static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.k$b */
    @e.T(29)
    public static class b {
        public static int a(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i10, @NonNull String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        @NonNull
        public static String b(@NonNull Context context) {
            return context.getOpPackageName();
        }

        @Nullable
        public static AppOpsManager c(@NonNull Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(@NonNull Context context, int i10, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return e(context, str, str2);
        }
        AppOpsManager appOpsManagerC = b.c(context);
        int iA = b.a(appOpsManagerC, str, Binder.getCallingUid(), str2);
        return iA != 0 ? iA : b.a(appOpsManagerC, str, i10, b.b(context));
    }

    public static int b(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2) {
        return ((AppOpsManager) context.getSystemService(C4830a.f217334e)).noteOp(str, i10, str2);
    }

    public static int c(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2) {
        return ((AppOpsManager) context.getSystemService(C4830a.f217334e)).noteOpNoThrow(str, i10, str2);
    }

    public static int d(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }

    public static int e(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    @Nullable
    public static String f(@NonNull String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
