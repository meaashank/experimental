package Jd;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final b f58263k = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Method f58264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Method f58265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Method f58266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Class<?> f58267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Class<?> f58268j;

    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<String> f58269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f58270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f58271c;

        public a(@NotNull List<String> protocols) {
            G.p(protocols, "protocols");
            this.f58269a = protocols;
        }

        @Nullable
        public final String a() {
            return this.f58271c;
        }

        public final boolean b() {
            return this.f58270b;
        }

        public final void c(@Nullable String str) {
            this.f58271c = str;
        }

        public final void d(boolean z10) {
            this.f58270b = z10;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] objArr) throws Throwable {
            G.p(proxy, "proxy");
            G.p(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (G.g(name, "supports") && G.g(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (G.g(name, "unsupported") && G.g(Void.TYPE, returnType)) {
                this.f58270b = true;
                return null;
            }
            if (G.g(name, "protocols") && objArr.length == 0) {
                return this.f58269a;
            }
            if ((G.g(name, "selectProtocol") || G.g(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            Object obj2 = list.get(i10);
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj2;
                            if (this.f58269a.contains(str)) {
                                this.f58271c = str;
                                return str;
                            }
                            if (i10 == size) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    String str2 = this.f58269a.get(0);
                    this.f58271c = str2;
                    return str2;
                }
            }
            if ((!G.g(name, "protocolSelected") && !G.g(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f58271c = (String) obj3;
            return null;
        }
    }

    public static final class b {
        public b() {
        }

        @Nullable
        public final i a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                G.o(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(G.C("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> clientProviderClass = Class.forName(G.C("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> serverProviderClass = Class.forName(G.C("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod(w7.i.f240158w, SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                G.o(putMethod, "putMethod");
                G.o(getMethod, "getMethod");
                G.o(removeMethod, "removeMethod");
                G.o(clientProviderClass, "clientProviderClass");
                G.o(serverProviderClass, "serverProviderClass");
                return new f(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public b(C4969v c4969v) {
        }
    }

    public f(@NotNull Method putMethod, @NotNull Method getMethod, @NotNull Method removeMethod, @NotNull Class<?> clientProviderClass, @NotNull Class<?> serverProviderClass) {
        G.p(putMethod, "putMethod");
        G.p(getMethod, "getMethod");
        G.p(removeMethod, "removeMethod");
        G.p(clientProviderClass, "clientProviderClass");
        G.p(serverProviderClass, "serverProviderClass");
        this.f58264f = putMethod;
        this.f58265g = getMethod;
        this.f58266h = removeMethod;
        this.f58267i = clientProviderClass;
        this.f58268j = serverProviderClass;
    }

    @Override // Jd.i
    public void c(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        try {
            this.f58266h.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // Jd.i
    public void f(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        G.p(sslSocket, "sslSocket");
        G.p(protocols, "protocols");
        try {
            this.f58264f.invoke(null, sslSocket, Proxy.newProxyInstance(i.class.getClassLoader(), new Class[]{this.f58267i, this.f58268j}, new a(i.f58277a.b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // Jd.i
    @Nullable
    public String j(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f58265g.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            boolean z10 = aVar.f58270b;
            if (!z10 && aVar.f58271c == null) {
                i.n(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f58271c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
