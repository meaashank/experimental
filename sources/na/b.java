package na;

import android.content.Context;
import com.prism.hider.vault.commons.B;
import com.prism.hider.vault.commons.D;
import na.c;
import r6.j;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f221254b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f221255c = "ITEM_USE_FINGERPRINT";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j<Boolean> f221256a = new j<>(D.f168597c.a(null), f221255c, Boolean.FALSE, (Class<Boolean>) Boolean.class);

    public static /* synthetic */ void a(c.InterfaceC0844c interfaceC0844c) {
        B.h().a();
        if (interfaceC0844c != null) {
            interfaceC0844c.a();
        }
    }

    public static b c() {
        if (f221254b == null) {
            synchronized (b.class) {
                f221254b = new b();
            }
        }
        return f221254b;
    }

    public c b(Context context, final c.InterfaceC0844c interfaceC0844c) {
        return new c(new c.InterfaceC0844c() { // from class: na.a
            @Override // na.c.InterfaceC0844c
            public final void a() {
                b.a(interfaceC0844c);
            }
        });
    }

    public boolean d(Context context) {
        return this.f221256a.h(context).booleanValue();
    }

    public void e(Context context, boolean z10) {
        this.f221256a.n(context, Boolean.valueOf(z10));
    }
}
