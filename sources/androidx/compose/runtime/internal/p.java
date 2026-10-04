package androidx.compose.runtime.internal;

import androidx.compose.runtime.InterfaceC1935o;
import androidx.compose.runtime.InterfaceC1936o0;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.X1;
import java.util.HashMap;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,100:1\n361#2,7:101\n361#2,7:108\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n81#1:101,7\n92#1:108,7\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, L0<Object>> f99940a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f99941b;

    @InterfaceC1936o0
    public static final void a() {
        f99941b = true;
    }

    public static final boolean b() {
        return f99941b;
    }

    @InterfaceC1936o0
    @InterfaceC1935o
    public static /* synthetic */ void c() {
    }

    @InterfaceC1936o0
    @InterfaceC1935o
    @NotNull
    public static final <T> X1<T> d(@NotNull String str, T t10) {
        HashMap<String, L0<Object>> map = f99940a;
        L0<Object> l0G = map.get(str);
        if (l0G == null) {
            l0G = M1.g(t10, null, 2, null);
            map.put(str, l0G);
        }
        return l0G;
    }

    @InterfaceC1936o0
    public static final void e(@NotNull String str, @Nullable Object obj) {
        boolean z10;
        HashMap<String, L0<Object>> map = f99940a;
        L0<Object> l0G = map.get(str);
        if (l0G == null) {
            l0G = M1.g(obj, null, 2, null);
            map.put(str, l0G);
            z10 = false;
        } else {
            z10 = true;
        }
        L0<Object> l02 = l0G;
        if (z10) {
            l02.setValue(obj);
        }
    }
}
