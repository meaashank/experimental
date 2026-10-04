package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.prism.gaia.server.accounts.b;
import e.InterfaceC4326A;
import e.T;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {

    @InterfaceC4326A("TTPropHelper.class")
    private static ArrayMap<String, File> ZH = null;
    private static boolean ZRu = false;
    private static ArrayMap<File, NOt> lp;
    private static ZRu sAl;

    @InterfaceC4326A("mWriteLock")
    private long FA;

    @InterfaceC4326A("mLoadLock")
    private int Ht;

    @InterfaceC4326A("this")
    private long Mm;
    private final Object NOt;
    private volatile boolean TFq;
    private final File Vor;
    private final File aT;
    private final Object mZ;

    @InterfaceC4326A("mLoadLock")
    private Properties uR;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.NOt$NOt, reason: collision with other inner class name */
    public static class C0408NOt {
        final Properties NOt;
        boolean TFq;
        final long ZRu;
        final CountDownLatch mZ;

        @InterfaceC4326A("mWritingToDiskLock")
        volatile boolean uR;

        public void ZRu(boolean z10, boolean z11) {
            this.TFq = z10;
            this.uR = z11;
            this.mZ.countDown();
        }

        private C0408NOt(long j10, Properties properties) {
            this.mZ = new CountDownLatch(1);
            this.uR = false;
            this.TFq = false;
            this.ZRu = j10;
            this.NOt = properties;
        }
    }

    public interface ZRu {
        ExecutorService getExecutorService();
    }

    private NOt(File file) {
        Object obj = new Object();
        this.NOt = obj;
        this.mZ = new Object();
        this.uR = new Properties();
        this.TFq = false;
        this.Ht = 0;
        this.Vor = file;
        this.aT = ZRu(file);
        synchronized (obj) {
            this.TFq = false;
        }
        ZRu zRu = sAl;
        if (zRu == null || zRu.getExecutorService() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.NOt.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    NOt.this.ZRu();
                }
            }.start();
        } else {
            sAl.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.NOt.2
                @Override // java.lang.Runnable
                public void run() {
                    NOt.this.ZRu();
                }
            });
        }
    }

    public static /* synthetic */ long Ht(NOt nOt) {
        long j10 = nOt.Mm;
        nOt.Mm = 1 + j10;
        return j10;
    }

    public static /* synthetic */ int TFq(NOt nOt) {
        int i10 = nOt.Ht;
        nOt.Ht = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int Vor(NOt nOt) {
        int i10 = nOt.Ht;
        nOt.Ht = i10 - 1;
        return i10;
    }

    private void uR() {
        while (!this.TFq) {
            try {
                this.NOt.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public mZ NOt() {
        return new mZ();
    }

    public class mZ implements SharedPreferences.Editor {
        private final Object NOt = new Object();

        @InterfaceC4326A("mEditorLock")
        private final Map<String, Object> mZ = new HashMap();

        @InterfaceC4326A("mEditorLock")
        private boolean uR = false;

        public mZ() {
        }

        private C0408NOt NOt() {
            Properties properties;
            long j10;
            Object obj;
            boolean z10;
            synchronized (NOt.this.NOt) {
                try {
                    if (NOt.this.Ht > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(NOt.this.uR);
                        NOt.this.uR = properties2;
                    }
                    properties = NOt.this.uR;
                    NOt.TFq(NOt.this);
                    synchronized (this.NOt) {
                        try {
                            boolean z11 = false;
                            if (this.uR) {
                                if (properties.isEmpty()) {
                                    z10 = false;
                                } else {
                                    properties.clear();
                                    z10 = true;
                                }
                                this.uR = false;
                                z11 = z10;
                            }
                            for (Map.Entry<String, Object> entry : this.mZ.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z11 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z11 = true;
                                }
                            }
                            this.mZ.clear();
                            if (z11) {
                                NOt.Ht(NOt.this);
                            }
                            j10 = NOt.this.Mm;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new C0408NOt(j10, properties);
        }

        public mZ ZRu(String str, Set<String> set) {
            synchronized (this.NOt) {
                this.mZ.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            NOt.this.ZRu(NOt(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = NOt.ZRu ? System.currentTimeMillis() : 0L;
            C0408NOt c0408NOtNOt = NOt();
            NOt.this.ZRu(c0408NOtNOt, true);
            try {
                c0408NOtNOt.mZ.await();
                if (NOt.ZRu) {
                    Log.d("TTPropHelper", NOt.this.Vor.getName() + b.f166434b0 + c0408NOtNOt.ZRu + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                return c0408NOtNOt.uR;
            } catch (InterruptedException unused) {
                if (!NOt.ZRu) {
                    return false;
                }
                Log.d("TTPropHelper", NOt.this.Vor.getName() + b.f166434b0 + c0408NOtNOt.ZRu + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return false;
            } catch (Throwable th) {
                if (NOt.ZRu) {
                    Log.d("TTPropHelper", NOt.this.Vor.getName() + b.f166434b0 + c0408NOtNOt.ZRu + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return ZRu(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public mZ putInt(String str, int i10) {
            synchronized (this.NOt) {
                this.mZ.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public mZ putLong(String str, long j10) {
            synchronized (this.NOt) {
                this.mZ.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public mZ putFloat(String str, float f10) {
            synchronized (this.NOt) {
                this.mZ.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public mZ putString(String str, String str2) {
            synchronized (this.NOt) {
                this.mZ.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public mZ putBoolean(String str, boolean z10) {
            synchronized (this.NOt) {
                this.mZ.put(str, Boolean.valueOf(z10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public mZ remove(String str) {
            synchronized (this.NOt) {
                this.mZ.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public mZ clear() {
            synchronized (this.NOt) {
                this.uR = true;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0138 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014c A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.FileOutputStream] */
    @e.InterfaceC4326A("mWriteLock")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void NOt(com.bytedance.sdk.component.NOt.C0408NOt r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.NOt.NOt(com.bytedance.sdk.component.NOt$NOt, boolean):void");
    }

    public static void ZRu(@NotNull ZRu zRu) {
        sAl = zRu;
    }

    @T(api = 19)
    public static NOt ZRu(@NotNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (NOt.class) {
            try {
                if (ZH == null) {
                    ZH = new ArrayMap<>();
                }
                File file = ZH.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    ZH.put(str, file);
                }
                if (lp == null) {
                    lp = new ArrayMap<>();
                }
                NOt nOt = lp.get(file);
                if (nOt != null) {
                    return nOt;
                }
                NOt nOt2 = new NOt(file);
                lp.put(file, nOt2);
                return nOt2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File ZRu(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.NOt.ZRu():void");
    }

    public String ZRu(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.NOt) {
            uR();
            property = this.uR.getProperty(str, str2);
        }
        return property;
    }

    public int ZRu(String str, int i10) {
        int i11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.NOt) {
                try {
                    try {
                        uR();
                        i11 = Integer.parseInt(this.uR.getProperty(str, String.valueOf(i10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i11;
        }
        return i10;
    }

    public long ZRu(String str, long j10) {
        long j11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.NOt) {
                try {
                    try {
                        uR();
                        j11 = Long.parseLong(this.uR.getProperty(str, String.valueOf(j10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j11;
        }
        return j10;
    }

    public float ZRu(String str, float f10) {
        float f11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.NOt) {
                try {
                    try {
                        uR();
                        f11 = Float.parseFloat(this.uR.getProperty(str, String.valueOf(f10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f11;
        }
        return f10;
    }

    public boolean ZRu(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.NOt) {
                try {
                    try {
                        uR();
                        z11 = Boolean.parseBoolean(this.uR.getProperty(str, String.valueOf(z10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z11;
        }
        return z10;
    }

    public boolean ZRu(String str) {
        boolean zContainsKey;
        synchronized (this.NOt) {
            try {
                try {
                    uR();
                    zContainsKey = this.uR.containsKey(str);
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zContainsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(final C0408NOt c0408NOt, final boolean z10) {
        boolean z11;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.NOt.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (NOt.this.mZ) {
                    try {
                        NOt.this.NOt(c0408NOt, z10);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (NOt.this.NOt) {
                    NOt.Vor(NOt.this);
                }
            }
        };
        if (z10) {
            synchronized (this.NOt) {
                z11 = this.Ht == 1;
            }
            if (z11) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.mZ.ZRu(runnable, true ^ z10);
    }
}
