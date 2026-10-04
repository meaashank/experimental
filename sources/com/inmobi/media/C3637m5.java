package com.inmobi.media;

import ed.InterfaceC4376a;
import java.util.Calendar;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3637m5 extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3651n5 f153135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f153136b = "IncompleteLogFinalizer";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3637m5(C3651n5 c3651n5) {
        super(0);
        this.f153135a = c3651n5;
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() throws JSONException {
        C3595j5 c3595j5 = this.f153135a.f153188a;
        JSONObject jSONObject = c3595j5.f153047a;
        JSONArray jSONArray = c3595j5.f153048b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put("log", jSONArray);
        String string = jSONObject2.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        AbstractC3735t6.a(this.f153136b, string, this.f153135a.f153188a.f153049c.f152914a);
        String str = this.f153135a.f153188a.f153049c.f152914a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        C3540f6 c3540f6 = this.f153135a.f153188a.f153049c;
        AbstractC3531eb.d().b(new C3540f6(str, timeInMillis, 0, c3540f6.f152917d, true, c3540f6.f152919f));
        return kotlin.L0.f217464a;
    }
}
