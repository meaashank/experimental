package com.mbridge.msdk.foundation.same.net.exception;

/* JADX INFO: loaded from: classes5.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f156417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f156418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f156419c;

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f156417a = i10;
        this.f156419c = aVar;
    }

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar, String str) {
        this.f156417a = i10;
        this.f156419c = aVar;
        this.f156418b = str;
    }
}
