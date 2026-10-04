package s7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.G;
import c7.x;

/* JADX INFO: renamed from: s7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5580b extends AbstractC2950b<IInterface> {
    public C5580b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        g(new x());
        f(new G("getPrimaryClip"));
        f(new G("setPrimaryClip"));
        f(new G("getPrimaryClipDescription"));
        f(new G("hasPrimaryClip"));
        f(new G("addPrimaryClipChangedListener"));
        f(new G("removePrimaryClipChangedListener"));
        f(new G("hasClipboardText"));
    }
}
