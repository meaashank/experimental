package androidx.window.core;

import android.util.Log;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f120065a = new a();

    @Override // androidx.window.core.f
    public void a(@NotNull String tag, @NotNull String message) {
        G.p(tag, "tag");
        G.p(message, "message");
        Log.d(tag, message);
    }
}
