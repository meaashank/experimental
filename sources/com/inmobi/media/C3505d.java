package com.inmobi.media;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3505d extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a f152802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3478b0 f152803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H9 f152804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3505d(InterfaceC4376a interfaceC4376a, InterfaceC3478b0 interfaceC3478b0, H9 h92) {
        super(0);
        this.f152802a = interfaceC4376a;
        this.f152803b = interfaceC3478b0;
        this.f152804c = h92;
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        try {
            if (((Boolean) this.f152802a.invoke()).booleanValue()) {
                Object objA = this.f152803b.a();
                H9 h92 = this.f152804c;
                if (h92 != null) {
                    h92.a(objA);
                }
            } else {
                H9 h93 = this.f152804c;
                if (h93 != null) {
                    h93.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
                }
            }
        } catch (Exception e10) {
            H9 h94 = this.f152804c;
            if (h94 != null) {
                h94.onError(e10);
            }
        }
        return kotlin.L0.f217464a;
    }
}
