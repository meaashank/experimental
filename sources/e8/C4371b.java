package e8;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.C;
import c7.J;
import c7.m;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.helper.compat.f;
import com.prism.gaia.naked.compat.com.android.internal.infra.AndroidFutureCompat2;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: e8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4371b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f200295i = "asdf-".concat(C4371b.class.getSimpleName());

    /* JADX INFO: renamed from: e8.b$a */
    public static class a extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f200296d;

        public a(String str) {
            this.f200296d = str;
        }

        @Override // c7.m
        public String A() {
            return this.f200296d;
        }

        @Override // c7.m
        public boolean P() {
            return m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) {
            return f.d(method, new ArrayList(0));
        }
    }

    /* JADX INFO: renamed from: e8.b$b, reason: collision with other inner class name */
    public static class C0727b<T> extends J<T> {
        public C0727b(String str, T t10) {
            super(str, t10);
        }

        @Override // c7.J, c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return (C3841e.D() || !C3841e.z()) ? this.f131248f : AndroidFutureCompat2.Util.completedFuture(this.f131248f);
        }
    }

    public C4371b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        String[] strArr = {"getShortcuts", "getManifestShortcuts", "getDynamicShortcuts", "getPinnedShortcuts"};
        for (int i10 = 0; i10 < 4; i10++) {
            f(new a(strArr[i10]));
        }
        f(new C("getShareTargets"));
        f(new C("hasShareTargets"));
        Boolean bool = Boolean.FALSE;
        f(new C0727b("isSharingShortcut", bool));
        f(new C0727b("setDynamicShortcuts", bool));
        f(new C0727b("addDynamicShortcuts", bool));
        f(new C0727b("requestPinShortcut", bool));
        f(new C0727b("isRequestPinShortcut", bool));
        f(new C0727b("isRequestPinItemSupported", bool));
        f(new C0727b("removeAllDynamicShortcuts", null));
        f(new C0727b("removeDynamicShortcuts", null));
        f(new C0727b("removeLongLivedShortcuts", null));
        f(new C0727b("updateShortcuts", bool));
        f(new C0727b("pushDynamicShortcut", null));
        f(new C("createShortcutResultIntent"));
        f(new C("disableShortcuts"));
        f(new C("enableShortcuts"));
        f(new C("getRemainingCallCount"));
        f(new C("getRateLimitResetTime"));
        f(new C("getIconMaxDimensions"));
        f(new C("getMaxShortcutCountPerActivity"));
        f(new C("reportShortcutUsed"));
        f(new C("onApplicationActive"));
    }
}
