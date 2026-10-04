package Jb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import t7.C5617a;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nAndroidExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExtentions.kt\ncom/tonyodev/fetch2core/FetchAndroidExtensions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,32:1\n12574#2,2:33\n*S KotlinDebug\n*F\n+ 1 AndroidExtentions.kt\ncom/tonyodev/fetch2core/FetchAndroidExtensions\n*L\n29#1:33,2\n*E\n"})
@dd.j(name = "FetchAndroidExtensions")
public final class b {
    public static final boolean a(@NotNull Context context) {
        G.p(context, "<this>");
        Object systemService = context.getSystemService(C5617a.f239212e);
        G.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (z10) {
            return z10;
        }
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
        G.o(allNetworkInfo, "getAllNetworkInfo(...)");
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(@NotNull Context context) {
        G.p(context, "<this>");
        Object systemService = context.getSystemService(C5617a.f239212e);
        G.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return ((ConnectivityManager) systemService).isActiveNetworkMetered();
    }

    public static final boolean c(@NotNull Context context) {
        G.p(context, "<this>");
        Object systemService = context.getSystemService(C5617a.f239212e);
        G.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }
}
