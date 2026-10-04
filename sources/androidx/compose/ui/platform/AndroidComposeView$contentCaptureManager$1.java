package androidx.compose.ui.platform;

import android.view.View;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements InterfaceC4376a<Y.d> {
    public AndroidComposeView$contentCaptureManager$1(Object obj) {
        super(0, obj, AndroidComposeView_androidKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
    }

    @Override // ed.InterfaceC4376a
    @Nullable
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final Y.d invoke() {
        return AndroidComposeView_androidKt.g((View) this.receiver);
    }
}
