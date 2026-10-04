package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3607k3 extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3607k3 f153076a = new C3607k3();

    public C3607k3() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        Context contextD = C3657nb.d();
        Object systemService = contextD != null ? contextD.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return Integer.valueOf(audioManager != null ? audioManager.getStreamVolume(3) : 15);
    }
}
