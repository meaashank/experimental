package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C4987s;

/* JADX INFO: loaded from: classes5.dex */
public final class O4 implements N4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3530ea f152335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gb f152336b;

    public O4(Context context, double d10, EnumC3568h6 logLevel, boolean z10, boolean z11, int i10, long j10, boolean z12) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(logLevel, "logLevel");
        if (!z11) {
            this.f152336b = new Gb();
        }
        if (z10) {
            return;
        }
        C3530ea c3530ea = new C3530ea(context, d10, logLevel, j10, i10, z12);
        this.f152335a = c3530ea;
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3694q6.f153295a;
        Objects.toString(c3530ea);
        copyOnWriteArrayList.add(new WeakReference(c3530ea));
    }

    public final void a(String tag, String message) {
        kotlin.jvm.internal.G.p(tag, "tag");
        kotlin.jvm.internal.G.p(message, "message");
        C3530ea c3530ea = this.f152335a;
        if (c3530ea != null) {
            c3530ea.a(EnumC3568h6.f152974b, tag, message);
        }
    }

    public final void b(String tag, String message) {
        kotlin.jvm.internal.G.p(tag, "tag");
        kotlin.jvm.internal.G.p(message, "message");
        C3530ea c3530ea = this.f152335a;
        if (c3530ea != null) {
            c3530ea.a(EnumC3568h6.f152975c, tag, message);
        }
    }

    public final void c(String tag, String message) {
        kotlin.jvm.internal.G.p(tag, "tag");
        kotlin.jvm.internal.G.p(message, "message");
        C3530ea c3530ea = this.f152335a;
        if (c3530ea != null) {
            c3530ea.a(EnumC3568h6.f152973a, tag, message);
        }
    }

    public final void d(String tag, String message) {
        kotlin.jvm.internal.G.p(tag, "tag");
        kotlin.jvm.internal.G.p(message, "message");
        C3530ea c3530ea = this.f152335a;
        if (c3530ea != null) {
            c3530ea.a(EnumC3568h6.f152976d, tag, message);
        }
        if (this.f152336b != null) {
            kotlin.jvm.internal.G.p("STATE_CHANGE: ".concat(message), "message");
        }
    }

    public final void e(String key, String value) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(value, "value");
        C3530ea c3530ea = this.f152335a;
        if (c3530ea != null) {
            Objects.toString(c3530ea.f152879i);
            if (c3530ea.f152879i.get()) {
                return;
            }
            c3530ea.f152878h.put(key, value);
        }
    }

    public final void a(String tag, String message, Exception error) {
        kotlin.jvm.internal.G.p(tag, "tag");
        kotlin.jvm.internal.G.p(message, "message");
        kotlin.jvm.internal.G.p(error, "error");
        C3530ea c3530ea = this.f152335a;
        if (c3530ea != null) {
            EnumC3568h6 enumC3568h6 = EnumC3568h6.f152975c;
            StringBuilder sbA = android.support.v4.media.f.a(message, "\nError: ");
            sbA.append(C4987s.i(error));
            c3530ea.a(enumC3568h6, tag, sbA.toString());
        }
    }

    public final void b() {
        C3530ea c3530ea = this.f152335a;
        if (c3530ea != null) {
            c3530ea.a();
        }
    }

    public final void a(boolean z10) {
        C3530ea c3530ea = this.f152335a;
        if (c3530ea != null) {
            Objects.toString(c3530ea.f152879i);
            if (!c3530ea.f152879i.get()) {
                c3530ea.f152874d = z10;
            }
        }
        if (z10) {
            return;
        }
        C3530ea c3530ea2 = this.f152335a;
        if (c3530ea2 == null || !c3530ea2.f152876f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3694q6.f153295a;
            AbstractC3680p6.a(this.f152335a);
            this.f152335a = null;
        }
    }

    public final void a() {
        C3530ea c3530ea = this.f152335a;
        if (c3530ea != null) {
            c3530ea.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3694q6.f153295a;
        AbstractC3680p6.a(this.f152335a);
    }
}
