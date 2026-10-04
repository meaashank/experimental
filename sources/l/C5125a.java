package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.RestrictTo;
import g.C4426a;

/* JADX INFO: renamed from: l.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C5125a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f220811a;

    public C5125a(Context context) {
        this.f220811a = context;
    }

    public static C5125a b(Context context) {
        return new C5125a(context);
    }

    public boolean a() {
        return this.f220811a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f220811a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f220811a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f220811a.getResources().getDimensionPixelSize(C4426a.e.f201129k);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f220811a.obtainStyledAttributes(null, C4426a.m.f201950a, C4426a.b.f200865f, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C4426a.m.f202072o, 0);
        Resources resources = this.f220811a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C4426a.e.f201127j));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f220811a.getResources().getBoolean(C4426a.c.f200978a);
    }

    public boolean h() {
        return true;
    }
}
