package androidx.core.app;

import B0.C0920d;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.C2379b;
import androidx.core.app.X;
import androidx.core.view.C2506z;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.core.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2379b extends C0920d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static j f111013a;

    /* JADX INFO: renamed from: androidx.core.app.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f111014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f111015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f111016c;

        public a(String[] strArr, Activity activity, int i10) {
            this.f111014a = strArr;
            this.f111015b = activity;
            this.f111016c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f111014a.length];
            PackageManager packageManager = this.f111015b.getPackageManager();
            String packageName = this.f111015b.getPackageName();
            int length = this.f111014a.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f111014a[i10], packageName);
            }
            ((i) this.f111015b).onRequestPermissionsResult(this.f111016c, this.f111014a, iArr);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    @e.T(21)
    public static class C0276b {
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$c */
    @e.T(22)
    public static class c {
        public static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$d */
    @e.T(23)
    public static class d {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$e */
    @e.T(28)
    public static class e {
        public static <T> T a(Activity activity, int i10) {
            return (T) activity.requireViewById(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$f */
    @e.T(30)
    public static class f {
        public static Display a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        public static void b(@NonNull Activity activity, @Nullable B0.A a10, @Nullable Bundle bundle) {
            activity.setLocusContext(a10 == null ? null : a10.f12249b, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$g */
    @e.T(31)
    public static class g {
        public static boolean a(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$h */
    @e.T(32)
    public static class h {
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$i */
    public interface i {
        void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    /* JADX INFO: renamed from: androidx.core.app.b$j */
    public interface j {
        boolean a(@NonNull Activity activity, @e.D(from = 0) int i10, int i11, @Nullable Intent intent);

        boolean b(@NonNull Activity activity, @NonNull String[] strArr, @e.D(from = 0) int i10);
    }

    /* JADX INFO: renamed from: androidx.core.app.b$k */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface k {
        void validateRequestPermissionsRequestCode(int i10);
    }

    /* JADX INFO: renamed from: androidx.core.app.b$l */
    @e.T(21)
    public static class l extends SharedElementCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X f111017a;

        public l(X x10) {
            this.f111017a = x10;
        }

        public static void a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            onSharedElementsReadyListener.onSharedElementsReady();
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f111017a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f111017a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f111017a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f111017a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f111017a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f111017a.getClass();
        }

        @Override // android.app.SharedElementCallback
        @e.T(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f111017a.h(list, list2, new X.a() { // from class: androidx.core.app.c
                @Override // androidx.core.app.X.a
                public final void onSharedElementsReady() {
                    C2379b.l.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    public static /* synthetic */ void b(Activity activity) {
        if (activity.isFinishing() || C2383f.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void c(@NonNull Activity activity) {
        activity.finishAffinity();
    }

    public static void d(@NonNull Activity activity) {
        activity.finishAfterTransition();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static j e() {
        return f111013a;
    }

    @Nullable
    public static Uri f(@NonNull Activity activity) {
        return activity.getReferrer();
    }

    @Deprecated
    public static boolean g(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean h(@NonNull Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 ? g.a(activity) : i10 == 30 ? (f.a(activity) == null || f.a(activity).getDisplayId() == 0) ? false : true : (i10 != 29 || activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
    }

    public static void i(@NonNull Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void j(@NonNull final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    C2379b.b(activity);
                }
            });
        }
    }

    @Nullable
    public static C2506z k(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        return C2506z.b(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(@NonNull Activity activity, @NonNull String[] strArr, @e.D(from = 0) int i10) {
        j jVar = f111013a;
        if (jVar == null || !jVar.b(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (TextUtils.isEmpty(strArr[i11])) {
                    throw new IllegalArgumentException(android.support.v4.media.e.a(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            }
            if (activity instanceof k) {
                ((k) activity).validateRequestPermissionsRequestCode(i10);
            }
            activity.requestPermissions(strArr, i10);
        }
    }

    @NonNull
    public static <T extends View> T m(@NonNull Activity activity, @e.C int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) e.a(activity, i10);
        }
        T t10 = (T) activity.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void n(@NonNull Activity activity, @Nullable X x10) {
        activity.setEnterSharedElementCallback(x10 != null ? new l(x10) : null);
    }

    public static void o(@NonNull Activity activity, @Nullable X x10) {
        activity.setExitSharedElementCallback(x10 != null ? new l(x10) : null);
    }

    public static void p(@NonNull Activity activity, @Nullable B0.A a10, @Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            f.b(activity, a10, bundle);
        }
    }

    public static void q(@Nullable j jVar) {
        f111013a = jVar;
    }

    public static boolean r(@NonNull Activity activity, @NonNull String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i10 >= 32 ? activity.shouldShowRequestPermissionRationale(str) : i10 == 31 ? g.b(activity, str) : activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void s(@NonNull Activity activity, @NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    public static void t(@NonNull Activity activity, @NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public static void u(@NonNull Activity activity) {
        activity.startPostponedEnterTransition();
    }
}
