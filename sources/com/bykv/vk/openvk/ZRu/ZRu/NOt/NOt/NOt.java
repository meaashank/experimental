package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.FA;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Vor;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.lp;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class NOt extends com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu {
    private volatile FA.ZRu WMI;
    final Object edo;
    private final int oK;
    private volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.mZ.NOt qF;
    final Object sAl;
    private final InterfaceC0372NOt yBV;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt$NOt, reason: collision with other inner class name */
    public interface InterfaceC0372NOt {
        void ZRu(NOt nOt);
    }

    public NOt(ZRu zRu) {
        super(zRu.uR, zRu.TFq);
        this.oK = zRu.Mm;
        this.yBV = zRu.Vor;
        this.sAl = this;
        this.Mm = zRu.ZRu;
        this.FA = zRu.NOt;
        this.Ht = zRu.Ht;
        this.aT = zRu.mZ;
        this.Vor = zRu.FA;
        this.edo = zRu.aT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        mZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01be, code lost:
    
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.mZ == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c0, code lost:
    
        android.util.Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cc, code lost:
    
        com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(r6.uR());
        r4.ZRu();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d6, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.lp.ZRu r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.lp$ZRu):void");
    }

    private boolean aT() throws com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.mZ.ZRu {
        while (this.aT.ZRu()) {
            TFq();
            lp.ZRu zRuNOt = this.aT.NOt();
            try {
                ZRu(zRuNOt);
                return true;
            } catch (FA.ZRu e10) {
                this.WMI = e10;
                Mm();
                return false;
            } catch (com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.mZ.NOt e11) {
                this.qF = e11;
                return false;
            } catch (com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.mZ.mZ unused) {
                zRuNOt.ZRu();
                Mm();
            } catch (IOException e12) {
                if (e12 instanceof SocketTimeoutException) {
                    zRuNOt.NOt();
                }
                if (!NOt()) {
                    Mm();
                }
            } catch (Throwable unused2) {
                return false;
            }
        }
        return false;
    }

    public FA.ZRu FA() {
        return this.WMI;
    }

    public com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.mZ.NOt Vor() {
        return this.qF;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ZRu.ZRu(this.FA);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            aT();
        } catch (Throwable unused) {
        }
        this.uR.set(SystemClock.elapsedRealtime() - jElapsedRealtime);
        this.ZRu.NOt(this.FA);
        InterfaceC0372NOt interfaceC0372NOt = this.yBV;
        if (interfaceC0372NOt != null) {
            interfaceC0372NOt.ZRu(this);
        }
    }

    public static final class ZRu {
        Vor FA;
        List<Vor.NOt> Ht;
        int Mm;
        String NOt;
        com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ TFq;
        InterfaceC0372NOt Vor;
        String ZRu;
        Object aT;
        lp mZ;
        com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.ZRu uR;

        public ZRu NOt(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("key == null");
            }
            this.NOt = str;
            return this;
        }

        public ZRu ZRu(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("rawKey == null");
            }
            this.ZRu = str;
            return this;
        }

        public ZRu ZRu(lp lpVar) {
            if (lpVar != null) {
                this.mZ = lpVar;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        public ZRu ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.ZRu zRu) {
            if (zRu != null) {
                this.uR = zRu;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        public ZRu ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ mZVar) {
            if (mZVar != null) {
                this.TFq = mZVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        public ZRu ZRu(List<Vor.NOt> list) {
            this.Ht = list;
            return this;
        }

        public ZRu ZRu(int i10) {
            this.Mm = i10;
            return this;
        }

        public ZRu ZRu(InterfaceC0372NOt interfaceC0372NOt) {
            this.Vor = interfaceC0372NOt;
            return this;
        }

        public ZRu ZRu(Vor vor) {
            this.FA = vor;
            return this;
        }

        public ZRu ZRu(Object obj) {
            this.aT = obj;
            return this;
        }

        public NOt ZRu() {
            if (this.uR != null && this.TFq != null && !TextUtils.isEmpty(this.ZRu) && !TextUtils.isEmpty(this.NOt) && this.mZ != null) {
                return new NOt(this);
            }
            throw new IllegalArgumentException();
        }
    }
}
