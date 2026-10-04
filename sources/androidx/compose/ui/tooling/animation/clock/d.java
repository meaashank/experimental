package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import i0.b;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface d<T extends ComposeAnimation, TState extends i0.b> {
    void a(long j10);

    long b();

    @NotNull
    List<ComposeAnimatedProperty> c();

    void d(@NotNull TState tstate);

    @NotNull
    List<TransitionInfo> e(long j10);

    void f(@NotNull Object obj, @Nullable Object obj2);

    long g();

    @NotNull
    TState getState();

    @NotNull
    T h();
}
