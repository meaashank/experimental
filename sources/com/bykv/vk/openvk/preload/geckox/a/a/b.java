package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"CI_StaticFieldLeak"})
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f140458a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f140459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f140460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected File f140461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List<String> f140462e;

    static {
        new f();
        f140459b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f140460c = aVar;
        this.f140461d = file;
        this.f140462e = list;
    }
}
