package com.bytedance.sdk.openadsdk.core.sAl.uR;

import com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class mZ extends uR {
    private final ZRu uR;
    private final List<NOt> ZRu = Collections.synchronizedList(new ArrayList());
    private int NOt = 1;
    private int mZ = 1;

    public interface NOt extends ZRu.InterfaceC0376ZRu {
        void ZRu(int i10, int i11);
    }

    public mZ() {
        ZRu zRu = new ZRu();
        this.uR = zRu;
        super.ZRu(zRu);
        ZRu(500);
    }

    public static /* synthetic */ int ZRu(mZ mZVar) {
        int i10 = mZVar.mZ;
        mZVar.mZ = i10 + 1;
        return i10;
    }

    public int OCA() {
        return this.mZ;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR
    public long WMI() {
        return (((long) (this.mZ - 1)) * super.yBV()) + super.WMI();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR
    public long yBV() {
        return super.yBV() * ((long) this.NOt);
    }

    public class ZRu implements ZRu.InterfaceC0376ZRu {
        private ZRu() {
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void NOt(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).NOt(zRu);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void TFq(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).TFq(zRu);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu) {
            mZ.ZRu(mZ.this);
            if (mZ.this.mZ > mZ.this.NOt) {
                Iterator it = mZ.this.ZRu.iterator();
                while (it.hasNext()) {
                    ((NOt) it.next()).ZRu(zRu);
                }
            } else {
                Iterator it2 = mZ.this.ZRu.iterator();
                while (it2.hasNext()) {
                    ((NOt) it2.next()).ZRu(mZ.this.mZ, mZ.this.NOt);
                }
                mZ.this.Vor();
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void mZ(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).mZ(zRu);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void uR(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).uR(zRu);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void NOt(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu, int i10) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).NOt(zRu, i10);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu, long j10) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).ZRu(zRu, j10);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu, com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu zRu2) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).ZRu(zRu, zRu2);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu, boolean z10) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).ZRu(zRu, z10);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu, int i10, int i11) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).ZRu(zRu, i10, i11);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu, int i10, int i11, int i12) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).ZRu(zRu, i10, i11, i12);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu, int i10) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).ZRu(zRu, i10);
            }
        }

        @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.InterfaceC0376ZRu
        public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu, long j10, long j11) {
            Iterator it = mZ.this.ZRu.iterator();
            while (it.hasNext()) {
                ((NOt) it.next()).ZRu(zRu, j10, j11);
            }
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR
    public void ZRu(ZRu.InterfaceC0376ZRu interfaceC0376ZRu) {
        if (!(interfaceC0376ZRu instanceof NOt)) {
            super.ZRu(interfaceC0376ZRu);
        } else {
            if (this.ZRu.contains(interfaceC0376ZRu)) {
                return;
            }
            this.ZRu.add((NOt) interfaceC0376ZRu);
        }
    }

    public void mZ(int i10) {
        this.NOt = Math.max(1, i10);
    }
}
