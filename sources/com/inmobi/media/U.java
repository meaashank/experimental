package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class U implements H9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3464a0 f152470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f152471b;

    public U(C3464a0 c3464a0, boolean z10) {
        this.f152470a = c3464a0;
        this.f152471b = z10;
    }

    @Override // com.inmobi.media.H9
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.f152470a.a("result pushed to queue");
        if (this.f152471b) {
            C3464a0 c3464a0 = this.f152470a;
            c3464a0.a("session end - cleanup");
            c3464a0.f152668g = null;
            c3464a0.f152667f.clear();
            c3464a0.f152664c.set(false);
            c3464a0.f152665d.set(false);
        }
    }

    @Override // com.inmobi.media.H9
    public final void onError(Exception exc) {
        this.f152470a.a(exc, "error in pushing to queue");
    }
}
