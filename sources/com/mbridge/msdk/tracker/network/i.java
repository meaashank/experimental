package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.v;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class i extends h<JSONObject> implements v.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final j<JSONObject> f159962C;

    public i(int i10, String str, String str2, long j10, j<JSONObject> jVar) {
        super(i10, str, 0, str2, j10);
        this.f159962C = jVar;
        a((v.a) this);
    }

    private void b(v<JSONObject> vVar) {
        j<JSONObject> jVar = this.f159962C;
        if (jVar != null) {
            try {
                jVar.b(this, vVar, vVar.f160096c.f159938a);
            } catch (Exception e10) {
                q0.b(h.f159956B, e10.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public void a(JSONObject jSONObject) {
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public v<JSONObject> a(q qVar) {
        try {
            String str = new String(qVar.f160019b, StandardCharsets.UTF_8);
            if (qVar.f160018a == 204) {
                v<JSONObject> vVarA = v.a(new JSONObject(), com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
                a(vVarA, qVar);
                return vVarA;
            }
            v<JSONObject> vVarA2 = v.a(new JSONObject(str), com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
            a(vVarA2, qVar);
            return vVarA2;
        } catch (JSONException e10) {
            q0.b(h.f159956B, e10.getMessage());
            v<JSONObject> vVarA3 = v.a(new s(e10));
            b(vVarA3);
            return vVarA3;
        } catch (Throwable th) {
            v<JSONObject> vVarA4 = v.a(new a0(th));
            b(vVarA4);
            return vVarA4;
        }
    }

    private void a(v<JSONObject> vVar, q qVar) {
        j<JSONObject> jVar = this.f159962C;
        if (jVar != null) {
            try {
                jVar.a(this, vVar, qVar);
            } catch (Exception e10) {
                q0.b(h.f159956B, e10.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.v.a
    public void a(b0 b0Var) {
        b(v.a(b0Var));
    }
}
