package com.prism.lib.downloader.internal;

import com.prism.lib.downloader.common.DownloadError;

/* JADX INFO: loaded from: classes6.dex */
public class DownloadResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Type f178679a = Type.SUCCESS;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DownloadError f178680b = null;

    public enum Type {
        SUCCESS,
        ERROR,
        PAUSED,
        CANCELLED
    }

    public DownloadError a() {
        return this.f178680b;
    }

    public boolean b() {
        return this.f178679a == Type.ERROR;
    }

    public boolean c() {
        return this.f178679a == Type.CANCELLED;
    }

    public boolean d() {
        return this.f178679a == Type.PAUSED;
    }

    public boolean e() {
        return this.f178679a == Type.SUCCESS;
    }

    public void f() {
        this.f178679a = Type.CANCELLED;
        this.f178680b = null;
    }

    public void g(DownloadError downloadError) {
        this.f178679a = Type.ERROR;
        this.f178680b = downloadError;
    }

    public void h() {
        this.f178679a = Type.PAUSED;
        this.f178680b = null;
    }

    public void i() {
        this.f178679a = Type.SUCCESS;
        this.f178680b = null;
    }
}
