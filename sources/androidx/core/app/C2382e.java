package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: androidx.core.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2382e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f111019a = "android.activity.usage_time";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f111020b = "android.usage_time_packages";

    /* JADX INFO: renamed from: androidx.core.app.e$a */
    public static class a extends C2382e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ActivityOptions f111021c;

        public a(ActivityOptions activityOptions) {
            this.f111021c = activityOptions;
        }

        @Override // androidx.core.app.C2382e
        public Rect a() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return d.a(this.f111021c);
        }

        @Override // androidx.core.app.C2382e
        public void j(@NonNull PendingIntent pendingIntent) {
            this.f111021c.requestUsageTimeReport(pendingIntent);
        }

        @Override // androidx.core.app.C2382e
        @NonNull
        public C2382e k(@Nullable Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new a(d.b(this.f111021c, rect));
        }

        @Override // androidx.core.app.C2382e
        @NonNull
        public C2382e l(int i10) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                f.a(this.f111021c, i10);
                return this;
            }
            if (i11 >= 33) {
                C0277e.a(this.f111021c, i10 != 2);
            }
            return this;
        }

        @Override // androidx.core.app.C2382e
        @NonNull
        public C2382e m(boolean z10) {
            return Build.VERSION.SDK_INT < 34 ? this : new a(f.b(this.f111021c, z10));
        }

        @Override // androidx.core.app.C2382e
        public Bundle n() {
            return this.f111021c.toBundle();
        }

        @Override // androidx.core.app.C2382e
        public void o(@NonNull C2382e c2382e) {
            if (c2382e instanceof a) {
                this.f111021c.update(((a) c2382e).f111021c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.e$b */
    @e.T(21)
    public static class b {
        public static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        public static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        public static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.e$c */
    @e.T(23)
    public static class c {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        public static ActivityOptions b(View view, int i10, int i11, int i12, int i13) {
            return ActivityOptions.makeClipRevealAnimation(view, i10, i11, i12, i13);
        }

        public static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.e$d */
    @e.T(24)
    public static class d {
        public static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        public static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.e$e, reason: collision with other inner class name */
    @e.T(33)
    public static class C0277e {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setPendingIntentBackgroundActivityLaunchAllowed(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.e$f */
    @e.T(34)
    public static class f {
        public static ActivityOptions a(ActivityOptions activityOptions, int i10) {
            return activityOptions.setPendingIntentBackgroundActivityStartMode(i10);
        }

        public static ActivityOptions b(ActivityOptions activityOptions, boolean z10) {
            return activityOptions.setShareIdentityEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.e$g */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface g {
    }

    @NonNull
    public static C2382e b() {
        return new a(ActivityOptions.makeBasic());
    }

    @NonNull
    public static C2382e c(@NonNull View view, int i10, int i11, int i12, int i13) {
        return new a(ActivityOptions.makeClipRevealAnimation(view, i10, i11, i12, i13));
    }

    @NonNull
    public static C2382e d(@NonNull Context context, int i10, int i11) {
        return new a(ActivityOptions.makeCustomAnimation(context, i10, i11));
    }

    @NonNull
    public static C2382e e(@NonNull View view, int i10, int i11, int i12, int i13) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, i10, i11, i12, i13));
    }

    @NonNull
    public static C2382e f(@NonNull Activity activity, @NonNull View view, @NonNull String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    @NonNull
    public static C2382e g(@NonNull Activity activity, @Nullable androidx.core.util.p<View, String>... pVarArr) {
        Pair[] pairArr;
        if (pVarArr != null) {
            pairArr = new Pair[pVarArr.length];
            for (int i10 = 0; i10 < pVarArr.length; i10++) {
                androidx.core.util.p<View, String> pVar = pVarArr[i10];
                pairArr[i10] = Pair.create(pVar.f111414a, pVar.f111415b);
            }
        } else {
            pairArr = null;
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    @NonNull
    public static C2382e h() {
        return new a(ActivityOptions.makeTaskLaunchBehind());
    }

    @NonNull
    public static C2382e i(@NonNull View view, @NonNull Bitmap bitmap, int i10, int i11) {
        return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i10, i11));
    }

    @Nullable
    public Rect a() {
        return null;
    }

    public void j(@NonNull PendingIntent pendingIntent) {
    }

    @NonNull
    public C2382e k(@Nullable Rect rect) {
        return this;
    }

    @NonNull
    public C2382e l(int i10) {
        return this;
    }

    @NonNull
    public C2382e m(boolean z10) {
        return this;
    }

    @Nullable
    public Bundle n() {
        return null;
    }

    public void o(@NonNull C2382e c2382e) {
    }
}
