package com.inmobi.media;

import android.content.Context;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class J9 extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J9 f152129a = new J9();

    public J9() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        K9.f152171a.getClass();
        Context contextD = C3657nb.d();
        JSONObject jSONObject = null;
        if (contextD != null) {
            if (K9.f152173c == null) {
                K9.f152173c = new E9(contextD, "pub_signals_store");
            }
            E9 e92 = K9.f152173c;
            if (e92 == null) {
                kotlin.jvm.internal.G.S("prefDao");
                throw null;
            }
            String strA = e92.a("saved_signals");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }
}
