package com.google.android.material.carousel;

import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements ShapeAppearanceModel.CornerSizeUnaryOperator {
    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public final CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.a(cornerSize);
    }
}
