package C4;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import q8.C5443b;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f17545a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17546b = 0;

    @dd.o
    public static final int a(@NotNull Context context) {
        G.p(context, "context");
        Object systemService = context.getSystemService(C5443b.f226850e);
        G.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    @dd.o
    public static final int b(@NotNull Context context) {
        G.p(context, "context");
        Object systemService = context.getSystemService(C5443b.f226850e);
        G.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Point point = new Point();
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        return point.x;
    }
}
