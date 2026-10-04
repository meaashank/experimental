package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1485b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f85452a = "ActionBarDrawerToggleHC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f85453b = {R.attr.homeAsUpIndicator};

    /* JADX INFO: renamed from: androidx.appcompat.app.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f85454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f85455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f85456c;

        public a(Activity activity) {
            try {
                this.f85454a = android.app.ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f85455b = android.app.ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(16908332);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f85456c = (ImageView) childAt;
                }
            }
        }
    }

    public static Drawable a(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(f85453b);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static a b(a aVar, Activity activity, int i10) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f85454a != null) {
            try {
                aVar.f85455b.invoke(activity.getActionBar(), Integer.valueOf(i10));
                return aVar;
            } catch (Exception e10) {
                Log.w(f85452a, "Couldn't set content description via JB-MR2 API", e10);
            }
        }
        return aVar;
    }

    public static a c(Activity activity, Drawable drawable, int i10) {
        a aVar = new a(activity);
        if (aVar.f85454a == null) {
            ImageView imageView = aVar.f85456c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return aVar;
            }
            Log.w(f85452a, "Couldn't set home-as-up indicator");
            return aVar;
        }
        try {
            android.app.ActionBar actionBar = activity.getActionBar();
            aVar.f85454a.invoke(actionBar, drawable);
            aVar.f85455b.invoke(actionBar, Integer.valueOf(i10));
            return aVar;
        } catch (Exception e10) {
            Log.w(f85452a, "Couldn't set home-as-up indicator via JB-MR2 API", e10);
            return aVar;
        }
    }
}
