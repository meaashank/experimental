package androidx.compose.ui.graphics.layer;

import android.view.View;
import androidx.compose.ui.graphics.Q2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(31)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f0 f101345a = new f0();

    public final void a(@NotNull View view, @Nullable Q2 q22) {
        view.setRenderEffect(q22 != null ? q22.a() : null);
    }
}
