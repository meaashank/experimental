package com.prism.gaia.download;

/* JADX INFO: loaded from: classes6.dex */
class StopRequestException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164579a;

    public StopRequestException(int i10, String str) {
        super(str);
        this.f164579a = i10;
    }

    public StopRequestException(int i10, String str, Throwable th) {
        super(str, th);
        this.f164579a = i10;
    }
}
