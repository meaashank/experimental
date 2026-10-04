package com.github.appintro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import dd.o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppIntroCustomLayoutFragment extends Fragment {

    @NotNull
    private static final String ARG_LAYOUT_RES_ID = "layoutResId";

    @NotNull
    public static final Companion Companion = new Companion(null);
    private int layoutResId;

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        @o
        @NotNull
        public final AppIntroCustomLayoutFragment newInstance(int i10) {
            AppIntroCustomLayoutFragment appIntroCustomLayoutFragment = new AppIntroCustomLayoutFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(AppIntroCustomLayoutFragment.ARG_LAYOUT_RES_ID, i10);
            appIntroCustomLayoutFragment.setArguments(bundle);
            return appIntroCustomLayoutFragment;
        }

        private Companion() {
        }
    }

    @o
    @NotNull
    public static final AppIntroCustomLayoutFragment newInstance(int i10) {
        return Companion.newInstance(i10);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.layoutResId = arguments == null ? 0 : arguments.getInt(ARG_LAYOUT_RES_ID);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        G.p(inflater, "inflater");
        return inflater.inflate(this.layoutResId, viewGroup, false);
    }
}
