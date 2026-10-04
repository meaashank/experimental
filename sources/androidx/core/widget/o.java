package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import e.S;
import e.T;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f112151a = "PopupWindowCompatApi21";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f112152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f112153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f112154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f112155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f112156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f112157g;

    @T(23)
    public static class a {
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        public static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static boolean a(@NonNull PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(@NonNull PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(@NonNull PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    public static void d(@NonNull PopupWindow popupWindow, int i10) {
        popupWindow.setWindowLayoutType(i10);
    }

    @S(expression = "popup.showAsDropDown(anchor, xoff, yoff, gravity)")
    @Deprecated
    public static void e(@NonNull PopupWindow popupWindow, @NonNull View view, int i10, int i11, int i12) {
        popupWindow.showAsDropDown(view, i10, i11, i12);
    }
}
