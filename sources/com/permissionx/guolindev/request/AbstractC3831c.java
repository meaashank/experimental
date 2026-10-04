package com.permissionx.guolindev.request;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import java.util.ArrayList;
import kotlin.L0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.permissionx.guolindev.request.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3831c implements InterfaceC3832d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public v f161737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @Nullable
    public InterfaceC3832d f161738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public C3833e f161739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public f f161740d;

    public AbstractC3831c(@NotNull v pb2) {
        G.p(pb2, "pb");
        this.f161737a = pb2;
        this.f161739c = new C3833e(pb2, this);
        this.f161740d = new f(this.f161737a, this);
        this.f161739c = new C3833e(this.f161737a, this);
        this.f161740d = new f(this.f161737a, this);
    }

    @Override // com.permissionx.guolindev.request.InterfaceC3832d
    @NotNull
    public f a() {
        return this.f161740d;
    }

    @Override // com.permissionx.guolindev.request.InterfaceC3832d
    public void b() {
        L0 l02;
        InterfaceC3832d interfaceC3832d = this.f161738b;
        if (interfaceC3832d != null) {
            interfaceC3832d.request();
            l02 = L0.f217464a;
        } else {
            l02 = null;
        }
        if (l02 == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f161737a.f161784m);
            arrayList.addAll(this.f161737a.f161785n);
            arrayList.addAll(this.f161737a.f161782k);
            if (this.f161737a.D()) {
                if (Q5.c.d(this.f161737a.i(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    this.f161737a.f161783l.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
            }
            if (this.f161737a.I() && this.f161737a.l() >= 23) {
                if (Settings.canDrawOverlays(this.f161737a.i())) {
                    this.f161737a.f161783l.add("android.permission.SYSTEM_ALERT_WINDOW");
                } else {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
            }
            if (this.f161737a.J() && this.f161737a.l() >= 23) {
                if (Settings.System.canWrite(this.f161737a.i())) {
                    this.f161737a.f161783l.add("android.permission.WRITE_SETTINGS");
                } else {
                    arrayList.add("android.permission.WRITE_SETTINGS");
                }
            }
            if (this.f161737a.G()) {
                if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                } else {
                    this.f161737a.f161783l.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                }
            }
            if (this.f161737a.F()) {
                if (Build.VERSION.SDK_INT < 26 || this.f161737a.l() < 26 || !this.f161737a.i().getPackageManager().canRequestPackageInstalls()) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                } else {
                    this.f161737a.f161783l.add("android.permission.REQUEST_INSTALL_PACKAGES");
                }
            }
            if (this.f161737a.H()) {
                if (Q5.c.a(this.f161737a.i())) {
                    this.f161737a.f161783l.add("android.permission.POST_NOTIFICATIONS");
                } else {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
            }
            if (this.f161737a.E()) {
                if (Q5.c.d(this.f161737a.i(), x.f161795f)) {
                    this.f161737a.f161783l.add(x.f161795f);
                } else {
                    arrayList.add(x.f161795f);
                }
            }
            R5.d dVar = this.f161737a.f161788q;
            if (dVar != null) {
                G.m(dVar);
                dVar.a(arrayList.isEmpty(), new ArrayList(this.f161737a.f161783l), arrayList);
            }
            this.f161737a.f();
        }
    }

    @Override // com.permissionx.guolindev.request.InterfaceC3832d
    @NotNull
    public C3833e d() {
        return this.f161739c;
    }
}
