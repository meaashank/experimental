package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class gI {

    public interface NOt {
        void NOt();

        void ZRu();

        void ZRu(View view, boolean z10);

        void ZRu(boolean z10);
    }

    public class ZRu implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ViewGroup NOt;
        View ZRu = null;

        public ZRu(ViewGroup viewGroup) {
            this.NOt = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                NOt nOt = (NOt) this.NOt.getTag(520093765);
                if (this.ZRu == null) {
                    ViewGroup viewGroup = this.NOt;
                    gI.NOt(viewGroup, nOt, (Integer) viewGroup.getTag(520093766));
                    return;
                }
                Rect rect = new Rect();
                this.ZRu.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.NOt.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (nOt != null) {
                        nOt.ZRu(this.NOt, false);
                    }
                    this.NOt.setTag(520093763, Boolean.FALSE);
                } else {
                    if (nOt != null) {
                        nOt.ZRu(this.NOt, true);
                    }
                    this.NOt.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e10) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.NOt.getTag(520093765), "ViewUtils", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void NOt(View view, NOt nOt, Integer num) {
        if (nOt == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        if (ZRu(view, num.intValue())) {
            nOt.ZRu(view, true);
        }
    }

    public static void ZRu(final ViewGroup viewGroup, boolean z10, int i10, NOt nOt, List<ViewGroup> list) {
        viewGroup.setTag(520093765, nOt);
        viewGroup.setTag(520093766, Integer.valueOf(i10));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final ZRu zRu = new ZRu(viewGroup);
        if (list != null && list.size() > 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.get(i11).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.gI.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        zRu.ZRu = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        zRu.ZRu = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(zRu);
        if (z10) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.gI.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        NOt nOt2 = (NOt) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        gI.NOt(viewGroup2, nOt2, (Integer) viewGroup2.getTag(520093766));
                    } catch (Exception e10) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.gI.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z11) {
                try {
                    NOt nOt2 = (NOt) viewGroup.getTag(520093765);
                    if (nOt2 != null) {
                        nOt2.ZRu(z11);
                        ViewGroup viewGroup2 = viewGroup;
                        gI.NOt(viewGroup2, nOt2, (Integer) viewGroup2.getTag(520093766));
                    }
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.gI.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                NOt nOt2 = (NOt) viewGroup.getTag(520093765);
                if (nOt2 != null) {
                    nOt2.ZRu();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                NOt nOt2 = (NOt) viewGroup.getTag(520093765);
                if (nOt2 != null) {
                    nOt2.NOt();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean ZRu(View view, int i10) {
        return com.bytedance.sdk.openadsdk.core.th.ZRu(view, 20, i10);
    }
}
