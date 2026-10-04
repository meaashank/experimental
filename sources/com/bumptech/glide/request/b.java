package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;
import e.InterfaceC4326A;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements RequestCoordinator, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f140059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f140060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f140061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile e f140062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InterfaceC4326A("requestLock")
    public RequestCoordinator.RequestState f140063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InterfaceC4326A("requestLock")
    public RequestCoordinator.RequestState f140064f;

    public b(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f140063e = requestState;
        this.f140064f = requestState;
        this.f140059a = obj;
        this.f140060b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e
    public boolean a() {
        boolean z10;
        synchronized (this.f140059a) {
            try {
                z10 = this.f140061c.a() || this.f140062d.a();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void b(e eVar) {
        synchronized (this.f140059a) {
            try {
                if (eVar.equals(this.f140061c)) {
                    this.f140063e = RequestCoordinator.RequestState.SUCCESS;
                } else if (eVar.equals(this.f140062d)) {
                    this.f140064f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f140060b;
                if (requestCoordinator != null) {
                    requestCoordinator.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean c(e eVar) {
        boolean z10;
        synchronized (this.f140059a) {
            try {
                z10 = m() && k(eVar);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f140059a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f140063e = requestState;
                this.f140061c.clear();
                if (this.f140064f != requestState) {
                    this.f140064f = requestState;
                    this.f140062d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(e eVar) {
        boolean zN;
        synchronized (this.f140059a) {
            zN = n();
        }
        return zN;
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
        boolean z10;
        synchronized (this.f140059a) {
            try {
                RequestCoordinator.RequestState requestState = this.f140063e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z10 = requestState == requestState2 && this.f140064f == requestState2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean f() {
        boolean z10;
        synchronized (this.f140059a) {
            try {
                RequestCoordinator.RequestState requestState = this.f140063e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z10 = requestState == requestState2 || this.f140064f == requestState2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean g(e eVar) {
        if (eVar instanceof b) {
            b bVar = (b) eVar;
            if (this.f140061c.g(bVar.f140061c) && this.f140062d.g(bVar.f140062d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f140059a) {
            try {
                RequestCoordinator requestCoordinator = this.f140060b;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void h(e eVar) {
        synchronized (this.f140059a) {
            try {
                if (eVar.equals(this.f140062d)) {
                    this.f140064f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f140060b;
                    if (requestCoordinator != null) {
                        requestCoordinator.h(this);
                    }
                    return;
                }
                this.f140063e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f140064f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f140064f = requestState2;
                    this.f140062d.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void i() {
        synchronized (this.f140059a) {
            try {
                RequestCoordinator.RequestState requestState = this.f140063e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f140063e = requestState2;
                    this.f140061c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f140059a) {
            try {
                RequestCoordinator.RequestState requestState = this.f140063e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z10 = requestState == requestState2 || this.f140064f == requestState2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean j(e eVar) {
        boolean z10;
        synchronized (this.f140059a) {
            try {
                z10 = l() && eVar.equals(this.f140061c);
            } finally {
            }
        }
        return z10;
    }

    @InterfaceC4326A("requestLock")
    public final boolean k(e eVar) {
        RequestCoordinator.RequestState requestState = this.f140063e;
        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.FAILED;
        if (requestState != requestState2) {
            return eVar.equals(this.f140061c);
        }
        if (!eVar.equals(this.f140062d)) {
            return false;
        }
        RequestCoordinator.RequestState requestState3 = this.f140064f;
        return requestState3 == RequestCoordinator.RequestState.SUCCESS || requestState3 == requestState2;
    }

    @InterfaceC4326A("requestLock")
    public final boolean l() {
        RequestCoordinator requestCoordinator = this.f140060b;
        return requestCoordinator == null || requestCoordinator.j(this);
    }

    @InterfaceC4326A("requestLock")
    public final boolean m() {
        RequestCoordinator requestCoordinator = this.f140060b;
        return requestCoordinator == null || requestCoordinator.c(this);
    }

    @InterfaceC4326A("requestLock")
    public final boolean n() {
        RequestCoordinator requestCoordinator = this.f140060b;
        return requestCoordinator == null || requestCoordinator.d(this);
    }

    public void o(e eVar, e eVar2) {
        this.f140061c = eVar;
        this.f140062d = eVar2;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f140059a) {
            try {
                RequestCoordinator.RequestState requestState = this.f140063e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f140063e = RequestCoordinator.RequestState.PAUSED;
                    this.f140061c.pause();
                }
                if (this.f140064f == requestState2) {
                    this.f140064f = RequestCoordinator.RequestState.PAUSED;
                    this.f140062d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
