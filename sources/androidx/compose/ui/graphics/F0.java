package androidx.compose.ui.graphics;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nCanvasUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,102:1\n26#2:103\n26#2:104\n*S KotlinDebug\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n*L\n54#1:103\n59#1:104\n*E\n"})
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final F0 f100681a = new F0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Method f100682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Method f100683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f100684d;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void a(@NotNull Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            I0.f100715a.a(canvas, z10);
            return;
        }
        if (!f100684d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f100682b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f100683c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f100682b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f100683c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f100682b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f100683c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f100684d = true;
        }
        if (z10) {
            try {
                Method method4 = f100682b;
                if (method4 != null) {
                    kotlin.jvm.internal.G.m(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f100683c) == null) {
            return;
        }
        kotlin.jvm.internal.G.m(method);
        method.invoke(canvas, null);
    }
}
