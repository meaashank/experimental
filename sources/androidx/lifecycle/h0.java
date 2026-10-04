package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final D f114341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Handler f114342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f114343c;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final D f114344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Lifecycle.Event f114345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f114346c;

        public a(@NotNull D registry, @NotNull Lifecycle.Event event) {
            kotlin.jvm.internal.G.p(registry, "registry");
            kotlin.jvm.internal.G.p(event, "event");
            this.f114344a = registry;
            this.f114345b = event;
        }

        @NotNull
        public final Lifecycle.Event a() {
            return this.f114345b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f114346c) {
                return;
            }
            this.f114344a.o(this.f114345b);
            this.f114346c = true;
        }
    }

    public h0(@NotNull B provider) {
        kotlin.jvm.internal.G.p(provider, "provider");
        this.f114341a = new D(provider);
        this.f114342b = new Handler();
    }

    @NotNull
    public Lifecycle a() {
        return this.f114341a;
    }

    public void b() {
        f(Lifecycle.Event.ON_START);
    }

    public void c() {
        f(Lifecycle.Event.ON_CREATE);
    }

    public void d() {
        f(Lifecycle.Event.ON_STOP);
        f(Lifecycle.Event.ON_DESTROY);
    }

    public void e() {
        f(Lifecycle.Event.ON_START);
    }

    public final void f(Lifecycle.Event event) {
        a aVar = this.f114343c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f114341a, event);
        this.f114343c = aVar2;
        this.f114342b.postAtFrontOfQueue(aVar2);
    }
}
