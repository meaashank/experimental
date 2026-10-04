package u7;

import android.accounts.Account;
import android.content.ISyncStatusObserver;
import android.content.SyncRequest;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.prism.commons.utils.C3838b;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.stub.BinderC3914a;
import com.prism.gaia.helper.utils.PkgUtils;
import java.lang.reflect.Method;
import java.util.Arrays;
import v8.C5706p;
import v8.C5714x;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C5706p f239609a = C5706p.e();

    public static final class A extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239610d = "asdf-".concat(A.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "removePeriodicSync";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.w((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2]);
            return 0;
        }
    }

    public static final class B extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239611d = "asdf-".concat(B.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "removeStatusChangeListener";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.x((ISyncStatusObserver) objArr[0]);
            return 0;
        }
    }

    public static final class C extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239612d = "asdf-".concat(C.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "requestSync";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.y((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2]);
            return 0;
        }
    }

    public static final class D extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239613d = "asdf-".concat(D.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "setIsSyncable";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.z((Account) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue());
            return 0;
        }
    }

    public static final class E extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239614d = "asdf-".concat(E.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "setMasterSyncAutomatically";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.A(((Boolean) objArr[0]).booleanValue());
            return 0;
        }
    }

    public static final class F extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239615d = "asdf-".concat(F.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "setMasterSyncAutomaticallyAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.B(((Boolean) objArr[0]).booleanValue(), c7.m.M());
            return 0;
        }
    }

    public static final class G extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239616d = "asdf-".concat(G.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "setSyncAutomatically";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.C((Account) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }
    }

    public static final class H extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239617d = "asdf-".concat(H.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "setSyncAutomaticallyAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Account account = (Account) objArr[0];
            String str = (String) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            c7.m.N(objArr, Integer.TYPE);
            c.f239609a.D(account, str, zBooleanValue, c7.m.M());
            return 0;
        }
    }

    public static final class I extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239618d = "asdf-".concat(I.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "sync";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.E((SyncRequest) objArr[0]);
            return 0;
        }
    }

    public static final class J extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239619d = "asdf-".concat(J.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "syncAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.F((SyncRequest) objArr[0], c7.m.M());
            return 0;
        }
    }

    public static final class K extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239620d = "asdf-".concat(K.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "unregisterContentObserver";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            BinderC3914a binderC3914aH2 = BinderC3914a.h2((IInterface) objArr[0]);
            if (binderC3914aH2 == null) {
                Arrays.asList(objArr);
                return method.invoke(obj, objArr);
            }
            c.f239609a.G(binderC3914aH2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: u7.c$a, reason: case insensitive filesystem */
    public static final class C5649a extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239621d = "asdf-".concat(C5649a.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "addPeriodicSync";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.a((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2], ((Long) objArr[3]).longValue());
            return 0;
        }
    }

    /* JADX INFO: renamed from: u7.c$b, reason: case insensitive filesystem */
    public static final class C5650b extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239622d = "asdf-".concat(C5650b.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "addStatusChangeListener";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.b(((Integer) objArr[0]).intValue(), (ISyncStatusObserver) objArr[1]);
            return 0;
        }
    }

    /* JADX INFO: renamed from: u7.c$c, reason: collision with other inner class name */
    public static final class C0893c extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239623d = "asdf-".concat(C0893c.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "cancelRequest";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: u7.c$d, reason: case insensitive filesystem */
    public static final class C5651d extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239624d = "asdf-".concat(C5651d.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "cancelSync";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.c((Account) objArr[0], (String) objArr[1], null);
            return 0;
        }
    }

    /* JADX INFO: renamed from: u7.c$e, reason: case insensitive filesystem */
    public static final class C5652e extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239625d = "asdf-".concat(C5652e.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "cancelSyncAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Account account = (Account) objArr[0];
            String str = (String) objArr[1];
            c7.m.N(objArr, Integer.TYPE);
            c.f239609a.d(account, str, null, c7.m.M());
            return 0;
        }
    }

    /* JADX INFO: renamed from: u7.c$f, reason: case insensitive filesystem */
    public static final class C5653f extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239626d = "asdf-".concat(C5653f.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getCache";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: u7.c$g, reason: case insensitive filesystem */
    public static final class C5654g extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239627d = "asdf-".concat(C5654g.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getCurrentSyncs";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: u7.c$h, reason: case insensitive filesystem */
    public static final class C5655h extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239628d = "asdf-".concat(C5655h.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getCurrentSyncsAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: u7.c$i, reason: case insensitive filesystem */
    public static final class C5656i extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239629d = "asdf-".concat(C5656i.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getIsSyncable";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return Integer.valueOf(c.f239609a.f((Account) objArr[0], (String) objArr[1]));
        }
    }

    /* JADX INFO: renamed from: u7.c$j, reason: case insensitive filesystem */
    public static final class C5657j extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239630d = "asdf-".concat(C5657j.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getIsSyncableAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Account account = (Account) objArr[0];
            String str = (String) objArr[1];
            c7.m.N(objArr, Integer.TYPE);
            return Integer.valueOf(c.f239609a.g(account, str, c7.m.M()));
        }
    }

    /* JADX INFO: renamed from: u7.c$k, reason: case insensitive filesystem */
    public static final class C5658k extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239631d = "asdf-".concat(C5658k.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getMasterSyncAutomatically";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(c.f239609a.h());
        }
    }

    public static final class l extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239632d = "asdf-".concat(l.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getMasterSyncAutomaticallyAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(c.f239609a.i(c7.m.M()));
        }
    }

    public static final class m extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239633d = "asdf-".concat(m.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getPeriodicSyncs";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return c.f239609a.j((Account) objArr[0], (String) objArr[1], null);
        }
    }

    public static final class n extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239634d = "asdf-".concat(n.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getSyncAdapterPackagesForAuthorityAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    public static final class o extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239635d = "asdf-".concat(o.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getSyncAdapterTypes";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return c.f239609a.l();
        }
    }

    public static final class p extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239636d = "asdf-".concat(p.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getSyncAdapterTypesAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return c.f239609a.m(c7.m.M());
        }
    }

    public static final class q extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239637d = "asdf-".concat(q.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getSyncAutomatically";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(c.f239609a.n((Account) objArr[0], (String) objArr[1]));
        }
    }

    public static final class r extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239638d = "asdf-".concat(r.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getSyncAutomaticallyAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Account account = (Account) objArr[0];
            String str = (String) objArr[1];
            c7.m.N(objArr, Integer.TYPE);
            return Boolean.valueOf(c.f239609a.o(account, str, c7.m.M()));
        }
    }

    public static final class s extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239639d = "asdf-".concat(s.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getSyncStatus";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c.f239609a.getClass();
            return null;
        }
    }

    public static final class t extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239640d = "asdf-".concat(t.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getSyncStatusAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c7.m.N(objArr, Integer.TYPE);
            c7.m.M();
            c.f239609a.getClass();
            return null;
        }
    }

    public static final class u extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239641d = "asdf-".concat(u.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "isSyncActive";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(c.f239609a.r((Account) objArr[0], (String) objArr[1], null));
        }
    }

    public static final class v extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239642d = "asdf-".concat(v.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "isSyncPending";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(c.f239609a.s((Account) objArr[0], (String) objArr[1], null));
        }
    }

    public static final class w extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239643d = "asdf-".concat(w.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "isSyncPendingAsUser";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Account account = (Account) objArr[0];
            String str = (String) objArr[1];
            c7.m.N(objArr, Integer.TYPE);
            return Boolean.valueOf(c.f239609a.t(account, str, null, c7.m.M()));
        }
    }

    public static final class x extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239644d = "asdf-".concat(x.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "notifyChange";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Uri[] uriArr = null;
            if (C3841e.x()) {
                Object obj2 = objArr[0];
                if (obj2 != null && obj2.getClass().isArray()) {
                    Object obj3 = objArr[0];
                    if (((Object[]) obj3)[0] instanceof Uri) {
                        uriArr = (Uri[]) obj3;
                    }
                }
            } else {
                Object obj4 = objArr[0];
                if (obj4 instanceof Uri) {
                    uriArr = new Uri[]{(Uri) obj4};
                }
            }
            if (C3838b.n(uriArr)) {
                return 0;
            }
            for (Uri uri : uriArr) {
                ProviderInfo providerInfoO0 = c7.m.o0(uri.getAuthority());
                if (C5714x.f239909d.b0(uri.getAuthority(), 0, c7.m.M()) == null && providerInfoO0 != null && PkgUtils.n(providerInfoO0.applicationInfo)) {
                    objArr[0] = new Uri[]{uri};
                    Arrays.asList(objArr);
                    method.invoke(obj, objArr);
                } else {
                    c.f239609a.u(uri, BinderC3914a.T5((IInterface) objArr[1]), ((Boolean) objArr[2]).booleanValue(), C3841e.p() ? ((Integer) objArr[3]).intValue() : ((Boolean) objArr[3]).booleanValue() ? 1 : 0, c7.m.M(), -1);
                }
            }
            return 0;
        }
    }

    public static final class y extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239645d = "asdf-".concat(y.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "putCache";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    public static final class z extends c7.m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f239646d = "asdf-".concat(z.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "registerContentObserver";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            int iN = c7.m.N(objArr, Uri.class);
            if (iN < 0) {
                return 0;
            }
            Uri uri = (Uri) objArr[iN];
            ProviderInfo providerInfoO0 = c7.m.o0(uri.getAuthority());
            if (providerInfoO0 != null && PkgUtils.n(providerInfoO0.applicationInfo)) {
                Arrays.asList(objArr);
                return method.invoke(obj, objArr);
            }
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            BinderC3914a binderC3914aT5 = BinderC3914a.T5((IInterface) objArr[2]);
            if (binderC3914aT5 != null) {
                c.f239609a.v(uri, zBooleanValue, binderC3914aT5, c7.m.M(), -1);
            }
            return 0;
        }
    }
}
