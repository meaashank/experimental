package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes5.dex */
public class c extends FutureTask<h> implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f154494a;

    public c(h hVar) {
        super(hVar, null);
        this.f154494a = hVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        h hVar = this.f154494a;
        int i10 = hVar.f154548a;
        h hVar2 = cVar.f154494a;
        int i11 = hVar2.f154548a;
        return i10 == i11 ? hVar.f154549b - hVar2.f154549b : i11 - i10;
    }
}
