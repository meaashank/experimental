package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.v;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes5.dex */
public class k extends h<String> implements v.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final j<String> f159963C;

    public k(int i10, String str, String str2, long j10, j<String> jVar) {
        super(i10, str, 0, str2, j10);
        this.f159963C = jVar;
        a((v.a) this);
    }

    private void b(v<String> vVar) {
        j<String> jVar = this.f159963C;
        if (jVar != null) {
            try {
                jVar.b(this, vVar, vVar.f160096c.f159938a);
            } catch (Exception e10) {
                q0.b(h.f159956B, "parseNetworkResponse error: ", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.t
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public v<String> a(q qVar) {
        try {
            v<String> vVarA = v.a(new String(qVar.f160019b, StandardCharsets.UTF_8), com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
            a(vVarA, qVar);
            return vVarA;
        } catch (Throwable th) {
            q0.b(h.f159956B, "parseNetworkResponse error: ", th);
            v<String> vVarA2 = v.a(new a0(th));
            b(vVarA2);
            return vVarA2;
        }
    }

    private void a(v<String> vVar, q qVar) {
        j<String> jVar = this.f159963C;
        if (jVar != null) {
            try {
                jVar.a(this, vVar, qVar);
            } catch (Exception e10) {
                q0.b(h.f159956B, "parseNetworkResponse error: ", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.v.a
    public void a(b0 b0Var) {
        b(v.a(b0Var));
    }
}
