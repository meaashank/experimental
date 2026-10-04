package b;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Set<c> f120562a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile Context f120563b;

    public final void a(@NotNull c listener) {
        G.p(listener, "listener");
        Context context = this.f120563b;
        if (context != null) {
            listener.a(context);
        }
        this.f120562a.add(listener);
    }

    public final void b() {
        this.f120563b = null;
    }

    public final void c(@NotNull Context context) {
        G.p(context, "context");
        this.f120563b = context;
        Iterator<c> it = this.f120562a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    @Nullable
    public final Context d() {
        return this.f120563b;
    }

    public final void e(@NotNull c listener) {
        G.p(listener, "listener");
        this.f120562a.remove(listener);
    }
}
