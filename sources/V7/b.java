package V7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.G;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f76358i = "asdf-".concat(b.class.getSimpleName());

    public b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new G("checkPermission"));
    }
}
