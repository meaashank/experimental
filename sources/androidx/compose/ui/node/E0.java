package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import ed.InterfaceC4376a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n48#2:93\n49#2,4:103\n116#3,2:94\n33#3,6:96\n118#3:102\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n39#1:93\n39#1:103,4\n39#1:94,2\n39#1:96,6\n39#1:102\n*E\n"})
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f102714a = 524571850;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final <T extends D0> T a(@NotNull View view, int i10, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        D0 d02;
        V vB = b(view);
        List<D0> list = vB.f103022b;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                d02 = null;
                break;
            }
            d02 = list.get(i11);
            if (d02.getId() == i10) {
                break;
            }
            i11++;
        }
        T t10 = d02 instanceof D0 ? (T) d02 : null;
        if (t10 != null) {
            return t10;
        }
        T tInvoke = interfaceC4376a.invoke();
        vB.f103022b.add(tInvoke);
        return tInvoke;
    }

    @NotNull
    public static final V b(@NotNull View view) {
        int i10 = f102714a;
        Object tag = view.getTag(i10);
        V v10 = tag instanceof V ? (V) tag : null;
        if (v10 != null) {
            return v10;
        }
        V v11 = new V();
        view.setTag(i10, v11);
        return v11;
    }

    @Nullable
    public static final V c(@NotNull View view) {
        Object tag = view.getTag(f102714a);
        if (tag instanceof V) {
            return (V) tag;
        }
        return null;
    }

    public static final int d(@NotNull String str) {
        return str.hashCode() | 50331648;
    }
}
