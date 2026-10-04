package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 extends FunctionReferenceImpl implements ed.l<View, InputMethodManagerImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 f93766a = new LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1();

    public LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1() {
        super(1, InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }

    @NotNull
    public final InputMethodManagerImpl e(@NotNull View view) {
        return new InputMethodManagerImpl(view);
    }

    @Override // ed.l
    public InputMethodManagerImpl invoke(View view) {
        return new InputMethodManagerImpl(view);
    }
}
