package com.inmobi.media;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ta extends W8 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Map f152460A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AtomicBoolean f152461B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f152462y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f152463z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ta(String url, C3686pc c3686pc, String str, int i10, int i11) {
        super("POST", url, c3686pc, Z3.a(Z3.f152641a, false, 1, null), (N4) null, "application/x-www-form-urlencoded", 64);
        kotlin.jvm.internal.G.p(url, "url");
        this.f152462y = i10;
        this.f152463z = i11;
        this.f152460A = null;
        this.f152564m = str;
        this.f152461B = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.W8
    public void f() {
        Set<Map.Entry> setEntrySet;
        super.f();
        Map map = this.f152460A;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            return;
        }
        for (Map.Entry entry : setEntrySet) {
            if (!this.f152560i.containsKey(entry.getKey())) {
                this.f152560i.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
