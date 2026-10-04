package com.bytedance.sdk.openadsdk.core.settings;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.settings.TFq;
import com.bytedance.sdk.openadsdk.utils.WD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oK implements TFq {
    private final String Mm;
    private ZRu aT;
    private final ConcurrentHashMap<String, Object> mZ = new ConcurrentHashMap<>();
    private final Object uR = new Object();
    private final Object TFq = new Object();
    private final CountDownLatch Ht = new CountDownLatch(1);
    private Properties FA = new Properties();
    private volatile boolean Vor = false;

    public interface ZRu {
        void NOt();

        void ZRu();
    }

    public oK(String str, ZRu zRu) {
        this.Mm = str;
        this.aT = zRu;
        WD.ZRu(new com.bytedance.sdk.component.FA.FA("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.oK.1
            @Override // java.lang.Runnable
            public void run() {
                oK.this.ZRu(false);
            }
        });
    }

    private File Ht() {
        return new File(WMI.ZRu().getFilesDir(), this.Mm);
    }

    private void TFq() {
        if (this.Vor) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.Ht.await(WD.TFq() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("SdkSettings.Prop", "awaitLoadedLocked: ", e10);
        }
    }

    public void mZ() {
        File fileHt = Ht();
        if (fileHt.exists()) {
            fileHt.delete();
        }
    }

    public void uR() {
        ZRu zRu = this.aT;
        if (zRu != null) {
            zRu.NOt();
        }
    }

    public boolean NOt() {
        return this.Vor;
    }

    public String ZRu(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        TFq();
        return this.FA.getProperty(str, str2);
    }

    public int ZRu(String str, int i10) {
        if (str != null && !str.isEmpty()) {
            TFq();
            try {
                return Integer.parseInt(this.FA.getProperty(str, String.valueOf(i10)));
            } catch (NumberFormatException e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("SdkSettings.Prop", "", e10);
            }
        }
        return i10;
    }

    public long ZRu(String str, long j10) {
        if (str != null && !str.isEmpty()) {
            TFq();
            try {
                return Long.parseLong(this.FA.getProperty(str, String.valueOf(j10)));
            } catch (NumberFormatException e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("SdkSettings.Prop", "", e10);
            }
        }
        return j10;
    }

    public float ZRu(String str, float f10) {
        if (str != null && !str.isEmpty()) {
            TFq();
            try {
                return Float.parseFloat(this.FA.getProperty(str, String.valueOf(f10)));
            } catch (NumberFormatException e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("SdkSettings.Prop", "", e10);
            }
        }
        return f10;
    }

    public class NOt implements TFq.ZRu {
        private final Map<String, Object> NOt = new HashMap();
        private final Object mZ = new Object();

        public NOt() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.ZRu
        public void ZRu() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.mZ) {
                try {
                    properties.putAll(oK.this.FA);
                    boolean z10 = false;
                    for (Map.Entry<String, Object> entry : this.NOt.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (properties.containsKey(key) && (obj = properties.get(key)) != null && obj.equals(value)) {
                            }
                            properties.put(key, String.valueOf(value));
                            z10 = true;
                        } else if (properties.containsKey(key)) {
                            properties.remove(key);
                            z10 = true;
                        }
                    }
                    this.NOt.clear();
                    if (z10) {
                        oK.this.ZRu(properties);
                        oK.this.FA = properties;
                        oK.this.mZ.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.ZRu
        public TFq.ZRu ZRu(String str, String str2) {
            synchronized (this.mZ) {
                this.NOt.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.ZRu
        public TFq.ZRu ZRu(String str, int i10) {
            synchronized (this.mZ) {
                this.NOt.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.ZRu
        public TFq.ZRu ZRu(String str, long j10) {
            synchronized (this.mZ) {
                this.NOt.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.ZRu
        public TFq.ZRu ZRu(String str) {
            synchronized (this.mZ) {
                this.NOt.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.ZRu
        public TFq.ZRu ZRu(String str, float f10) {
            synchronized (this.mZ) {
                this.NOt.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.ZRu
        public TFq.ZRu ZRu(String str, boolean z10) {
            synchronized (this.mZ) {
                this.NOt.put(str, Boolean.valueOf(z10));
            }
            return this;
        }
    }

    public boolean ZRu(String str, boolean z10) {
        if (str != null && !str.isEmpty()) {
            TFq();
            try {
                return Boolean.parseBoolean(this.FA.getProperty(str, String.valueOf(z10)));
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("SdkSettings.Prop", "", e10);
            }
        }
        return z10;
    }

    public void ZRu(boolean z10) {
        ZRu zRu;
        Object obj;
        FileInputStream fileInputStream;
        synchronized (this.uR) {
            try {
                if (!this.Vor || z10) {
                    File fileHt = Ht();
                    if (fileHt.exists()) {
                        Properties properties = new Properties();
                        FileInputStream fileInputStream2 = null;
                        try {
                            try {
                                fileInputStream = new FileInputStream(fileHt);
                            } catch (Throwable th) {
                                if (fileInputStream2 != null) {
                                    com.bytedance.sdk.openadsdk.utils.aT.ZRu(fileInputStream2);
                                }
                                this.uR.notifyAll();
                                throw th;
                            }
                        } catch (OutOfMemoryError unused) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            properties.load(fileInputStream);
                            properties.size();
                            new StringBuilder("items from ").append(fileHt.getAbsolutePath());
                            if (!properties.isEmpty()) {
                                this.FA = properties;
                                this.mZ.clear();
                            }
                            com.bytedance.sdk.openadsdk.utils.aT.ZRu(fileInputStream);
                            obj = this.uR;
                        } catch (OutOfMemoryError unused2) {
                            fileInputStream2 = fileInputStream;
                            try {
                                com.bytedance.sdk.component.utils.Ht.mZ(fileHt);
                            } catch (Throwable th3) {
                                com.bytedance.sdk.component.utils.lp.ZRu("SdkSettings.Prop", "delete: ", th3);
                            }
                            if (fileInputStream2 != null) {
                                com.bytedance.sdk.openadsdk.utils.aT.ZRu(fileInputStream2);
                            }
                            obj = this.uR;
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream2 = fileInputStream;
                            com.bytedance.sdk.component.utils.lp.ZRu("SdkSettings.Prop", "reload: ", th);
                            if (fileInputStream2 != null) {
                                com.bytedance.sdk.openadsdk.utils.aT.ZRu(fileInputStream2);
                            }
                            obj = this.uR;
                        }
                        obj.notifyAll();
                    } else if (com.bytedance.sdk.component.utils.WMI.ZRu(WMI.ZRu()) && "tt_sdk_settings.prop".equals(this.Mm)) {
                        try {
                            boolean z11 = false;
                            SharedPreferences sharedPreferences = WMI.ZRu().getSharedPreferences("tt_sdk_settings", 0);
                            if (!sharedPreferences.getAll().isEmpty()) {
                                TFq.ZRu ZRu2 = ZRu();
                                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                                    String key = entry.getKey();
                                    Object value = entry.getValue();
                                    if (key != null && !key.isEmpty() && value != null) {
                                        ZRu2.ZRu(key, value.toString());
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    ZRu2.ZRu();
                                }
                                sharedPreferences.edit().clear().commit();
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    if (!this.Vor && (zRu = this.aT) != null) {
                        zRu.ZRu();
                    }
                    this.Vor = true;
                    this.Ht.countDown();
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public TFq.ZRu ZRu() {
        return new NOt();
    }

    public <T> T ZRu(String str, T t10, TFq.NOt<T> nOt) {
        T tNOt;
        if (str != null && !str.isEmpty()) {
            if (this.mZ.containsKey(str)) {
                try {
                    return (T) this.mZ.get(str);
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.lp.ZRu("SdkSettings.Prop", "", e10);
                    return t10;
                }
            }
            TFq();
            String property = this.FA.getProperty(str, null);
            if (property != null && nOt != null && (tNOt = nOt.NOt(property)) != null) {
                this.mZ.put(str, tNOt);
                return tNOt;
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(Properties properties) {
        FileOutputStream fileOutputStream;
        synchronized (this.TFq) {
            File fileHt = Ht();
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(fileHt);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                properties.store(fileOutputStream, (String) null);
                fileHt.getAbsolutePath();
                com.bytedance.sdk.openadsdk.utils.aT.ZRu(fileOutputStream);
            } catch (Exception e11) {
                e = e11;
                fileOutputStream2 = fileOutputStream;
                com.bytedance.sdk.component.utils.lp.ZRu("SdkSettings.Prop", "saveToLocal: ", e);
                if (fileOutputStream2 != null) {
                    com.bytedance.sdk.openadsdk.utils.aT.ZRu(fileOutputStream2);
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    com.bytedance.sdk.openadsdk.utils.aT.ZRu(fileOutputStream2);
                }
                throw th;
            }
        }
        yBV.qZ();
    }
}
