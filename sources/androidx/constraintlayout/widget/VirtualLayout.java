package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f107791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f107792k;

    public VirtualLayout(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void A(AttributeSet attrs) {
        super.A(attrs);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.f110547y6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.f109877F6) {
                    this.f107791j = true;
                } else if (index == g.m.f110115V6) {
                    this.f107792k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void O(androidx.constraintlayout.core.widgets.i layout, int widthMeasureSpec, int heightMeasureSpec) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f107791j || this.f107792k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f107591b; i10++) {
                    View viewById = constraintLayout.getViewById(this.f107590a[i10]);
                    if (viewById != null) {
                        if (this.f107791j) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f107792k && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void s(ConstraintLayout container) {
        r(container);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        q();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        q();
    }

    public VirtualLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VirtualLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
