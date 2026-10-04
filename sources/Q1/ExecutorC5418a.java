package q1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: q1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC5418a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f226699a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f226699a.post(runnable);
    }
}
