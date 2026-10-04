package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2598k implements InterfaceC2611y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC2597j f114348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final InterfaceC2611y f114349b;

    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114350a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f114350a = iArr;
        }
    }

    public C2598k(@NotNull InterfaceC2597j defaultLifecycleObserver, @Nullable InterfaceC2611y interfaceC2611y) {
        kotlin.jvm.internal.G.p(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f114348a = defaultLifecycleObserver;
        this.f114349b = interfaceC2611y;
    }

    @Override // androidx.lifecycle.InterfaceC2611y
    public void onStateChanged(@NotNull B source, @NotNull Lifecycle.Event event) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(event, "event");
        switch (a.f114350a[event.ordinal()]) {
            case 1:
                this.f114348a.l(source);
                break;
            case 2:
                this.f114348a.onStart(source);
                break;
            case 3:
                this.f114348a.g(source);
                break;
            case 4:
                this.f114348a.k(source);
                break;
            case 5:
                this.f114348a.onStop(source);
                break;
            case 6:
                this.f114348a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC2611y interfaceC2611y = this.f114349b;
        if (interfaceC2611y != null) {
            interfaceC2611y.onStateChanged(source, event);
        }
    }
}
