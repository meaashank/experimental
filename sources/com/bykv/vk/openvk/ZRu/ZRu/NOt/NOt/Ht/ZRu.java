package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Ht;

import android.text.TextUtils;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Ht;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.mZ;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    public static final boolean ZRu = mZ.mZ();
    private HashMap<String, Boolean> NOt;
    private C0370ZRu mZ;

    public static class NOt {
        private static final ZRu ZRu = new ZRu();
    }

    public static ZRu ZRu() {
        return NOt.ZRu;
    }

    private static com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ mZ() {
        File file = new File(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ mZVar = new com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ(file);
            try {
                mZVar.ZRu(104857600L);
                return mZVar;
            } catch (IOException unused) {
                return mZVar;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public boolean NOt() {
        if (this.mZ != null) {
            return true;
        }
        com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ mZVarMZ = mZ();
        if (mZVarMZ == null) {
            return false;
        }
        TFq.ZRu(true);
        TFq.NOt(true);
        TFq.ZRu(1);
        Ht.ZRu().uR();
        try {
            C0370ZRu c0370ZRu = new C0370ZRu();
            this.mZ = c0370ZRu;
            c0370ZRu.setName("csj_video_cache_preloader");
            this.mZ.start();
            TFq.ZRu(mZVarMZ, com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu());
            uR.mZ();
            uR.mZ().ZRu(10485759);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private ZRu() {
        this.NOt = new HashMap<>();
        NOt();
    }

    public boolean ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        if (!NOt()) {
            return false;
        }
        this.mZ.ZRu(mZVar);
        return true;
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Ht.ZRu$ZRu, reason: collision with other inner class name */
    public class C0370ZRu extends Thread {
        private final Queue<C0371ZRu> uR = new ArrayBlockingQueue(10);
        private Queue<C0371ZRu> NOt = new LinkedBlockingQueue();
        private boolean mZ = true;
        private Queue<C0371ZRu> TFq = new LinkedBlockingQueue();

        /* JADX INFO: renamed from: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Ht.ZRu$ZRu$ZRu, reason: collision with other inner class name */
        public class C0371ZRu {
            public com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ Ht;
            public String NOt;
            public String TFq;
            public int ZRu;
            public String[] mZ;
            public int uR;

            public C0371ZRu() {
            }
        }

        public C0370ZRu() {
        }

        private synchronized void NOt(C0371ZRu c0371ZRu) {
            this.TFq.add(c0371ZRu);
            notify();
        }

        private C0371ZRu ZRu(int i10, com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
            this.uR.size();
            C0371ZRu c0371ZRuPoll = this.uR.poll();
            if (c0371ZRuPoll == null) {
                c0371ZRuPoll = new C0371ZRu();
            }
            c0371ZRuPoll.ZRu = i10;
            c0371ZRuPoll.Ht = mZVar;
            return c0371ZRuPoll;
        }

        private void mZ(C0371ZRu c0371ZRu) {
            if (c0371ZRu == null) {
                return;
            }
            this.NOt.offer(c0371ZRu);
            notify();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.mZ) {
                synchronized (this) {
                    try {
                        if (!this.TFq.isEmpty()) {
                            ZRu();
                        }
                        while (!this.NOt.isEmpty()) {
                            C0371ZRu c0371ZRuPoll = this.NOt.poll();
                            if (c0371ZRuPoll != null) {
                                int i10 = c0371ZRuPoll.ZRu;
                                if (i10 == 0) {
                                    String[] strArr = c0371ZRuPoll.mZ;
                                    if (strArr != null && strArr.length > 0) {
                                        ArrayList arrayList = new ArrayList();
                                        for (String str : c0371ZRuPoll.mZ) {
                                            if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(str)) {
                                                arrayList.add(str);
                                            }
                                        }
                                        uR.mZ().ZRu(false, !TextUtils.isEmpty(c0371ZRuPoll.TFq), c0371ZRuPoll.uR, c0371ZRuPoll.NOt, (String[]) arrayList.toArray(new String[arrayList.size()]));
                                    }
                                } else if (i10 == 1) {
                                    uR.mZ().ZRu(c0371ZRuPoll.NOt);
                                } else if (i10 == 2) {
                                    uR.mZ().uR();
                                } else if (i10 == 3) {
                                    uR.mZ().uR();
                                    if (TFq.mZ() != null) {
                                        TFq.mZ();
                                        throw null;
                                    }
                                    if (TFq.NOt() != null) {
                                        TFq.NOt().ZRu();
                                    }
                                } else if (i10 == 4) {
                                    uR.mZ().uR();
                                    this.mZ = false;
                                }
                                ZRu(c0371ZRuPoll);
                            }
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        private void ZRu(C0371ZRu c0371ZRu) {
            c0371ZRu.mZ = null;
            c0371ZRu.NOt = null;
            c0371ZRu.ZRu = -1;
            c0371ZRu.Ht = null;
            this.uR.offer(c0371ZRu);
        }

        private void ZRu() {
            while (true) {
                C0371ZRu c0371ZRuPoll = this.TFq.poll();
                if (c0371ZRuPoll == null) {
                    return;
                }
                c0371ZRuPoll.NOt = c0371ZRuPoll.Ht.sAl();
                c0371ZRuPoll.mZ = new String[]{c0371ZRuPoll.Ht.sAl()};
                int iZRu = c0371ZRuPoll.Ht.ZRu();
                if (iZRu <= 0) {
                    iZRu = c0371ZRuPoll.Ht.mZ();
                }
                c0371ZRuPoll.uR = iZRu;
                c0371ZRuPoll.TFq = c0371ZRuPoll.Ht.edo();
                if (!TextUtils.isEmpty(c0371ZRuPoll.Ht.edo())) {
                    c0371ZRuPoll.NOt = c0371ZRuPoll.Ht.edo();
                }
                c0371ZRuPoll.Ht = null;
                mZ(c0371ZRuPoll);
            }
        }

        public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
            NOt(ZRu(0, mZVar));
        }
    }

    public String NOt(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        if (mZVar == null) {
            return null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(mZVar.edo());
        return Ht.ZRu().ZRu(false, !zIsEmpty, !zIsEmpty ? mZVar.edo() : mZVar.sAl(), mZVar.sAl());
    }
}
