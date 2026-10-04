package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.C2591d;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class W implements InterfaceC2611y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f114145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2591d.a f114146b;

    public W(Object obj) {
        this.f114145a = obj;
        this.f114146b = C2591d.f114307c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC2611y
    public void onStateChanged(@NonNull B b10, @NonNull Lifecycle.Event event) {
        this.f114146b.a(b10, event, this.f114145a);
    }
}
