package e7;

import android.os.IInterface;
import android.os.Process;
import com.prism.gaia.client.hook.providers.ProviderProxyHandler;
import com.prism.gaia.download.j;
import com.prism.gaia.naked.metadata.android.content.IContentProviderCAG;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f200291a = "asdf-".concat(f.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, e> f200292b;

    public class a implements e {
        @Override // e7.f.e
        public ProviderProxyHandler a(boolean z10, IInterface iInterface) {
            return new com.prism.gaia.client.hook.providers.e(iInterface, "settings");
        }
    }

    public class b implements e {
        @Override // e7.f.e
        public ProviderProxyHandler a(boolean z10, IInterface iInterface) {
            return new com.prism.gaia.client.hook.providers.d(iInterface, "downloads");
        }
    }

    public class c implements e {
        @Override // e7.f.e
        public ProviderProxyHandler a(boolean z10, IInterface iInterface) {
            return new com.prism.gaia.client.hook.providers.b(iInterface, j.b.f164732b);
        }
    }

    public class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f200293a;

        public d(String str) {
            this.f200293a = str;
        }

        @Override // e7.f.e
        public ProviderProxyHandler a(boolean z10, IInterface iInterface) {
            return z10 ? new com.prism.gaia.client.hook.providers.a(iInterface, this.f200293a) : new com.prism.gaia.client.hook.providers.c(iInterface, this.f200293a);
        }
    }

    public interface e {
        ProviderProxyHandler a(boolean z10, IInterface iInterface);
    }

    static {
        HashMap map = new HashMap();
        f200292b = map;
        map.put("settings", new a());
        map.put("downloads", new b());
        map.put(j.b.f164732b, new c());
    }

    public static IInterface a(IInterface iInterface, ProviderProxyHandler providerProxyHandler) {
        if (iInterface == null || providerProxyHandler == null) {
            return null;
        }
        return (IInterface) Proxy.newProxyInstance(iInterface.getClass().getClassLoader(), new Class[]{IContentProviderCAG.f165596G.ORG_CLASS()}, providerProxyHandler);
    }

    public static IInterface b(boolean z10, String str, IInterface iInterface) {
        if (!(iInterface instanceof Proxy) || !(Proxy.getInvocationHandler(iInterface) instanceof ProviderProxyHandler)) {
            ProviderProxyHandler providerProxyHandlerA = c(str).a(z10, iInterface);
            Process.myPid();
            IInterface iInterfaceA = a(iInterface, providerProxyHandlerA);
            if (iInterfaceA != null) {
                return iInterfaceA;
            }
        }
        return iInterface;
    }

    public static e c(String str) {
        e eVar = f200292b.get(str);
        return eVar == null ? new d(str) : eVar;
    }
}
