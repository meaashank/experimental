package androidx.databinding;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static k f112279a = new DataBinderMapperImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static DataBindingComponent f112280b = null;

    @Nullable
    public static <T extends B> T a(@NonNull View view) {
        return (T) b(view, f112280b);
    }

    @Nullable
    public static <T extends B> T b(@NonNull View view, DataBindingComponent dataBindingComponent) {
        T t10 = (T) B.s(view);
        if (t10 != null) {
            return t10;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int iE = f112279a.e((String) tag);
        if (iE != 0) {
            return (T) f112279a.c(dataBindingComponent, view, iE);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    public static <T extends B> T c(DataBindingComponent dataBindingComponent, View view, int i10) {
        return (T) f112279a.c(dataBindingComponent, view, i10);
    }

    public static <T extends B> T d(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        return (T) f112279a.d(dataBindingComponent, viewArr, i10);
    }

    public static <T extends B> T e(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return (T) f112279a.c(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return (T) f112279a.d(dataBindingComponent, viewArr, i11);
    }

    @Nullable
    public static String f(int i10) {
        return f112279a.b(i10);
    }

    @Nullable
    public static <T extends B> T g(@NonNull View view) {
        while (view != null) {
            T t10 = (T) B.s(view);
            if (t10 != null) {
                return t10;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char cCharAt = str.charAt(6);
                    int iIndexOf = str.indexOf(47, 7);
                    if (cCharAt == '/') {
                        if (iIndexOf == -1) {
                            return null;
                        }
                    } else if (cCharAt == '-' && iIndexOf != -1 && str.indexOf(47, iIndexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @Nullable
    public static <T extends B> T h(@NonNull View view) {
        return (T) B.s(view);
    }

    @Nullable
    public static DataBindingComponent i() {
        return f112280b;
    }

    public static <T extends B> T j(@NonNull LayoutInflater layoutInflater, int i10, @Nullable ViewGroup viewGroup, boolean z10) {
        return (T) k(layoutInflater, i10, viewGroup, z10, f112280b);
    }

    public static <T extends B> T k(@NonNull LayoutInflater layoutInflater, int i10, @Nullable ViewGroup viewGroup, boolean z10, @Nullable DataBindingComponent dataBindingComponent) {
        boolean z11 = viewGroup != null && z10;
        return z11 ? (T) e(dataBindingComponent, viewGroup, z11 ? viewGroup.getChildCount() : 0, i10) : (T) f112279a.c(dataBindingComponent, layoutInflater.inflate(i10, viewGroup, z10), i10);
    }

    public static <T extends B> T l(@NonNull Activity activity, int i10) {
        return (T) m(activity, i10, f112280b);
    }

    public static <T extends B> T m(@NonNull Activity activity, int i10, @Nullable DataBindingComponent dataBindingComponent) {
        activity.setContentView(i10);
        return (T) e(dataBindingComponent, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i10);
    }

    public static void n(@Nullable DataBindingComponent dataBindingComponent) {
        f112280b = dataBindingComponent;
    }
}
