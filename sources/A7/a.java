package A7;

import android.annotation.TargetApi;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.hardware.display.DisplayManagerGlobalCAG;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(17)
public class a implements u8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f7261a;

    @Override // u8.b
    public boolean a(String str) {
        try {
            IInterface iInterface = DisplayManagerGlobalCAG.f165814G.mDm().get(DisplayManagerGlobalCAG.f165814G.getInstance().call(new Object[0]));
            b bVar = this.f7261a;
            if (bVar != null) {
                return iInterface != bVar.n();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // u8.b
    public void b() throws Throwable {
        this.f7261a = new b(DisplayManagerGlobalCAG.f165814G.mDm().get(DisplayManagerGlobalCAG.f165814G.getInstance().call(new Object[0])));
        DisplayManagerGlobalCAG.f165814G.mDm().set(DisplayManagerGlobalCAG.f165814G.getInstance().call(new Object[0]), this.f7261a.n());
    }

    @Override // u8.b
    public Object c() {
        return getClass();
    }
}
