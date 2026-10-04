package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.inmobi.media.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3579i3 implements InterfaceC3551g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile CrashConfig f152997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q6 f152998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f152999c;

    public C3579i3(Context context, CrashConfig crashConfig, Q6 eventBus) {
        C3579i3 c3579i3;
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(crashConfig, "crashConfig");
        kotlin.jvm.internal.G.p(eventBus, "eventBus");
        this.f152997a = crashConfig;
        this.f152998b = eventBus;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        kotlin.jvm.internal.G.o(listSynchronizedList, "synchronizedList(...)");
        this.f152999c = listSynchronizedList;
        if (this.f152997a.getCrashConfig().getEnabled()) {
            listSynchronizedList.add(new Q2(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f152997a.getANRConfig().getAppExitReason().getEnabled() && C3635m3.f153124a.E()) {
            c3579i3 = this;
            listSynchronizedList.add(new O0(context, c3579i3, this.f152997a.getANRConfig().getAppExitReason().getIncidentWaitInterval(), this.f152997a.getANRConfig().getAppExitReason().getMaxNumberOfLines()));
        } else {
            c3579i3 = this;
        }
        if (c3579i3.f152997a.getANRConfig().getWatchdog().getEnabled()) {
            listSynchronizedList.add(new C3477b(c3579i3.f152997a.getANRConfig().getWatchdog().getInterval(), this));
        }
    }

    public final void a(C3525e5 incidentEvent) {
        int i10;
        kotlin.jvm.internal.G.p(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof P0) && this.f152997a.getANRConfig().getAppExitReason().getEnabled()) {
            i10 = Opcodes.DCMPG;
        } else if ((incidentEvent instanceof R2) && this.f152997a.getCrashConfig().getEnabled()) {
            i10 = 150;
        } else if (!(incidentEvent instanceof ed) || !this.f152997a.getANRConfig().getWatchdog().getEnabled()) {
            return;
        } else {
            i10 = Opcodes.DCMPL;
        }
        this.f152998b.b(new P1(i10, incidentEvent.f151967a, kotlin.collections.m0.k(new Pair("data", incidentEvent))));
    }
}
