package com.bytedance.adsdk.NOt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import androidx.multidex.MultiDexExtractor;
import androidx.multidex.d;
import com.bytedance.adsdk.NOt.TFq.Zf;
import com.bytedance.component.sdk.annotation.RawRes;
import com.bytedance.component.sdk.annotation.WorkerThread;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import u.e;
import zd.b;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    private static final Map<String, sAl<Mm>> ZRu = new HashMap();
    private static final Set<Object> NOt = new HashSet();
    private static final byte[] mZ = {80, 75, 3, 4};

    public static sAl<Mm> NOt(Context context, String str) {
        return NOt(context, str, "asset_".concat(String.valueOf(str)));
    }

    @WorkerThread
    public static lp<Mm> mZ(Context context, String str) {
        return mZ(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static sAl<Mm> NOt(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return ZRu(str2, new Callable<lp<Mm>>() { // from class: com.bytedance.adsdk.NOt.FA.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public lp<Mm> call() throws Exception {
                return FA.mZ(applicationContext, str, str2);
            }
        });
    }

    public static sAl<Mm> ZRu(Context context, String str) {
        return ZRu(context, str, "url_".concat(String.valueOf(str)));
    }

    @WorkerThread
    public static lp<Mm> mZ(Context context, String str, String str2) {
        try {
            if (!str.endsWith(MultiDexExtractor.f114845k) && !str.endsWith(".lottie")) {
                return NOt(context.getAssets().open(str), str2);
            }
            return ZRu(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new lp<>((Throwable) e10);
        }
    }

    public static sAl<Mm> ZRu(final Context context, final String str, final String str2) {
        return ZRu(str2, new Callable<lp<Mm>>() { // from class: com.bytedance.adsdk.NOt.FA.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public lp<Mm> call() throws Exception {
                lp<Mm> lpVarZRu = TFq.ZRu(context).ZRu(context, str, str2);
                if (str2 != null && lpVarZRu.ZRu() != null) {
                    com.bytedance.adsdk.NOt.mZ.TFq.ZRu().ZRu(str2, lpVarZRu.ZRu());
                }
                return lpVarZRu;
            }
        });
    }

    @WorkerThread
    public static lp<Mm> NOt(Context context, @RawRes int i10) {
        return NOt(context, i10, mZ(context, i10));
    }

    public static sAl<Mm> ZRu(Context context, @RawRes int i10) {
        return ZRu(context, i10, mZ(context, i10));
    }

    @WorkerThread
    public static lp<Mm> NOt(Context context, @RawRes int i10, String str) {
        try {
            return NOt(context.getResources().openRawResource(i10), mZ(context, i10));
        } catch (Resources.NotFoundException e10) {
            return new lp<>((Throwable) e10);
        }
    }

    public static sAl<Mm> ZRu(Context context, @RawRes final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return ZRu(str, new Callable<lp<Mm>>() { // from class: com.bytedance.adsdk.NOt.FA.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public lp<Mm> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return FA.NOt(context2, i10, str);
            }
        });
    }

    private static String mZ(Context context, @RawRes int i10) {
        return d.a(new StringBuilder("rawRes"), ZRu(context) ? "_night_" : "_day_", i10);
    }

    @WorkerThread
    public static lp<Mm> NOt(InputStream inputStream, String str) {
        return ZRu(inputStream, str, true);
    }

    @WorkerThread
    private static lp<Mm> NOt(Context context, ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            Mm mmZRu = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    mmZRu = ZRu(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).ZRu();
                } else if (!name.endsWith(e.f239314f) && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                    if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                        zipInputStream.closeEntry();
                    } else if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split(RemoteSettings.FORWARD_SLASH_STRING);
                        String str2 = strArrSplit[strArrSplit.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i10 = zipInputStream.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            file.getAbsolutePath();
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    }
                } else if (name.contains("../")) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    String[] strArrSplit2 = name.split(RemoteSettings.FORWARD_SLASH_STRING);
                    map.put(strArrSplit2[strArrSplit2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (mmZRu == null) {
                return new lp<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                aT aTVarZRu = ZRu(mmZRu, (String) entry.getKey());
                if (aTVarZRu != null) {
                    aTVarZRu.ZRu(com.bytedance.adsdk.NOt.Ht.Ht.ZRu((Bitmap) entry.getValue(), aTVarZRu.ZRu(), aTVarZRu.NOt()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z10 = false;
                for (com.bytedance.adsdk.NOt.mZ.mZ mZVar : mmZRu.oK().values()) {
                    if (mZVar.ZRu().equals(entry2.getKey())) {
                        mZVar.ZRu((Typeface) entry2.getValue());
                        z10 = true;
                    }
                }
                if (!z10) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, aT>> it = mmZRu.yBV().entrySet().iterator();
                while (it.hasNext()) {
                    aT value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strFA = value.FA();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strFA.startsWith(b.f241358c) && strFA.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strFA.substring(strFA.indexOf(44) + 1), 0);
                            value.ZRu(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, aT> entry3 : mmZRu.yBV().entrySet()) {
                if (entry3.getValue().aT() == null) {
                    return new lp<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().FA()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.NOt.mZ.TFq.ZRu().ZRu(str, mmZRu);
            }
            return new lp<>(mmZRu);
        } catch (IOException e10) {
            return new lp<>((Throwable) e10);
        }
    }

    private static boolean ZRu(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static sAl<Mm> ZRu(final InputStream inputStream, final String str) {
        return ZRu(str, new Callable<lp<Mm>>() { // from class: com.bytedance.adsdk.NOt.FA.6
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public lp<Mm> call() throws Exception {
                return FA.NOt(inputStream, str);
            }
        });
    }

    @WorkerThread
    private static lp<Mm> ZRu(InputStream inputStream, String str, boolean z10) {
        try {
            return ZRu(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z10) {
                com.bytedance.adsdk.NOt.Ht.Ht.ZRu(inputStream);
            }
        }
    }

    @WorkerThread
    public static lp<Mm> ZRu(JsonReader jsonReader, String str) {
        return ZRu(jsonReader, str, true);
    }

    private static lp<Mm> ZRu(JsonReader jsonReader, String str, boolean z10) {
        try {
            try {
                Mm mmZRu = Zf.ZRu(jsonReader);
                com.bytedance.adsdk.NOt.mZ.TFq.ZRu().ZRu(str, mmZRu);
                lp<Mm> lpVar = new lp<>(mmZRu);
                if (z10) {
                    ZRu(jsonReader);
                }
                return lpVar;
            } catch (Exception e10) {
                lp<Mm> lpVar2 = new lp<>(e10);
                if (z10) {
                    ZRu(jsonReader);
                }
                return lpVar2;
            }
        } catch (Throwable th) {
            if (z10) {
                ZRu(jsonReader);
            }
            throw th;
        }
    }

    public static void ZRu(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    @WorkerThread
    public static lp<Mm> ZRu(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return NOt(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.NOt.Ht.Ht.ZRu(zipInputStream);
        }
    }

    private static aT ZRu(Mm mm, String str) {
        for (aT aTVar : mm.yBV().values()) {
            if (aTVar.FA().equals(str)) {
                return aTVar;
            }
        }
        return null;
    }

    private static sAl<Mm> ZRu(final String str, Callable<lp<Mm>> callable) {
        final Mm mmZRu = str == null ? null : com.bytedance.adsdk.NOt.mZ.TFq.ZRu().ZRu(str);
        if (mmZRu != null) {
            return new sAl<>(new Callable<lp<Mm>>() { // from class: com.bytedance.adsdk.NOt.FA.7
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
                public lp<Mm> call() throws Exception {
                    return new lp<>(mmZRu);
                }
            });
        }
        if (str != null) {
            Map<String, sAl<Mm>> map = ZRu;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        sAl<Mm> sal = new sAl<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            sal.ZRu(new ZH<Mm>() { // from class: com.bytedance.adsdk.NOt.FA.2
                @Override // com.bytedance.adsdk.NOt.ZH
                public void ZRu(Mm mm) {
                    FA.ZRu.remove(str);
                    atomicBoolean.set(true);
                    if (FA.ZRu.size() == 0) {
                        FA.NOt(true);
                    }
                }
            });
            sal.mZ(new ZH<Throwable>() { // from class: com.bytedance.adsdk.NOt.FA.3
                @Override // com.bytedance.adsdk.NOt.ZH
                public void ZRu(Throwable th) {
                    FA.ZRu.remove(str);
                    atomicBoolean.set(true);
                    if (FA.ZRu.size() == 0) {
                        FA.NOt(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, sAl<Mm>> map2 = ZRu;
                map2.put(str, sal);
                if (map2.size() == 1) {
                    NOt(false);
                }
            }
        }
        return sal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void NOt(boolean z10) {
        ArrayList arrayList = new ArrayList(NOt);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10);
        }
    }
}
