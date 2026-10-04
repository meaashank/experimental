package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public abstract class W3 {
    public static final boolean a(String str) {
        if (str == null || kotlin.text.M.e6(str).toString().length() == 0) {
            return true;
        }
        return (kotlin.text.F.L2(str, R3.a.f67725c, false, 2, null) || kotlin.text.F.L2(str, R3.a.f67726d, false, 2, null)) ? false : true;
    }

    public static final void a(Thread thread, String name) {
        kotlin.jvm.internal.G.p(thread, "<this>");
        kotlin.jvm.internal.G.p(name, "name");
        try {
            thread.start();
        } catch (InternalError e10) {
            e10.toString();
        }
    }
}
