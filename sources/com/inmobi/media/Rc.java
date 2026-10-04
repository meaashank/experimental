package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f152417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H7 f152418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f152419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdConfig f152420d;

    public Rc(r container) {
        kotlin.jvm.internal.G.p(container, "container");
        this.f152417a = container;
        this.f152420d = container.getAdConfig();
    }

    public abstract View a(View view, ViewGroup viewGroup, boolean z10);

    public void a() {
        WeakReference weakReference = this.f152419c;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public abstract void a(byte b10);

    public abstract void a(Context context, byte b10);

    public abstract void a(View view);

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(HashMap map);

    public View b() {
        WeakReference weakReference = this.f152419c;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public H7 c() {
        return this.f152418b;
    }

    public View d() {
        return null;
    }

    public abstract void e();
}
