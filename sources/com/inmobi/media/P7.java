package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public abstract class P7 {
    public static Q7 a() {
        synchronized (Q7.f152390d) {
            Q7 q72 = Q7.f152391e;
            if (q72 == null) {
                return new Q7();
            }
            Q7.f152391e = q72.f152395c;
            q72.f152395c = null;
            Q7.f152392f--;
            return q72;
        }
    }
}
