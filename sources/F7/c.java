package f7;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import c7.m;
import com.prism.gaia.client.GaiaContext;
import java.lang.reflect.Method;
import java.util.Arrays;
import v8.C5693c;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C5693c f200619a = C5693c.k();

    public static class A extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200620d = "asdf-".concat(A.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "isCredentialsUpdateSuggested";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.F((IBinder) objArr[0], (Account) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    public static class B extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200621d = "asdf-".concat(B.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "peekAuthToken";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.G((Account) objArr[0], (String) objArr[1]);
        }
    }

    public static class C extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200622d = "asdf-".concat(C.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "registerAccountListener";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.H((String[]) objArr[0], c.b());
            return 0;
        }
    }

    public static class D extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200623d = "asdf-".concat(D.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "removeAccount";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.I((IBinder) objArr[0], (Account) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }
    }

    public static class E extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200624d = "asdf-".concat(E.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "removeAccountAsUser";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.I((IBinder) objArr[0], (Account) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }
    }

    public static class F extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200625d = "asdf-".concat(F.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "removeAccountExplicitly";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return Boolean.valueOf(c.f200619a.K((Account) objArr[0]));
        }
    }

    public static class G extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200626d = "asdf-".concat(G.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "renameAccount";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.M((IBinder) objArr[0], (Account) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    public static class H extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200627d = "asdf-".concat(H.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "setAccountVisibility";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return Boolean.valueOf(c.f200619a.N((Account) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue()));
        }
    }

    public static class I extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200628d = "asdf-".concat(I.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "setAuthToken";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.O((Account) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    public static class J extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200629d = "asdf-".concat(J.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "setPassword";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.P((Account) objArr[0], (String) objArr[1]);
            return 0;
        }
    }

    public static class K extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200630d = "asdf-".concat(K.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "setUserData";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.Q((Account) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    public static class L extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200631d = "asdf-".concat(L.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "startAddAccountSession";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.R((IBinder) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }
    }

    public static class M extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200632d = "asdf-".concat(M.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "startUpdateCredentialsSession";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.S((IBinder) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), (Bundle) objArr[4]);
            return 0;
        }
    }

    public static class N extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200633d = "asdf-".concat(N.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "unregisterAccountListener";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.T((String[]) objArr[0], c.b());
            return 0;
        }
    }

    public static class O extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200634d = "asdf-".concat(O.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "updateAppPermission";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.U((Account) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue());
            return 0;
        }
    }

    public static class P extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200635d = "asdf-".concat(P.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "updateCredentials";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.V((IBinder) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), (Bundle) objArr[4]);
            return 0;
        }
    }

    /* JADX INFO: renamed from: f7.c$a, reason: case insensitive filesystem */
    public static class C4392a extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200636d = "asdf-".concat(C4392a.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "accountAuthenticated";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return Boolean.valueOf(c.f200619a.a((Account) objArr[0]));
        }
    }

    /* JADX INFO: renamed from: f7.c$b, reason: case insensitive filesystem */
    public static class C4393b extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200637d = "asdf-".concat(C4393b.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "addAccount";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.b((IBinder) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }
    }

    /* JADX INFO: renamed from: f7.c$c, reason: collision with other inner class name */
    public static class C0732c extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200638d = "asdf-".concat(C0732c.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "addAccountAsUser";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.b((IBinder) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }
    }

    /* JADX INFO: renamed from: f7.c$d, reason: case insensitive filesystem */
    public static class C4394d extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200639d = "asdf-".concat(C4394d.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "addAccountExplicitly";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return Boolean.valueOf(c.f200619a.d((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2]));
        }
    }

    /* JADX INFO: renamed from: f7.c$e, reason: case insensitive filesystem */
    public static class C4395e extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200640d = "asdf-".concat(C4395e.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "addAccountExplicitlyWithVisibility";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return Boolean.valueOf(c.f200619a.d((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2]));
        }
    }

    /* JADX INFO: renamed from: f7.c$f, reason: case insensitive filesystem */
    public static class C4396f extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200641d = "asdf-".concat(C4396f.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "clearPassword";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.g((Account) objArr[0]);
            return 0;
        }
    }

    /* JADX INFO: renamed from: f7.c$g, reason: case insensitive filesystem */
    public static class C4397g extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200642d = "asdf-".concat(C4397g.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "confirmCredentialsAsUser";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.h((IBinder) objArr[0], (Account) objArr[1], (Bundle) objArr[2], ((Boolean) objArr[3]).booleanValue(), m.M());
            return 0;
        }
    }

    /* JADX INFO: renamed from: f7.c$h, reason: case insensitive filesystem */
    public static class C4398h extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200643d = "asdf-".concat(C4398h.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "editProperties";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.i((IBinder) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }
    }

    /* JADX INFO: renamed from: f7.c$i, reason: case insensitive filesystem */
    public static class C4399i extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200644d = "asdf-".concat(C4399i.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "finishSessionAsUser";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.j((IBinder) objArr[0], (Bundle) objArr[1], ((Boolean) objArr[2]).booleanValue(), (Bundle) objArr[3], m.M());
            return 0;
        }
    }

    /* JADX INFO: renamed from: f7.c$j, reason: case insensitive filesystem */
    public static class C4400j extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200645d = "asdf-".concat(C4400j.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAccountByTypeAndFeatures";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.l((IBinder) objArr[0], (String) objArr[1], (String[]) objArr[2], c.b());
            return 0;
        }
    }

    /* JADX INFO: renamed from: f7.c$k, reason: case insensitive filesystem */
    public static class C4401k extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200646d = "asdf-".concat(C4401k.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAccountVisibility";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return Integer.valueOf(c.f200619a.m((Account) objArr[0], (String) objArr[1]));
        }
    }

    /* JADX INFO: renamed from: f7.c$l, reason: case insensitive filesystem */
    public static class C4402l extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200647d = "asdf-".concat(C4402l.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAccounts";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.n((String) objArr[0], GaiaContext.j().r());
        }
    }

    /* JADX INFO: renamed from: f7.c$m, reason: case insensitive filesystem */
    public static class C4403m extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200648d = "asdf-".concat(C4403m.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAccountsAndVisibilityForPackage";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.o((String) objArr[0], (String) objArr[1]);
        }
    }

    /* JADX INFO: renamed from: f7.c$n, reason: case insensitive filesystem */
    public static class C4404n extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200649d = "asdf-".concat(C4404n.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAccountsAsUser";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.p((String) objArr[0], m.M(), c.b());
        }
    }

    /* JADX INFO: renamed from: f7.c$o, reason: case insensitive filesystem */
    public static class C4405o extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200650d = "asdf-".concat(C4405o.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAccountsByFeatures";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.q((IBinder) objArr[0], (String) objArr[1], (String[]) objArr[2], c.b());
            return 0;
        }
    }

    /* JADX INFO: renamed from: f7.c$p, reason: case insensitive filesystem */
    public static class C4406p extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200651d = "asdf-".concat(C4406p.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAccountsByTypeForPackage";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.r((String) objArr[0], (String) objArr[1], c.b());
        }
    }

    public static class q extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200652d = "asdf-".concat(q.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAccountsForPackage";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.t((String) objArr[0], ((Integer) objArr[1]).intValue(), c.b());
        }
    }

    public static class r extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200653d = "asdf-".concat(r.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAuthToken";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.u((IBinder) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }
    }

    public static class s extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200654d = "asdf-".concat(s.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAuthTokenLabel";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.v((IBinder) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    public static class t extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200655d = "asdf-".concat(t.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getAuthenticatorTypes";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.w(((Integer) objArr[0]).intValue());
        }
    }

    public static class u extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200656d = "asdf-".concat(u.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getPackagesAndVisibilityForAccount";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.x((Account) objArr[0]);
        }
    }

    public static class v extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200657d = "asdf-".concat(v.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getPassword";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.z((Account) objArr[0]);
        }
    }

    public static class w extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200658d = "asdf-".concat(w.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getPreviousName";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.A((Account) objArr[0]);
        }
    }

    public static class x extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200659d = "asdf-".concat(x.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getUserData";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            return c.f200619a.C((Account) objArr[0], (String) objArr[1]);
        }
    }

    public static class y extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200660d = "asdf-".concat(y.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "hasFeatures";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.D((IBinder) objArr[0], (Account) objArr[1], (String[]) objArr[2], c.b());
            return 0;
        }
    }

    public static class z extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f200661d = "asdf-".concat(z.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "invalidateAuthToken";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Arrays.asList(objArr);
            c.f200619a.E((String) objArr[0], (String) objArr[1]);
            return 0;
        }
    }

    public static String b() {
        return GaiaContext.j().r();
    }
}
