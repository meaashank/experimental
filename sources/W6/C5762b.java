package w6;

/* JADX INFO: renamed from: w6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5762b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f240110a = false;

    public void a(InterfaceC5761a interfaceC5761a) {
        if (this.f240110a) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f240110a) {
                    if (interfaceC5761a != null) {
                        interfaceC5761a.a();
                    }
                    this.f240110a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
