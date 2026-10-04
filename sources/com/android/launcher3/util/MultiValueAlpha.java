package com.android.launcher3.util;

import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class MultiValueAlpha {
    public static final Property<AlphaProperty, Float> VALUE = new AnonymousClass1(Float.TYPE, "value");
    private final AlphaProperty[] mMyProperties;
    private int mValidMask = 0;
    private final View mView;

    /* JADX INFO: renamed from: com.android.launcher3.util.MultiValueAlpha$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<AlphaProperty, Float> {
        public AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(AlphaProperty alphaProperty) {
            return Float.valueOf(alphaProperty.mValue);
        }

        @Override // android.util.Property
        public void set(AlphaProperty alphaProperty, Float f10) {
            alphaProperty.setValue(f10.floatValue());
        }
    }

    public class AlphaProperty {
        private final int mMyMask;
        private float mValue = 1.0f;
        private float mOthers = 1.0f;

        public AlphaProperty(int i10) {
            this.mMyMask = i10;
        }

        public float getValue() {
            return this.mValue;
        }

        public void setValue(float f10) {
            if (this.mValue == f10) {
                return;
            }
            if ((MultiValueAlpha.this.mValidMask & this.mMyMask) == 0) {
                this.mOthers = 1.0f;
                for (AlphaProperty alphaProperty : MultiValueAlpha.this.mMyProperties) {
                    if (alphaProperty != this) {
                        this.mOthers *= alphaProperty.mValue;
                    }
                }
            }
            MultiValueAlpha.this.mValidMask = this.mMyMask;
            this.mValue = f10;
            MultiValueAlpha.this.mView.setAlpha(this.mOthers * this.mValue);
        }
    }

    public MultiValueAlpha(View view, int i10) {
        this.mView = view;
        this.mMyProperties = new AlphaProperty[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 1 << i11;
            this.mValidMask |= i12;
            this.mMyProperties[i11] = new AlphaProperty(i12);
        }
    }

    public AlphaProperty getProperty(int i10) {
        return this.mMyProperties[i10];
    }
}
