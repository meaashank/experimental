package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements ed.l<ViewParent, ViewParent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewKt$ancestors$1 f111702a = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final ViewParent e(ViewParent viewParent) {
        return viewParent.getParent();
    }

    @Override // ed.l
    public ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
