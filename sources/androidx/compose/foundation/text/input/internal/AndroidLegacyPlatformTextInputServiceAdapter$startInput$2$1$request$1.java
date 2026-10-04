package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.K0;
import androidx.compose.ui.graphics.C2086n2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends FunctionReferenceImpl implements ed.l<C2086n2, kotlin.L0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K0.a f93638a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(K0.a aVar) {
        super(1, G.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f93638a = aVar;
    }

    public final void e(@NotNull float[] fArr) {
        AndroidLegacyPlatformTextInputServiceAdapter.r(this.f93638a, fArr);
    }

    @Override // ed.l
    public /* synthetic */ kotlin.L0 invoke(C2086n2 c2086n2) {
        e(c2086n2.f101363a);
        return kotlin.L0.f217464a;
    }
}
