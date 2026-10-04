package x4;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.compose.runtime.internal.r;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: x4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class C5786a implements io.reactivex.disposables.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f240490d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f240491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BroadcastReceiver f240492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f240493c;

    public C5786a(@NotNull Context context, @NotNull BroadcastReceiver broadcastReceiver) {
        G.p(context, "context");
        G.p(broadcastReceiver, "broadcastReceiver");
        this.f240491a = context;
        this.f240492b = broadcastReceiver;
        this.f240493c = new AtomicBoolean(false);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (this.f240493c.getAndSet(true)) {
            return;
        }
        this.f240491a.unregisterReceiver(this.f240492b);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f240493c.get();
    }
}
