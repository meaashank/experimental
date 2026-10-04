package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.AbstractC2360m;
import androidx.compose.ui.text.InterfaceC2361n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class q extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AbstractC2360m f104928a;

    public q(@NotNull AbstractC2360m abstractC2360m) {
        this.f104928a = abstractC2360m;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View view) {
        InterfaceC2361n interfaceC2361nA = this.f104928a.a();
        if (interfaceC2361nA != null) {
            interfaceC2361nA.a(this.f104928a);
        }
    }
}
