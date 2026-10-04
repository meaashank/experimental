package K2;

import K2.k;
import android.annotation.SuppressLint;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
@SuppressLint({"NewApi"})
public final class l implements Consumer<List<? extends SplitInfo>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final k.a f58350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f58351b;

    public l(@NotNull k.a callback, @NotNull h adapter) {
        G.p(callback, "callback");
        G.p(adapter, "adapter");
        this.f58350a = callback;
        this.f58351b = adapter;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(@NotNull List<? extends SplitInfo> splitInfoList) {
        G.p(splitInfoList, "splitInfoList");
        this.f58350a.a(this.f58351b.i(splitInfoList));
    }
}
