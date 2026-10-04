package v7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.I;

/* JADX INFO: renamed from: v7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5690b extends AbstractC2950b<IInterface> {
    public C5690b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new I("registerCallback", 0));
        f(new I("getContextHubHandles", new int[0]));
    }
}
