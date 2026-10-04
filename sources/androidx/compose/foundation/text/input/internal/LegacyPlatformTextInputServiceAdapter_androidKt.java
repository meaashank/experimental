package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class LegacyPlatformTextInputServiceAdapter_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f93764a = "AndroidLegacyPlatformTextInputServiceAdapter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static ed.l<? super View, ? extends G0> f93765b = LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1.f93766a;

    @NotNull
    public static final K0 b() {
        return new AndroidLegacyPlatformTextInputServiceAdapter();
    }

    @NotNull
    public static final ed.l<View, G0> c() {
        return f93765b;
    }

    @e.f0
    public static /* synthetic */ void d() {
    }

    public static final void e(@NotNull ed.l<? super View, ? extends G0> lVar) {
        f93765b = lVar;
    }

    public static final void f(EditorInfo editorInfo) {
        if (androidx.emoji2.text.c.q()) {
            androidx.emoji2.text.c.c().G(editorInfo);
        }
    }
}
