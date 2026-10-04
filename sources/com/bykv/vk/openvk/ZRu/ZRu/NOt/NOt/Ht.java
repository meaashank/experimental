package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt;

import R3.a;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Mm;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.gaia.server.accounts.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class Ht {
    private static volatile Ht uR;
    private final SparseArray<Set<Mm>> FA;
    private volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ Ht;
    private volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.NOt Mm;
    private volatile int NOt;
    private volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ TFq;
    private final Mm.mZ Vor;
    private volatile mZ ZH;
    private volatile ServerSocket ZRu;
    private volatile mZ aT;
    private final Runnable lp;
    private final AtomicInteger mZ = new AtomicInteger(0);
    private final AtomicBoolean sAl;

    public static final class ZRu implements Callable<Boolean> {
        private final int NOt;
        private final String ZRu;

        public ZRu(String str, int i10) {
            this.ZRu = str;
            this.NOt = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Socket socket;
            Throwable th;
            try {
                socket = new Socket(this.ZRu, this.NOt);
                try {
                    socket.setSoTimeout(2000);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        return Boolean.TRUE;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.getMessage();
                        Ht.ZRu("ping error", Log.getStackTraceString(th));
                    } finally {
                        com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(socket);
                    }
                }
            } catch (Throwable th3) {
                socket = null;
                th = th3;
            }
            return Boolean.FALSE;
        }
    }

    private Ht() {
        SparseArray<Set<Mm>> sparseArray = new SparseArray<>(2);
        this.FA = sparseArray;
        this.Vor = new Mm.mZ() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Ht.1
            @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Mm.mZ
            public void NOt(Mm mm) {
                if (TFq.mZ) {
                    Log.d("ProxyServer", "afterExecute, ProxyTask: ".concat(String.valueOf(mm)));
                }
                int iHt = mm.Ht();
                synchronized (Ht.this.FA) {
                    try {
                        Set set = (Set) Ht.this.FA.get(iHt);
                        if (set != null) {
                            set.remove(mm);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Mm.mZ
            public void ZRu(Mm mm) {
                synchronized (Ht.this.FA) {
                    try {
                        Set set = (Set) Ht.this.FA.get(mm.Ht());
                        if (set != null) {
                            set.add(mm);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.lp = new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Ht.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int i10 = 0;
                    Ht.this.ZRu = new ServerSocket(0, 50, InetAddress.getByName(Ht.this.Vor()));
                    Ht ht = Ht.this;
                    ht.NOt = ht.ZRu.getLocalPort();
                    if (Ht.this.NOt == -1) {
                        Ht.ZRu("socket not bound", "");
                        Ht.this.TFq();
                        return;
                    }
                    aT.ZRu(Ht.this.Vor(), Ht.this.NOt);
                    if (Ht.this.Mm()) {
                        AtomicInteger unused = Ht.this.mZ;
                        if (Ht.this.mZ.compareAndSet(0, 1)) {
                            AtomicInteger unused2 = Ht.this.mZ;
                            boolean z10 = TFq.mZ;
                            while (Ht.this.mZ.get() == 1) {
                                try {
                                    try {
                                        Socket socketAccept = Ht.this.ZRu.accept();
                                        com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ mZVar = Ht.this.TFq;
                                        if (mZVar != null) {
                                            final Mm mmZRu = new Mm.ZRu().ZRu(mZVar).ZRu(socketAccept).ZRu(Ht.this.Vor).ZRu();
                                            com.bytedance.sdk.component.FA.Ht.mZ().execute(new com.bytedance.sdk.component.FA.FA("ProxyTask", 10) { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Ht.2.1
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    mmZRu.run();
                                                }
                                            });
                                        } else {
                                            com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(socketAccept);
                                        }
                                    } catch (IOException e10) {
                                        Ht.ZRu("accept error", Log.getStackTraceString(e10));
                                        i10++;
                                        if (i10 > 3) {
                                            boolean z11 = TFq.mZ;
                                            Ht.this.TFq();
                                        }
                                    }
                                } catch (Throwable th) {
                                    String stackTraceString = Log.getStackTraceString(th);
                                    Log.e("ProxyServer", "proxy server crashed!  ".concat(String.valueOf(stackTraceString)));
                                    Ht.ZRu(CampaignEx.JSON_NATIVE_VIDEO_ERROR, stackTraceString);
                                }
                            }
                            boolean z112 = TFq.mZ;
                            Ht.this.TFq();
                        }
                    }
                } catch (IOException e11) {
                    if (TFq.mZ) {
                        Log.e("ProxyServer", "create ServerSocket error!  " + Log.getStackTraceString(e11));
                    }
                    Ht.ZRu("create ServerSocket error", Log.getStackTraceString(e11));
                    Ht.this.TFq();
                }
            }
        };
        this.sAl = new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    public static /* synthetic */ void ZRu(String str, String str2) {
    }

    private void FA() {
        Socket socketAccept = null;
        try {
            socketAccept = this.ZRu.accept();
            socketAccept.setSoTimeout(2000);
            if ("Ping".equals(new BufferedReader(new InputStreamReader(socketAccept.getInputStream())).readLine())) {
                OutputStream outputStream = socketAccept.getOutputStream();
                outputStream.write("OK\n".getBytes(com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu));
                outputStream.flush();
            }
        } catch (IOException e10) {
            Log.getStackTraceString(e10);
        } finally {
            com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(socketAccept);
        }
    }

    private void Ht() {
        int i10;
        ArrayList arrayList = new ArrayList();
        synchronized (this.FA) {
            try {
                int size = this.FA.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    SparseArray<Set<Mm>> sparseArray = this.FA;
                    Set<Mm> set = sparseArray.get(sparseArray.keyAt(i11));
                    if (set != null) {
                        arrayList.addAll(set);
                        set.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Mm) obj).ZRu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean Mm() {
        com.bytedance.sdk.component.FA.Mm mm = new com.bytedance.sdk.component.FA.Mm(new ZRu(Vor(), this.NOt), 5, 1);
        com.bytedance.sdk.component.FA.Ht.mZ().submit(mm);
        FA();
        try {
            if (((Boolean) mm.get()).booleanValue()) {
                boolean z10 = TFq.mZ;
                return true;
            }
            Log.e("ProxyServer", "Ping error");
            TFq();
            return false;
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            TFq();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void TFq() {
        if (this.mZ.compareAndSet(1, 2) || this.mZ.compareAndSet(0, 2)) {
            com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(this.ZRu);
            Ht();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Vor() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }

    public mZ NOt() {
        return this.aT;
    }

    public mZ mZ() {
        return this.ZH;
    }

    public void uR() {
        if (this.sAl.compareAndSet(false, true)) {
            Thread thread = new Thread(this.lp);
            thread.setName("csj_proxy_server");
            thread.start();
        }
    }

    public boolean ZRu(int i10, String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.FA) {
            Set<Mm> set = this.FA.get(i10);
            if (set != null) {
                for (Mm mm : set) {
                    if (mm != null && str.equals(mm.FA)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static Ht ZRu() {
        if (uR == null) {
            synchronized (Ht.class) {
                try {
                    if (uR == null) {
                        uR = new Ht();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uR;
    }

    public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ mZVar) {
        this.TFq = mZVar;
    }

    public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ mZVar) {
        this.Ht = mZVar;
    }

    public String ZRu(boolean z10, boolean z11, String str, String... strArr) {
        String str2;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return strArr[0];
        }
        if (this.TFq == null) {
            return strArr[0];
        }
        if ((z10 ? this.Mm : this.Ht) == null) {
            return strArr[0];
        }
        if (this.mZ.get() != 1) {
            return strArr[0];
        }
        List<String> listZRu = com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(strArr);
        if (listZRu == null) {
            return strArr[0];
        }
        String strZRu = Vor.ZRu(str, z11 ? str : com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.NOt.ZRu(str), listZRu);
        if (strZRu == null) {
            return strArr[0];
        }
        if (z10) {
            str2 = a.f67726d + Vor() + b.f166434b0 + this.NOt + "?f=1&" + strZRu;
        } else {
            str2 = a.f67726d + Vor() + b.f166434b0 + this.NOt + "?" + strZRu;
        }
        return str2.replaceFirst("s", "");
    }
}
