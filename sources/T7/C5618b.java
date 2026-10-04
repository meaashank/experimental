package t7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.I;
import c7.m;
import c7.x;
import com.prism.commons.utils.C3841e;
import java.util.ArrayList;
import o8.C5335a;
import o8.k;
import t7.C5619c;

/* JADX INFO: renamed from: t7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5618b extends AbstractC2950b<IInterface> {
    public C5618b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new I("isTetheringSupported", Boolean.TRUE));
        f(new C5619c.a());
        if (!C3841e.z() && Z6.b.a() && C5335a.a()) {
            ArrayList arrayList = (ArrayList) k.C();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f((m) obj);
            }
        }
        g(new x());
    }
}
