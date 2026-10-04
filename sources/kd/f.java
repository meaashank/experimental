package Kd;

import Kd.j;
import Kd.k;
import com.android.launcher3.IconCache;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.C5013e;
import kotlin.text.F;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class f implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f58578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final j.a f58579g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<? super SSLSocket> f58580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Method f58581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f58582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f58583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f58584e;

    public static final class a {

        /* JADX INFO: renamed from: Kd.f$a$a, reason: collision with other inner class name */
        public static final class C0071a implements j.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f58585a;

            public C0071a(String str) {
                this.f58585a = str;
            }

            @Override // Kd.j.a
            public boolean a(@NotNull SSLSocket sslSocket) {
                G.p(sslSocket, "sslSocket");
                return F.L2(sslSocket.getClass().getName(), G.C(this.f58585a, IconCache.EMPTY_CLASS_NAME), false, 2, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Kd.j.a
            @NotNull
            public k b(@NotNull SSLSocket sslSocket) {
                G.p(sslSocket, "sslSocket");
                return f.f58578f.b(sslSocket.getClass());
            }
        }

        public a() {
        }

        public final f b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(G.C("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            G.m(superclass);
            return new f(superclass);
        }

        @NotNull
        public final j.a c(@NotNull String packageName) {
            G.p(packageName, "packageName");
            return new C0071a(packageName);
        }

        @NotNull
        public final j.a d() {
            return f.f58579g;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        a aVar = new a();
        f58578f = aVar;
        f58579g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(@NotNull Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        G.p(sslSocketClass, "sslSocketClass");
        this.f58580a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        G.o(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f58581b = declaredMethod;
        this.f58582c = sslSocketClass.getMethod("setHostname", String.class);
        this.f58583d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f58584e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // Kd.k
    public boolean a(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        return this.f58580a.isInstance(sslSocket);
    }

    @Override // Kd.k
    @Nullable
    public String b(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            try {
                byte[] bArr = (byte[]) this.f58583d.invoke(sslSocket, null);
                if (bArr != null) {
                    return new String(bArr, C5013e.f218326b);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (!(cause instanceof NullPointerException) || !G.g(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e11);
                }
            }
        }
        return null;
    }

    @Override // Kd.k
    public void c(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        G.p(sslSocket, "sslSocket");
        G.p(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f58581b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f58582c.invoke(sslSocket, str);
                }
                this.f58584e.invoke(sslSocket, Jd.i.f58277a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // Kd.k
    @Nullable
    public X509TrustManager d(@NotNull SSLSocketFactory sSLSocketFactory) {
        k.a.b(this, sSLSocketFactory);
        return null;
    }

    @Override // Kd.k
    public boolean e(@NotNull SSLSocketFactory sSLSocketFactory) {
        k.a.a(this, sSLSocketFactory);
        return false;
    }

    @Override // Kd.k
    public boolean isSupported() {
        Jd.c.f58250h.getClass();
        return Jd.c.f58251i;
    }
}
