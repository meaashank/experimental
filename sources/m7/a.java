package M7;

import c7.AbstractC2950b;
import c7.H;
import c7.InterfaceC2949a;
import c7.InterfaceC2951c;
import com.prism.gaia.genum.AutoLogSetting;
import com.prism.gaia.naked.compat.libcore.io.OsCompat2;
import com.prism.gaia.naked.metadata.libcore.io.LibcoreCAG;

/* JADX INFO: loaded from: classes6.dex */
public class a implements u8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0077a f58867a;

    /* JADX INFO: renamed from: M7.a$a, reason: collision with other inner class name */
    @InterfaceC2951c(AutoLogSetting.OFF)
    @InterfaceC2949a(b.class)
    public static class C0077a extends AbstractC2950b<Object> {
        public C0077a(Object obj) {
            super(obj);
        }

        @Override // c7.AbstractC2950b
        public void r() {
            f(new H("chown", 1));
            f(new H("fchown", 1));
            f(new H("getpwuid", 0));
            f(new H("lchown", 1));
            f(new H("setuid", 0));
        }
    }

    public static Object d() {
        return OsCompat2.Util.getOs();
    }

    @Override // u8.b
    public boolean a(String str) {
        try {
            if (this.f58867a != null) {
                return OsCompat2.Util.getOs() != this.f58867a.n();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // u8.b
    public void b() throws Throwable {
        this.f58867a = new C0077a(OsCompat2.Util.getOs());
        LibcoreCAG.f166017G.os().set(this.f58867a.n());
    }

    @Override // u8.b
    public Object c() {
        return getClass();
    }
}
