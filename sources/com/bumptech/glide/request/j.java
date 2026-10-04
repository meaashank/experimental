package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;
import e.InterfaceC4326A;

/* JADX INFO: loaded from: classes2.dex */
public class j implements RequestCoordinator, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f140084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f140085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f140086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile e f140087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InterfaceC4326A("requestLock")
    public RequestCoordinator.RequestState f140088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InterfaceC4326A("requestLock")
    public RequestCoordinator.RequestState f140089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4326A("requestLock")
    public boolean f140090g;

    public j(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f140088e = requestState;
        this.f140089f = requestState;
        this.f140085b = obj;
        this.f140084a = requestCoordinator;
    }

    @InterfaceC4326A("requestLock")
    private boolean k() {
        RequestCoordinator requestCoordinator = this.f140084a;
        return requestCoordinator == null || requestCoordinator.j(this);
    }

    @InterfaceC4326A("requestLock")
    private boolean l() {
        RequestCoordinator requestCoordinator = this.f140084a;
        return requestCoordinator == null || requestCoordinator.c(this);
    }

    @InterfaceC4326A("requestLock")
    private boolean m() {
        RequestCoordinator requestCoordinator = this.f140084a;
        return requestCoordinator == null || requestCoordinator.d(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e
    public boolean a() {
        boolean z10;
        synchronized (this.f140085b) {
            try {
                z10 = this.f140087d.a() || this.f140086c.a();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void b(e eVar) {
        synchronized (this.f140085b) {
            try {
                if (eVar.equals(this.f140087d)) {
                    this.f140089f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f140088e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f140084a;
                if (requestCoordinator != null) {
                    requestCoordinator.b(this);
                }
                if (!this.f140089f.isComplete()) {
                    this.f140087d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean c(e eVar) {
        boolean z10;
        synchronized (this.f140085b) {
            try {
                z10 = l() && eVar.equals(this.f140086c) && !a();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f140085b) {
            this.f140090g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f140088e = requestState;
            this.f140089f = requestState;
            this.f140087d.clear();
            this.f140086c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(e eVar) {
        boolean z10;
        synchronized (this.f140085b) {
            try {
                z10 = m() && (eVar.equals(this.f140086c) || this.f140088e != RequestCoordinator.RequestState.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
        boolean z10;
        synchronized (this.f140085b) {
            z10 = this.f140088e == RequestCoordinator.RequestState.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean f() {
        boolean z10;
        synchronized (this.f140085b) {
            z10 = this.f140088e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean g(e eVar) {
        if (eVar instanceof j) {
            j jVar = (j) eVar;
            if (this.f140086c != null ? this.f140086c.g(jVar.f140086c) : jVar.f140086c == null) {
                if (this.f140087d == null) {
                    if (jVar.f140087d == null) {
                        return true;
                    }
                } else if (this.f140087d.g(jVar.f140087d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f140085b) {
            try {
                RequestCoordinator requestCoordinator = this.f140084a;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void h(e eVar) {
        synchronized (this.f140085b) {
            try {
                if (!eVar.equals(this.f140086c)) {
                    this.f140089f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f140088e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f140084a;
                if (requestCoordinator != null) {
                    requestCoordinator.h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void i() {
        synchronized (this.f140085b) {
            try {
                this.f140090g = true;
                try {
                    if (this.f140088e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f140089f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f140089f = requestState2;
                            this.f140087d.i();
                        }
                    }
                    if (this.f140090g) {
                        RequestCoordinator.RequestState requestState3 = this.f140088e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f140088e = requestState4;
                            this.f140086c.i();
                        }
                    }
                    this.f140090g = false;
                } catch (Throwable th) {
                    this.f140090g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f140085b) {
            z10 = this.f140088e == RequestCoordinator.RequestState.RUNNING;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean j(e eVar) {
        boolean z10;
        synchronized (this.f140085b) {
            try {
                z10 = k() && eVar.equals(this.f140086c) && this.f140088e != RequestCoordinator.RequestState.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    public void n(e eVar, e eVar2) {
        this.f140086c = eVar;
        this.f140087d = eVar2;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f140085b) {
            try {
                if (!this.f140089f.isComplete()) {
                    this.f140089f = RequestCoordinator.RequestState.PAUSED;
                    this.f140087d.pause();
                }
                if (!this.f140088e.isComplete()) {
                    this.f140088e = RequestCoordinator.RequestState.PAUSED;
                    this.f140086c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
