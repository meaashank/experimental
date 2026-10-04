package com.prism.gaia.client.stub;

import B0.C0922f;
import B0.C0923g;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.utils.PkgUtils;
import com.prism.gaia.remote.AppProceedInfo;
import com.prism.gaia.remote.GuestAppInfo;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import okio.internal.ZipKt;
import y8.C5842a;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements InvocationHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f164444b = "GuestPkgInstaller";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f164445c = "pi_stage";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f164446d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f164447e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f164448f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f164449g = 1610612736;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f164450h = 256;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f164451i = 536870399;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f164452j = 1577836800;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f164454l = "gaia_pi_session_seq";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f164455m = 21600000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f164456n = 604800000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile boolean f164458p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile boolean f164459q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f164460r = ".owner.lock";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f164461s = ".names";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f164462t = ".meta";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f164465w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f164466x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f164467y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f164468z = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f164469a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicInteger f164453k = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicInteger f164457o = new AtomicInteger();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Map<Integer, c> f164463u = new ConcurrentHashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f164464v = Integer.toString(Process.myPid());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f164470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IntentSender f164471b;

        public a(String str, IntentSender intentSender) {
            this.f164470a = str;
            this.f164471b = intentSender;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            boolean zT;
            try {
                zT = C5842a.m().t(this.f164470a);
            } catch (Throwable th) {
                th.getMessage();
                zT = 0;
            }
            n.i0(this.f164471b, !zT, this.f164470a, -1, zT != 0 ? null : "container uninstall failed");
        }
    }

    public static final class b implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f164473a;

        public b(c cVar) {
            this.f164473a = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r5, java.lang.reflect.Method r6, java.lang.Object[] r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 462
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.client.stub.n.b.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f164474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f164475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile String f164476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile int f164477d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f164478e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Map<String, File> f164479f = new ConcurrentHashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile RandomAccessFile f164480g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile FileLock f164481h;

        public c(int i10, File file, String str) {
            this.f164474a = i10;
            this.f164475b = file;
            this.f164476c = str;
        }
    }

    public n(Object obj) {
        this.f164469a = obj;
    }

    public static int A(File file) {
        File[] fileArrListFiles = file.listFiles(new i());
        if (fileArrListFiles == null) {
            return 0;
        }
        return fileArrListFiles.length;
    }

    public static Object C(Method method) {
        Class<?> returnType = method.getReturnType();
        if (returnType == Void.TYPE) {
            return null;
        }
        if (returnType == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (returnType == Integer.TYPE) {
            return 0;
        }
        if (returnType == Long.TYPE) {
            return 0L;
        }
        if (returnType == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (returnType == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (returnType == int[].class) {
            return new int[0];
        }
        return null;
    }

    public static void D(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                D(file2);
            }
        }
        file.delete();
    }

    public static File E(c cVar, String str) {
        String strQ = Q(str);
        String lowerCase = strQ.toLowerCase(Locale.ROOT);
        if (!lowerCase.endsWith(".apk") && !lowerCase.endsWith(com.prism.gaia.download.b.f164617b)) {
            strQ = strQ.concat(".apk");
        }
        return new File(cVar.f164475b, strQ);
    }

    public static void F(int i10) {
        c cVarRemove = f164463u.remove(Integer.valueOf(i10));
        if (cVarRemove != null) {
            x(cVarRemove);
            D(cVarRemove.f164475b);
        }
    }

    public static void G(c cVar) {
        try {
            File[] fileArrListFiles = cVar.f164475b.listFiles();
            StringBuilder sb2 = new StringBuilder();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    String strG = file.getName().toLowerCase(Locale.ROOT).endsWith(".apk") ? PkgUtils.g(file.getAbsolutePath()) : "(not-apk)";
                    sb2.append(file.getName());
                    sb2.append('[');
                    sb2.append(file.length());
                    sb2.append("B,split=");
                    sb2.append(strG);
                    sb2.append("] ");
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Object H() {
        try {
            return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(new ArrayList());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void I(c cVar) {
        try {
            File file = new File(cVar.f164475b, f164460r);
            x(cVar);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileLock fileLockTryLock = randomAccessFile.getChannel().tryLock();
            if (fileLockTryLock == null) {
                randomAccessFile.close();
            } else {
                cVar.f164480g = randomAccessFile;
                cVar.f164481h = fileLockTryLock;
            }
        } catch (Throwable th) {
            int i10 = cVar.f164474a;
            th.getMessage();
        }
    }

    public static void J(File file) throws Exception {
        if (file.isDirectory()) {
            return;
        }
        file.mkdirs();
        if (!file.isDirectory()) {
            throw new IllegalStateException(C0923g.a("cannot create stage dir ", file));
        }
    }

    public static Object K(Method method, Object[] objArr, String str) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (parameterTypes[i10].getName().equals(str) && i10 < objArr.length) {
                return objArr[i10];
            }
        }
        for (Object obj : objArr) {
            if (obj != null && O(obj, str)) {
                return obj;
            }
        }
        return null;
    }

    public static Context M() {
        return GaiaContext.j().n();
    }

    public static void N(c cVar) {
        boolean z10;
        String strG;
        try {
            GuestAppInfo guestAppInfoE = C5842a.m().e(cVar.f164476c);
            if (guestAppInfoE == null) {
                return;
            }
            HashSet hashSet = new HashSet();
            File[] fileArrListFiles = cVar.f164475b.listFiles(new l());
            if (fileArrListFiles != null) {
                z10 = false;
                for (File file : fileArrListFiles) {
                    String strG2 = PkgUtils.g(file.getAbsolutePath());
                    if (strG2 == null) {
                        z10 = true;
                    } else {
                        hashSet.add(strG2);
                    }
                }
            } else {
                z10 = false;
            }
            if (!z10 && guestAppInfoE.apkPath != null) {
                z(new File(guestAppInfoE.apkPath), new File(cVar.f164475b, "base.apk"));
            }
            String[] strArr = guestAppInfoE.splitCodePaths;
            if (strArr != null) {
                for (String str : strArr) {
                    if (str != null && (strG = PkgUtils.g(str)) != null && !hashSet.contains(strG)) {
                        z(new File(str), new File(cVar.f164475b, new File(str).getName()));
                    }
                }
            }
        } catch (Throwable th) {
            String str2 = cVar.f164476c;
            th.getMessage();
        }
    }

    public static boolean O(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(File file) {
        return System.currentTimeMillis() - file.lastModified() > f164455m || file.lastModified() <= 0;
    }

    public static String Q(String str) {
        return str == null ? "base" : new File(str).getName();
    }

    public static ParcelFileDescriptor S(File file) throws Exception {
        final FileDescriptor fileDescriptorOpen = Os.open(file.getAbsolutePath(), OsConstants.O_CREAT | OsConstants.O_WRONLY | OsConstants.O_TRUNC, 420);
        final FileDescriptor fileDescriptor = new FileDescriptor();
        FileDescriptor fileDescriptor2 = new FileDescriptor();
        try {
            Os.socketpair(OsConstants.AF_UNIX, OsConstants.SOCK_STREAM, 0, fileDescriptor, fileDescriptor2);
            Thread thread = new Thread(new Runnable() { // from class: com.prism.gaia.client.stub.k
                @Override // java.lang.Runnable
                public final void run() {
                    n.g0(fileDescriptor, fileDescriptorOpen);
                }
            }, "pi-filebridge-" + file.getName());
            thread.setDaemon(true);
            thread.start();
            return q0(fileDescriptor2);
        } catch (Throwable th) {
            try {
                Os.close(fileDescriptorOpen);
            } catch (Throwable unused) {
            }
            th.getMessage();
            file.getName();
            return ParcelFileDescriptor.open(file, 1006632960);
        }
    }

    public static int T(FileDescriptor fileDescriptor, byte[] bArr, int i10, int i11) throws Exception {
        do {
            try {
                return Os.read(fileDescriptor, bArr, i10, i11);
            } catch (ErrnoException e10) {
            }
        } while (e10.errno == OsConstants.EINTR);
        throw e10;
    }

    public static boolean U(File file) {
        File file2 = new File(file, f164460r);
        if (!file2.isFile()) {
            boolean z10 = file.lastModified() > 0 && System.currentTimeMillis() - file.lastModified() > f164456n;
            if (!z10) {
                file.getName();
            }
            return z10;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                FileLock fileLockTryLock = randomAccessFile.getChannel().tryLock();
                if (fileLockTryLock == null) {
                    randomAccessFile.close();
                    return false;
                }
                fileLockTryLock.release();
                randomAccessFile.close();
                return true;
            } finally {
            }
        } catch (Throwable unused) {
            return false;
        }
        return false;
    }

    public static int V(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static File W(File file) {
        File file2 = new File(file, "base.apk");
        if (file2.isFile()) {
            return file2;
        }
        File[] fileArrListFiles = file.listFiles(new j());
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return null;
        }
        for (File file3 : fileArrListFiles) {
            if (PkgUtils.g(file3.getAbsolutePath()) == null) {
                return file3;
            }
        }
        return fileArrListFiles[0];
    }

    public static String X(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj.getClass().getField("appPackageName").get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean Y(FileDescriptor fileDescriptor, byte[] bArr, int i10, int i11) throws Exception {
        int i12 = 0;
        while (i12 < i11) {
            int iT = T(fileDescriptor, bArr, i10 + i12, i11 - i12);
            if (iT <= 0) {
                return false;
            }
            i12 += iT;
        }
        return true;
    }

    public static int Z(Object obj, String str, int i10) {
        if (obj != null) {
            try {
                return obj.getClass().getField(str).getInt(obj);
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    public static long a0(Object obj, String str, long j10) {
        if (obj != null) {
            try {
                return obj.getClass().getField(str).getLong(obj);
            } catch (Throwable unused) {
            }
        }
        return j10;
    }

    public static /* synthetic */ void b(c cVar, IntentSender intentSender) {
        File fileW;
        String str;
        String str2 = cVar.f164476c;
        int i10 = 1;
        String message = null;
        try {
            G(cVar);
            long j10 = -1;
            if (cVar.f164478e != -1 && cVar.f164476c != null) {
                GuestAppInfo guestAppInfoE = C5842a.m().e(cVar.f164476c);
                if (guestAppInfoE != null) {
                    j10 = (((long) guestAppInfoE.versionCodeMajor) << 32) | (((long) guestAppInfoE.versionCode) & ZipKt.f225990j);
                }
                if (j10 != cVar.f164478e) {
                    throw new IllegalStateException("requiredInstalledVersionCode=" + cVar.f164478e + " but installed=" + j10);
                }
            }
            if (cVar.f164477d == 2) {
                N(cVar);
            }
            fileW = W(cVar.f164475b);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        if (fileW == null) {
            throw new IllegalStateException("no apk staged in session " + cVar.f164474a);
        }
        File file = new File(cVar.f164475b, "base.apk");
        if (!fileW.equals(file)) {
            file.delete();
            if (!fileW.renameTo(file)) {
                throw new IllegalStateException("cannot name base as base.apk: " + fileW);
            }
        }
        String strF = PkgUtils.f(file.getAbsolutePath());
        if (str2 == null) {
            str2 = strF;
        } else if (strF != null && !str2.equals(strF)) {
            throw new IllegalStateException("specified package " + str2 + " inconsistent with staged " + strF);
        }
        A(cVar.f164475b);
        file.getName();
        AppProceedInfo appProceedInfoJ = C5842a.m().j(file.getAbsolutePath(), cVar.f164477d == 2 ? 192 : 64);
        if (appProceedInfoJ == null || !appProceedInfoJ.isSuccess()) {
            if (appProceedInfoJ == null) {
                str = "install returned null";
            } else {
                str = appProceedInfoJ.code + RemoteSettings.FORWARD_SLASH_STRING + appProceedInfoJ.msg;
            }
            message = str;
        } else {
            i10 = 0;
        }
        if (appProceedInfoJ != null) {
            Objects.toString(appProceedInfoJ.code);
        }
        int i11 = cVar.f164474a;
        i0(intentSender, i10, str2, i11, message);
        F(cVar.f164474a);
    }

    public static Map<String, String> b0(c cVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        File file = new File(cVar.f164475b, f164461s);
        if (!file.isFile()) {
            return concurrentHashMap;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return concurrentHashMap;
                    }
                    int iIndexOf = line.indexOf(9);
                    if (iIndexOf > 0 && iIndexOf < line.length() - 1) {
                        concurrentHashMap.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            th.getMessage();
            return concurrentHashMap;
        }
    }

    public static void c0(File file) {
        int i10;
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    Map<Integer, c> map = f164463u;
                    try {
                        i10 = Integer.parseInt(file2.getName());
                    } catch (NumberFormatException unused) {
                        i10 = 0;
                    }
                    c cVar = map.get(Integer.valueOf(i10));
                    if ((cVar == null || !file2.equals(cVar.f164475b)) && U(file2) && P(file2)) {
                        D(file2);
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void d0(c cVar) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cVar.f164475b, f164462t), false);
            try {
                StringBuilder sb2 = new StringBuilder("mode=");
                sb2.append(cVar.f164477d);
                sb2.append("\nrequiredInstalledVersionCode=");
                sb2.append(cVar.f164478e);
                sb2.append("\npkg=");
                sb2.append(cVar.f164476c == null ? "" : cVar.f164476c);
                sb2.append("\n");
                fileOutputStream.write(sb2.toString().getBytes("UTF-8"));
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            int i10 = cVar.f164474a;
            th.getMessage();
        }
    }

    public static void e0(c cVar, String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cVar.f164475b, f164461s), true);
            try {
                fileOutputStream.write((str2 + "\t" + str + "\n").getBytes("UTF-8"));
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            int i10 = cVar.f164474a;
            th.getMessage();
        }
    }

    public static void f0(c cVar) {
        File file = new File(cVar.f164475b, f164462t);
        if (!file.isFile()) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return;
                    }
                    int iIndexOf = line.indexOf(61);
                    if (iIndexOf > 0) {
                        String strSubstring = line.substring(0, iIndexOf);
                        String strSubstring2 = line.substring(iIndexOf + 1);
                        if ("mode".equals(strSubstring)) {
                            cVar.f164477d = Integer.parseInt(strSubstring2);
                        } else if ("requiredInstalledVersionCode".equals(strSubstring)) {
                            cVar.f164478e = Long.parseLong(strSubstring2);
                        } else if ("pkg".equals(strSubstring) && !strSubstring2.isEmpty()) {
                            cVar.f164476c = strSubstring2;
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void g0(FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2) {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[65536];
        while (true) {
            try {
                if (Y(fileDescriptor, bArr, 0, 8)) {
                    int iT = t(bArr, 0);
                    if (iT == 1) {
                        int iT2 = t(bArr, 4);
                        while (iT2 > 0) {
                            int iT3 = T(fileDescriptor, bArr2, 0, Math.min(iT2, 65536));
                            if (iT3 <= 0) {
                                throw new EOFException("write payload truncated");
                            }
                            s0(fileDescriptor2, bArr2, 0, iT3);
                            iT2 -= iT3;
                        }
                    } else if (iT == 2) {
                        try {
                            Os.fsync(fileDescriptor2);
                        } catch (Throwable unused) {
                        }
                        s0(fileDescriptor, bArr, 0, 8);
                    } else if (iT == 3) {
                        try {
                            Os.fsync(fileDescriptor2);
                        } catch (Throwable unused2) {
                        }
                        s0(fileDescriptor, bArr, 0, 8);
                    }
                }
            } finally {
            }
        }
        try {
            Os.close(fileDescriptor2);
        } catch (Throwable unused3) {
        }
        try {
            Os.close(fileDescriptor);
        } catch (Throwable unused4) {
        }
    }

    public static void h0() {
        int iW;
        RandomAccessFile randomAccessFile;
        if (f164458p) {
            return;
        }
        synchronized (n.class) {
            try {
                if (f164458p) {
                    return;
                }
                File file = new File(M().getCacheDir(), f164445c);
                File file2 = new File(M().getFilesDir(), f164454l);
                try {
                    file.mkdirs();
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                } catch (Throwable th) {
                    iW = w() + f164449g;
                    th.getMessage();
                }
                try {
                    FileLock fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        int iW2 = -1;
                        if (randomAccessFile.length() > 0) {
                            randomAccessFile.seek(0L);
                            String line = randomAccessFile.readLine();
                            if (line != null) {
                                try {
                                    iW2 = Integer.parseInt(line.trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                        if (iW2 < 0 || iW2 > 536870399) {
                            iW2 = w();
                        }
                        iW = iW2 + f164449g;
                        randomAccessFile.setLength(0L);
                        randomAccessFile.seek(0L);
                        randomAccessFile.writeBytes(Integer.toString(iW2 + 256));
                        randomAccessFile.getFD().sync();
                        fileLockLock.release();
                        fileLockLock.close();
                        randomAccessFile.close();
                        f164457o.set(iW);
                        f164453k.set(iW + 256);
                        f164458p = true;
                        if (!f164459q) {
                            f164459q = true;
                            c0(file);
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i0(IntentSender intentSender, int i10, String str, int i11, String str2) {
        if (intentSender == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("android.content.pm.extra.STATUS", i10);
            intent.putExtra("android.content.pm.extra.SESSION_ID", i11);
            if (str != null) {
                intent.putExtra("android.content.pm.extra.PACKAGE_NAME", str);
            }
            if (str2 != null) {
                intent.putExtra("android.content.pm.extra.STATUS_MESSAGE", str2);
            }
            intentSender.sendIntent(M(), 0, intent, null, null);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void j0(Object obj, String str, Object obj2) {
        try {
            Field field = obj.getClass().getField(str);
            field.setAccessible(true);
            field.set(obj, obj2);
        } catch (Throwable unused) {
        }
    }

    public static File k0(int i10) {
        return new File(new File(M().getCacheDir(), f164445c), Integer.toString(i10));
    }

    public static boolean l0(File file) {
        if (file == null || !file.isDirectory()) {
            return false;
        }
        return !U(file);
    }

    public static int m0() {
        return 1;
    }

    public static int n0() {
        return 0;
    }

    public static Object p0(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new n(obj));
        } catch (Throwable th) {
            th.getMessage();
            return obj;
        }
    }

    public static ParcelFileDescriptor q0(FileDescriptor fileDescriptor) throws Exception {
        try {
            Constructor declaredConstructor = ParcelFileDescriptor.class.getDeclaredConstructor(FileDescriptor.class);
            declaredConstructor.setAccessible(true);
            return (ParcelFileDescriptor) declaredConstructor.newInstance(fileDescriptor);
        } catch (Throwable unused) {
            return ParcelFileDescriptor.dup(fileDescriptor);
        }
    }

    public static void r(c cVar) {
        File[] fileArrListFiles = cVar.f164475b.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        Map<String, String> mapB0 = b0(cVar);
        int i10 = 0;
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (file.isFile() && !f164460r.equals(name) && !f164461s.equals(name) && !f164462t.equals(name) && !name.startsWith("_app_metadata")) {
                String str = (String) ((ConcurrentHashMap) mapB0).get(name);
                if (str == null) {
                    if (name.toLowerCase(Locale.ROOT).endsWith(".apk")) {
                        name = C0922f.a(name, 4, 0);
                    }
                    str = name;
                }
                cVar.f164479f.put(Q(str), file);
                i10++;
            }
        }
        if (i10 > 0) {
            cVar.f164479f.keySet();
        }
    }

    public static void r0(Object[] objArr) {
        ParcelFileDescriptor parcelFileDescriptor;
        int length = objArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                parcelFileDescriptor = null;
                break;
            }
            Object obj = objArr[i10];
            if (obj instanceof ParcelFileDescriptor) {
                parcelFileDescriptor = (ParcelFileDescriptor) obj;
                break;
            }
            i10++;
        }
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static int s() {
        while (true) {
            AtomicInteger atomicInteger = f164457o;
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            AtomicInteger atomicInteger2 = f164453k;
            if (iIncrementAndGet <= atomicInteger2.get()) {
                return iIncrementAndGet;
            }
            synchronized (n.class) {
                try {
                    if (atomicInteger.get() > atomicInteger2.get()) {
                        atomicInteger2.get();
                        f164458p = false;
                        h0();
                    }
                } finally {
                }
            }
        }
    }

    public static void s0(FileDescriptor fileDescriptor, byte[] bArr, int i10, int i11) throws Exception {
        int iWrite;
        int i12 = 0;
        while (i12 < i11) {
            try {
                iWrite = Os.write(fileDescriptor, bArr, i10 + i12, i11 - i12);
            } catch (ErrnoException e10) {
                if (e10.errno != OsConstants.EINTR) {
                    throw e10;
                }
            }
            if (iWrite <= 0) {
                throw new IOException("short write");
            }
            i12 += iWrite;
        }
    }

    public static int t(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static Object u(c cVar) {
        try {
            Object objNewInstance = Class.forName("android.content.pm.PackageInstaller$SessionInfo").getDeclaredConstructor(null).newInstance(null);
            j0(objNewInstance, "sessionId", Integer.valueOf(cVar.f164474a));
            j0(objNewInstance, "appPackageName", cVar.f164476c);
            j0(objNewInstance, "installerPackageName", "com.android.vending");
            j0(objNewInstance, "resolvedBaseCodePath", new File(cVar.f164475b, "base.apk").getAbsolutePath());
            j0(objNewInstance, "progress", Float.valueOf(0.0f));
            j0(objNewInstance, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.TRUE);
            j0(objNewInstance, "mode", 1);
            return objNewInstance;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static void v(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (!f164460r.equals(file2.getName())) {
                D(file2);
            }
        }
    }

    public static int w() {
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - f164452j;
        if (jCurrentTimeMillis < 0) {
            return 0;
        }
        return (int) Math.min(jCurrentTimeMillis, 536870399L);
    }

    public static void x(c cVar) {
        try {
            if (cVar.f164481h != null) {
                cVar.f164481h.release();
            }
        } catch (Throwable unused) {
        }
        try {
            if (cVar.f164480g != null) {
                cVar.f164480g.close();
            }
        } catch (Throwable unused2) {
        }
        cVar.f164481h = null;
        cVar.f164480g = null;
    }

    public static void y(final c cVar, final IntentSender intentSender) {
        new Thread(new Runnable() { // from class: com.prism.gaia.client.stub.m
            @Override // java.lang.Runnable
            public final void run() {
                n.b(cVar, intentSender);
            }
        }, "pi-commit-" + cVar.f164474a).start();
    }

    public static void z(File file, File file2) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[65536];
                while (true) {
                    int i10 = fileInputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Object B(Method method, Object[] objArr) throws Exception {
        Object objK = K(method, objArr, "android.content.pm.PackageInstaller$SessionParams");
        String strX = X(objK);
        int iZ = Z(objK, "mode", 1);
        long jA0 = a0(objK, "requiredInstalledVersionCode", -1L);
        Z(objK, "installFlags", 0);
        h0();
        while (true) {
            int iS = s();
            c cVar = new c(iS, k0(iS), strX);
            cVar.f164477d = iZ;
            cVar.f164478e = jA0;
            Map<Integer, c> map = f164463u;
            if (map.putIfAbsent(Integer.valueOf(iS), cVar) == null) {
                if (!l0(cVar.f164475b)) {
                    J(cVar.f164475b);
                    v(cVar.f164475b);
                    I(cVar);
                    d0(cVar);
                    return Integer.valueOf(iS);
                }
                map.remove(Integer.valueOf(iS), cVar);
            }
        }
    }

    public final c L(int i10) {
        Map<Integer, c> map = f164463u;
        c cVar = map.get(Integer.valueOf(i10));
        if (cVar != null) {
            return cVar;
        }
        File fileK0 = k0(i10);
        fileK0.mkdirs();
        c cVar2 = new c(i10, fileK0, null);
        f0(cVar2);
        r(cVar2);
        c cVar3 = (c) map.putIfAbsent(Integer.valueOf(i10), cVar2);
        if (cVar3 == null) {
            I(cVar2);
        }
        return cVar3 != null ? cVar3 : cVar2;
    }

    public final Object R(int i10) {
        c cVarL = L(i10);
        try {
            Class<?> cls = Class.forName("android.content.pm.IPackageInstallerSession");
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b(cVarL));
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.client.stub.n.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o0(java.lang.Object[] r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L50
            int r1 = r9.length
            r2 = 0
            r3 = r0
            r4 = r3
        L7:
            if (r2 >= r1) goto L52
            r5 = r9[r2]
            boolean r6 = r5 instanceof android.content.IntentSender
            if (r6 == 0) goto L13
            r4 = r5
            android.content.IntentSender r4 = (android.content.IntentSender) r4
            goto L4d
        L13:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L26
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r7 = 46
            int r7 = r6.indexOf(r7)
            if (r7 <= 0) goto L26
            if (r3 != 0) goto L26
            r3 = r6
            goto L4d
        L26:
            if (r5 == 0) goto L4d
            java.lang.Class r6 = r5.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "android.content.pm.VersionedPackage"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L4d
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r7 = "getPackageName"
            java.lang.reflect.Method r6 = r6.getMethod(r7, r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L4d
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L4d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L4d
            r3 = r5
        L4d:
            int r2 = r2 + 1
            goto L7
        L50:
            r3 = r0
            r4 = r3
        L52:
            if (r3 != 0) goto L5c
            r9 = -1
            java.lang.String r1 = "no package name supplied"
            r2 = 4
            i0(r4, r2, r0, r9, r1)
            return r0
        L5c:
            java.lang.Thread r9 = new java.lang.Thread
            com.prism.gaia.client.stub.n$a r1 = new com.prism.gaia.client.stub.n$a
            r1.<init>(r3, r4)
            java.lang.String r2 = "pi-uninstall-"
            java.lang.String r2 = r2.concat(r3)
            r9.<init>(r1, r2)
            r9.start()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.client.stub.n.o0(java.lang.Object[]):java.lang.Object");
    }
}
