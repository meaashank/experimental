package com.inmobi.media;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3595j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f153047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f153048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3540f6 f153049c;

    public C3595j5(JSONObject vitals, JSONArray logs, C3540f6 data) {
        kotlin.jvm.internal.G.p(vitals, "vitals");
        kotlin.jvm.internal.G.p(logs, "logs");
        kotlin.jvm.internal.G.p(data, "data");
        this.f153047a = vitals;
        this.f153048b = logs;
        this.f153049c = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3595j5)) {
            return false;
        }
        C3595j5 c3595j5 = (C3595j5) obj;
        return kotlin.jvm.internal.G.g(this.f153047a, c3595j5.f153047a) && kotlin.jvm.internal.G.g(this.f153048b, c3595j5.f153048b) && kotlin.jvm.internal.G.g(this.f153049c, c3595j5.f153049c);
    }

    public final int hashCode() {
        return this.f153049c.hashCode() + ((this.f153048b.hashCode() + (this.f153047a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f153047a + ", logs=" + this.f153048b + ", data=" + this.f153049c + ')';
    }
}
