package A7;

import android.annotation.TargetApi;
import android.os.IInterface;
import c7.AbstractC2950b;
import c7.C;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(17)
public class b extends AbstractC2950b<IInterface> {
    public b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new C("createVirtualDisplay"));
    }
}
