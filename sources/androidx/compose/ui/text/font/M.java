package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final M f104573a = new M();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104574b = 0;

    public final int a(@NotNull Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return N.f104575a.a(context);
        }
        return 0;
    }
}
