package r5;

import Z3.f;

/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static AbstractC5532d a(String str) {
        return (str.toLowerCase().equals("js") || str.toLowerCase().equals(f.f79411h)) ? new C5531c() : str.toLowerCase().equals("html") ? new C5530b() : str.toLowerCase().equals("css") ? new C5529a() : new C5531c();
    }
}
