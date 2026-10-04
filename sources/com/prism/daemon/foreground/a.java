package com.prism.daemon.foreground;

import A6.f;
import android.content.Context;
import androidx.annotation.NonNull;
import com.prism.daemon.foreground.DaemonAliveService;

/* JADX INFO: loaded from: classes5.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f162179a = new a();

    public static a e() {
        return f162179a;
    }

    @Override // A6.f
    public boolean a() {
        return true;
    }

    @Override // A6.f
    public void b(@NonNull Context context) {
        DaemonAliveService.f(context);
    }

    @Override // A6.f
    public void c(@NonNull Context context) {
        DaemonAliveService.g(context);
    }

    @Override // A6.f
    public void d(@NonNull Context context) {
        DaemonAliveService.InnerService.a(context);
    }
}
