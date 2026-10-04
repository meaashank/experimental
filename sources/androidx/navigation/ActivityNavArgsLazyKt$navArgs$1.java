package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nActivityNavArgsLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavArgsLazy.kt\nandroidx/navigation/ActivityNavArgsLazyKt$navArgs$1\n*L\n1#1,47:1\n*E\n"})
public final class ActivityNavArgsLazyKt$navArgs$1 extends Lambda implements InterfaceC4376a<Bundle> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f114891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavArgsLazyKt$navArgs$1(Activity activity) {
        super(0);
        this.f114891d = activity;
    }

    @Override // ed.InterfaceC4376a
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Bundle invoke() {
        Bundle extras;
        Intent intent = this.f114891d.getIntent();
        if (intent != null) {
            Activity activity = this.f114891d;
            extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
            }
        } else {
            extras = null;
        }
        if (extras != null) {
            return extras;
        }
        throw new IllegalStateException("Activity " + this.f114891d + " has a null Intent");
    }
}
