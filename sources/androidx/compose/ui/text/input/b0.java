package androidx.compose.ui.text.input;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Choreographer f104786a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c0.e(this.f104786a, runnable);
    }
}
