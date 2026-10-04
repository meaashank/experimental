package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.text.AnnotatedString;
import com.cookiegames.smartcookie.settings.fragment.AdBlockSettingsFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s7.C5579a;

/* JADX INFO: renamed from: androidx.compose.ui.platform.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,609:1\n1#2:610\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2236e implements InterfaceC2234d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103813b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClipboardManager f103814a;

    public C2236e(@NotNull ClipboardManager clipboardManager) {
        this.f103814a = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2234d0
    public boolean a() {
        ClipDescription primaryClipDescription = this.f103814a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType(AdBlockSettingsFragment.f147795A);
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2234d0
    @NotNull
    public ClipboardManager b() {
        return this.f103814a;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2234d0
    public void c(@Nullable Z z10) {
        if (z10 != null) {
            this.f103814a.setPrimaryClip(z10.f103771a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            T.a(this.f103814a);
        } else {
            this.f103814a.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC2234d0
    @Nullable
    public Z d() {
        ClipData primaryClip = this.f103814a.getPrimaryClip();
        if (primaryClip != null) {
            return new Z(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2234d0
    public void e(@NotNull AnnotatedString annotatedString) {
        this.f103814a.setPrimaryClip(ClipData.newPlainText(C2239f.f103824a, C2239f.b(annotatedString)));
    }

    @Override // androidx.compose.ui.platform.InterfaceC2234d0
    @Nullable
    public AnnotatedString getText() {
        ClipData primaryClip = this.f103814a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return C2239f.a(itemAt != null ? itemAt.getText() : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2236e(@NotNull Context context) {
        Object systemService = context.getSystemService(C5579a.f238596f);
        kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
