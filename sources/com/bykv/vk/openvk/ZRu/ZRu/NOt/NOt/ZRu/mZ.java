package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR;
import com.bytedance.sdk.component.FA.FA;
import com.bytedance.sdk.component.FA.Ht;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.ZRu {
    private volatile float FA;
    private final Set<ZRu> Ht;
    private volatile long Mm;
    private final LinkedHashMap<String, File> NOt = new LinkedHashMap<>(0, 0.75f, true);
    private final ReentrantReadWriteLock.WriteLock TFq;
    private final NOt Vor;
    private final Handler ZH;
    public final File ZRu;
    private final Runnable aT;
    private final ReentrantReadWriteLock mZ;
    private final ReentrantReadWriteLock.ReadLock uR;

    public static final class NOt {
        private final Map<String, Integer> ZRu;

        private NOt() {
            this.ZRu = new HashMap();
        }

        public synchronized void NOt(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.ZRu.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.ZRu.remove(str);
                    return;
                }
                this.ZRu.put(str, Integer.valueOf(num.intValue() - 1));
            }
        }

        public synchronized void ZRu(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.ZRu.get(str);
                if (num == null) {
                    this.ZRu.put(str, 1);
                    return;
                }
                this.ZRu.put(str, Integer.valueOf(num.intValue() + 1));
            }
        }

        public synchronized boolean mZ(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.ZRu.containsKey(str);
        }
    }

    public interface ZRu {
        void ZRu(String str);

        void ZRu(Set<String> set);
    }

    public mZ(File file) throws IOException {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mZ = reentrantReadWriteLock;
        this.uR = reentrantReadWriteLock.readLock();
        this.TFq = reentrantReadWriteLock.writeLock();
        this.Ht = Collections.newSetFromMap(new ConcurrentHashMap());
        this.Mm = 104857600L;
        this.FA = 0.5f;
        this.Vor = new NOt();
        this.aT = new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ.1
            @Override // java.lang.Runnable
            public void run() {
                Ht.NOt(new FA("cleanupCmd", 1) { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        mZ mZVar = mZ.this;
                        mZVar.NOt(mZVar.Mm);
                    }
                });
            }
        };
        this.ZH = new Handler(Looper.getMainLooper());
        if (file != null && file.exists() && file.isDirectory() && file.canRead() && file.canWrite()) {
            this.ZRu = file;
            Ht.NOt(new FA("DiskLruCache", 5) { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ.2
                @Override // java.lang.Runnable
                public void run() {
                    mZ.this.NOt();
                }
            });
            return;
        }
        if (file == null) {
            str = " dir null";
        } else {
            str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
        }
        throw new IOException("dir error!  ".concat(String.valueOf(str)));
    }

    private void mZ() {
        this.ZH.removeCallbacks(this.aT);
        this.ZH.postDelayed(this.aT, 10000L);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.ZRu
    public File uR(String str) {
        if (!this.uR.tryLock()) {
            return null;
        }
        File file = this.NOt.get(str);
        this.uR.unlock();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt() {
        this.TFq.lock();
        try {
            File[] fileArrListFiles = this.ZRu.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                final HashMap map = new HashMap(fileArrListFiles.length);
                ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                int i10 = 0;
                for (File file : fileArrListFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        map.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new Comparator<File>() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ.3
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        long jLongValue = ((Long) map.get(file2)).longValue() - ((Long) map.get(file3)).longValue();
                        if (jLongValue < 0) {
                            return -1;
                        }
                        return jLongValue > 0 ? 1 : 0;
                    }
                });
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    File file2 = (File) obj;
                    this.NOt.put(ZRu(file2), file2);
                }
            }
            this.TFq.unlock();
            mZ();
        } catch (Throwable th) {
            this.TFq.unlock();
            throw th;
        }
    }

    public void ZRu(ZRu zRu) {
        if (zRu != null) {
            this.Ht.add(zRu);
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.ZRu
    public File mZ(String str) {
        this.uR.lock();
        File file = this.NOt.get(str);
        this.uR.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.ZRu, str);
        this.TFq.lock();
        this.NOt.put(str, file2);
        this.TFq.unlock();
        Iterator<ZRu> it = this.Ht.iterator();
        while (it.hasNext()) {
            it.next().ZRu(str);
        }
        mZ();
        return file2;
    }

    public void ZRu(long j10) {
        this.Mm = j10;
        mZ();
    }

    public void ZRu() {
        uR.mZ().uR();
        Context contextZRu = TFq.ZRu();
        if (contextZRu != null) {
            com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ.ZRu(contextZRu).ZRu(0);
        }
        this.ZH.removeCallbacks(this.aT);
        Ht.NOt(new FA("clear", 1) { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ.4
            @Override // java.lang.Runnable
            public void run() {
                mZ.this.NOt(0L);
            }
        });
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.ZRu
    public void ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.Vor.ZRu(str);
    }

    private String ZRu(File file) {
        return file.getName();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.ZRu
    public void NOt(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.Vor.NOt(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(long j10) {
        HashSet hashSet;
        final HashSet hashSet2 = new HashSet();
        this.TFq.lock();
        try {
            Iterator<Map.Entry<String, File>> it = this.NOt.entrySet().iterator();
            long length = 0;
            while (it.hasNext()) {
                length += it.next().getValue().length();
            }
            if (length <= j10) {
                this.TFq.unlock();
                return;
            }
            long j11 = (long) (j10 * this.FA);
            hashSet = new HashSet();
            try {
                for (Map.Entry<String, File> entry : this.NOt.entrySet()) {
                    File value = entry.getValue();
                    if (value != null && value.exists()) {
                        if (!this.Vor.mZ(ZRu(value))) {
                            long length2 = value.length();
                            File file = new File(value.getAbsolutePath() + "-tmp");
                            if (value.renameTo(file)) {
                                hashSet2.add(file);
                                length -= length2;
                                hashSet.add(entry.getKey());
                            }
                        }
                    } else {
                        hashSet.add(entry.getKey());
                    }
                    if (length <= j11) {
                        break;
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    this.NOt.remove((String) it2.next());
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            hashSet = null;
        }
        this.TFq.unlock();
        Iterator<ZRu> it3 = this.Ht.iterator();
        while (it3.hasNext()) {
            it3.next().ZRu(hashSet);
        }
        Ht.NOt(new FA("trimSize", 1) { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ.5
            @Override // java.lang.Runnable
            public void run() {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    try {
                        ((File) it4.next()).delete();
                    } catch (Throwable unused3) {
                    }
                }
            }
        });
    }
}
