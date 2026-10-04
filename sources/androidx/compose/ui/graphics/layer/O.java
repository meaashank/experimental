package androidx.compose.ui.graphics.layer;

import android.view.View;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final O f101274a = new O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Method f101275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f101276c;

    public final boolean a(@NotNull View view) {
        view.invalidateOutline();
        return true;
    }
}
