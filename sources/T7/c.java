package T7;

import android.os.IInterface;
import c7.C2953e;
import com.prism.gaia.naked.metadata.android.app.NotificationManagerCAG;
import com.prism.gaia.naked.metadata.android.widget.ToastCAG;

/* JADX INFO: loaded from: classes6.dex */
public class c implements u8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2953e<IInterface> f68352a;

    @Override // u8.b
    public boolean a(String str) {
        return false;
    }

    @Override // u8.b
    public void b() throws Throwable {
        this.f68352a = new d(NotificationManagerCAG.f165360G.getService().call(new Object[0]));
        NotificationManagerCAG.f165360G.sService().set(this.f68352a.n());
        ToastCAG.f165973G.sService().set(this.f68352a.n());
    }

    @Override // u8.b
    public Object c() {
        return getClass();
    }
}
