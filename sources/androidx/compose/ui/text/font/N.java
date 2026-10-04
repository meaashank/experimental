package androidx.compose.ui.text.font;

import android.content.Context;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(31)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final N f104575a = new N();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104576b = 0;

    @e.T(31)
    @InterfaceC4345t
    public final int a(@NotNull Context context) {
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }
}
