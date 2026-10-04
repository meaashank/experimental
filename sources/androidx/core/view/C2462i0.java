package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: androidx.core.view.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2462i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111913b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111914c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f111915d = 1001;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f111916e = 1002;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f111917f = 1003;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f111918g = 1004;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f111919h = 1006;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f111920i = 1007;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f111921j = 1008;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f111922k = 1009;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f111923l = 1010;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f111924m = 1011;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f111925n = 1012;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f111926o = 1013;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f111927p = 1014;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f111928q = 1015;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f111929r = 1016;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f111930s = 1017;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f111931t = 1018;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f111932u = 1019;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f111933v = 1020;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f111934w = 1021;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f111935x = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointerIcon f111936a;

    /* JADX INFO: renamed from: androidx.core.view.i0$a */
    @e.T(24)
    public static class a {
        public static PointerIcon a(Bitmap bitmap, float f10, float f11) {
            return PointerIcon.create(bitmap, f10, f11);
        }

        public static PointerIcon b(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }

        public static PointerIcon c(Resources resources, int i10) {
            return PointerIcon.load(resources, i10);
        }
    }

    public C2462i0(PointerIcon pointerIcon) {
        this.f111936a = pointerIcon;
    }

    @NonNull
    public static C2462i0 a(@NonNull Bitmap bitmap, float f10, float f11) {
        return Build.VERSION.SDK_INT >= 24 ? new C2462i0(a.a(bitmap, f10, f11)) : new C2462i0(null);
    }

    @NonNull
    public static C2462i0 c(@NonNull Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new C2462i0(a.b(context, i10)) : new C2462i0(null);
    }

    @NonNull
    public static C2462i0 d(@NonNull Resources resources, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new C2462i0(a.c(resources, i10)) : new C2462i0(null);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Object b() {
        return this.f111936a;
    }
}
