package com.bytedance.adsdk.NOt.ZRu.NOt;

import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.d;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu<K, A> {
    private final mZ<K> TFq;
    protected com.bytedance.adsdk.NOt.Mm.NOt<A> mZ;
    final List<InterfaceC0381ZRu> ZRu = new ArrayList(1);
    private boolean uR = false;
    protected float NOt = 0.0f;
    private A Ht = null;
    private float Mm = -1.0f;
    private float FA = -1.0f;

    public static final class NOt<T> implements mZ<T> {
        private NOt() {
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public com.bytedance.adsdk.NOt.Mm.ZRu<T> NOt() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public boolean ZRu() {
            return true;
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public float mZ() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public float uR() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public boolean NOt(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public boolean ZRu(float f10) {
            return false;
        }
    }

    public static final class TFq<T> implements mZ<T> {
        private float NOt = -1.0f;
        private final com.bytedance.adsdk.NOt.Mm.ZRu<T> ZRu;

        public TFq(List<? extends com.bytedance.adsdk.NOt.Mm.ZRu<T>> list) {
            this.ZRu = list.get(0);
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public com.bytedance.adsdk.NOt.Mm.ZRu<T> NOt() {
            return this.ZRu;
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public boolean ZRu() {
            return false;
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public float mZ() {
            return this.ZRu.mZ();
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public float uR() {
            return this.ZRu.uR();
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public boolean NOt(float f10) {
            if (this.NOt == f10) {
                return true;
            }
            this.NOt = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public boolean ZRu(float f10) {
            return !this.ZRu.TFq();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.NOt.ZRu.NOt.ZRu$ZRu, reason: collision with other inner class name */
    public interface InterfaceC0381ZRu {
        void ZRu();
    }

    public interface mZ<T> {
        com.bytedance.adsdk.NOt.Mm.ZRu<T> NOt();

        boolean NOt(float f10);

        boolean ZRu();

        boolean ZRu(float f10);

        @FloatRange(from = 0.0d, to = 1.0d)
        float mZ();

        @FloatRange(from = 0.0d, to = 1.0d)
        float uR();
    }

    public static final class uR<T> implements mZ<T> {
        private final List<? extends com.bytedance.adsdk.NOt.Mm.ZRu<T>> ZRu;
        private com.bytedance.adsdk.NOt.Mm.ZRu<T> mZ = null;
        private float uR = -1.0f;
        private com.bytedance.adsdk.NOt.Mm.ZRu<T> NOt = mZ(0.0f);

        public uR(List<? extends com.bytedance.adsdk.NOt.Mm.ZRu<T>> list) {
            this.ZRu = list;
        }

        private com.bytedance.adsdk.NOt.Mm.ZRu<T> mZ(float f10) {
            com.bytedance.adsdk.NOt.Mm.ZRu<T> zRu = (com.bytedance.adsdk.NOt.Mm.ZRu) d.a(this.ZRu, 1);
            if (f10 >= zRu.mZ()) {
                return zRu;
            }
            for (int size = this.ZRu.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.NOt.Mm.ZRu<T> zRu2 = this.ZRu.get(size);
                if (this.NOt != zRu2 && zRu2.ZRu(f10)) {
                    return zRu2;
                }
            }
            return this.ZRu.get(0);
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public com.bytedance.adsdk.NOt.Mm.ZRu<T> NOt() {
            return this.NOt;
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public boolean ZRu() {
            return false;
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public float uR() {
            return ((com.bytedance.adsdk.NOt.Mm.ZRu) d.a(this.ZRu, 1)).uR();
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public boolean NOt(float f10) {
            com.bytedance.adsdk.NOt.Mm.ZRu<T> zRu = this.mZ;
            com.bytedance.adsdk.NOt.Mm.ZRu<T> zRu2 = this.NOt;
            if (zRu == zRu2 && this.uR == f10) {
                return true;
            }
            this.mZ = zRu2;
            this.uR = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public boolean ZRu(float f10) {
            if (this.NOt.ZRu(f10)) {
                return !this.NOt.TFq();
            }
            this.NOt = mZ(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.mZ
        public float mZ() {
            return this.ZRu.get(0).mZ();
        }
    }

    public ZRu(List<? extends com.bytedance.adsdk.NOt.Mm.ZRu<K>> list) {
        this.TFq = ZRu(list);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    private float Vor() {
        if (this.Mm == -1.0f) {
            this.Mm = this.TFq.mZ();
        }
        return this.Mm;
    }

    public float FA() {
        return this.NOt;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float Ht() {
        if (this.FA == -1.0f) {
            this.FA = this.TFq.uR();
        }
        return this.FA;
    }

    public A Mm() {
        float fUR = uR();
        if (this.mZ == null && this.TFq.NOt(fUR)) {
            return this.Ht;
        }
        com.bytedance.adsdk.NOt.Mm.ZRu<K> zRuMZ = mZ();
        Interpolator interpolator = zRuMZ.uR;
        A aZRu = (interpolator == null || zRuMZ.TFq == null) ? ZRu(zRuMZ, TFq()) : ZRu(zRuMZ, fUR, interpolator.getInterpolation(fUR), zRuMZ.TFq.getInterpolation(fUR));
        this.Ht = aZRu;
        return aZRu;
    }

    public void NOt() {
        for (int i10 = 0; i10 < this.ZRu.size(); i10++) {
            this.ZRu.get(i10).ZRu();
        }
    }

    public float TFq() {
        com.bytedance.adsdk.NOt.Mm.ZRu<K> zRuMZ = mZ();
        if (zRuMZ == null || zRuMZ.TFq()) {
            return 0.0f;
        }
        return zRuMZ.mZ.getInterpolation(uR());
    }

    public abstract A ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<K> zRu, float f10);

    public void ZRu() {
        this.uR = true;
    }

    public com.bytedance.adsdk.NOt.Mm.ZRu<K> mZ() {
        com.bytedance.adsdk.NOt.TFq.ZRu("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.NOt.Mm.ZRu<K> zRuNOt = this.TFq.NOt();
        com.bytedance.adsdk.NOt.TFq.NOt("BaseKeyframeAnimation#getCurrentKeyframe");
        return zRuNOt;
    }

    public float uR() {
        if (this.uR) {
            return 0.0f;
        }
        com.bytedance.adsdk.NOt.Mm.ZRu<K> zRuMZ = mZ();
        if (zRuMZ.TFq()) {
            return 0.0f;
        }
        return (this.NOt - zRuMZ.mZ()) / (zRuMZ.uR() - zRuMZ.mZ());
    }

    public void ZRu(InterfaceC0381ZRu interfaceC0381ZRu) {
        this.ZRu.add(interfaceC0381ZRu);
    }

    public void ZRu(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        if (this.TFq.ZRu()) {
            return;
        }
        if (f10 < Vor()) {
            f10 = Vor();
        } else if (f10 > Ht()) {
            f10 = Ht();
        }
        if (f10 == this.NOt) {
            return;
        }
        this.NOt = f10;
        if (this.TFq.ZRu(f10)) {
            NOt();
        }
    }

    public A ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<K> zRu, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> mZ<T> ZRu(List<? extends com.bytedance.adsdk.NOt.Mm.ZRu<T>> list) {
        if (list.isEmpty()) {
            return new NOt();
        }
        if (list.size() == 1) {
            return new TFq(list);
        }
        return new uR(list);
    }
}
