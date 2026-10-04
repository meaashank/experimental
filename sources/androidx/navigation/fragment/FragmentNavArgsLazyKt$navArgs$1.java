package androidx.navigation.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nFragmentNavArgsLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt$navArgs$1\n*L\n1#1,45:1\n*E\n"})
public final class FragmentNavArgsLazyKt$navArgs$1 extends Lambda implements InterfaceC4376a<Bundle> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f115206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavArgsLazyKt$navArgs$1(Fragment fragment) {
        super(0);
        this.f115206d = fragment;
    }

    @Override // ed.InterfaceC4376a
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Bundle invoke() {
        Bundle arguments = this.f115206d.getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this.f115206d + " has null arguments");
    }
}
