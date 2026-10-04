package Bd;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.LruCacheKt;
import androidx.compose.runtime.R0;
import com.google.common.net.HttpHeaders;
import com.tonyodev.fetch2core.server.FileRequest;
import dd.g;
import dd.j;
import ed.InterfaceC4376a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.C4987s;
import kotlin.L0;
import kotlin.collections.AbstractC4864f0;
import kotlin.collections.EmptyList;
import kotlin.collections.I;
import kotlin.collections.J;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4955g;
import kotlin.jvm.internal.C4956h;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Y;
import kotlin.text.C5013e;
import kotlin.text.M;
import kotlin.text.Regex;
import md.l;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.n;
import okhttp3.t;
import okhttp3.u;
import okio.ByteString;
import okio.C5360j;
import okio.InterfaceC5361k;
import okio.InterfaceC5362l;
import okio.T;
import okio.U;
import okio.c0;
import okio.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@j(name = "Util")
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g
    @NotNull
    public static final byte[] f17491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g
    @NotNull
    public static final Headers f17492b = Headers.f225209b.j(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @g
    @NotNull
    public static final u f17493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @g
    @NotNull
    public static final t f17494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final T f17495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @g
    @NotNull
    public static final TimeZone f17496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Regex f17497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @g
    public static final boolean f17498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @g
    @NotNull
    public static final String f17499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f17500j = "okhttp/4.11.0";

    static {
        byte[] bArr = new byte[0];
        f17491a = bArr;
        f17493c = u.b.l(u.f225848b, bArr, null, 1, null);
        f17494d = t.a.r(t.f225839a, bArr, null, 0, 0, 7, null);
        T.a aVar = T.f225877e;
        ByteString.a aVar2 = ByteString.f225866d;
        f17495e = aVar.d(aVar2.i("efbbbf"), aVar2.i("feff"), aVar2.i("fffe"), aVar2.i("0000ffff"), aVar2.i("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        G.m(timeZone);
        f17496f = timeZone;
        f17497g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f17498h = false;
        f17499i = M.F4(M.z4(OkHttpClient.class.getName(), "okhttp3."), FileRequest.FIELD_CLIENT);
    }

    public static final long A(@NotNull Response response) {
        G.p(response, "<this>");
        String str = response.f225297f.get("Content-Length");
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final void B(@NotNull InterfaceC4376a<L0> block) {
        G.p(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> C(@NotNull T... elements) {
        G.p(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(I.Q(Arrays.copyOf(objArr, objArr.length)));
        G.o(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int D(@NotNull String[] strArr, @NotNull String value, @NotNull Comparator<String> comparator) {
        G.p(strArr, "<this>");
        G.p(value, "value");
        G.p(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int E(@NotNull String str) {
        G.p(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (G.t(cCharAt, 31) <= 0 || G.t(cCharAt, 127) >= 0) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    public static final int F(@NotNull String str, int i10, int i11) {
        G.p(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int G(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return F(str, i10, i11);
    }

    public static final int H(@NotNull String str, int i10, int i11) {
        G.p(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12 = i13;
            }
        }
        return i10;
    }

    public static /* synthetic */ int I(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return H(str, i10, i11);
    }

    public static final int J(@NotNull String str, int i10) {
        G.p(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10 = i11;
        }
        return str.length();
    }

    public static /* synthetic */ int K(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return J(str, i10);
    }

    @NotNull
    public static final String[] L(@NotNull String[] strArr, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        G.p(strArr, "<this>");
        G.p(other, "other");
        G.p(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = other.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    String str2 = other[i11];
                    i11++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean M(@NotNull Id.a aVar, @NotNull File file) throws IOException {
        G.p(aVar, "<this>");
        G.p(file, "file");
        c0 c0VarH = aVar.h(file);
        try {
            aVar.c(file);
            ((U) c0VarH).close();
            return true;
        } catch (IOException unused) {
            ((U) c0VarH).close();
            aVar.c(file);
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.b.a(c0VarH, th);
                throw th2;
            }
        }
    }

    public static final boolean N(@NotNull Socket socket, @NotNull InterfaceC5362l source) {
        G.p(socket, "<this>");
        G.p(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.r3();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean O(@NotNull String name) {
        G.p(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase(HttpHeaders.SET_COOKIE);
    }

    public static final void P(@NotNull Object obj) {
        G.p(obj, "<this>");
        obj.notify();
    }

    public static final void Q(@NotNull Object obj) {
        G.p(obj, "<this>");
        obj.notifyAll();
    }

    public static final int R(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    @NotNull
    public static final String S(@NotNull Socket socket) {
        G.p(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        G.o(hostName, "address.hostName");
        return hostName;
    }

    @NotNull
    public static final Charset T(@NotNull InterfaceC5362l interfaceC5362l, @NotNull Charset charset) throws IOException {
        G.p(interfaceC5362l, "<this>");
        G.p(charset, "default");
        int iW3 = interfaceC5362l.W3(f17495e);
        if (iW3 == -1) {
            return charset;
        }
        if (iW3 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            G.o(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iW3 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            G.o(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iW3 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            G.o(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iW3 == 3) {
            return C5013e.f218325a.b();
        }
        if (iW3 == 4) {
            return C5013e.f218325a.c();
        }
        throw new AssertionError();
    }

    @Nullable
    public static final <T> T U(@NotNull Object instance, @NotNull Class<T> fieldType, @NotNull String fieldName) throws IllegalAccessException {
        T tCast;
        Object objU;
        G.p(instance, "instance");
        G.p(fieldType, "fieldType");
        G.p(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            tCast = null;
            if (superclass.equals(Object.class)) {
                if (fieldName.equals("delegate") || (objU = U(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) U(objU, fieldType, fieldName);
            }
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (!fieldType.isInstance(obj)) {
                    break;
                }
                tCast = fieldType.cast(obj);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                G.o(superclass, "c.superclass");
            }
        }
        return tCast;
    }

    public static final int V(@NotNull InterfaceC5362l interfaceC5362l) throws IOException {
        G.p(interfaceC5362l, "<this>");
        return (interfaceC5362l.readByte() & 255) | ((interfaceC5362l.readByte() & 255) << 16) | ((interfaceC5362l.readByte() & 255) << 8);
    }

    public static final int W(@NotNull C5360j c5360j, byte b10) throws EOFException {
        G.p(c5360j, "<this>");
        int i10 = 0;
        while (!c5360j.r3() && c5360j.f1(0L) == b10) {
            i10++;
            c5360j.readByte();
        }
        return i10;
    }

    public static final boolean X(@NotNull e0 e0Var, int i10, @NotNull TimeUnit timeUnit) throws IOException {
        G.p(e0Var, "<this>");
        G.p(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jD = e0Var.timeout().f() ? e0Var.timeout().d() - jNanoTime : Long.MAX_VALUE;
        e0Var.timeout().e(Math.min(jD, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C5360j c5360j = new C5360j();
            while (e0Var.L3(c5360j, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                c5360j.l();
            }
            if (jD == Long.MAX_VALUE) {
                e0Var.timeout().a();
                return true;
            }
            e0Var.timeout().e(jNanoTime + jD);
            return true;
        } catch (InterruptedIOException unused) {
            if (jD == Long.MAX_VALUE) {
                e0Var.timeout().a();
                return false;
            }
            e0Var.timeout().e(jNanoTime + jD);
            return false;
        } catch (Throwable th) {
            if (jD == Long.MAX_VALUE) {
                e0Var.timeout().a();
            } else {
                e0Var.timeout().e(jNanoTime + jD);
            }
            throw th;
        }
    }

    @NotNull
    public static final ThreadFactory Y(@NotNull final String name, final boolean z10) {
        G.p(name, "name");
        return new ThreadFactory() { // from class: Bd.e
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return f.Z(name, z10, runnable);
            }
        };
    }

    public static final Thread Z(String name, boolean z10, Runnable runnable) {
        G.p(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final void a0(@NotNull String name, @NotNull InterfaceC4376a<L0> block) {
        G.p(name, "name");
        G.p(block, "block");
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        threadCurrentThread.setName(name);
        try {
            block.invoke();
        } finally {
            threadCurrentThread.setName(name2);
        }
    }

    public static /* synthetic */ n b(n nVar, okhttp3.d dVar) {
        h(nVar, dVar);
        return nVar;
    }

    @NotNull
    public static final List<Hd.a> b0(@NotNull Headers headers) {
        G.p(headers, "<this>");
        l lVarY1 = md.u.Y1(0, headers.size());
        ArrayList arrayList = new ArrayList(J.d0(lVarY1, 10));
        Iterator<Integer> it = lVarY1.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC4864f0) it).nextInt();
            arrayList.add(new Hd.a(headers.j(iNextInt), headers.x(iNextInt)));
        }
        return arrayList;
    }

    public static final <E> void c(@NotNull List<E> list, E e10) {
        G.p(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    @NotNull
    public static final Headers c0(@NotNull List<Hd.a> list) {
        G.p(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Hd.a aVar : list) {
            builder.addLenient$okhttp(aVar.f50759a.s0(), aVar.f50760b.s0());
        }
        return builder.build();
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    @NotNull
    public static final String d0(int i10) {
        String hexString = Integer.toHexString(i10);
        G.o(hexString, "toHexString(this)");
        return hexString;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    @NotNull
    public static final String e0(long j10) {
        String hexString = Long.toHexString(j10);
        G.o(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long f(int i10, long j10) {
        return j10 & ((long) i10);
    }

    @NotNull
    public static final String f0(@NotNull HttpUrl httpUrl, boolean z10) {
        G.p(httpUrl, "<this>");
        String strA = M.p3(httpUrl.f225227d, com.prism.gaia.server.accounts.b.f166434b0, false, 2, null) ? R0.a(new StringBuilder("["), httpUrl.f225227d, ']') : httpUrl.f225227d;
        if (!z10 && httpUrl.f225228e == HttpUrl.f225211k.g(httpUrl.f225224a)) {
            return strA;
        }
        return strA + ':' + httpUrl.f225228e;
    }

    @NotNull
    public static final n.c g(@NotNull final n nVar) {
        G.p(nVar, "<this>");
        return new n.c() { // from class: Bd.d
            @Override // okhttp3.n.c
            public final n a(okhttp3.d dVar) {
                n nVar2 = nVar;
                f.b(nVar2, dVar);
                return nVar2;
            }
        };
    }

    public static /* synthetic */ String g0(HttpUrl httpUrl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return f0(httpUrl, z10);
    }

    public static final n h(n this_asFactory, okhttp3.d it) {
        G.p(this_asFactory, "$this_asFactory");
        G.p(it, "it");
        return this_asFactory;
    }

    @NotNull
    public static final <T> List<T> h0(@NotNull List<? extends T> list) {
        G.p(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(kotlin.collections.U.d6(list));
        G.o(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final void i(@NotNull Object obj) {
        G.p(obj, "<this>");
        if (f17498h && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + obj);
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> i0(@NotNull Map<K, ? extends V> map) {
        G.p(map, "<this>");
        if (map.isEmpty()) {
            return n0.z();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        G.o(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final void j(@NotNull Object obj) {
        G.p(obj, "<this>");
        if (!f17498h || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + obj);
    }

    public static final long j0(@NotNull String str, long j10) {
        G.p(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final boolean k(@NotNull String str) {
        G.p(str, "<this>");
        return f17497g.m(str);
    }

    public static final int k0(@Nullable String str, int i10) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
        if (lValueOf == null) {
            return i10;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > LruCacheKt.f86729a) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final boolean l(@NotNull HttpUrl httpUrl, @NotNull HttpUrl other) {
        G.p(httpUrl, "<this>");
        G.p(other, "other");
        return G.g(httpUrl.f225227d, other.f225227d) && httpUrl.f225228e == other.f225228e && G.g(httpUrl.f225224a, other.f225224a);
    }

    @NotNull
    public static final String l0(@NotNull String str, int i10, int i11) {
        G.p(str, "<this>");
        int iF = F(str, i10, i11);
        String strSubstring = str.substring(iF, H(str, iF, i11));
        G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final int m(@NotNull String name, long j10, @Nullable TimeUnit timeUnit) {
        G.p(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException(G.C(name, " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > LruCacheKt.f86729a) {
            throw new IllegalArgumentException(G.C(name, " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(G.C(name, " too small.").toString());
    }

    public static /* synthetic */ String m0(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return l0(str, i10, i11);
    }

    public static final void n(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void n0(@NotNull Object obj) throws InterruptedException {
        G.p(obj, "<this>");
        obj.wait();
    }

    public static final void o(@NotNull Closeable closeable) {
        G.p(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final Throwable o0(@NotNull Exception exc, @NotNull List<? extends Exception> suppressed) throws IllegalAccessException, InvocationTargetException {
        G.p(exc, "<this>");
        G.p(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            C4987s.a(exc, it.next());
        }
        return exc;
    }

    public static final void p(@NotNull ServerSocket serverSocket) {
        G.p(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void p0(@NotNull InterfaceC5361k interfaceC5361k, int i10) throws IOException {
        G.p(interfaceC5361k, "<this>");
        interfaceC5361k.writeByte((i10 >>> 16) & 255);
        interfaceC5361k.writeByte((i10 >>> 8) & 255);
        interfaceC5361k.writeByte(i10 & 255);
    }

    public static final void q(@NotNull Socket socket) {
        G.p(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!G.g(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] r(@NotNull String[] strArr, @NotNull String value) {
        G.p(strArr, "<this>");
        G.p(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        G.o(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[strArr2.length - 1] = value;
        return strArr2;
    }

    public static final int s(@NotNull String str, char c10, int i10, int i11) {
        G.p(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final int t(@NotNull String str, @NotNull String delimiters, int i10, int i11) {
        G.p(str, "<this>");
        G.p(delimiters, "delimiters");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (M.o3(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int u(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return s(str, c10, i10, i11);
    }

    public static /* synthetic */ int v(String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return t(str, str2, i10, i11);
    }

    public static final boolean w(@NotNull e0 e0Var, int i10, @NotNull TimeUnit timeUnit) {
        G.p(e0Var, "<this>");
        G.p(timeUnit, "timeUnit");
        try {
            return X(e0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final <T> List<T> x(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        G.p(iterable, "<this>");
        G.p(predicate, "predicate");
        ArrayList arrayList = EmptyList.f217510a;
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                Y.g(arrayList).add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final String y(@NotNull String format, @NotNull Object... args) {
        G.p(format, "format");
        G.p(args, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean z(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        C4955g c4955g;
        G.p(strArr, "<this>");
        G.p(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                Iterator itA = C4956h.a(strArr2);
                do {
                    c4955g = (C4955g) itA;
                    if (c4955g.hasNext()) {
                    }
                } while (comparator.compare(str, (String) c4955g.next()) != 0);
                return true;
            }
        }
        return false;
    }
}
