package com.android.launcher3.anim;

import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyListBuilder {
    private final ArrayList<PropertyValuesHolder> mProperties = new ArrayList<>();

    public PropertyListBuilder alpha(float f10) {
        this.mProperties.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, f10));
        return this;
    }

    public PropertyValuesHolder[] build() {
        ArrayList<PropertyValuesHolder> arrayList = this.mProperties;
        return (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()]);
    }

    public PropertyListBuilder scale(float f10) {
        return scaleX(f10).scaleY(f10);
    }

    public PropertyListBuilder scaleX(float f10) {
        this.mProperties.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f10));
        return this;
    }

    public PropertyListBuilder scaleY(float f10) {
        this.mProperties.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10));
        return this;
    }

    public PropertyListBuilder translationX(float f10) {
        this.mProperties.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10));
        return this;
    }

    public PropertyListBuilder translationY(float f10) {
        this.mProperties.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f10));
        return this;
    }
}
